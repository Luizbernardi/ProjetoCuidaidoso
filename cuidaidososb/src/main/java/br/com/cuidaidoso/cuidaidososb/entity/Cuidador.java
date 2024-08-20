package br.com.cuidaidoso.cuidaidososb.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

import br.com.cuidaidoso.cuidaidososb.enumCuidaidoso.Estado;
import br.com.cuidaidoso.cuidaidososb.enumCuidaidoso.TipoGenero;
import jakarta.validation.constraints.NotNull;

@Getter
@Setter
@Entity
public class Cuidador {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @Column(unique = true)
    @Size(min = 3, max = 20, message = "O nome de usuário deve ter entre 3 e 20 caracteres")
    private String userName;

    @NotNull
    @Size(min = 3)
    private String nome;

    @Size(min = 3)
    @NotNull
    private String sobrenome;

    @NotNull
    @Size(min = 8, message = "A senha deve ter pelo menos 8 caracteres")
    @jakarta.validation.constraints.Pattern(regexp = "^(?=.*[A-Z])(?=.*[^a-zA-Z\\d]).+$", message = "A senha deve conter pelo menos uma letra maiúscula e um caractere especial")
    private String senha;

    @NotNull
    @Enumerated(EnumType.STRING)
    private TipoGenero genero;

    @NotNull
    @Size(min = 11, max = 11, message = "O CPF deve ter 11 dígitos")
    @Column(unique = true)
    private String cpf;

    @NotNull
    private LocalDate dataNascimento;

    @NotNull
    @Email(message = "O email deve ser válido")
    private String email;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Estado estado;

    @Size(min = 4)
    private String formacao;

    public Cuidador() {
    }

}
