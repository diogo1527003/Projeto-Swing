package com.br.pdvpostodecombustivel.enums;

public enum TipoPessoa{
    FISICA("Pessoa Fisisca"),
    JURIDICA("Pessoa Juridica");

    private final String descricao;

    private TipoPessoa(String descricao){
        this.descricao = descricao;
    }
    public String getDescricao(){
        return descricao;
    }
}