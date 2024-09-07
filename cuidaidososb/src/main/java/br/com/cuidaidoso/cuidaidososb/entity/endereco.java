package br.com.cuidaidoso.cuidaidososb.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @Size(min = 8, max = 8, message = "O CEP deve ter 8 dígitos")
    @Pattern(regexp = "\\d{8}", message = "O CEP deve conter apenas dígitos")
    private String cep;

    @NotNull
    @Size(min = 3)
    @Pattern(regexp = "^[a-zA-Z\\s]+$", message = "O estado deve conter apenas letras")
    private String estado;

    @NotNull
    @Size(min = 3)
    @Pattern(regexp = "^[a-zA-Z\\s]+$", message = "A cidade deve conter apenas letras")
    private String cidade;

    @NotNull
    @Size(min = 3)
    @Pattern(regexp = "^[a-zA-Z\\s]+$", message = "O bairro deve conter apenas letras")
    private String bairro;

    @NotNull
    @Size(min = 1, max = 6, message = "O número deve ter entre 1 e 6 caracteres")
    @Pattern(regexp = "\\d{1,6}", message = "O número deve conter apenas dígitos")
    private String numero;

    @Size(min = 3)
    @Pattern(regexp = "^[a-zA-Z\\s]+$", message = "O complemento deve conter apenas letras")
    private String complemento;

    @OneToOne
    @JoinColumn(name = "cuidador_id")
    private Cuidador cuidador;

    public Endereco() {
    }

}
