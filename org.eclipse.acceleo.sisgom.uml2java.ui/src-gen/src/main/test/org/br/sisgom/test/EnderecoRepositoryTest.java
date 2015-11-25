package org.br.sisgom.test.daos;

import EnderecoDao
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.log4j.Logger;
// Start of user code imports do test
import org.br.sisgom.entities.EnderecoEntity;
import org.br.sisgom.entities.EnderecoDao;
// End of user code

public class EnderecoRepositoryTest {

	private static final Logger LOGGER = Logger.getLogger(EnderecoRepositoryTest.class);
	private EnderecoDao enderecoDao = FactoryDao.enderecoInstance();

	@Test
	public void testFindAll() {
		// Start of user code Encontrar todos
		List<EnderecoEntity> endereco = this.enderecoDao.findAll();

		LOGGER.info(endereco);
		// End of user code
	}

	@Test
	public void testFindById() {
		
		EnderecoEntity endereco = this.save();
		
		
		Integer id = endereco.getId();

		Entity endereco = this.enderecoDao.findById(id);

		LOGGER.info(endereco);
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
		EnderecoEntity endereco = this.save();

		this.enderecoDao.delete(endereco); 

		LOGGER.info("Endereco deletado(a):" + endereco);
		// End of user code
	}

	private EnderecoEntity save() {
		// Start of user code Salvar
		EnderecoEntity endereco = new EnderecoEntity();

		this.servicoDao.save(endereco);

		LOGGER.info("Endereco saved " + endereco);

		return endereco;
		// End of user code
	}
}
