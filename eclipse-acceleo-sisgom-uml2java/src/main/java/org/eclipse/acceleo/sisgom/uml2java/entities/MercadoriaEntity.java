package org.eclipse.acceleo.sisgom.uml2java.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.eclipse.acceleo.sisgom.uml2java.utils.BaseBean;

@Entity
@Table(name="Mercadoria")
public class MercadoriaEntity extends BaseBean {
	private static final long serialVersionUID = -8905377519843249323L;
	
	public MercadoriaEntity(){
		super();
	}

	public MercadoriaEntity(String nome, float valorCompra, float valorVenda){
		super();
		this.nome = nome;
		this.valorCompra = valorCompra;
		this.valorVenda = valorVenda;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	private String nome;
	private float valorCompra;
	private float valorVenda;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(float valorCompra) {
		this.valorCompra = valorCompra;
	}

	public float getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(float valorVenda) {
		this.valorVenda = valorVenda;
	}

}
