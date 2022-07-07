package com.hotmart.empresa.model;

import com.hotmart.empresa.enums.StatusBudget;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
public class Projeto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column
    @NonNull
    private String nome;

    @Column
    private LocalDate dataContratacao;

    @Column
    private BigDecimal valor;

    @Column
    @Enumerated(EnumType.STRING)
    private StatusBudget statusBudget;

    @ManyToOne
    private Departamento departamento;

    @ManyToMany
    @JoinTable(name = "projeto_funcionario", joinColumns = @JoinColumn(name = "projeto_id"), inverseJoinColumns = @JoinColumn(name = "funcionario_id"))
    private List<Funcionario> funcionarios;

    public Projeto() {

    }

    public Projeto(Long id, String nome, LocalDate dataContratacao, BigDecimal valor, StatusBudget statusBudget, Departamento departamento,
                   List<Funcionario> funcionarios) {
        this.id = this.id;
        this.nome = nome;
        this.dataContratacao = dataContratacao;
        this.valor = valor;
        this.funcionarios = funcionarios;

    }





//    public StatusBudget (){
//        if (valor >= custoAtual) return StatusBudget.VERDE;
//        if (custoAtual =< 0.10 * valor){
//            return StatusBudget.AMARELO;
//        }
//        if (custoAtual => 0.10 * valor);
//            return StatusBudget.VERMELHO;
//
    }







