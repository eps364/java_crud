package br.com.missionsst.javacrud.domain.model;

import javax.persistence.*;

@Entity
public class ItemPedido {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long codItemPedido;
  @ManyToOne
  private Pedido numPedido;
  @ManyToOne
  private Produto codProduto;
  private Double quantidade;
  private Double pcoUnit;

  public ItemPedido() { }

  public ItemPedido(Pedido numPedido, Produto codProduto, Double quantidade, Double pcoUnit) {
    this.numPedido = numPedido;
    this.codProduto = codProduto;
    this.quantidade = quantidade;
    this.pcoUnit = pcoUnit;
  }

  public Long getCodItemPedido() {
    return codItemPedido;
  }

  public void setCodItemPedido(Long codItemPedido) {
    this.codItemPedido = codItemPedido;
  }

  public Pedido getNumPedido() {
    return numPedido;
  }

  public void setNumPedido(Pedido numPedido) {
    this.numPedido = numPedido;
  }

  public Produto getCodProduto() {
    return codProduto;
  }

  public void setCodProduto(Produto codProduto) {
    this.codProduto = codProduto;
  }


  public Double getQuantidade() {
    return quantidade;
  }

  public void setQuantidade(Double quantidade) {
    this.quantidade = quantidade;
  }


  public Double getPcoUnit() {
    return pcoUnit;
  }

  public void setPcoUnit(Double pcoUnit) {
    this.pcoUnit = pcoUnit;
  }

}
