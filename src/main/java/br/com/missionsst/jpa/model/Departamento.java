package br.com.missionsst.jpa.model;


import javax.persistence.*;

@Entity
public class Departamento {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long codDepartamento;
  private String nomeDepartamento;
  @ManyToOne
  private Regiao codRegiao;

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

  public Regiao getCodRegiao() {
    return codRegiao;
  }

  public void setCodRegiao(Regiao codRegiao) {
    this.codRegiao = codRegiao;
  }
}
