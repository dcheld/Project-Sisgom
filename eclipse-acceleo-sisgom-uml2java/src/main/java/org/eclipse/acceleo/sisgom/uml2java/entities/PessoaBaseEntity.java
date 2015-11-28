/**
 * Generated by Acceleo 3
 * All rights reserved.
 */
package org.eclipse.acceleo.sisgom.uml2java.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.eclipse.acceleo.sisgom.uml2java.utils.BaseBean;

@Entity
@Table(name = "PessoaBase")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class PessoaBaseEntity  extends BaseBean {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4513608586119903698L;

	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="PessoaBase_Id", nullable = false, insertable = true, updatable = true)
	private List<ContatoEntity> contatos;
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="PessoaBase_Id", nullable = false, insertable = true, updatable = true)
	private List<EnderecoEntity> enderecos;
	
	private String nome;
	
	private String cpfouCnpj;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	public PessoaBaseEntity(List<ContatoEntity> contatos, List<EnderecoEntity> enderecos, String nome, String cPFouCNPJ) {
		super();
		this.contatos = contatos;
		this.enderecos = enderecos; 
		this.nome = nome;
		this.cpfouCnpj = cPFouCNPJ;
	}
	
	public PessoaBaseEntity() {
		super();
	}
	
	
	public List<ContatoEntity> getContato() {
		return this.contatos;
	}
	
	public void setContato(List<ContatoEntity> contatos) {
		this.contatos = contatos;
	}
	
	public List<EnderecoEntity> getEndereco() {
		return this.enderecos;
	}
	
	public void setEndereco(List<EnderecoEntity> enderecos) {
		this.enderecos = enderecos;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
		
	public String getCpfouCnpj() {
		return this.cpfouCnpj;
	}
	
	public void setCpfouCnpj(String cpfouCnpj) {
		this.cpfouCnpj = cpfouCnpj;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
}