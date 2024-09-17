package br.com.cuidaidoso.cuidaidososb.entity;

import java.time.LocalDate;

import br.com.cuidaidoso.cuidaidososb.enumCuidaidoso.Perfil;
import br.com.cuidaidoso.cuidaidososb.enumCuidaidoso.Genero;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public abstract class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @Column(unique = true)
    @Size(min = 3, max = 20, message = "O nome de usuário deve ter entre 3 e 20 caracteres")
    @Pattern(regexp = "^[a-zA-Z0-9]+$", message = "O nome de usuário deve conter apenas letras e números")
    private String userName;

    @NotNull
    @Size(min = 3)
    @Pattern(regexp = "^[a-zA-Z\\s]+$", message = "O nome deve conter apenas letras")
    private String nome;

    @Size(min = 3)
    @NotNull
    @Pattern(regexp = "^[a-zA-Z\\s]+$", message = "O sobrenome deve conter apenas letras")
    private String sobrenome;

    @NotNull
    @Size(min = 8, message = "A senha deve ter pelo menos 8 caracteres")
    @Pattern(regexp = "^(?=.*[A-Z])(?=.*[^a-zA-Z\\d]).+$", message = "A senha deve conter pelo menos uma letra maiúscula e um caractere especial")
    private String senha;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Genero genero;

    @NotNull
    @Size(min = 11, max = 11, message = "O CPF deve ter 11 dígitos")
    @Pattern(regexp = "\\d{9}", message = "O CPF deve conter apenas dígitos")
    @Column(unique = true)
    private String cpf;

    @NotNull
    @Size(min = 11)
    @Pattern(regexp = "\\d{11}", message = "O telefone deve conter apenas dígitos")
    private String telefone;

    @NotNull
    @Past(message = "A data de nascimento deve ser uma data no passado")
    @Pattern(regexp = "\\d{4}-\\d{2}-\\d{2}", message = "A data de nascimento deve estar no formato yyyy-MM-dd")
    private LocalDate dataNascimento;

    @NotNull
    @Email(message = "O email deve ser válido")
    @Column(unique = true)
    private String email;

    private Perfil perfil;

    public User() {

    }

    public User(long id,
            @NotNull @Size(min = 3, max = 20, message = "O nome de usuário deve ter entre 3 e 20 caracteres") @Pattern(regexp = "^[a-zA-Z0-9]+$", message = "O nome de usuário deve conter apenas letras e números") String userName,
            @NotNull @Size(min = 3) @Pattern(regexp = "^[a-zA-Z\\s]+$", message = "O nome deve conter apenas letras") String nome,
            @Size(min = 3) @NotNull @Pattern(regexp = "^[a-zA-Z\\s]+$", message = "O sobrenome deve conter apenas letras") String sobrenome,
            @NotNull @Size(min = 8, message = "A senha deve ter pelo menos 8 caracteres") @Pattern(regexp = "^(?=.*[A-Z])(?=.*[^a-zA-Z\\d]).+$", message = "A senha deve conter pelo menos uma letra maiúscula e um caractere especial") String senha,
            @NotNull Genero genero,
            @NotNull @Size(min = 11, max = 11, message = "O CPF deve ter 11 dígitos") @Pattern(regexp = "\\d{9}", message = "O CPF deve conter apenas dígitos") String cpf,
            @NotNull @Size(min = 11) @Pattern(regexp = "\\d{11}", message = "O telefone deve conter apenas dígitos") String telefone,
            @NotNull @Past(message = "A data de nascimento deve ser uma data no passado") @Pattern(regexp = "\\d{4}-\\d{2}-\\d{2}", message = "A data de nascimento deve estar no formato yyyy-MM-dd") LocalDate dataNascimento,
            @NotNull @Email(message = "O email deve ser válido") String email, Perfil perfil) {
        this.id = id;
        this.userName = userName;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.senha = senha;
        this.genero = genero;
        this.cpf = cpf;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.perfil = perfil;
    }

}