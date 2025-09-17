package com.br.pdvpostodecombustivel.domain.entity;

import java.math.BigDecimal;

public class Estoque{
    private BigDecimal quantidade;
    private String LocalTanque;
    private String LocalEndereco;
    private String LoteFabricacao;
    private String dataValidade;

    public Estoque(BigDecimal quantidade, String LocalEndereço, String LocalTanque, String LoteFabricacao, String dataValide) {
    this.quantidade = quantidade;
    this.LocalTanque = LocalTanque;
    this.LocalEndereco = LocalEndereco;
    this.LoteFabricacao = LoteFabricacao;
    this.dataValidade = dataValidade;

    }
    public BigDecimal getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(BigDecimal quantidade) {
        this.quantidade = quantidade;
    }
    public String getLocalTanque() {
        return LocalTanque;
    }
    public void setLocalTanque(String LocalTanque) {
        this.LocalTanque = LocalTanque;
    }
    public String getLocalEndereco() {
        return LocalEndereco;
    }
    public void setLocalEndereco(String LocalEndereco) {
        this.LocalEndereco = LocalEndereco;
    }
    public String getLoteFabricacao() {
        return LoteFabricacao;
    }
    public void setLoteFabricacao(String LoteFabricacao) {
        this.LoteFabricacao = LoteFabricacao;
    }
    public String getDataValidade() {
        return dataValidade;
    }
    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

}
