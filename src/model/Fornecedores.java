package model;

import java.util.Date;

public class Fornecedores {
	
  private int idCodigo;
  private Date dDataCad;
  private double nValor;
  private int cCNPJ;
  private String cNome;
  
  public int getidCodigo() {
	  return idCodigo;
  }
  public void setidCodigo(int idCodigo) {
	  this.idCodigo = idCodigo;
  }
  public Date getdDataCad() {
	  return dDataCad;
  }
  public void setdDataCad(Date dDataCad) {
	  this.dDataCad = dDataCad;
  }
  public double getvnValor() { 
	  return nValor;
  }
  public void setvnValor(double nValor) {
	  this.nValor = nValor;
  }
  public int getcCNPJ() {
	  return cCNPJ;
  }
  public void setcCNPJ(int cCNPJ) {
	  this.cCNPJ = cCNPJ;
  }
  
  public String getcNome() {
	  return cNome;
  }
  public void setcNome(String cNome) {
	  this.cNome = cNome;
  }
}