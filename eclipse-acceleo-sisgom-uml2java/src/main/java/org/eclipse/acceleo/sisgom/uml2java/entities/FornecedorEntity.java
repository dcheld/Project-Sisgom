/**
 * Generated by Acceleo 3
 * All rights reserved.
 */
package org.eclipse.acceleo.sisgom.uml2java.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

// Start of user code for imports
// End of user code
@Entity
@Table(name = "Fornecedor")
@PrimaryKeyJoinColumn(name="Id")
public class FornecedorEntity extends PessoaBaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3157794866268695132L;
	private String inscricaoEstadual;

	public FornecedorEntity() {
		super();
	}

	public FornecedorEntity(List<ContatoEntity> contatos, List<EnderecoEntity> enderecos, String nome, String cPFouCNPJ, String inscricaoEstadual){
		super(contatos, enderecos, nome, cPFouCNPJ);
		this.inscricaoEstadual = inscricaoEstadual;
	}
	
	public String getInscricaoEstadual() {
		return this.inscricaoEstadual;
	}

	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}

}
