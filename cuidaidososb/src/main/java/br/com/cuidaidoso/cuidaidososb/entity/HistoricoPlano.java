package br.com.cuidaidoso.cuidaidososb.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

@Getter
@Setter
@Entity
public class HistoricoPlano {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idCobranca;

    private LocalDate dataEntrada;

    private LocalDate dataSaida;

}
