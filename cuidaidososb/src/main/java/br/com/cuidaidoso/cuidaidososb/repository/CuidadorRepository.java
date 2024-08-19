package br.com.cuidaidoso.cuidaidososb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cuidaidoso.cuidaidososb.entity.Cuidador;
import br.com.cuidaidoso.cuidaidososb.enumCuidaidoso.Estado;

@Repository
public interface CuidadorRepository extends JpaRepository<Cuidador, Long> {

    List<Cuidador> findByEstado(Estado estado);

}