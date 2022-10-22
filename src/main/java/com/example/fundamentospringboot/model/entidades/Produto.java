package com.example.fundamentospringboot.model.entidades;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "produtos")
@Getter
@Setter
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    @NonNull
    @NotBlank//validação para esse valor ser diferente de vazio
    private String nome;

    @Column
    @NonNull
    @Min(0)//validação para preco minimo ser 0
    private Double preco;

    @Column
    @NonNull
    @Min(0)
    @Max(1)
    private Double desconto;
}
