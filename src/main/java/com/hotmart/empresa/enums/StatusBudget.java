package com.hotmart.empresa.enums;

public enum StatusBudget {

    VERDE ("O custo dos projetos está igual ou abaixo do valor do orçamento do departamento;"),
    AMARELO ("O custo dos projetos está acima do orçamento em até 10%"),
    VERMELHO ("O custo dos projetos está acima do orçamento ultrapassando 10%");

    private String descricao;

    StatusBudget(String descricao) { this.descricao = descricao;}

    public String getDescricao() { return descricao; }

}
