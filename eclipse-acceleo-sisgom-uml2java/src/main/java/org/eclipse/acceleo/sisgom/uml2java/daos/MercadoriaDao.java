package org.eclipse.acceleo.sisgom.uml2java.daos;

import java.util.List;

import org.eclipse.acceleo.sisgom.uml2java.entities.MercadoriaEntity;
import org.eclipse.acceleo.sisgom.uml2java.utils.GenericDao;

public class MercadoriaDao extends GenericDao<MercadoriaEntity, Integer> {
	@SuppressWarnings("unchecked")
	public List<MercadoriaEntity> findByMercadoriaName(String mercadoriaNome) {
		List<MercadoriaEntity> mercadorias = (List<MercadoriaEntity>)
				this.executeQuery("SELECT c FROM MercadoriaEntity c WHERE c.nome = ?0", mercadoriaNome);

		return mercadorias;
	}
}