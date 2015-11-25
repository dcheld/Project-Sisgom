package org.br.sisgom.test.daos;

import FornecedorDao
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.log4j.Logger;
// Start of user code imports do test
import org.br.sisgom.entities.FornecedorEntity;
import org.br.sisgom.entities.FornecedorDao;
// End of user code

public class FornecedorRepositoryTest {

	private static final Logger LOGGER = Logger.getLogger(FornecedorRepositoryTest.class);
	private FornecedorDao fornecedorDao = FactoryDao.fornecedorInstance();

	@Test
	public void testFindAll() {
		// Start of user code Encontrar todos
		List<FornecedorEntity> fornecedor = this.fornecedorDao.findAll();

		LOGGER.info(fornecedor);
		// End of user code
	}

	@Test
	public void testFindById() {
		
		FornecedorEntity fornecedor = this.save();
		
		
		Integer id = 0;

		Entity fornecedor = this.fornecedorDao.findById(id);

		LOGGER.info(fornecedor);
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
		FornecedorEntity fornecedor = this.save();

		this.fornecedorDao.delete(fornecedor); 

		LOGGER.info("Fornecedor deletado(a):" + fornecedor);
		// End of user code
	}

	private FornecedorEntity save() {
		// Start of user code Salvar
		FornecedorEntity fornecedor = new FornecedorEntity();

		this.servicoDao.save(fornecedor);

		LOGGER.info("Fornecedor saved " + fornecedor);

		return fornecedor;
		// End of user code
	}
}
