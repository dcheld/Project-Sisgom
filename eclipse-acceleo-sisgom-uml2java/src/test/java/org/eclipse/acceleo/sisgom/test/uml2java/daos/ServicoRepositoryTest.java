package org.eclipse.acceleo.sisgom.test.uml2java.daos;

import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.acceleo.sisgom.uml2java.daos.ServicoDao;
import org.eclipse.acceleo.sisgom.uml2java.entities.ServicoEntity;
import org.eclipse.acceleo.sisgom.uml2java.utils.DaoFactory;
import org.junit.Test;

public class ServicoRepositoryTest {

	private static final Logger LOGGER = Logger
			.getLogger(ServicoRepositoryTest.class);

	private ServicoDao servicoDao = DaoFactory.servicoInstance();

	@Test
	public void testFindAll() {
		List<ServicoEntity> servicos = this.servicoDao.findAll();

		LOGGER.info(servicos);
	}
	
	@Test
	public void testFindById() {
		Integer id = this.save("Servico 2").getCodigo();

		ServicoEntity Servico = this.servicoDao.findById(id);

		LOGGER.info(Servico);
	}

	@Test
	public void testInsert() {
		this.save(null);
	}

	@Test
	public void testDelete() {
		ServicoEntity Servico = this.save("Servico Deletada");

		this.servicoDao.delete(Servico);

		LOGGER.info("Servico deleted " + Servico);
	}

	@Test
	public void testFindServicoName() {
		this.save("Servico Busca");
		List<ServicoEntity> categories = this.servicoDao.findByServicoNome("Servico Busca");

		LOGGER.info(categories);
	}

	private ServicoEntity save(String ServicoNome) {
		if(ServicoNome == null )
			ServicoNome = "Servico 1";
		
		ServicoEntity servico = new ServicoEntity(ServicoNome, 80.15F);

		this.servicoDao.save(servico);

		LOGGER.info("Servico saved " + servico);

		return servico;
	}

}
