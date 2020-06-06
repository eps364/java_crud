package br.com.missionsst.jpa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HistoricoLocacao {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long numLocacao;
  private Long codLocatario;
  private Long codEquipamento;
  private java.sql.Timestamp dataHistorico;


  public Long getNumLocacao() {
    return numLocacao;
  }

  public void setNumLocacao(Long numLocacao) {
    this.numLocacao = numLocacao;
  }


  public Long getCodLocatario() {
    return codLocatario;
  }

  public void setCodLocatario(Long codLocatario) {
    this.codLocatario = codLocatario;
  }


  public Long getCodEquipamento() {
    return codEquipamento;
  }

  public void setCodEquipamento(Long codEquipamento) {
    this.codEquipamento = codEquipamento;
  }


  public java.sql.Timestamp getDataHistorico() {
    return dataHistorico;
  }

  public void setDataHistorico(java.sql.Timestamp dataHistorico) {
    this.dataHistorico = dataHistorico;
  }

}
