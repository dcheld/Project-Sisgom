package org.br.sisgom.utils;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.br.sisgom.daos.VeiculoDao;
import org.br.sisgom.daos.FuncionarioDao;
import org.br.sisgom.daos.FornecedorDao;
import org.br.sisgom.daos.MercadoriaDao;
import org.br.sisgom.daos.ClienteDao;
import org.br.sisgom.daos.EnderecoDao;
import org.br.sisgom.daos.ContatoDao;
import org.br.sisgom.daos.OrdemDeServicoDao;
import org.br.sisgom.daos.ServicoDao;

public final class FactoryDao {

	private DaoFactory() {
	}

	private static final String PERSISTENCE_UNIT_NAME = "";

	private static EntityManagerFactory entityManagerFactoryInstance;

	public static EntityManagerFactory entityManagerFactorInstance() {
		if (entityManagerFactoryInstance == null) {
			entityManagerFactoryInstance = Persistence
					.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		}

		return entityManagerFactoryInstance;
	}

	private static VeiculoDao veiculoDaoInstance;

	public static VeiculoDao veiculoInstance() {
		if (servicoDaoInstance == null) {
			veiculoDao = new VeiculoDao();
		}

		return veiculoDao;
	}
	private static FuncionarioDao funcionarioDaoInstance;

	public static FuncionarioDao funcionarioInstance() {
		if (servicoDaoInstance == null) {
			funcionarioDao = new FuncionarioDao();
		}

		return funcionarioDao;
	}
	private static FornecedorDao fornecedorDaoInstance;

	public static FornecedorDao fornecedorInstance() {
		if (servicoDaoInstance == null) {
			fornecedorDao = new FornecedorDao();
		}

		return fornecedorDao;
	}
	private static MercadoriaDao mercadoriaDaoInstance;

	public static MercadoriaDao mercadoriaInstance() {
		if (servicoDaoInstance == null) {
			mercadoriaDao = new MercadoriaDao();
		}

		return mercadoriaDao;
	}
	private static ClienteDao clienteDaoInstance;

	public static ClienteDao clienteInstance() {
		if (servicoDaoInstance == null) {
			clienteDao = new ClienteDao();
		}

		return clienteDao;
	}
	private static EnderecoDao enderecoDaoInstance;

	public static EnderecoDao enderecoInstance() {
		if (servicoDaoInstance == null) {
			enderecoDao = new EnderecoDao();
		}

		return enderecoDao;
	}
	private static ContatoDao contatoDaoInstance;

	public static ContatoDao contatoInstance() {
		if (servicoDaoInstance == null) {
			contatoDao = new ContatoDao();
		}

		return contatoDao;
	}
	private static OrdemDeServicoDao ordemDeServicoDaoInstance;

	public static OrdemDeServicoDao ordemDeServicoInstance() {
		if (servicoDaoInstance == null) {
			ordemDeServicoDao = new OrdemDeServicoDao();
		}

		return ordemDeServicoDao;
	}
	private static ServicoDao servicoDaoInstance;

	public static ServicoDao servicoInstance() {
		if (servicoDaoInstance == null) {
			servicoDao = new ServicoDao();
		}

		return servicoDao;
	}

}
