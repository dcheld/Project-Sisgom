package org.br.sisgom..test..daos;

import 
import org.junit.Test;

public class OrdemDeServicoRepositoryTest {

	private static final Log gger
			.getLogger(FornecedorRepositoryTest.class);

	private OrdemDeServicoDao ordemDeServicoDao = FactoryDao.ordemDeServicoInstance();

	@Test
	public void testFindAll() {
Start of user code Encontrar todos
		List<EnderecoEntity> endereco = this.enderecoDao.findAll();

		LOGGER.info(endereco);
End of user code
	}

	@Test
	public void testFindById() {
Start of user code Encontrar por Id
		Integer id = this.save().get();

		Entity endereco = this.enderecoDao.findById(id);

		LOGGER.info(endereco);
End of user code
	}

	@Test
	public void testInsert() {
		this.save();
	}

	@Test
	public void testDelete() {
Start of user code Deletar
		EnderecoEntity endereco = this.save();

		this.enderecoDao.delete(endereco); 

		LOGGER.info("Endereco deletado(a):" + endereco);
End of user code
	}

	private OrdemDeServicoEntity save() {
Start of user code Salvar
		EnderecoEntity endereco = new EnderecoEntity();

		this.servicoDao.save(endereco);

		LOGGER.info("Endereco saved " + endereco);

		return servico;
End of user code
	}
}
