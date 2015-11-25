package org.br.sisgom.test.daos;

import VeiculoDao
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.log4j.Logger;
// Start of user code imports do test
import org.br.sisgom.entities.VeiculoEntity;
import org.br.sisgom.entities.VeiculoDao;
// End of user code

public class VeiculoRepositoryTest {

	private static final Logger LOGGER = Logger.getLogger(VeiculoRepositoryTest.class);
	private VeiculoDao veiculoDao = FactoryDao.veiculoInstance();

	@Test
	public void testFindAll() {
		// Start of user code Encontrar todos
		List<VeiculoEntity> veiculo = this.veiculoDao.findAll();

		LOGGER.info(veiculo);
		// End of user code
	}

	@Test
	public void testFindById() {
		
		VeiculoEntity veiculo = this.save();
		
		
		Integer id = 0;

		Entity veiculo = this.veiculoDao.findById(id);

		LOGGER.info(veiculo);
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
		VeiculoEntity veiculo = this.save();

		this.veiculoDao.delete(veiculo); 

		LOGGER.info("Veiculo deletado(a):" + veiculo);
		// End of user code
	}

	private VeiculoEntity save() {
		// Start of user code Salvar
		VeiculoEntity veiculo = new VeiculoEntity();

		this.servicoDao.save(veiculo);

		LOGGER.info("Veiculo saved " + veiculo);

		return veiculo;
		// End of user code
	}
}
