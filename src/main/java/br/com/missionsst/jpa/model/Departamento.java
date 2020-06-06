package br.com.missionsst.jpa.model;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Departamento {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long codDepartamento;
  private String nomeDepartamento;
  private Long codRegiao;


  public Long getCodDepartamento() {
    return codDepartamento;
  }

  public void setCodDepartamento(Long codDepartamento) {
    this.codDepartamento = codDepartamento;
  }


  public String getNomeDepartamento() {
    return nomeDepartamento;
  }

  public void setNomeDepartamento(String nomeDepartamento) {
    this.nomeDepartamento = nomeDepartamento;
  }


  public Long getCodRegiao() {
    return codRegiao;
  }

  public void setCodRegiao(Long codRegiao) {
    this.codRegiao = codRegiao;
  }

}
