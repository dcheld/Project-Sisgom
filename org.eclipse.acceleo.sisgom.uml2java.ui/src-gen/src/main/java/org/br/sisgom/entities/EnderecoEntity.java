package org.br.sisgom.entities;

import org.br.sisgom.utils.GenericDao.BaseBean;

	
	import javax.persistence.*;
// Start of user code for imports
// End of user code
@Entity
public  class EnderecoEntity extends BaseBean
 {
	private String rua;
	
	private String cEP;
	
	private int numero;
	
	private String estado;
	
	private int id;
	
	private String cidade;
	
	private String bairro;
	
	public EnderecoEntity() {
		super();
	}
	
	
	public String getRua() {
		return this.rua;
	}
	
	public void setRua(String rua) {
		this.rua = rua;
	}
	
	
	public String getCEP() {
		return this.cEP;
	}
	
	public void setCEP(String cEP) {
		this.cEP = cEP;
	}
	
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	public String getEstado() {
		return this.estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	@Id
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
	
	
	public String getBairro() {
		return this.bairro;
	}
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
}
