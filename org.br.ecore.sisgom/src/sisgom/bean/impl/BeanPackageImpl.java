/**
 */
package sisgom.bean.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import sisgom.bean.BeanFactory;
import sisgom.bean.BeanPackage;
import sisgom.bean.Cliente;
import sisgom.bean.Contato;
import sisgom.bean.Endereco;
import sisgom.bean.Fornecedor;
import sisgom.bean.Funcionario;
import sisgom.bean.ItensDeServico;
import sisgom.bean.OrdemDeServico;
import sisgom.bean.Peca;
import sisgom.bean.PessoaBase;
import sisgom.bean.Servico;
import sisgom.bean.TipoCobranca;
import sisgom.bean.Veiculo;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BeanPackageImpl extends EPackageImpl implements BeanPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pessoaBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enderecoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fornecedorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass funcionarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clienteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contatoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass servicoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ordemDeServicoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pecaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass veiculoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itensDeServicoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tipoCobrancaEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see sisgom.bean.BeanPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BeanPackageImpl() {
		super(eNS_URI, BeanFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link BeanPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BeanPackage init() {
		if (isInited) return (BeanPackage)EPackage.Registry.INSTANCE.getEPackage(BeanPackage.eNS_URI);

		// Obtain or create and register package
		BeanPackageImpl theBeanPackage = (BeanPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BeanPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BeanPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theBeanPackage.createPackageContents();

		// Initialize created meta-data
		theBeanPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBeanPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BeanPackage.eNS_URI, theBeanPackage);
		return theBeanPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPessoaBase() {
		return pessoaBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPessoaBase_Id() {
		return (EAttribute)pessoaBaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPessoaBase_Nome() {
		return (EAttribute)pessoaBaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPessoaBase_CPFouCNPJ() {
		return (EAttribute)pessoaBaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPessoaBase_Contatos() {
		return (EReference)pessoaBaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPessoaBase_Enderecos() {
		return (EReference)pessoaBaseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndereco() {
		return enderecoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndereco_Id() {
		return (EAttribute)enderecoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndereco_Rua() {
		return (EAttribute)enderecoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndereco_Estado() {
		return (EAttribute)enderecoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndereco_Cidade() {
		return (EAttribute)enderecoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndereco_CEP() {
		return (EAttribute)enderecoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFornecedor() {
		return fornecedorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFornecedor_InscricaoEstadual() {
		return (EAttribute)fornecedorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFuncionario() {
		return funcionarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFuncionario_Matricula() {
		return (EAttribute)funcionarioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCliente() {
		return clienteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCliente_Veiculo() {
		return (EReference)clienteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContato() {
		return contatoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContato_Id() {
		return (EAttribute)contatoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContato_Telefone() {
		return (EAttribute)contatoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContato_Email() {
		return (EAttribute)contatoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServico() {
		return servicoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServico_Codigo() {
		return (EAttribute)servicoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServico_Nome() {
		return (EAttribute)servicoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServico_Valor() {
		return (EAttribute)servicoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrdemDeServico() {
		return ordemDeServicoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrdemDeServico_Codigo() {
		return (EAttribute)ordemDeServicoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrdemDeServico_DataEntradaVeiculo() {
		return (EAttribute)ordemDeServicoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrdemDeServico_Veiculo() {
		return (EReference)ordemDeServicoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrdemDeServico_ItensDeServico() {
		return (EReference)ordemDeServicoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPeca() {
		return pecaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPeca_Codigo() {
		return (EAttribute)pecaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPeca_Nome() {
		return (EAttribute)pecaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPeca_ValorCompra() {
		return (EAttribute)pecaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPeca_ValorVenda() {
		return (EAttribute)pecaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPeca_Fornecedor() {
		return (EReference)pecaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVeiculo() {
		return veiculoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVeiculo_Chassis() {
		return (EAttribute)veiculoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVeiculo_Modelo() {
		return (EAttribute)veiculoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVeiculo_Ano() {
		return (EAttribute)veiculoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVeiculo_Cor() {
		return (EAttribute)veiculoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItensDeServico() {
		return itensDeServicoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItensDeServico_Funcionario() {
		return (EReference)itensDeServicoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItensDeServico_Servico() {
		return (EReference)itensDeServicoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItensDeServico_Peca() {
		return (EReference)itensDeServicoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItensDeServico_ValorServico() {
		return (EAttribute)itensDeServicoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItensDeServico_ValorPeca() {
		return (EAttribute)itensDeServicoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTipoCobranca() {
		return tipoCobrancaEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BeanFactory getBeanFactory() {
		return (BeanFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		pessoaBaseEClass = createEClass(PESSOA_BASE);
		createEAttribute(pessoaBaseEClass, PESSOA_BASE__ID);
		createEAttribute(pessoaBaseEClass, PESSOA_BASE__NOME);
		createEAttribute(pessoaBaseEClass, PESSOA_BASE__CP_FOU_CNPJ);
		createEReference(pessoaBaseEClass, PESSOA_BASE__CONTATOS);
		createEReference(pessoaBaseEClass, PESSOA_BASE__ENDERECOS);

		enderecoEClass = createEClass(ENDERECO);
		createEAttribute(enderecoEClass, ENDERECO__ID);
		createEAttribute(enderecoEClass, ENDERECO__RUA);
		createEAttribute(enderecoEClass, ENDERECO__ESTADO);
		createEAttribute(enderecoEClass, ENDERECO__CIDADE);
		createEAttribute(enderecoEClass, ENDERECO__CEP);

		fornecedorEClass = createEClass(FORNECEDOR);
		createEAttribute(fornecedorEClass, FORNECEDOR__INSCRICAO_ESTADUAL);

		funcionarioEClass = createEClass(FUNCIONARIO);
		createEAttribute(funcionarioEClass, FUNCIONARIO__MATRICULA);

		clienteEClass = createEClass(CLIENTE);
		createEReference(clienteEClass, CLIENTE__VEICULO);

		contatoEClass = createEClass(CONTATO);
		createEAttribute(contatoEClass, CONTATO__ID);
		createEAttribute(contatoEClass, CONTATO__TELEFONE);
		createEAttribute(contatoEClass, CONTATO__EMAIL);

		servicoEClass = createEClass(SERVICO);
		createEAttribute(servicoEClass, SERVICO__CODIGO);
		createEAttribute(servicoEClass, SERVICO__NOME);
		createEAttribute(servicoEClass, SERVICO__VALOR);

		ordemDeServicoEClass = createEClass(ORDEM_DE_SERVICO);
		createEAttribute(ordemDeServicoEClass, ORDEM_DE_SERVICO__CODIGO);
		createEAttribute(ordemDeServicoEClass, ORDEM_DE_SERVICO__DATA_ENTRADA_VEICULO);
		createEReference(ordemDeServicoEClass, ORDEM_DE_SERVICO__VEICULO);
		createEReference(ordemDeServicoEClass, ORDEM_DE_SERVICO__ITENS_DE_SERVICO);

		pecaEClass = createEClass(PECA);
		createEAttribute(pecaEClass, PECA__CODIGO);
		createEAttribute(pecaEClass, PECA__NOME);
		createEAttribute(pecaEClass, PECA__VALOR_COMPRA);
		createEAttribute(pecaEClass, PECA__VALOR_VENDA);
		createEReference(pecaEClass, PECA__FORNECEDOR);

		veiculoEClass = createEClass(VEICULO);
		createEAttribute(veiculoEClass, VEICULO__CHASSIS);
		createEAttribute(veiculoEClass, VEICULO__MODELO);
		createEAttribute(veiculoEClass, VEICULO__ANO);
		createEAttribute(veiculoEClass, VEICULO__COR);

		itensDeServicoEClass = createEClass(ITENS_DE_SERVICO);
		createEReference(itensDeServicoEClass, ITENS_DE_SERVICO__FUNCIONARIO);
		createEReference(itensDeServicoEClass, ITENS_DE_SERVICO__SERVICO);
		createEReference(itensDeServicoEClass, ITENS_DE_SERVICO__PECA);
		createEAttribute(itensDeServicoEClass, ITENS_DE_SERVICO__VALOR_SERVICO);
		createEAttribute(itensDeServicoEClass, ITENS_DE_SERVICO__VALOR_PECA);

		// Create enums
		tipoCobrancaEEnum = createEEnum(TIPO_COBRANCA);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		fornecedorEClass.getESuperTypes().add(this.getPessoaBase());
		funcionarioEClass.getESuperTypes().add(this.getPessoaBase());
		clienteEClass.getESuperTypes().add(this.getPessoaBase());

		// Initialize classes, features, and operations; add parameters
		initEClass(pessoaBaseEClass, PessoaBase.class, "PessoaBase", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPessoaBase_Id(), theXMLTypePackage.getInt(), "Id", null, 0, 1, PessoaBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPessoaBase_Nome(), ecorePackage.getEString(), "Nome", null, 0, 1, PessoaBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPessoaBase_CPFouCNPJ(), ecorePackage.getEString(), "CPFouCNPJ", null, 0, 1, PessoaBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPessoaBase_Contatos(), this.getContato(), null, "Contatos", null, 0, -1, PessoaBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPessoaBase_Contatos().getEKeys().add(this.getContato_Id());
		initEReference(getPessoaBase_Enderecos(), this.getEndereco(), null, "Enderecos", null, 0, -1, PessoaBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enderecoEClass, Endereco.class, "Endereco", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEndereco_Id(), theXMLTypePackage.getInt(), "Id", null, 0, 1, Endereco.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEndereco_Rua(), theXMLTypePackage.getString(), "Rua", null, 0, 1, Endereco.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEndereco_Estado(), theXMLTypePackage.getString(), "Estado", null, 0, 1, Endereco.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEndereco_Cidade(), theXMLTypePackage.getString(), "Cidade", null, 0, 1, Endereco.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEndereco_CEP(), theXMLTypePackage.getString(), "CEP", null, 0, 1, Endereco.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fornecedorEClass, Fornecedor.class, "Fornecedor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFornecedor_InscricaoEstadual(), theXMLTypePackage.getString(), "InscricaoEstadual", null, 0, 1, Fornecedor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(funcionarioEClass, Funcionario.class, "Funcionario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFuncionario_Matricula(), theXMLTypePackage.getInt(), "Matricula", null, 0, 1, Funcionario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clienteEClass, Cliente.class, "Cliente", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCliente_Veiculo(), this.getVeiculo(), null, "veiculo", null, 0, -1, Cliente.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contatoEClass, Contato.class, "Contato", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContato_Id(), theXMLTypePackage.getInt(), "Id", null, 0, 1, Contato.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContato_Telefone(), theXMLTypePackage.getString(), "Telefone", null, 0, 1, Contato.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getContato_Email(), theXMLTypePackage.getString(), "Email", null, 0, 1, Contato.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(servicoEClass, Servico.class, "Servico", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServico_Codigo(), theXMLTypePackage.getInt(), "Codigo", null, 0, 1, Servico.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServico_Nome(), theXMLTypePackage.getString(), "Nome", null, 0, 1, Servico.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getServico_Valor(), theXMLTypePackage.getFloat(), "Valor", null, 0, 1, Servico.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ordemDeServicoEClass, OrdemDeServico.class, "OrdemDeServico", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrdemDeServico_Codigo(), theXMLTypePackage.getInt(), "Codigo", null, 0, 1, OrdemDeServico.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrdemDeServico_DataEntradaVeiculo(), theXMLTypePackage.getDateTime(), "DataEntradaVeiculo", null, 0, 1, OrdemDeServico.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrdemDeServico_Veiculo(), this.getVeiculo(), null, "Veiculo", null, 1, 1, OrdemDeServico.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrdemDeServico_ItensDeServico(), this.getItensDeServico(), null, "ItensDeServico", null, 1, -1, OrdemDeServico.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pecaEClass, Peca.class, "Peca", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPeca_Codigo(), theXMLTypePackage.getInt(), "Codigo", null, 0, 1, Peca.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPeca_Nome(), theXMLTypePackage.getString(), "Nome", null, 0, 1, Peca.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPeca_ValorCompra(), theXMLTypePackage.getFloat(), "ValorCompra", null, 0, 1, Peca.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPeca_ValorVenda(), theXMLTypePackage.getFloat(), "ValorVenda", null, 0, 1, Peca.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPeca_Fornecedor(), this.getFornecedor(), null, "Fornecedor", null, 1, 1, Peca.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(veiculoEClass, Veiculo.class, "Veiculo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVeiculo_Chassis(), theXMLTypePackage.getString(), "Chassis", null, 0, 1, Veiculo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVeiculo_Modelo(), theXMLTypePackage.getString(), "Modelo", null, 0, 1, Veiculo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVeiculo_Ano(), theXMLTypePackage.getInt(), "Ano", null, 0, 1, Veiculo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVeiculo_Cor(), theXMLTypePackage.getString(), "Cor", null, 0, 1, Veiculo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(itensDeServicoEClass, ItensDeServico.class, "ItensDeServico", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getItensDeServico_Funcionario(), this.getFuncionario(), null, "Funcionario", null, 1, 1, ItensDeServico.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItensDeServico_Servico(), this.getServico(), null, "servico", null, 1, 1, ItensDeServico.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItensDeServico_Peca(), this.getPeca(), null, "peca", null, 1, 1, ItensDeServico.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItensDeServico_ValorServico(), theXMLTypePackage.getFloat(), "ValorServico", null, 0, 1, ItensDeServico.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItensDeServico_ValorPeca(), theXMLTypePackage.getFloat(), "ValorPeca", null, 0, 1, ItensDeServico.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(tipoCobrancaEEnum, TipoCobranca.class, "TipoCobranca");
		addEEnumLiteral(tipoCobrancaEEnum, TipoCobranca.POR_HORA);
		addEEnumLiteral(tipoCobrancaEEnum, TipoCobranca.POR_UNIDADE);

		// Create resource
		createResource(eNS_URI);
	}

} //BeanPackageImpl
