package org.br.sisgom.test.daos;

import MercadoriaDao
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.log4j.Logger;
// Start of user code imports do test
import org.br.sisgom.entities.MercadoriaEntity;
import org.br.sisgom.entities.MercadoriaDao;
// End of user code

public class MercadoriaRepositoryTest {

	private static final Logger LOGGER = Logger.getLogger(MercadoriaRepositoryTest.class);
	private MercadoriaDao mercadoriaDao = FactoryDao.mercadoriaInstance();

	@Test
	public void testFindAll() {
		// Start of user code Encontrar todos
		List<MercadoriaEntity> mercadoria = this.mercadoriaDao.findAll();

		LOGGER.info(mercadoria);
		// End of user code
	}

	@Test
	public void testFindById() {
		
		MercadoriaEntity mercadoria = this.save();
		
		
		Integer id = 0;

		Entity mercadoria = this.mercadoriaDao.findById(id);

		LOGGER.info(mercadoria);
		// Start of user code Encontrar por Id
		// End of user code
	}

	@Test
	public void testInsert() {
		this.save();
	}

	@Test
	public void testDelete() {
		// Start of user code Deletar
		MercadoriaEntity mercadoria = this.save();

		this.mercadoriaDao.delete(mercadoria); 

		LOGGER.info("Mercadoria deletado(a):" + mercadoria);
		// End of user code
	}

	private MercadoriaEntity save() {
		// Start of user code Salvar
		MercadoriaEntity mercadoria = new MercadoriaEntity();

		this.servicoDao.save(mercadoria);

		LOGGER.info("Mercadoria saved " + mercadoria);

		return mercadoria;
		// End of user code
	}
}
