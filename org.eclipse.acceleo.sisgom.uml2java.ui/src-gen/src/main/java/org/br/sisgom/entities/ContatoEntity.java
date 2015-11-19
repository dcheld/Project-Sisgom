package org.br.sisgom.entities;

import org.br.sisgom.utils.GenericDao.BaseBean;

	
	
// Start of user code for imports
// End of user code

public  class ContatoEntity extends BaseBean
 {
	private String telefone;
	
	private int id;
	
	private String email;
	
	public ContatoEntity() {
		super();
	}
	
	
	public String getTelefone() {
		return this.telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
}
