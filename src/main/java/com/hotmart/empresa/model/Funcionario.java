package com.hotmart.empresa.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;


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
    private LocalDate dataNascimento;

    @Column(nullable = false, length = 60)
    private String sexo;

    @Column(nullable = false, length = 60)
    private BigDecimal salarioBase;

    @OneToOne
    private Endereco endereco;

    @ManyToOne
    @JoinColumn(name = "supervisor_id")
    private Funcionario supervisor;

    @OneToMany(mappedBy = "supervisor")
    private List<Funcionario> subordinados;

    public Funcionario(){

    }


//    public boolean hierarquiaFuncionarios(){
//        Funcionario alterarSupervisor = this.getSupervisor();
//        if (alterarSupervisor == null) {
//            return false;
//        }
//        for (Funcionario superv : this.getSubordinados()) {
//            superv.setSupervisor(alterarSupervisor);
//        }
//        return true;
//    }

}
