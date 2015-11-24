package org.br.sisgom.entities;

import org.br.sisgom.utils.GenericDao.BaseBean;

	
	
// Start of user code for imports
// End of user code

public  class MercadoriaEntity extends BaseBean
 {
	private float valorCompra;
	
	private String nome;
	
	private float valorVenda;
	
	private int codigo;
	
	public MercadoriaEntity() {
		super();
	}
	
	
	public float getValorCompra() {
		return this.valorCompra;
	}
	
	public void setValorCompra(float valorCompra) {
		this.valorCompra = valorCompra;
	}
	
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public float getValorVenda() {
		return this.valorVenda;
	}
	
	public void setValorVenda(float valorVenda) {
		this.valorVenda = valorVenda;
	}
	
	
	public int getCodigo() {
		return this.codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
}
