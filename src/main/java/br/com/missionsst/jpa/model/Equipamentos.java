package br.com.missionsst.jpa.model;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Equipamentos {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long codEquipamento;
  private Long codMaquina;
  private String indativa;


  public Long getCodEquipamento() {
    return codEquipamento;
  }

  public void setCodEquipamento(Long codEquipamento) {
    this.codEquipamento = codEquipamento;
  }


  public Long getCodMaquina() {
    return codMaquina;
  }

  public void setCodMaquina(Long codMaquina) {
    this.codMaquina = codMaquina;
  }


  public String getIndativa() {
    return indativa;
  }

  public void setIndativa(String indativa) {
    this.indativa = indativa;
  }

}
