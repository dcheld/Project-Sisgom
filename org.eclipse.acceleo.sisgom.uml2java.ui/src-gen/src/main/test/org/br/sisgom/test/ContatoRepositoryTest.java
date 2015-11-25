package org.br.sisgom.test.daos;

import ContatoDao
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.log4j.Logger;
// Start of user code imports do test
import org.br.sisgom.entities.ContatoEntity;
import org.br.sisgom.entities.ContatoDao;
// End of user code

public class ContatoRepositoryTest {

	private static final Logger LOGGER = Logger.getLogger(ContatoRepositoryTest.class);
	private ContatoDao contatoDao = FactoryDao.contatoInstance();

	@Test
	public void testFindAll() {
		// Start of user code Encontrar todos
		List<ContatoEntity> contato = this.contatoDao.findAll();

		LOGGER.info(contato);
		// End of user code
	}

	@Test
	public void testFindById() {
		
		ContatoEntity contato = this.save();
		
		
		Integer id = 0;

		Entity contato = this.contatoDao.findById(id);

		LOGGER.info(contato);
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
		ContatoEntity contato = this.save();

		this.contatoDao.delete(contato); 

		LOGGER.info("Contato deletado(a):" + contato);
		// End of user code
	}

	private ContatoEntity save() {
		// Start of user code Salvar
		ContatoEntity contato = new ContatoEntity();

		this.servicoDao.save(contato);

		LOGGER.info("Contato saved " + contato);

		return contato;
		// End of user code
	}
}
