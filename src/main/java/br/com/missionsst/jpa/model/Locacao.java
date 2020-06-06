package br.com.missionsst.jpa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Locacao {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long numLocacao;
  private Long codlocatario;
  private Long codEquipamento;
  private java.sql.Timestamp datalocacao;
  private java.sql.Timestamp dataprevdev;
  private java.sql.Timestamp datadev;
  private String valorprevloc;
  private String valorpago;


  public Long getNumLocacao() {
    return numLocacao;
  }

  public void setNumLocacao(Long numLocacao) {
    this.numLocacao = numLocacao;
  }


  public Long getCodlocatario() {
    return codlocatario;
  }

  public void setCodlocatario(Long codlocatario) {
    this.codlocatario = codlocatario;
  }


  public Long getCodEquipamento() {
    return codEquipamento;
  }

  public void setCodEquipamento(Long codEquipamento) {
    this.codEquipamento = codEquipamento;
  }


  public java.sql.Timestamp getDatalocacao() {
    return datalocacao;
  }

  public void setDatalocacao(java.sql.Timestamp datalocacao) {
    this.datalocacao = datalocacao;
  }


  public java.sql.Timestamp getDataprevdev() {
    return dataprevdev;
  }

  public void setDataprevdev(java.sql.Timestamp dataprevdev) {
    this.dataprevdev = dataprevdev;
  }


  public java.sql.Timestamp getDatadev() {
    return datadev;
  }

  public void setDatadev(java.sql.Timestamp datadev) {
    this.datadev = datadev;
  }


  public String getValorprevloc() {
    return valorprevloc;
  }

  public void setValorprevloc(String valorprevloc) {
    this.valorprevloc = valorprevloc;
  }


  public String getValorpago() {
    return valorpago;
  }

  public void setValorpago(String valorpago) {
    this.valorpago = valorpago;
  }

}
