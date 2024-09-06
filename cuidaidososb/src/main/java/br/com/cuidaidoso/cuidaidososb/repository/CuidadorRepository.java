package br.com.cuidaidoso.cuidaidososb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cuidaidoso.cuidaidososb.entity.Cuidador;

@Repository
public interface CuidadorRepository extends JpaRepository<Cuidador, Long> {

}