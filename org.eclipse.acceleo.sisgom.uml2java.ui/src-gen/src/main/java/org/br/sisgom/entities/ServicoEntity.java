package org.br.sisgom.entities;

import org.br.sisgom.utils.GenericDao.BaseBean;

	
	
// Start of user code for imports
// End of user code

public  class ServicoEntity extends BaseBean
 {
	private int codigo;
	
	private String nome;
	
	private float valor;
	
	public ServicoEntity() {
		super();
	}
	
	
	public int getCodigo() {
		return this.codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public float getValor() {
		return this.valor;
	}
	
	public void setValor(float valor) {
		this.valor = valor;
	}
	
}
