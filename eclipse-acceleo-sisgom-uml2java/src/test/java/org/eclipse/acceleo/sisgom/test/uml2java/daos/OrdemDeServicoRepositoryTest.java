package org.eclipse.acceleo.sisgom.test.uml2java.daos;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.acceleo.sisgom.uml2java.daos.MercadoriaDao;
import org.eclipse.acceleo.sisgom.uml2java.daos.OrdemDeServicoDao;
import org.eclipse.acceleo.sisgom.uml2java.daos.ServicoDao;
import org.eclipse.acceleo.sisgom.uml2java.daos.VeiculoDao;
import org.eclipse.acceleo.sisgom.uml2java.entities.OrdemDeServicoEntity;
import org.eclipse.acceleo.sisgom.uml2java.utils.DaoFactory;
import org.junit.Test;

public class OrdemDeServicoRepositoryTest {

	private static final Logger LOGGER = Logger
			.getLogger(FornecedorRepositoryTest.class);

	private OrdemDeServicoDao ordemDeServicoDao = DaoFactory.ordemDeServicoInstance();
	private MercadoriaDao mercadoriaDao = DaoFactory.mercadoriaInstance();
	private ServicoDao servicoDao = DaoFactory.servicoInstance();
	private VeiculoDao veiculoDao = DaoFactory.veiculoInstance();

	@Test
	public void testFindAll() {
		List<OrdemDeServicoEntity> ordemDeServico = this.ordemDeServicoDao.findAll();

		LOGGER.info(ordemDeServico);
	}

	@Test
	public void testFindById() {
		Integer id = this.save().getCodigo();

		OrdemDeServicoEntity Servico = this.ordemDeServicoDao.findById(id);

		LOGGER.info(Servico);
	}

	@Test
	public void testInsert() {
		this.save();
	}

	@Test
	public void testDelete() {
		OrdemDeServicoEntity ordemDeServico = this.save();

		this.ordemDeServicoDao.delete(ordemDeServico);

		LOGGER.info("Servico deleted " + ordemDeServico);
	}

	private OrdemDeServicoEntity save() {

		OrdemDeServicoEntity ordemDeServico = new OrdemDeServicoEntity();
		ordemDeServico.setMercadorias(mercadoriaDao.findAll().get(0));
		ordemDeServico.setServicos(servicoDao.findAll().get(0));
		ordemDeServico.setVeiculo(veiculoDao.findAll().get(0));
		ordemDeServico.setDataEntradaVeiculo(new Date());
		
		ordemDeServicoDao.save(ordemDeServico);
				
		LOGGER.info("OrdemDeServico saved " + ordemDeServico);

		return ordemDeServico;
	}
}
