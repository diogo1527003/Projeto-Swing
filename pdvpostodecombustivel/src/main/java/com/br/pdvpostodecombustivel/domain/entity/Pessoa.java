package com.br.pdvpostodecombustivel.domain.entity;

import java.util.Date;

@Entity
@Table(name = "pessoa")

public class Pessoa{

    @Id
    @GeneratedValue(Strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 200, nullable = false)
  // atributos
  private String nomeCompleto;

   @Column(length = 14, nullable = false)
    
  private String cpfCnpj;

    @Column(length = 12)

  private Date dataNascimento;

    @Column(length = 8, nullable = false)

  private Long numeroCtps;

    @Column(length )

  //construtor
   public Pessoa(String nomeCompleto,  String cpfCnpj, Date dataNascimento, Integer numeroCtps){
       this.nomeCompleto = nomeCompleto;
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