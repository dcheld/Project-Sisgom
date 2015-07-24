/**
 */
package sisgom.bean.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import sisgom.bean.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see sisgom.bean.BeanPackage
 * @generated
 */
public class BeanAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BeanPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BeanAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BeanPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BeanSwitch<Adapter> modelSwitch =
		new BeanSwitch<Adapter>() {
			@Override
			public Adapter casePessoaBase(PessoaBase object) {
				return createPessoaBaseAdapter();
			}
			@Override
			public Adapter caseEndereco(Endereco object) {
				return createEnderecoAdapter();
			}
			@Override
			public Adapter caseFornecedor(Fornecedor object) {
				return createFornecedorAdapter();
			}
			@Override
			public Adapter caseFuncionario(Funcionario object) {
				return createFuncionarioAdapter();
			}
			@Override
			public Adapter caseCliente(Cliente object) {
				return createClienteAdapter();
			}
			@Override
			public Adapter caseContato(Contato object) {
				return createContatoAdapter();
			}
			@Override
			public Adapter caseServico(Servico object) {
				return createServicoAdapter();
			}
			@Override
			public Adapter caseOrdemDeServico(OrdemDeServico object) {
				return createOrdemDeServicoAdapter();
			}
			@Override
			public Adapter casePeca(Peca object) {
				return createPecaAdapter();
			}
			@Override
			public Adapter caseVeiculo(Veiculo object) {
				return createVeiculoAdapter();
			}
			@Override
			public Adapter caseItensDeServico(ItensDeServico object) {
				return createItensDeServicoAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link sisgom.bean.PessoaBase <em>Pessoa Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sisgom.bean.PessoaBase
	 * @generated
	 */
	public Adapter createPessoaBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sisgom.bean.Endereco <em>Endereco</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sisgom.bean.Endereco
	 * @generated
	 */
	public Adapter createEnderecoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sisgom.bean.Fornecedor <em>Fornecedor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sisgom.bean.Fornecedor
	 * @generated
	 */
	public Adapter createFornecedorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sisgom.bean.Funcionario <em>Funcionario</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sisgom.bean.Funcionario
	 * @generated
	 */
	public Adapter createFuncionarioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sisgom.bean.Cliente <em>Cliente</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sisgom.bean.Cliente
	 * @generated
	 */
	public Adapter createClienteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sisgom.bean.Contato <em>Contato</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sisgom.bean.Contato
	 * @generated
	 */
	public Adapter createContatoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sisgom.bean.Servico <em>Servico</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sisgom.bean.Servico
	 * @generated
	 */
	public Adapter createServicoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sisgom.bean.OrdemDeServico <em>Ordem De Servico</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sisgom.bean.OrdemDeServico
	 * @generated
	 */
	public Adapter createOrdemDeServicoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sisgom.bean.Peca <em>Peca</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sisgom.bean.Peca
	 * @generated
	 */
	public Adapter createPecaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sisgom.bean.Veiculo <em>Veiculo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sisgom.bean.Veiculo
	 * @generated
	 */
	public Adapter createVeiculoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sisgom.bean.ItensDeServico <em>Itens De Servico</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sisgom.bean.ItensDeServico
	 * @generated
	 */
	public Adapter createItensDeServicoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //BeanAdapterFactory
