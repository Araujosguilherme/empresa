package com.hotmart.empresa.model;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

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


    @OneToMany(mappedBy = "departamento", cascade = CascadeType.ALL)
    private List<Projeto> projetos;

    public Departamento() {
        projetos = new ArrayList<>();

    }

    public Departamento(Departamento departamento) {
        this.id = departamento.getId();
        this.nome = departamento.getNome();
        this.numero = departamento.getNumero();
        this.descricao = getDescricao();
        this.projetos = departamento.getProjetos();
        if (projetos == null)
            projetos = new ArrayList<>();

        }

    public void addDepartamento() {
    }
}





