package br.fatec.HelpDesk.Entities;


import jakarta.persistence.*;
import lombok.Data;
import java.io.Serial;
import java.io.Serializable;

@Data
@Entity
@Table(name = "Categoria", schema = "public")
public class Categoria implements Serializable {

    @Serial
    public static final long serialVersionUID = 64532513252354L;

    @Id
    @SequenceGenerator(
            name = "SEQ-CATEGORIA",
            sequenceName = "public.seq_categoria",
            allocationSize = 1)
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "service", length = 50, nullable = false)
    private String service;


}
