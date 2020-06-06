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
  private String faixaComissao;
  private String salarioFixo;


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


  public String getFaixaComissao() {
    return faixaComissao;
  }

  public void setFaixaComissao(String faixaComissao) {
    this.faixaComissao = faixaComissao;
  }


  public String getSalarioFixo() {
    return salarioFixo;
  }

  public void setSalarioFixo(String salarioFixo) {
    this.salarioFixo = salarioFixo;
  }

}
