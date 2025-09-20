package com.br.pdvpostodecombustivel.domain.entity;
import com.br.pdvpostodecombustivel.enums.TipoPessoa;
import jakarta.persistence.*;
import jakarta.websocket.OnMessage;
import java.util.Date;

@Entity
@Table(name = "pessoa")

public class Pessoa{

    @Id
    @GeneratedValue(Strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_completo",length = 200, nullable = false)
  // atributos
  private String nomeCompleto;

   @Column(name = "cpf_cnpj",length = 14, nullable = false)
    
  private String cpfCnpj;

    @Column(length = 12)

  private Date dataNascimento;

    private TipoPessoa tipoPessoa;

    @Column(length = 8, nullable = false)
    private Integer numeroCtps;
    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_pessoa", nullable = false, length = 15)
    private TipoPessoa tipo;


  //construtor
   public Pessoa(String nomeCompleto,  String cpfCnpj, Date dataNascimento, Integer numeroCtps){
       this.nomeCompleto = nomeCompleto;
       this.dataNascimento = dataNascimento;
       this.cpfCnpj = cpfCnpj;
       this.tipoPessoa = tipoPessoa;
       this.numeroCtps = numeroCtps;
   }


  //getters
  public String getNomeCompleto(){
       return nomeCompleto;
  }

  //setters
    public void setNomeCompepleto(String nomeCompleto){
       this.nomeCompleto = nomeCompleto;
    }

    public String getCpfCnpj(){
       return cpfCnpj;
    }
    public void setCpfCnpj(String cpfCnpj){
       this.cpfCnpj = cpfCnpj;
    }
    public Date getDataNascimento(){
       return dataNascimento;
    }
    public void setDataNascimento(Date dataNascimento){
       this.dataNascimento = dataNascimento;
    }
    public Integer getNumeroCtps(){
       return numeroCtps;
    }
    public void setNumeroCtps(Integer numeroCtps){
       this.numeroCtps = numeroCtps;
    }

}