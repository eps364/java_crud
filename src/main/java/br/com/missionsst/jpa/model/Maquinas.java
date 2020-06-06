package br.com.missionsst.jpa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Maquinas {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long codMaquina;
  private String descMaquina;
  private Long qtdEquipamentos;


  public Long getCodMaquina() {
    return codMaquina;
  }

  public void setCodMaquina(Long codMaquina) {
    this.codMaquina = codMaquina;
  }


  public String getDescMaquina() {
    return descMaquina;
  }

  public void setDescMaquina(String descMaquina) {
    this.descMaquina = descMaquina;
  }


  public Long getQtdEquipamentos() {
    return qtdEquipamentos;
  }

  public void setQtdEquipamentos(Long qtdEquipamentos) {
    this.qtdEquipamentos = qtdEquipamentos;
  }

}
