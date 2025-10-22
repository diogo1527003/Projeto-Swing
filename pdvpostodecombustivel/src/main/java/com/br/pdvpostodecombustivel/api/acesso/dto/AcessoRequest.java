package com.br.pdvpostodecombustivel.api.acesso.dto;

import com.br.pdvpostodecombustivel.enums.TipoAcesso;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDate;


    public record AcessoRequest(
           String usuario,
           String senha,
           @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
           TipoAcesso tipoAcesso)
    {}
