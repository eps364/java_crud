package br.com.missionsst.javacrud.domain.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Regiao {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long codRegiao;
  private String nomeRegiao;

  public Regiao(){}

  public Regiao(String nomeRegiao) {
    this.nomeRegiao = nomeRegiao;
  }

  public Long getCodRegiao() {
    return codRegiao;
  }

  public void setCodRegiao(Long codRegiao) {
    this.codRegiao = codRegiao;
  }


  public String getNomeRegiao() {
    return nomeRegiao;
  }

  public void setNomeRegiao(String nomeRegiao) {
    this.nomeRegiao = nomeRegiao;
  }

}
