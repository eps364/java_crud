package br.com.missionsst.jpa.model;

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
