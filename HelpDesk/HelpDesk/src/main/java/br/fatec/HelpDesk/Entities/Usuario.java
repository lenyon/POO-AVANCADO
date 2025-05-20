package br.fatec.HelpDesk.Entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;
import java.io.Serial;
import java.io.Serializable;
import java.util.Collection;

@Data
@Entity
@Table(name = "usuario", schema = "public")
public class Usuario implements Serializable {

    @Serial
    public static final long serialVersionUID = 542342523452354L;

    @Id
    @SequenceGenerator(
            name = "SEQ-USUARIO",
            sequenceName = "public.seq_usuario",
            allocationSize = 1)

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false, length = 255)
    private String name;

    @Column(name = "email", nullable = false, unique = true, length = 100)
    private String email;

    @Column(name = "senha", nullable = false, length = 255)
    private String senha;

    @Column(name = "cargo", nullable = false, length = 80)
    private String cargo;

    @Column (name = "telefone", nullable = false, length = 30)
    private String telefone;

    @OneToOne
    @JoinColumn (name = "id_perfil", referencedColumnName = "id", insertable = true, updatable = true)
    private Perfil perfil;

    @OneToMany
    @JoinTable(name = "usuario_equipe", schema = "public",
            joinColumns = @JoinColumn(name = "id_usuario"),
            inverseJoinColumns = @JoinColumn(name = "id_equipe"))
    @JsonManagedReference
    private Collection<Equipe> equipe;








}
