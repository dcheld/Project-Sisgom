package org.eclipse.acceleo.sisgom.uml2java.daos;

import java.util.List;

import org.eclipse.acceleo.sisgom.uml2java.entities.ServicoEntity;
import org.eclipse.acceleo.sisgom.uml2java.utils.GenericDao;

public class ServicoDao extends GenericDao<ServicoEntity, Integer> {

	@SuppressWarnings("unchecked")
	public List<ServicoEntity> findByServicoNome(String servicoName) {
		List<ServicoEntity> categories = (List<ServicoEntity>)
				this.executeQuery("SELECT c FROM ServicoEntity c WHERE c.nome = ?0", servicoName);

		return categories;
	}

}
