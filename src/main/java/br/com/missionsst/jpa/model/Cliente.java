package br.com.missionsst.jpa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long codCliente;
  private String nomeCliente;
  private String endereco;
  private String cidade;
  private String cep;
  private String uf;
  private String cpfCnpj;
  private String ie;
  private String limiteCompra;
  private String estado;


  public Long getCodCliente() {
    return codCliente;
  }

  public void setCodCliente(Long codCliente) {
    this.codCliente = codCliente;
  }


  public String getNomeCliente() {
    return nomeCliente;
  }

  public void setNomeCliente(String nomeCliente) {
    this.nomeCliente = nomeCliente;
  }


  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }


  public String getCidade() {
    return cidade;
  }

  public void setCidade(String cidade) {
    this.cidade = cidade;
  }


  public String getCep() {
    return cep;
  }

  public void setCep(String cep) {
    this.cep = cep;
  }


  public String getUf() {
    return uf;
  }

  public void setUf(String uf) {
    this.uf = uf;
  }


  public String getCpfCnpj() {
    return cpfCnpj;
  }

  public void setCpfCnpj(String cpfCnpj) {
    this.cpfCnpj = cpfCnpj;
  }


  public String getIe() {
    return ie;
  }

  public void setIe(String ie) {
    this.ie = ie;
  }


  public String getLimiteCompra() {
    return limiteCompra;
  }

  public void setLimiteCompra(String limiteCompra) {
    this.limiteCompra = limiteCompra;
  }


  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

}
