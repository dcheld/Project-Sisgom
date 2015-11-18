package org.eclipse.acceleo.sisgom.uml2java.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.eclipse.acceleo.sisgom.uml2java.utils.BaseBean;

@Entity
@Table(name="Servico")
public class ServicoEntity extends BaseBean {

	private static final long serialVersionUID = -16240817663243274L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	private float valor;
	private String nome;
	
	public ServicoEntity() {
		super();
	}
	
	public ServicoEntity(String nome, float valor) {
		super();
		this.valor = valor;
		this.nome = nome;
	}

	public Integer getCodigo() {
		return this.codigo;
	}
	
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	
	public Float getValor() {
		return this.valor;
	}
	
	public void setValor(Float valor) {
		this.valor = valor;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}
