package br.com.cuidaidoso.cuidaidososb.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Entity
public class HistoricoPlano {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idHistoricoPlano;

    @NotNull
    private LocalDate dataEntrada;

    private LocalDate dataSaida;

    @NotNull
    @OneToMany(mappedBy = "historicoPlano")
    private List<Plano> planos;

    @OneToMany(mappedBy = "historicoPlano")
    private List<Cancelamento> cancelamentos;

    @ManyToOne
    @JoinColumn(name = "cuidador_id")
    private Cuidador cuidador;

    public HistoricoPlano() {
    }
}
