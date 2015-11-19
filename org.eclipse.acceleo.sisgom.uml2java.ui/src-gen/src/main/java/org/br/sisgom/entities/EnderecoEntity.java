package org.br.sisgom.entities;

import org.br.sisgom.utils.GenericDao.BaseBean;

	
	import javax.persistence.*;
// Start of user code for imports
// End of user code
@Entity
public  class EnderecoEntity extends BaseBean
 {
	private int id;
	
	private String estado;
	
	private String cEP;
	
	private String rua;
	
	private String bairro;
	
	private String cidade;
	
	private int numero;
	
	public EnderecoEntity() {
		super();
	}
	
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	
	public String getEstado() {
		return this.estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	public String getCEP() {
		return this.cEP;
	}
	
	public void setCEP(String cEP) {
		this.cEP = cEP;
	}
	
	
	public String getRua() {
		return this.rua;
	}
	
	public void setRua(String rua) {
		this.rua = rua;
	}
	
	
	public String getBairro() {
		return this.bairro;
	}
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	
	public String getCidade() {
		return this.cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
}
