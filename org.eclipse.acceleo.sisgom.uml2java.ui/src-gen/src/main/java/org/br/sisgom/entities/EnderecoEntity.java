package org.br.sisgom.entities;

import org.br.sisgom.utils.GenericDao.BaseBean;

	
	import javax.persistence.*;
// Start of user code for imports
// End of user code
@Entity
public  class EnderecoEntity extends BaseBean
 {
	private String estado;
	
	private String rua;
	
	private int numero;
	
	private int id;
	
	private String cidade;
	
	private String cEP;
	
	private String bairro;
	
	public EnderecoEntity() {
		super();
	}
	
	
	public String getEstado() {
		return this.estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	public String getRua() {
		return this.rua;
	}
	
	public void setRua(String rua) {
		this.rua = rua;
	}
	
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	
	public String getCidade() {
		return this.cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	
	public String getCEP() {
		return this.cEP;
	}
	
	public void setCEP(String cEP) {
		this.cEP = cEP;
	}
	
	
	public String getBairro() {
		return this.bairro;
	}
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
}
