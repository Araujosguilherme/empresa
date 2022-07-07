package com.hotmart.empresa.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;


@Getter
@Setter
@Entity
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(nullable = false, length = 60)
    private String nome;

    @Column(nullable = false, length = 60)
    private String cpf;

    @Column(nullable = false, length = 60)
    private String dataNascimento;

    @Column(nullable = false, length = 60)
    private String sexo;

    @Column(nullable = false, length = 60)
    private BigDecimal salarioBase;

    @OneToOne
    private Endereco endereco;



}
