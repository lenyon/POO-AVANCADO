package br.fatec.HelpDesk.Entities;


import jakarta.persistence.*;
import lombok.Data;
import java.io.Serial;
import java.io.Serializable;

@Data
@Entity
@Table(name = "Equipe", schema = "public")
public class Equipe implements Serializable {

    @Serial
    public static final long serialVersionUID =546346346346L;

    @Id
    @SequenceGenerator(
            name = "SEQ-EQUIPE",
            sequenceName = "public.seq_equipe",
            allocationSize = 1)
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "equipe", length = 50, nullable = false)
    private String equipe;
}
