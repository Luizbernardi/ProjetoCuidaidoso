package br.com.cuidaidoso.cuidaidososb.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

import jakarta.validation.constraints.Pattern;

@Getter
@Setter
@Entity
@Table(name = "cuidadores")
public class Cuidador extends User {

    @Size(min = 4)
    @Pattern(regexp = "^[a-zA-Z\\s]+$", message = "A formação deve conter apenas letras")
    private String formacao;

    @OneToOne(mappedBy = "cuidador")
    private Endereco endereco;

}
