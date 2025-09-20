package com.br.pdvpostodecombustivel.api.contato.dto;

public record ContatoRequest(
        String telefone,
        String email,
        String endereco
)
{}