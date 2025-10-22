package com.br.pdvpostodecombustivel.api.contato.dto;

import com.br.pdvpostodecombustivel.enums.TipoAcesso;
import org.springframework.format.annotation.DateTimeFormat;

public record ContatoRequest(String telefone, String email, String endereco, @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
TipoAcesso tipoAcesso) {
}