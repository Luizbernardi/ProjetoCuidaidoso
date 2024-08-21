package br.com.cuidaidoso.cuidaidososb.entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Cartao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCartao;

    @NotNull
    @Pattern(regexp = "\\d{16}", message = "O número do cartão deve ter 16 dígitos")
    private String numeroCartao;

    @NotNull
    private LocalDate validadeCartao;

    @OneToOne
    @JoinColumn(name = "cuidador_id")
    private Cuidador cuidador;

    @OneToMany(mappedBy = "cartao", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Cobranca> cobrancas;

    public Cartao() {
    }

}
