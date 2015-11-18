package org.eclipse.acceleo.sisgom.uml2java.utils;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.eclipse.acceleo.sisgom.uml2java.daos.ClienteDao;
import org.eclipse.acceleo.sisgom.uml2java.daos.ContatoDao;
import org.eclipse.acceleo.sisgom.uml2java.daos.FornecedorDao;
import org.eclipse.acceleo.sisgom.uml2java.daos.FuncionarioDao;
import org.eclipse.acceleo.sisgom.uml2java.daos.MercadoriaDao;
import org.eclipse.acceleo.sisgom.uml2java.daos.OrdemDeServicoDao;
import org.eclipse.acceleo.sisgom.uml2java.daos.ServicoDao;
import org.eclipse.acceleo.sisgom.uml2java.daos.VeiculoDao;

public final class DaoFactory {

	private DaoFactory() {
	}

	// /////////////////////////////////////////////////////////////////
	// ENTITY MANAGER FACTORY
	// /////////////////////////////////////////////////////////////////

	private static final String PERSISTENCE_UNIT_NAME = "sisgomPersistenceUnit";

	private static EntityManagerFactory entityManagerFactoryInstance;

	public static EntityManagerFactory entityManagerFactorInstance() {
		if (entityManagerFactoryInstance == null) {
			entityManagerFactoryInstance = Persistence
					.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		}

		return entityManagerFactoryInstance;
	}

	private static ServicoDao servicoDaoInstance;

	public static ServicoDao servicoInstance() {
		if (servicoDaoInstance == null) {
			servicoDaoInstance = new ServicoDao();
		}

		return servicoDaoInstance;
	}

	private static MercadoriaDao mercadoriaDaoInstance;

	public static MercadoriaDao mercadoriaInstance() {
		if (mercadoriaDaoInstance == null) {
			mercadoriaDaoInstance = new MercadoriaDao();
		}

		return mercadoriaDaoInstance;
	}

	private static FornecedorDao fornecedorDaoInstance;

	public static FornecedorDao fornecedorInstance() {
		if (mercadoriaDaoInstance == null) {
			fornecedorDaoInstance = new FornecedorDao();
		}

		return fornecedorDaoInstance;
	}

	private static ClienteDao clienteDaoInstance;

	public static ClienteDao clienteInstance() {
		if (mercadoriaDaoInstance == null) {
			clienteDaoInstance = new ClienteDao();
		}

		return clienteDaoInstance;
	}

	private static FuncionarioDao funcionarioDaoInstance;

	public static FuncionarioDao funcionarioInstance() {
		if (funcionarioDaoInstance == null) {
			funcionarioDaoInstance = new FuncionarioDao();
		}

		return funcionarioDaoInstance;
	}

	private static VeiculoDao veiculoDaoInstance;

	public static VeiculoDao veiculoInstance() {
		if (veiculoDaoInstance == null) {
			veiculoDaoInstance = new VeiculoDao();
		}

		return veiculoDaoInstance;
	}
	
	private static OrdemDeServicoDao ordemDeServicoDaoInstance;

	public static OrdemDeServicoDao ordemDeServicoInstance() {
		if (ordemDeServicoDaoInstance == null) {
			ordemDeServicoDaoInstance = new OrdemDeServicoDao();
		}

		return ordemDeServicoDaoInstance;
	}
	
	private static ContatoDao contatoInstance;

	public static ContatoDao contatoInstance() {
		if (contatoInstance == null) {
			contatoInstance = new ContatoDao();
		}

		return contatoInstance;
	}
}
