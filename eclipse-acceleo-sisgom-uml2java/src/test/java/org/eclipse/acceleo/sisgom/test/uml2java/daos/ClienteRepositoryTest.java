package org.eclipse.acceleo.sisgom.test.uml2java.daos;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.log4j.Logger;
import org.eclipse.acceleo.sisgom.uml2java.daos.ClienteDao;
import org.eclipse.acceleo.sisgom.uml2java.entities.ClienteEntity;
import org.eclipse.acceleo.sisgom.uml2java.entities.ContatoEntity;
import org.eclipse.acceleo.sisgom.uml2java.entities.EnderecoEntity;
import org.eclipse.acceleo.sisgom.uml2java.entities.VeiculoEntitty;
import org.eclipse.acceleo.sisgom.uml2java.utils.DaoFactory;
import org.junit.Test;

public class ClienteRepositoryTest {

	private static final Logger LOGGER = Logger
			.getLogger(FornecedorRepositoryTest.class);

	private ClienteDao clienteDao = DaoFactory.clienteInstance();

	@Test
	public void testFindAll() {
		List<ClienteEntity> cliente = this.clienteDao.findAll();

		LOGGER.info(cliente);
	}

	@Test
	public void testFindById() {
		Integer id = this.save().getId();

		ClienteEntity Servico = this.clienteDao.findById(id);

		LOGGER.info(Servico);
	}

	@Test
	public void testInsert() {
		this.save();
	}

	@Test
	public void testDelete() {
		ClienteEntity cliente = this.save();

		this.clienteDao.delete(cliente);

		LOGGER.info("Servico deleted " + cliente);
	}

	private ClienteEntity save() {
		List<ContatoEntity> contatos = new ArrayList<ContatoEntity>() {
			private static final long serialVersionUID = 8648716238561273811L;

			{
				add(new ContatoEntity("email2@cliente.com", "(19) 33333-3333"));
			}
		};
		List<EnderecoEntity> endereco = new ArrayList<EnderecoEntity>() {
			private static final long serialVersionUID = 3150057553442149089L;

			{
				add(new EnderecoEntity("Rua 3", "Americana 3", "São Paulo 2",
						2, "13467-000", "Centro 3"));
			}
		};

		ClienteEntity cliente = new ClienteEntity(contatos, endereco,
				"Cliente 1", "124451154444", (new Random()).nextInt());

		
		String chassi = new BigInteger(130, new SecureRandom()).toString(45);
		final VeiculoEntitty veiculo = new VeiculoEntitty(chassi, 2015,
				"HB20", "prata", null);
		
		List<VeiculoEntitty> veiculos = new ArrayList<VeiculoEntitty>() {
			private static final long serialVersionUID = 1L;

			{
				add(veiculo);
			}
		};

		cliente.setVeiculo(veiculos);
		
		clienteDao.save(cliente);
				
		LOGGER.info("Cliente saved " + cliente);

		return cliente;
	}
}
