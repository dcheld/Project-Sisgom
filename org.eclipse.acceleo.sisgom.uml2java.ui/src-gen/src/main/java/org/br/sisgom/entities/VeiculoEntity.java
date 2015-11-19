package org.br.sisgom.entities;

import org.br.sisgom.utils.GenericDao.BaseBean;

	
	
// Start of user code for imports
// End of user code

public  class VeiculoEntity extends BaseBean
 {
	private String chassis;
	
	private int id;
	
	private String cor;
	
	private String modelo;
	
	private int ano;
	
	public VeiculoEntity() {
		super();
	}
	
	
	public String getChassis() {
		return this.chassis;
	}
	
	public void setChassis(String chassis) {
		this.chassis = chassis;
	}
	
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	
	public String getCor() {
		return this.cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
	public String getModelo() {
		return this.modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	
	public int getAno() {
		return this.ano;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
}
