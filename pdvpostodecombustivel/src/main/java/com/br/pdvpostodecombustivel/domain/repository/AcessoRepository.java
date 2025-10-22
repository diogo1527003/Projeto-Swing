package com.br.pdvpostodecombustivel.domain.repository;

import com.br.pdvpostodecombustivel.domain.entity.Acesso;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface AcessoRepository extends JpaRepository<Acesso, Long>{
    Optional<Acesso> findByUsuario(String usuario);
    Optional<Acesso> findBySenha(String senha);
    boolean existsByUsuarioAndSenha(String usuario, String senha);
}
