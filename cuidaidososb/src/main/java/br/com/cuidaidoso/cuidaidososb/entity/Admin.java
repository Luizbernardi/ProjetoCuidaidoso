package br.com.cuidaidoso.cuidaidososb.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "admins")
public class Admin extends User {

    @OneToMany(mappedBy = "admin")
    private List<AdminLog> adminlog;

}
