package org.br.sisgom.entities;

import org.br.sisgom.utils.GenericDao.BaseBean;

import java.util.List;
	
	
// Start of user code for imports
// End of user code

public abstract class PessoaBaseEntity extends BaseBean
 {
	private String nome;
	
	private int id;
	
	private List<EnderecoEntity> endereco;
	
	private String cPFouCNPJ;
	
	private List<ContatoEntity> contato;
	
	public PessoaBaseEntity() {
		super();
	}
	
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	
	public List<EnderecoEntity> getEndereco() {
		return this.endereco;
	}
	
	public void setEndereco(List<EnderecoEntity> endereco) {
		this.endereco = endereco;
	}
	
	
	public String getCPFouCNPJ() {
		return this.cPFouCNPJ;
	}
	
	public void setCPFouCNPJ(String cPFouCNPJ) {
		this.cPFouCNPJ = cPFouCNPJ;
	}
	
	
	public List<ContatoEntity> getContato() {
		return this.contato;
	}
	
	public void setContato(List<ContatoEntity> contato) {
		this.contato = contato;
	}
	
}
