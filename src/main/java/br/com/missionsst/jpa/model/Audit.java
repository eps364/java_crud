package br.com.missionsst.jpa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Audit {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long idAudit;
  private String texto;
  private java.sql.Timestamp data;


  public long getIdAudit() {
    return idAudit;
  }

  public void setIdAudit(long idAudit) {
    this.idAudit = idAudit;
  }


  public String getTexto() {
    return texto;
  }

  public void setTexto(String texto) {
    this.texto = texto;
  }


  public java.sql.Timestamp getData() {
    return data;
  }

  public void setData(java.sql.Timestamp data) {
    this.data = data;
  }

}
