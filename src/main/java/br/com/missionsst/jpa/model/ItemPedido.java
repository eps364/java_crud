package br.com.missionsst.jpa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ItemPedido {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long numPedido;
  private Long codProduto;
  private Long quantidade;
  private String pcoUnit;


  public Long getNumPedido() {
    return numPedido;
  }

  public void setNumPedido(Long numPedido) {
    this.numPedido = numPedido;
  }


  public Long getCodProduto() {
    return codProduto;
  }

  public void setCodProduto(Long codProduto) {
    this.codProduto = codProduto;
  }


  public Long getQuantidade() {
    return quantidade;
  }

  public void setQuantidade(Long quantidade) {
    this.quantidade = quantidade;
  }


  public String getPcoUnit() {
    return pcoUnit;
  }

  public void setPcoUnit(String pcoUnit) {
    this.pcoUnit = pcoUnit;
  }

}
