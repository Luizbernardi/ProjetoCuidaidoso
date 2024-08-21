package br.com.cuidaidoso.cuidaidososb.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
public class Cobranca {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idCobranca;

    @NotNull
    private LocalDate dataDebito;

    @ManyToOne
    @JoinColumn(name = "cartao_id")
    private Cartao cartao;

    @ManyToOne
    @JoinColumn(name = "plano_id")
    private Plano plano;

}
