package br.com.cuidaidoso.cuidaidososb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.cuidaidoso.cuidaidososb.entity.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {

}