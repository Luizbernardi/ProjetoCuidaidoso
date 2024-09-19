package br.com.cuidaidoso.cuidaidososb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cuidaidoso.cuidaidososb.entity.Cuidador;
import java.util.List;
import java.util.Optional;

import br.com.cuidaidoso.cuidaidososb.entity.Endereco;

@Repository
public interface CuidadorRepository extends JpaRepository<Cuidador, Long> {

    Optional<List<Cuidador>> findByEndereco(Endereco endereco);

    Optional<Cuidador> findByUsername(String username);
}