package br.fatec.HelpDesk.Entities;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
@Entity
@Table(name = "Perfil", schema = "public")
public class Perfil implements Serializable {

    @Serial
    public static final long serialVersionUID = 56346345643653456L;

    @Id
    @SequenceGenerator(
            name = "SEQ-PERFIL",
            sequenceName = "public.seq_perfil",
            allocationSize = 1)

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "perfil", length = 255, nullable = false)
    private String perfil;
}
