package org.br.sisgom.test.daos;

import ClienteDao
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.log4j.Logger;
// Start of user code imports do test
import org.br.sisgom.entities.ClienteEntity;
import org.br.sisgom.entities.ClienteDao;
// End of user code

public class ClienteRepositoryTest {

	private static final Logger LOGGER = Logger.getLogger(ClienteRepositoryTest.class);
	private ClienteDao clienteDao = FactoryDao.clienteInstance();

	@Test
	public void testFindAll() {
		// Start of user code Encontrar todos
		List<ClienteEntity> cliente = this.clienteDao.findAll();

		LOGGER.info(cliente);
		// End of user code
	}

	@Test
	public void testFindById() {
		
		ClienteEntity cliente = this.save();
		
		
		Integer id = 0;

		Entity cliente = this.clienteDao.findById(id);

		LOGGER.info(cliente);
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
		ClienteEntity cliente = this.save();

		this.clienteDao.delete(cliente); 

		LOGGER.info("Cliente deletado(a):" + cliente);
		// End of user code
	}

	private ClienteEntity save() {
		// Start of user code Salvar
		ClienteEntity cliente = new ClienteEntity();

		this.servicoDao.save(cliente);

		LOGGER.info("Cliente saved " + cliente);

		return cliente;
		// End of user code
	}
}
