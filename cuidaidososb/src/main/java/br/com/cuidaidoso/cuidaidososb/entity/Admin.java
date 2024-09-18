package br.com.cuidaidoso.cuidaidososb.entity;

import java.time.LocalDate;
import java.util.List;

import br.com.cuidaidoso.cuidaidososb.enumCuidaidoso.Genero;
import br.com.cuidaidoso.cuidaidososb.enumCuidaidoso.Perfil;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "admins")
public class Admin extends User {

    @OneToMany(mappedBy = "admin")
    private List<AdminLog> adminLog;

    public Admin() {
    }

    public Admin(long id,
            @NotNull @Size(min = 3, max = 20, message = "O nome de usuário deve ter entre 3 e 20 caracteres") @Pattern(regexp = "^[a-zA-Z0-9]+$", message = "O nome de usuário deve conter apenas letras e números") String userName,
            @NotNull @Size(min = 3) @Pattern(regexp = "^[a-zA-Z\\s]+$", message = "O nome deve conter apenas letras") String nome,
            @Size(min = 3) @NotNull @Pattern(regexp = "^[a-zA-Z\\s]+$", message = "O sobrenome deve conter apenas letras") String sobrenome,
            @NotNull @Size(min = 8, message = "A senha deve ter pelo menos 8 caracteres") @Pattern(regexp = "^(?=.*[A-Z])(?=.*[^a-zA-Z\\d]).+$", message = "A senha deve conter pelo menos uma letra maiúscula e um caractere especial") String senha,
            @NotNull Genero genero,
            @NotNull @Size(min = 11, max = 11, message = "O CPF deve ter 11 dígitos") @Pattern(regexp = "\\d{9}", message = "O CPF deve conter apenas dígitos") String cpf,
            @NotNull @Size(min = 11) @Pattern(regexp = "\\d{11}", message = "O telefone deve conter apenas dígitos") String telefone,
            @NotNull @Past(message = "A data de nascimento deve ser uma data no passado") @Pattern(regexp = "\\d{4}-\\d{2}-\\d{2}", message = "A data de nascimento deve estar no formato yyyy-MM-dd") LocalDate dataNascimento,
            @NotNull @Email(message = "O email deve ser válido") String email, String imagem, Perfil perfil,
            List<AdminLog> adminLog) {
        super(id, userName, nome, sobrenome, senha, genero, cpf, telefone, dataNascimento, email, imagem, perfil);
        this.adminLog = adminLog;
    }

}
