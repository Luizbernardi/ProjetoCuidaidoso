package br.com.cuidaidoso.cuidaidososb.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

@Entity
public class Plano {

    @Id
    @NotNull
    private long idPlano;

    @NotNull
    private String nomePlano;

    @NotNull
    private String valorPlano;

}
