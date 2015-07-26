/**
 */
package sisgom.bean.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import sisgom.bean.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BeanFactoryImpl extends EFactoryImpl implements BeanFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BeanFactory init() {
		try {
			BeanFactory theBeanFactory = (BeanFactory)EPackage.Registry.INSTANCE.getEFactory(BeanPackage.eNS_URI);
			if (theBeanFactory != null) {
				return theBeanFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BeanFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BeanFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BeanPackage.ENDERECO: return createEndereco();
			case BeanPackage.FORNECEDOR: return createFornecedor();
			case BeanPackage.FUNCIONARIO: return createFuncionario();
			case BeanPackage.CLIENTE: return createCliente();
			case BeanPackage.CONTATO: return createContato();
			case BeanPackage.SERVICO: return createServico();
			case BeanPackage.ORDEM_DE_SERVICO: return createOrdemDeServico();
			case BeanPackage.PECA: return createPeca();
			case BeanPackage.VEICULO: return createVeiculo();
			case BeanPackage.ITENS_DE_SERVICO: return createItensDeServico();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case BeanPackage.TIPO_COBRANCA:
				return createTipoCobrancaFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case BeanPackage.TIPO_COBRANCA:
				return convertTipoCobrancaToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Endereco createEndereco() {
		EnderecoImpl endereco = new EnderecoImpl();
		return endereco;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fornecedor createFornecedor() {
		FornecedorImpl fornecedor = new FornecedorImpl();
		return fornecedor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Funcionario createFuncionario() {
		FuncionarioImpl funcionario = new FuncionarioImpl();
		return funcionario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cliente createCliente() {
		ClienteImpl cliente = new ClienteImpl();
		return cliente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contato createContato() {
		ContatoImpl contato = new ContatoImpl();
		return contato;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Servico createServico() {
		ServicoImpl servico = new ServicoImpl();
		return servico;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrdemDeServico createOrdemDeServico() {
		OrdemDeServicoImpl ordemDeServico = new OrdemDeServicoImpl();
		return ordemDeServico;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Peca createPeca() {
		PecaImpl peca = new PecaImpl();
		return peca;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Veiculo createVeiculo() {
		VeiculoImpl veiculo = new VeiculoImpl();
		return veiculo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItensDeServico createItensDeServico() {
		ItensDeServicoImpl itensDeServico = new ItensDeServicoImpl();
		return itensDeServico;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoCobranca createTipoCobrancaFromString(EDataType eDataType, String initialValue) {
		TipoCobranca result = TipoCobranca.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTipoCobrancaToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BeanPackage getBeanPackage() {
		return (BeanPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BeanPackage getPackage() {
		return BeanPackage.eINSTANCE;
	}

} //BeanFactoryImpl
