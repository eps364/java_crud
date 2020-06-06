package br.com.missionsst.jpa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tlogproduto {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long Id;
  private String usuario;
  private java.sql.Timestamp dataalteracao;
  private String nomeProduto;


  public String getUsuario() {
    return usuario;
  }

  public void setUsuario(String usuario) {
    this.usuario = usuario;
  }


  public java.sql.Timestamp getDataalteracao() {
    return dataalteracao;
  }

  public void setDataalteracao(java.sql.Timestamp dataalteracao) {
    this.dataalteracao = dataalteracao;
  }


  public String getNomeProduto() {
    return nomeProduto;
  }

  public void setNomeProduto(String nomeProduto) {
    this.nomeProduto = nomeProduto;
  }

  public Long getId() {
    return Id;
  }

  public void setId(Long id) {
    Id = id;
  }
}
