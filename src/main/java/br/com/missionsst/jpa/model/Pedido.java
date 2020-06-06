package br.com.missionsst.jpa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pedido {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long numPedido;
  private java.sql.Timestamp dataCompra;
  private java.sql.Timestamp dataEntrega;
  private Long codCliente;
  private Long codVendedor;


  public Long getNumPedido() {
    return numPedido;
  }

  public void setNumPedido(Long numPedido) {
    this.numPedido = numPedido;
  }


  public java.sql.Timestamp getDataCompra() {
    return dataCompra;
  }

  public void setDataCompra(java.sql.Timestamp dataCompra) {
    this.dataCompra = dataCompra;
  }


  public java.sql.Timestamp getDataEntrega() {
    return dataEntrega;
  }

  public void setDataEntrega(java.sql.Timestamp dataEntrega) {
    this.dataEntrega = dataEntrega;
  }


  public Long getCodCliente() {
    return codCliente;
  }

  public void setCodCliente(Long codCliente) {
    this.codCliente = codCliente;
  }


  public Long getCodVendedor() {
    return codVendedor;
  }

  public void setCodVendedor(Long codVendedor) {
    this.codVendedor = codVendedor;
  }

}
