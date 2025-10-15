package com.br.pdvpostodecombustivel.domain.repository;

import com.br.pdvpostodecombustivel.domain.entity.Pessoa;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{
    Optional<Pessoa> findByNomeCompleto(String nome);

    Optional<Pessoa> findByCpfCnpj(String cpfCnpj);

    boolean existsByCpfCnpj(String cpfCnpj);

    boolean existsByNomeCompleto(String nome);
}