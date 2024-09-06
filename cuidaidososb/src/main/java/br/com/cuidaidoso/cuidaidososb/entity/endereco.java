package br.com.cuidaidoso.cuidaidososb.entity;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class endereco {

    @NotNull
    @Size(min = 8, max = 8, message = "O CEP deve ter 8 dígitos")
    private String cep;

    private String estado;
    private String cidade;
    private String bairro;
    private String numero;
    private String complemento;
}
