package br.com.missionsst.jpa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vendedor {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long codVendedor;
  private String nomeVendedor;
  private Double faixaComissao;
  private Double salarioFixo;

  public Vendedor(){}

  public Vendedor(String nomeVendedor, Double faixaComissao, Double salarioFixo) {
    this.nomeVendedor = nomeVendedor;
    this.faixaComissao = faixaComissao;
    this.salarioFixo = salarioFixo;
  }



  public Long getCodVendedor() {
    return codVendedor;
  }

  public void setCodVendedor(Long codVendedor) {
    this.codVendedor = codVendedor;
  }


  public String getNomeVendedor() {
    return nomeVendedor;
  }

  public void setNomeVendedor(String nomeVendedor) {
    this.nomeVendedor = nomeVendedor;
  }


  public Double getFaixaComissao() {
    return faixaComissao;
  }

  public void setFaixaComissao(Double faixaComissao) {
    this.faixaComissao = faixaComissao;
  }


  public Double getSalarioFixo() {
    return salarioFixo;
  }

  public void setSalarioFixo(Double salarioFixo) {
    this.salarioFixo = salarioFixo;
  }

}
