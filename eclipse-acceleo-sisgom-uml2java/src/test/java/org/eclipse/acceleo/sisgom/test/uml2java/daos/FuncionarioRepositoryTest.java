package org.eclipse.acceleo.sisgom.test.uml2java.daos;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.log4j.Logger;
import org.eclipse.acceleo.sisgom.uml2java.daos.FuncionarioDao;
import org.eclipse.acceleo.sisgom.uml2java.entities.ContatoEntity;
import org.eclipse.acceleo.sisgom.uml2java.entities.EnderecoEntity;
import org.eclipse.acceleo.sisgom.uml2java.entities.FuncionarioEntity;
import org.eclipse.acceleo.sisgom.uml2java.utils.DaoFactory;
import org.junit.Test;

public class FuncionarioRepositoryTest {

	private static final Logger LOGGER = Logger
			.getLogger(FornecedorRepositoryTest.class);

	private FuncionarioDao FuncionarioDao = DaoFactory.funcionarioInstance();

	@Test
	public void testFindAll() {
		List<FuncionarioEntity> funcionario = this.FuncionarioDao.findAll();

		LOGGER.info(funcionario);
	}

	@Test
	public void testFindById() {
		Integer id = this.save().getId();

		FuncionarioEntity Funcionario = this.FuncionarioDao.findById(id);

		LOGGER.info(Funcionario);
	}

	@Test
	public void testInsert() {
		this.save();
	}

	@Test
	public void testDelete() {
		FuncionarioEntity Funcionario = this.save();

		this.FuncionarioDao.delete(Funcionario);

		LOGGER.info("Funcionario deleted " + Funcionario);
	}

	private FuncionarioEntity save() {
		List<ContatoEntity> contatos = new ArrayList<ContatoEntity>() {
			private static final long serialVersionUID = 8648716238561273811L;

			{
				add(new ContatoEntity("email2@teste.com", "(19) 22222-2222"));
			}
		};
		List<EnderecoEntity> endereco = new ArrayList<EnderecoEntity>() {
			private static final long serialVersionUID = 3150057553442149089L;

			{
				add(new EnderecoEntity("Rua 2", "Americana 2", "São Paulo 2", 2,
						"13467-000", "Centro 2"));
			}
		};

		FuncionarioEntity Funcionario = new FuncionarioEntity(contatos,
				endereco, "Funcionario 1", "124451154444", (new Random()).nextInt());

		this.FuncionarioDao.save(Funcionario);

		LOGGER.info("Funcionario saved " + Funcionario);

		return Funcionario;
	}
}
