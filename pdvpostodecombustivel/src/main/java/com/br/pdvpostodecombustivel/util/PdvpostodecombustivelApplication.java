package com.br.pdvpostodecombustivel.util;

import com.br.pdvpostodecombustivel.domain.entity.Pessoa;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PdvpostodecombustivelApplication {

    public static void main(String[] args) {
        //SpringApplication.run(PdvpostodecombustivelApplication.class, args);


        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNomeCompleto("Rud");
        pessoa1.setCpfCnpj("21434532");
        pessoa1.setNumeroCtps(123);
        System.out.println(pessoa1.getNomeCompleto());
        System.out.println(pessoa1.getCpfCnpj());
        System.out.println(pessoa1.getNumeroCtps());


    }
}
