package org.br.sisgom.test.daos;

import ServicoDao
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.log4j.Logger;
// Start of user code imports do test
import org.br.sisgom.entities.ServicoEntity;
import org.br.sisgom.entities.ServicoDao;
// End of user code

public class ServicoRepositoryTest {

	private static final Logger LOGGER = Logger.getLogger(ServicoRepositoryTest.class);
	private ServicoDao servicoDao = FactoryDao.servicoInstance();

	@Test
	public void testFindAll() {
		// Start of user code Encontrar todos
		List<ServicoEntity> servico = this.servicoDao.findAll();

		LOGGER.info(servico);
		// End of user code
	}

	@Test
	public void testFindById() {
		
		ServicoEntity servico = this.save();
		
		
		Integer id = 0;

		Entity servico = this.servicoDao.findById(id);

		LOGGER.info(servico);
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
		ServicoEntity servico = this.save();

		this.servicoDao.delete(servico); 

		LOGGER.info("Servico deletado(a):" + servico);
		// End of user code
	}

	private ServicoEntity save() {
		// Start of user code Salvar
		ServicoEntity servico = new ServicoEntity();

		this.servicoDao.save(servico);

		LOGGER.info("Servico saved " + servico);

		return servico;
		// End of user code
	}
}
