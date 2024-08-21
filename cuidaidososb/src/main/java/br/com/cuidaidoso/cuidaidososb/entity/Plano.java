package br.com.cuidaidoso.cuidaidososb.entity;

import java.util.List;

import br.com.cuidaidoso.cuidaidososb.enumCuidaidoso.Prioridade;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Plano {

    @Id
    @NotNull
    private long idPlano;

    @NotNull
    private String nomePlano;

    @NotNull
    private String valorPlano;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Prioridade prioridade;

    @ManyToOne
    @JoinColumn(name = "historico_plano_id")
    private HistoricoPlano historicoPlano;

    @OneToMany(mappedBy = "plano")
    private List<Cobranca> cobranca;

    public Plano() {
    }

}
