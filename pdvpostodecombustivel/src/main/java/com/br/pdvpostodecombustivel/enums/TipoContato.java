package com.br.pdvpostodecombustivel.enums;

public enum TipoContato {
    Empresarial("Contato Empresarial"),
    Privado("Contato Privado");
    private String descricao;
    TipoContato(String descricao) {
        this.descricao = descricao;}
        public String getDescricao () { return descricao; }
}
