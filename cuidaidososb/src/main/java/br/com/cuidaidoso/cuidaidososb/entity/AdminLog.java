package br.com.cuidaidoso.cuidaidososb.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import lombok.Setter;
import lombok.Getter;

@Getter
@Setter
@Entity
public class AdminLog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private String acao;

    @NotNull
    private LocalDateTime horaAcao = LocalDateTime.now();

    @ManyToOne
    @JoinColumn(name = "admin_id")
    private Admin admin;

    public AdminLog() {
    }

    public AdminLog(Long id, @NotNull String acao, @NotNull LocalDateTime horaAcao, @NotNull Admin admin) {
        this.id = id;
        this.acao = acao;
        this.horaAcao = horaAcao;
        this.admin = admin;
    }

}
