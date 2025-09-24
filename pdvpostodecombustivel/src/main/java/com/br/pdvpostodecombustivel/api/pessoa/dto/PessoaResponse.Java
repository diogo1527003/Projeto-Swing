package com.br.pdvpostodecombustivel.api.pessoa.dto;

public record PessoaResponse(
        Long Id,
        Long numeroCtps,
        String nomeCompleto,
        String cpfCnpj
        )
{}
