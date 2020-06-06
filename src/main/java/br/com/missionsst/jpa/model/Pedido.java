package br.com.missionsst.jpa.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Pedido {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long numPedido;
  private Date dataCompra;
  private Date dataEntrega;

  @ManyToOne
  private Cliente codCliente;
  @ManyToOne
  private Vendedor codVendedor;

  public Pedido() {
  }

  public Pedido(Date dataCompra, Date dataEntrega, Cliente codCliente, Vendedor codVendedor) {
    this.dataCompra = dataCompra;
    this.dataEntrega = dataEntrega;
    this.codCliente = codCliente;
    this.codVendedor = codVendedor;
  }

  public Long getNumPedido() {
    return numPedido;
  }

  public void setNumPedido(Long numPedido) {
    this.numPedido = numPedido;
  }


  public Date getDataCompra() {
    return dataCompra;
  }

  public void setDataCompra(Date dataCompra) {
    this.dataCompra = dataCompra;
  }


  public Date getDataEntrega() {
    return dataEntrega;
  }

  public void setDataEntrega(java.sql.Timestamp dataEntrega) {
    this.dataEntrega = dataEntrega;
  }


  public Cliente getCodCliente() {
    return codCliente;
  }

  public void setCodCliente(Cliente codCliente) {
    this.codCliente = codCliente;
  }


  public Vendedor getCodVendedor() {
    return codVendedor;
  }

  public void setCodVendedor(Vendedor codVendedor) {
    this.codVendedor = codVendedor;
  }

}
