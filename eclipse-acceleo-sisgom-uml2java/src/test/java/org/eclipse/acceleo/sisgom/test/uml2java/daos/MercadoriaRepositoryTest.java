package org.eclipse.acceleo.sisgom.test.uml2java.daos;

import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.acceleo.sisgom.uml2java.daos.MercadoriaDao;
import org.eclipse.acceleo.sisgom.uml2java.entities.MercadoriaEntity;
import org.eclipse.acceleo.sisgom.uml2java.utils.DaoFactory;
import org.junit.Test;

public class MercadoriaRepositoryTest {

	private static final Logger LOGGER = Logger.getLogger(MercadoriaRepositoryTest.class);

	private MercadoriaDao mercadoriaDao = DaoFactory.mercadoriaInstance();

	@Test
	public void testFindAll() {
		List<MercadoriaEntity> mercadorias = mercadoriaDao.findAll();

		LOGGER.info(mercadorias);
	}
	@Test
	public void testFindById() {
		Integer id = this.save("Mercadoria 2").getCodigo();

		MercadoriaEntity mercadoria = this.mercadoriaDao.findById(id);

		LOGGER.info(mercadoria);
	}

	@Test
	public void testInsert() {
		this.save(null);
	}

	@Test
	public void testDelete() {
		MercadoriaEntity mercadoria = this.save("Mercadoria Deletada");

		this.mercadoriaDao.delete(mercadoria);

		LOGGER.info("mercadoria deleted " + mercadoria);
	}

	@Test
	public void testFindmercadoriaName() {
		this.save("Mercadoria 1");
		List<MercadoriaEntity> categories = this.mercadoriaDao.findByMercadoriaName("Mercadoria 1");

		LOGGER.info(categories);
	}

	private MercadoriaEntity save(String mercadoriaNome) {
		if(mercadoriaNome == null )
			mercadoriaNome = "Mercadoria 1";
		
		MercadoriaEntity mercadoria = new MercadoriaEntity(mercadoriaNome, 10.12F, 154.15F);

		this.mercadoriaDao.save(mercadoria);

		LOGGER.info("Mercadoria saved " + mercadoria);

		return mercadoria;
	}
	
}
