package br.com.missionsst.javacrud.domain.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Objects;

@Entity
public class Cliente {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long codCliente;
  @NotBlank
  private String nomeCliente;
  @NotBlank
  private String endereco;
  @NotBlank
  private String cidade;
  @NotBlank
  @Size(min = 2, max = 2)
  private String uf;
  @NotBlank
  private String cep;
  @NotBlank
  private String cpfCnpj;
  @NotBlank
  private String ie;
  @NotBlank
  private Double limiteCompra;

  public Cliente(){}

  public Cliente(String nomeCliente, String endereco, String cidade, String cep, String uf, String cpfCnpj, String ie, Double limiteCompra) {
    this.nomeCliente = nomeCliente;
    this.endereco = endereco;
    this.cidade = cidade;
    this.cep = cep;
    this.uf = uf;
    this.cpfCnpj = cpfCnpj;
    this.ie = ie;
    this.limiteCompra = limiteCompra;
  }



  public Long getCodCliente() {
    return codCliente;
  }

  public void setCodCliente(long codCliente) {
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


  public Double getLimiteCompra() {
    return limiteCompra;
  }

  public void setLimiteCompra(Double limiteCompra) {
    this.limiteCompra = limiteCompra;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Cliente cliente = (Cliente) o;
    return codCliente.equals(cliente.codCliente);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codCliente);
  }
}
