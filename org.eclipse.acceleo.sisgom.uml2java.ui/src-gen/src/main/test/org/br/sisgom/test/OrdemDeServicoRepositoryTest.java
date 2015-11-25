package org.br.sisgom.test.daos;

import OrdemDeServicoDao
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.log4j.Logger;
// Start of user code imports do test
import org.br.sisgom.entities.OrdemDeServicoEntity;
import org.br.sisgom.entities.OrdemDeServicoDao;
// End of user code

public class OrdemDeServicoRepositoryTest {

	private static final Logger LOGGER = Logger.getLogger(OrdemDeServicoRepositoryTest.class);
	private OrdemDeServicoDao ordemDeServicoDao = FactoryDao.ordemDeServicoInstance();

	@Test
	public void testFindAll() {
		// Start of user code Encontrar todos
		List<OrdemDeServicoEntity> ordemDeServico = this.ordemDeServicoDao.findAll();

		LOGGER.info(ordemDeServico);
		// End of user code
	}

	@Test
	public void testFindById() {
		
		OrdemDeServicoEntity ordemDeServico = this.save();
		
		
		Integer id = ordemDeServico.getCodigo();

		Entity ordemDeServico = this.ordemDeServicoDao.findById(id);

		LOGGER.info(ordemDeServico);
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
		OrdemDeServicoEntity ordemDeServico = this.save();

		this.ordemDeServicoDao.delete(ordemDeServico); 

		LOGGER.info("OrdemDeServico deletado(a):" + ordemDeServico);
		// End of user code
	}

	private OrdemDeServicoEntity save() {
		// Start of user code Salvar
		OrdemDeServicoEntity ordemDeServico = new OrdemDeServicoEntity();

		this.servicoDao.save(ordemDeServico);

		LOGGER.info("OrdemDeServico saved " + ordemDeServico);

		return ordemDeServico;
		// End of user code
	}
}
