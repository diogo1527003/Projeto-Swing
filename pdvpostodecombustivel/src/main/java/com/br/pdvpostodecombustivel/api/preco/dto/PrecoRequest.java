package com.br.pdvpostodecombustivel.api.preco.dto;
import com.br.pdvpostodecombustivel.enums.TipoPreco;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.time.LocalDate;

public record PrecoRequest(
        BigDecimal valor,
        String dataAlteracao,
        String valorAlteracao,
        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
        TipoPreco tipoPreco)
{}