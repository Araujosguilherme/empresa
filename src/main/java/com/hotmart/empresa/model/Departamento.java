package com.hotmart.empresa.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@Entity
public class Departamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column
    private String nome;

    @Column
    private Integer numero;

    @Column
    private String descricao;


    @OneToMany(mappedBy = "departamento", cascade =CascadeType.ALL)
    private List<Projeto> projetos;

    public Departamento() {


// To do
    }

    public Departamento(Long id, String nome, Integer numero, String descricao) {
        this.id = id;
        this.nome = nome;
        this.numero = numero;
        this.descricao = descricao;
    }

    }




