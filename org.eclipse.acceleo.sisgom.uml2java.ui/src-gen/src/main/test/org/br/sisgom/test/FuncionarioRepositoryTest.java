package org.br.sisgom.test.daos;

import FuncionarioDao
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.log4j.Logger;
// Start of user code imports do test
import org.br.sisgom.entities.FuncionarioEntity;
import org.br.sisgom.entities.FuncionarioDao;
// End of user code

public class FuncionarioRepositoryTest {

	private static final Logger LOGGER = Logger.getLogger(FuncionarioRepositoryTest.class);
	private FuncionarioDao funcionarioDao = FactoryDao.funcionarioInstance();

	@Test
	public void testFindAll() {
		// Start of user code Encontrar todos
		List<FuncionarioEntity> funcionario = this.funcionarioDao.findAll();

		LOGGER.info(funcionario);
		// End of user code
	}

	@Test
	public void testFindById() {
		
		FuncionarioEntity funcionario = this.save();
		
		
		Integer id = 0;

		Entity funcionario = this.funcionarioDao.findById(id);

		LOGGER.info(funcionario);
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
		FuncionarioEntity funcionario = this.save();

		this.funcionarioDao.delete(funcionario); 

		LOGGER.info("Funcionario deletado(a):" + funcionario);
		// End of user code
	}

	private FuncionarioEntity save() {
		// Start of user code Salvar
		FuncionarioEntity funcionario = new FuncionarioEntity();

		this.servicoDao.save(funcionario);

		LOGGER.info("Funcionario saved " + funcionario);

		return funcionario;
		// End of user code
	}
}
