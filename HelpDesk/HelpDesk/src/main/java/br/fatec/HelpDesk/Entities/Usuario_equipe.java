package br.fatec.HelpDesk.Entities;


import jakarta.persistence.*;
import lombok.Data;
import java.io.Serial;

@Data
@Entity
@Table (name = "usuario_equipe", schema = "public")
public class Usuario_equipe {

    @Serial
    public static final long serialVersionUID =12341234123424124L;

    @Id
    @SequenceGenerator(
            name = "SEQ-USUARIO-EQUIPE",
            sequenceName = "public.seq_usuario_equipe",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "id_usuario", referencedColumnName = "id")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "id_equipe", referencedColumnName = "id")
    private Equipe equipe;

    @ManyToOne
    @JoinColumn(name = "id_categoria", referencedColumnName = "id")
    private Categoria categoria;

}
