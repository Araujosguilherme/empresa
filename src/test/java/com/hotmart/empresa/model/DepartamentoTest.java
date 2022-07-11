package com.hotmart.empresa.model;

import com.hotmart.empresa.repository.DepartamentoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.util.Assert;

import java.math.BigDecimal;

@MockBean
@SpringBootTest
class DepartamentoTest {


    @Autowired
    DepartamentoRepository departamentoRepository;



    @Test
    public void inserirDepartamento() {

        Departamento departamento = new Departamento(null);



        Assert.isNull(departamento.getId(), "ID inválido");
        Assert.isNull(departamento.getNome(), "Nome inválido");
        Assert.isNull(departamento.getDescricao(), "Descricao inválida");
        Assert.noNullElements(departamento.getProjetos(), "projeto inválido");


    }
    @Test
    public void testarAddFuncionarios() {
        Funcionario funcionario = new Funcionario();
        funcionario.setSalarioBase(BigDecimal.TEN);

        Funcionario funcionario2 = new Funcionario();
        funcionario2.setSalarioBase(new BigDecimal(100));

        Projeto projeto = new Projeto();
        projeto.addFuncionario(funcionario);

        projeto.addFuncionario(funcionario2);
        Assert.notEmpty(projeto.getFuncionarios(), "A lista deve conter dois funcionarios");
    }



}