package br.com.cuidaidoso.cuidaidososb.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Cancelamento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idCancelamento;

    @NotBlank(message = "O motivo do cancelamento não pode ser vazio")
    private String motivo;

    @NotNull
    private LocalDate dataCancelamento;

    @ManyToOne
    @JoinColumn(name = "historico_plano_id")
    private HistoricoPlano historicoPlano;

    public Cancelamento() {
    }
}
