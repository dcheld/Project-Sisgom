package org.eclipse.acceleo.sisgom.test.uml2java.daos;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.acceleo.sisgom.uml2java.daos.FornecedorDao;
import org.eclipse.acceleo.sisgom.uml2java.entities.ContatoEntity;
import org.eclipse.acceleo.sisgom.uml2java.entities.EnderecoEntity;
import org.eclipse.acceleo.sisgom.uml2java.entities.FornecedorEntity;
import org.eclipse.acceleo.sisgom.uml2java.utils.DaoFactory;
import org.junit.Test;

public class FornecedorRepositoryTest {

	private static final Logger LOGGER = Logger
			.getLogger(FornecedorRepositoryTest.class);

	private FornecedorDao fornecedorDao = DaoFactory.fornecedorInstance();

	@Test
	public void testFindAll() {
		List<FornecedorEntity> fornecedor = this.fornecedorDao.findAll();

		LOGGER.info(fornecedor);
	}

	@Test
	public void testFindById() {
		Integer id = this.save().getId();

		FornecedorEntity Fornecedor = this.fornecedorDao.findById(id);

		LOGGER.info(Fornecedor);
	}

	@Test
	public void testInsert() {
		this.save();
	}

	@Test
	public void testDelete() {
		FornecedorEntity fornecedor = this.save();

		this.fornecedorDao.delete(fornecedor);

		LOGGER.info("Fornecedor deleted " + fornecedor);
	}

	private FornecedorEntity save() {

		List<ContatoEntity> contatos = new ArrayList<ContatoEntity>() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 8648716238561273811L;

			{
				add(new ContatoEntity("email@teste.com", "(19) 11111-1111"));
			}
		};
		List<EnderecoEntity> endereco = new ArrayList<EnderecoEntity>() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 3150057553442149089L;

			{
				add(new EnderecoEntity("Rua 1", "Americana", "São Paulo", 1,
						"13467-000", "Centro"));
			}
		};

		FornecedorEntity fornecedor = new FornecedorEntity(contatos, endereco,
				"Fonecedor 1", "124451154444", "154545444");

		this.fornecedorDao.save(fornecedor);

		LOGGER.info("Fornecedor saved " + fornecedor);

		return fornecedor;
	}

}
