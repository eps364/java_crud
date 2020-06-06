package br.com.missionsst.jpa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Locatario {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long codlocatario;
  private String nomelocatario;
  private String endlocatario;
  private String cidlocatario;
  private java.sql.Timestamp datincl;
  private java.sql.Timestamp datanasc;


  public Long getCodlocatario() {
    return codlocatario;
  }

  public void setCodlocatario(long codlocatario) {
    this.codlocatario = codlocatario;
  }


  public String getNomelocatario() {
    return nomelocatario;
  }

  public void setNomelocatario(String nomelocatario) {
    this.nomelocatario = nomelocatario;
  }


  public String getEndlocatario() {
    return endlocatario;
  }

  public void setEndlocatario(String endlocatario) {
    this.endlocatario = endlocatario;
  }


  public String getCidlocatario() {
    return cidlocatario;
  }

  public void setCidlocatario(String cidlocatario) {
    this.cidlocatario = cidlocatario;
  }


  public java.sql.Timestamp getDatincl() {
    return datincl;
  }

  public void setDatincl(java.sql.Timestamp datincl) {
    this.datincl = datincl;
  }


  public java.sql.Timestamp getDatanasc() {
    return datanasc;
  }

  public void setDatanasc(java.sql.Timestamp datanasc) {
    this.datanasc = datanasc;
  }

}
