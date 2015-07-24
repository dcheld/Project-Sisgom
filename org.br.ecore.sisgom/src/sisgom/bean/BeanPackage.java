/**
 */
package sisgom.bean;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see sisgom.bean.BeanFactory
 * @model kind="package"
 * @generated
 */
public interface BeanPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bean";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "bean";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bean";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BeanPackage eINSTANCE = sisgom.bean.impl.BeanPackageImpl.init();

	/**
	 * The meta object id for the '{@link sisgom.bean.impl.PessoaBaseImpl <em>Pessoa Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sisgom.bean.impl.PessoaBaseImpl
	 * @see sisgom.bean.impl.BeanPackageImpl#getPessoaBase()
	 * @generated
	 */
	int PESSOA_BASE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PESSOA_BASE__ID = 0;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PESSOA_BASE__NOME = 1;

	/**
	 * The feature id for the '<em><b>CP Fou CNPJ</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PESSOA_BASE__CP_FOU_CNPJ = 2;

	/**
	 * The feature id for the '<em><b>Contatos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PESSOA_BASE__CONTATOS = 3;

	/**
	 * The feature id for the '<em><b>Enderecos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PESSOA_BASE__ENDERECOS = 4;

	/**
	 * The number of structural features of the '<em>Pessoa Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PESSOA_BASE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Pessoa Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PESSOA_BASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sisgom.bean.impl.EnderecoImpl <em>Endereco</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sisgom.bean.impl.EnderecoImpl
	 * @see sisgom.bean.impl.BeanPackageImpl#getEndereco()
	 * @generated
	 */
	int ENDERECO = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDERECO__ID = 0;

	/**
	 * The feature id for the '<em><b>Rua</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDERECO__RUA = 1;

	/**
	 * The feature id for the '<em><b>Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDERECO__ESTADO = 2;

	/**
	 * The feature id for the '<em><b>Cidade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDERECO__CIDADE = 3;

	/**
	 * The feature id for the '<em><b>CEP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDERECO__CEP = 4;

	/**
	 * The number of structural features of the '<em>Endereco</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDERECO_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Endereco</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDERECO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sisgom.bean.impl.FornecedorImpl <em>Fornecedor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sisgom.bean.impl.FornecedorImpl
	 * @see sisgom.bean.impl.BeanPackageImpl#getFornecedor()
	 * @generated
	 */
	int FORNECEDOR = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORNECEDOR__ID = PESSOA_BASE__ID;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORNECEDOR__NOME = PESSOA_BASE__NOME;

	/**
	 * The feature id for the '<em><b>CP Fou CNPJ</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORNECEDOR__CP_FOU_CNPJ = PESSOA_BASE__CP_FOU_CNPJ;

	/**
	 * The feature id for the '<em><b>Contatos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORNECEDOR__CONTATOS = PESSOA_BASE__CONTATOS;

	/**
	 * The feature id for the '<em><b>Enderecos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORNECEDOR__ENDERECOS = PESSOA_BASE__ENDERECOS;

	/**
	 * The feature id for the '<em><b>Inscricao Estadual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORNECEDOR__INSCRICAO_ESTADUAL = PESSOA_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fornecedor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORNECEDOR_FEATURE_COUNT = PESSOA_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Fornecedor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORNECEDOR_OPERATION_COUNT = PESSOA_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sisgom.bean.impl.FuncionarioImpl <em>Funcionario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sisgom.bean.impl.FuncionarioImpl
	 * @see sisgom.bean.impl.BeanPackageImpl#getFuncionario()
	 * @generated
	 */
	int FUNCIONARIO = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO__ID = PESSOA_BASE__ID;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO__NOME = PESSOA_BASE__NOME;

	/**
	 * The feature id for the '<em><b>CP Fou CNPJ</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO__CP_FOU_CNPJ = PESSOA_BASE__CP_FOU_CNPJ;

	/**
	 * The feature id for the '<em><b>Contatos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO__CONTATOS = PESSOA_BASE__CONTATOS;

	/**
	 * The feature id for the '<em><b>Enderecos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO__ENDERECOS = PESSOA_BASE__ENDERECOS;

	/**
	 * The feature id for the '<em><b>Matricula</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO__MATRICULA = PESSOA_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Funcionario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO_FEATURE_COUNT = PESSOA_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Funcionario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO_OPERATION_COUNT = PESSOA_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sisgom.bean.impl.ClienteImpl <em>Cliente</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sisgom.bean.impl.ClienteImpl
	 * @see sisgom.bean.impl.BeanPackageImpl#getCliente()
	 * @generated
	 */
	int CLIENTE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE__ID = PESSOA_BASE__ID;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE__NOME = PESSOA_BASE__NOME;

	/**
	 * The feature id for the '<em><b>CP Fou CNPJ</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE__CP_FOU_CNPJ = PESSOA_BASE__CP_FOU_CNPJ;

	/**
	 * The feature id for the '<em><b>Contatos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE__CONTATOS = PESSOA_BASE__CONTATOS;

	/**
	 * The feature id for the '<em><b>Enderecos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE__ENDERECOS = PESSOA_BASE__ENDERECOS;

	/**
	 * The feature id for the '<em><b>Veiculo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE__VEICULO = PESSOA_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cliente</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE_FEATURE_COUNT = PESSOA_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Cliente</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE_OPERATION_COUNT = PESSOA_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sisgom.bean.impl.ContatoImpl <em>Contato</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sisgom.bean.impl.ContatoImpl
	 * @see sisgom.bean.impl.BeanPackageImpl#getContato()
	 * @generated
	 */
	int CONTATO = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTATO__ID = 0;

	/**
	 * The feature id for the '<em><b>Telefone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTATO__TELEFONE = 1;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTATO__EMAIL = 2;

	/**
	 * The number of structural features of the '<em>Contato</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTATO_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Contato</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTATO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sisgom.bean.impl.ServicoImpl <em>Servico</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sisgom.bean.impl.ServicoImpl
	 * @see sisgom.bean.impl.BeanPackageImpl#getServico()
	 * @generated
	 */
	int SERVICO = 6;

	/**
	 * The feature id for the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICO__CODIGO = 0;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICO__NOME = 1;

	/**
	 * The feature id for the '<em><b>Valor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICO__VALOR = 2;

	/**
	 * The number of structural features of the '<em>Servico</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICO_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Servico</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sisgom.bean.impl.OrdemDeServicoImpl <em>Ordem De Servico</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sisgom.bean.impl.OrdemDeServicoImpl
	 * @see sisgom.bean.impl.BeanPackageImpl#getOrdemDeServico()
	 * @generated
	 */
	int ORDEM_DE_SERVICO = 7;

	/**
	 * The feature id for the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDEM_DE_SERVICO__CODIGO = 0;

	/**
	 * The feature id for the '<em><b>Data Entrada Veiculo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDEM_DE_SERVICO__DATA_ENTRADA_VEICULO = 1;

	/**
	 * The feature id for the '<em><b>Veiculo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDEM_DE_SERVICO__VEICULO = 2;

	/**
	 * The feature id for the '<em><b>Itens De Servico</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDEM_DE_SERVICO__ITENS_DE_SERVICO = 3;

	/**
	 * The number of structural features of the '<em>Ordem De Servico</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDEM_DE_SERVICO_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Ordem De Servico</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDEM_DE_SERVICO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sisgom.bean.impl.PecaImpl <em>Peca</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sisgom.bean.impl.PecaImpl
	 * @see sisgom.bean.impl.BeanPackageImpl#getPeca()
	 * @generated
	 */
	int PECA = 8;

	/**
	 * The feature id for the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PECA__CODIGO = 0;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PECA__NOME = 1;

	/**
	 * The feature id for the '<em><b>Valor Compra</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PECA__VALOR_COMPRA = 2;

	/**
	 * The feature id for the '<em><b>Valor Venda</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PECA__VALOR_VENDA = 3;

	/**
	 * The feature id for the '<em><b>Fornecedor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PECA__FORNECEDOR = 4;

	/**
	 * The number of structural features of the '<em>Peca</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PECA_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Peca</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PECA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sisgom.bean.impl.VeiculoImpl <em>Veiculo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sisgom.bean.impl.VeiculoImpl
	 * @see sisgom.bean.impl.BeanPackageImpl#getVeiculo()
	 * @generated
	 */
	int VEICULO = 9;

	/**
	 * The feature id for the '<em><b>Chassis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEICULO__CHASSIS = 0;

	/**
	 * The feature id for the '<em><b>Modelo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEICULO__MODELO = 1;

	/**
	 * The feature id for the '<em><b>Ano</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEICULO__ANO = 2;

	/**
	 * The feature id for the '<em><b>Cor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEICULO__COR = 3;

	/**
	 * The number of structural features of the '<em>Veiculo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEICULO_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Veiculo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEICULO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sisgom.bean.impl.ItensDeServicoImpl <em>Itens De Servico</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sisgom.bean.impl.ItensDeServicoImpl
	 * @see sisgom.bean.impl.BeanPackageImpl#getItensDeServico()
	 * @generated
	 */
	int ITENS_DE_SERVICO = 10;

	/**
	 * The feature id for the '<em><b>Funcionario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITENS_DE_SERVICO__FUNCIONARIO = 0;

	/**
	 * The feature id for the '<em><b>Servico</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITENS_DE_SERVICO__SERVICO = 1;

	/**
	 * The feature id for the '<em><b>Peca</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITENS_DE_SERVICO__PECA = 2;

	/**
	 * The feature id for the '<em><b>Valor Servico</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITENS_DE_SERVICO__VALOR_SERVICO = 3;

	/**
	 * The feature id for the '<em><b>Valor Peca</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITENS_DE_SERVICO__VALOR_PECA = 4;

	/**
	 * The number of structural features of the '<em>Itens De Servico</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITENS_DE_SERVICO_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Itens De Servico</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITENS_DE_SERVICO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sisgom.bean.TipoCobranca <em>Tipo Cobranca</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sisgom.bean.TipoCobranca
	 * @see sisgom.bean.impl.BeanPackageImpl#getTipoCobranca()
	 * @generated
	 */
	int TIPO_COBRANCA = 11;


	/**
	 * Returns the meta object for class '{@link sisgom.bean.PessoaBase <em>Pessoa Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pessoa Base</em>'.
	 * @see sisgom.bean.PessoaBase
	 * @generated
	 */
	EClass getPessoaBase();

	/**
	 * Returns the meta object for the attribute '{@link sisgom.bean.PessoaBase#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see sisgom.bean.PessoaBase#getId()
	 * @see #getPessoaBase()
	 * @generated
	 */
	EAttribute getPessoaBase_Id();

	/**
	 * Returns the meta object for the attribute '{@link sisgom.bean.PessoaBase#getNome <em>Nome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nome</em>'.
	 * @see sisgom.bean.PessoaBase#getNome()
	 * @see #getPessoaBase()
	 * @generated
	 */
	EAttribute getPessoaBase_Nome();

	/**
	 * Returns the meta object for the attribute '{@link sisgom.bean.PessoaBase#getCPFouCNPJ <em>CP Fou CNPJ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CP Fou CNPJ</em>'.
	 * @see sisgom.bean.PessoaBase#getCPFouCNPJ()
	 * @see #getPessoaBase()
	 * @generated
	 */
	EAttribute getPessoaBase_CPFouCNPJ();

	/**
	 * Returns the meta object for the containment reference list '{@link sisgom.bean.PessoaBase#getContatos <em>Contatos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contatos</em>'.
	 * @see sisgom.bean.PessoaBase#getContatos()
	 * @see #getPessoaBase()
	 * @generated
	 */
	EReference getPessoaBase_Contatos();

	/**
	 * Returns the meta object for the containment reference list '{@link sisgom.bean.PessoaBase#getEnderecos <em>Enderecos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enderecos</em>'.
	 * @see sisgom.bean.PessoaBase#getEnderecos()
	 * @see #getPessoaBase()
	 * @generated
	 */
	EReference getPessoaBase_Enderecos();

	/**
	 * Returns the meta object for class '{@link sisgom.bean.Endereco <em>Endereco</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Endereco</em>'.
	 * @see sisgom.bean.Endereco
	 * @generated
	 */
	EClass getEndereco();

	/**
	 * Returns the meta object for the attribute '{@link sisgom.bean.Endereco#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see sisgom.bean.Endereco#getId()
	 * @see #getEndereco()
	 * @generated
	 */
	EAttribute getEndereco_Id();

	/**
	 * Returns the meta object for the attribute '{@link sisgom.bean.Endereco#getRua <em>Rua</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rua</em>'.
	 * @see sisgom.bean.Endereco#getRua()
	 * @see #getEndereco()
	 * @generated
	 */
	EAttribute getEndereco_Rua();

	/**
	 * Returns the meta object for the attribute '{@link sisgom.bean.Endereco#getEstado <em>Estado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estado</em>'.
	 * @see sisgom.bean.Endereco#getEstado()
	 * @see #getEndereco()
	 * @generated
	 */
	EAttribute getEndereco_Estado();

	/**
	 * Returns the meta object for the attribute '{@link sisgom.bean.Endereco#getCidade <em>Cidade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cidade</em>'.
	 * @see sisgom.bean.Endereco#getCidade()
	 * @see #getEndereco()
	 * @generated
	 */
	EAttribute getEndereco_Cidade();

	/**
	 * Returns the meta object for the attribute '{@link sisgom.bean.Endereco#getCEP <em>CEP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CEP</em>'.
	 * @see sisgom.bean.Endereco#getCEP()
	 * @see #getEndereco()
	 * @generated
	 */
	EAttribute getEndereco_CEP();

	/**
	 * Returns the meta object for class '{@link sisgom.bean.Fornecedor <em>Fornecedor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fornecedor</em>'.
	 * @see sisgom.bean.Fornecedor
	 * @generated
	 */
	EClass getFornecedor();

	/**
	 * Returns the meta object for the attribute '{@link sisgom.bean.Fornecedor#getInscricaoEstadual <em>Inscricao Estadual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inscricao Estadual</em>'.
	 * @see sisgom.bean.Fornecedor#getInscricaoEstadual()
	 * @see #getFornecedor()
	 * @generated
	 */
	EAttribute getFornecedor_InscricaoEstadual();

	/**
	 * Returns the meta object for class '{@link sisgom.bean.Funcionario <em>Funcionario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Funcionario</em>'.
	 * @see sisgom.bean.Funcionario
	 * @generated
	 */
	EClass getFuncionario();

	/**
	 * Returns the meta object for the attribute '{@link sisgom.bean.Funcionario#getMatricula <em>Matricula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Matricula</em>'.
	 * @see sisgom.bean.Funcionario#getMatricula()
	 * @see #getFuncionario()
	 * @generated
	 */
	EAttribute getFuncionario_Matricula();

	/**
	 * Returns the meta object for class '{@link sisgom.bean.Cliente <em>Cliente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cliente</em>'.
	 * @see sisgom.bean.Cliente
	 * @generated
	 */
	EClass getCliente();

	/**
	 * Returns the meta object for the containment reference list '{@link sisgom.bean.Cliente#getVeiculo <em>Veiculo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Veiculo</em>'.
	 * @see sisgom.bean.Cliente#getVeiculo()
	 * @see #getCliente()
	 * @generated
	 */
	EReference getCliente_Veiculo();

	/**
	 * Returns the meta object for class '{@link sisgom.bean.Contato <em>Contato</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contato</em>'.
	 * @see sisgom.bean.Contato
	 * @generated
	 */
	EClass getContato();

	/**
	 * Returns the meta object for the attribute '{@link sisgom.bean.Contato#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see sisgom.bean.Contato#getId()
	 * @see #getContato()
	 * @generated
	 */
	EAttribute getContato_Id();

	/**
	 * Returns the meta object for the attribute '{@link sisgom.bean.Contato#getTelefone <em>Telefone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Telefone</em>'.
	 * @see sisgom.bean.Contato#getTelefone()
	 * @see #getContato()
	 * @generated
	 */
	EAttribute getContato_Telefone();

	/**
	 * Returns the meta object for the attribute '{@link sisgom.bean.Contato#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see sisgom.bean.Contato#getEmail()
	 * @see #getContato()
	 * @generated
	 */
	EAttribute getContato_Email();

	/**
	 * Returns the meta object for class '{@link sisgom.bean.Servico <em>Servico</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Servico</em>'.
	 * @see sisgom.bean.Servico
	 * @generated
	 */
	EClass getServico();

	/**
	 * Returns the meta object for the attribute '{@link sisgom.bean.Servico#getCodigo <em>Codigo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Codigo</em>'.
	 * @see sisgom.bean.Servico#getCodigo()
	 * @see #getServico()
	 * @generated
	 */
	EAttribute getServico_Codigo();

	/**
	 * Returns the meta object for the attribute '{@link sisgom.bean.Servico#getNome <em>Nome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nome</em>'.
	 * @see sisgom.bean.Servico#getNome()
	 * @see #getServico()
	 * @generated
	 */
	EAttribute getServico_Nome();

	/**
	 * Returns the meta object for the attribute '{@link sisgom.bean.Servico#getValor <em>Valor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valor</em>'.
	 * @see sisgom.bean.Servico#getValor()
	 * @see #getServico()
	 * @generated
	 */
	EAttribute getServico_Valor();

	/**
	 * Returns the meta object for class '{@link sisgom.bean.OrdemDeServico <em>Ordem De Servico</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ordem De Servico</em>'.
	 * @see sisgom.bean.OrdemDeServico
	 * @generated
	 */
	EClass getOrdemDeServico();

	/**
	 * Returns the meta object for the attribute '{@link sisgom.bean.OrdemDeServico#getCodigo <em>Codigo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Codigo</em>'.
	 * @see sisgom.bean.OrdemDeServico#getCodigo()
	 * @see #getOrdemDeServico()
	 * @generated
	 */
	EAttribute getOrdemDeServico_Codigo();

	/**
	 * Returns the meta object for the attribute '{@link sisgom.bean.OrdemDeServico#getDataEntradaVeiculo <em>Data Entrada Veiculo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Entrada Veiculo</em>'.
	 * @see sisgom.bean.OrdemDeServico#getDataEntradaVeiculo()
	 * @see #getOrdemDeServico()
	 * @generated
	 */
	EAttribute getOrdemDeServico_DataEntradaVeiculo();

	/**
	 * Returns the meta object for the containment reference '{@link sisgom.bean.OrdemDeServico#getVeiculo <em>Veiculo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Veiculo</em>'.
	 * @see sisgom.bean.OrdemDeServico#getVeiculo()
	 * @see #getOrdemDeServico()
	 * @generated
	 */
	EReference getOrdemDeServico_Veiculo();

	/**
	 * Returns the meta object for the reference list '{@link sisgom.bean.OrdemDeServico#getItensDeServico <em>Itens De Servico</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Itens De Servico</em>'.
	 * @see sisgom.bean.OrdemDeServico#getItensDeServico()
	 * @see #getOrdemDeServico()
	 * @generated
	 */
	EReference getOrdemDeServico_ItensDeServico();

	/**
	 * Returns the meta object for class '{@link sisgom.bean.Peca <em>Peca</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Peca</em>'.
	 * @see sisgom.bean.Peca
	 * @generated
	 */
	EClass getPeca();

	/**
	 * Returns the meta object for the attribute '{@link sisgom.bean.Peca#getCodigo <em>Codigo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Codigo</em>'.
	 * @see sisgom.bean.Peca#getCodigo()
	 * @see #getPeca()
	 * @generated
	 */
	EAttribute getPeca_Codigo();

	/**
	 * Returns the meta object for the attribute '{@link sisgom.bean.Peca#getNome <em>Nome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nome</em>'.
	 * @see sisgom.bean.Peca#getNome()
	 * @see #getPeca()
	 * @generated
	 */
	EAttribute getPeca_Nome();

	/**
	 * Returns the meta object for the attribute '{@link sisgom.bean.Peca#getValorCompra <em>Valor Compra</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valor Compra</em>'.
	 * @see sisgom.bean.Peca#getValorCompra()
	 * @see #getPeca()
	 * @generated
	 */
	EAttribute getPeca_ValorCompra();

	/**
	 * Returns the meta object for the attribute '{@link sisgom.bean.Peca#getValorVenda <em>Valor Venda</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valor Venda</em>'.
	 * @see sisgom.bean.Peca#getValorVenda()
	 * @see #getPeca()
	 * @generated
	 */
	EAttribute getPeca_ValorVenda();

	/**
	 * Returns the meta object for the reference '{@link sisgom.bean.Peca#getFornecedor <em>Fornecedor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fornecedor</em>'.
	 * @see sisgom.bean.Peca#getFornecedor()
	 * @see #getPeca()
	 * @generated
	 */
	EReference getPeca_Fornecedor();

	/**
	 * Returns the meta object for class '{@link sisgom.bean.Veiculo <em>Veiculo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Veiculo</em>'.
	 * @see sisgom.bean.Veiculo
	 * @generated
	 */
	EClass getVeiculo();

	/**
	 * Returns the meta object for the attribute '{@link sisgom.bean.Veiculo#getChassis <em>Chassis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Chassis</em>'.
	 * @see sisgom.bean.Veiculo#getChassis()
	 * @see #getVeiculo()
	 * @generated
	 */
	EAttribute getVeiculo_Chassis();

	/**
	 * Returns the meta object for the attribute '{@link sisgom.bean.Veiculo#getModelo <em>Modelo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modelo</em>'.
	 * @see sisgom.bean.Veiculo#getModelo()
	 * @see #getVeiculo()
	 * @generated
	 */
	EAttribute getVeiculo_Modelo();

	/**
	 * Returns the meta object for the attribute '{@link sisgom.bean.Veiculo#getAno <em>Ano</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ano</em>'.
	 * @see sisgom.bean.Veiculo#getAno()
	 * @see #getVeiculo()
	 * @generated
	 */
	EAttribute getVeiculo_Ano();

	/**
	 * Returns the meta object for the attribute '{@link sisgom.bean.Veiculo#getCor <em>Cor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cor</em>'.
	 * @see sisgom.bean.Veiculo#getCor()
	 * @see #getVeiculo()
	 * @generated
	 */
	EAttribute getVeiculo_Cor();

	/**
	 * Returns the meta object for class '{@link sisgom.bean.ItensDeServico <em>Itens De Servico</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Itens De Servico</em>'.
	 * @see sisgom.bean.ItensDeServico
	 * @generated
	 */
	EClass getItensDeServico();

	/**
	 * Returns the meta object for the reference '{@link sisgom.bean.ItensDeServico#getFuncionario <em>Funcionario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Funcionario</em>'.
	 * @see sisgom.bean.ItensDeServico#getFuncionario()
	 * @see #getItensDeServico()
	 * @generated
	 */
	EReference getItensDeServico_Funcionario();

	/**
	 * Returns the meta object for the reference '{@link sisgom.bean.ItensDeServico#getServico <em>Servico</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Servico</em>'.
	 * @see sisgom.bean.ItensDeServico#getServico()
	 * @see #getItensDeServico()
	 * @generated
	 */
	EReference getItensDeServico_Servico();

	/**
	 * Returns the meta object for the reference '{@link sisgom.bean.ItensDeServico#getPeca <em>Peca</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Peca</em>'.
	 * @see sisgom.bean.ItensDeServico#getPeca()
	 * @see #getItensDeServico()
	 * @generated
	 */
	EReference getItensDeServico_Peca();

	/**
	 * Returns the meta object for the attribute '{@link sisgom.bean.ItensDeServico#getValorServico <em>Valor Servico</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valor Servico</em>'.
	 * @see sisgom.bean.ItensDeServico#getValorServico()
	 * @see #getItensDeServico()
	 * @generated
	 */
	EAttribute getItensDeServico_ValorServico();

	/**
	 * Returns the meta object for the attribute '{@link sisgom.bean.ItensDeServico#getValorPeca <em>Valor Peca</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valor Peca</em>'.
	 * @see sisgom.bean.ItensDeServico#getValorPeca()
	 * @see #getItensDeServico()
	 * @generated
	 */
	EAttribute getItensDeServico_ValorPeca();

	/**
	 * Returns the meta object for enum '{@link sisgom.bean.TipoCobranca <em>Tipo Cobranca</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Cobranca</em>'.
	 * @see sisgom.bean.TipoCobranca
	 * @generated
	 */
	EEnum getTipoCobranca();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BeanFactory getBeanFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link sisgom.bean.impl.PessoaBaseImpl <em>Pessoa Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sisgom.bean.impl.PessoaBaseImpl
		 * @see sisgom.bean.impl.BeanPackageImpl#getPessoaBase()
		 * @generated
		 */
		EClass PESSOA_BASE = eINSTANCE.getPessoaBase();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PESSOA_BASE__ID = eINSTANCE.getPessoaBase_Id();

		/**
		 * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PESSOA_BASE__NOME = eINSTANCE.getPessoaBase_Nome();

		/**
		 * The meta object literal for the '<em><b>CP Fou CNPJ</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PESSOA_BASE__CP_FOU_CNPJ = eINSTANCE.getPessoaBase_CPFouCNPJ();

		/**
		 * The meta object literal for the '<em><b>Contatos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PESSOA_BASE__CONTATOS = eINSTANCE.getPessoaBase_Contatos();

		/**
		 * The meta object literal for the '<em><b>Enderecos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PESSOA_BASE__ENDERECOS = eINSTANCE.getPessoaBase_Enderecos();

		/**
		 * The meta object literal for the '{@link sisgom.bean.impl.EnderecoImpl <em>Endereco</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sisgom.bean.impl.EnderecoImpl
		 * @see sisgom.bean.impl.BeanPackageImpl#getEndereco()
		 * @generated
		 */
		EClass ENDERECO = eINSTANCE.getEndereco();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENDERECO__ID = eINSTANCE.getEndereco_Id();

		/**
		 * The meta object literal for the '<em><b>Rua</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENDERECO__RUA = eINSTANCE.getEndereco_Rua();

		/**
		 * The meta object literal for the '<em><b>Estado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENDERECO__ESTADO = eINSTANCE.getEndereco_Estado();

		/**
		 * The meta object literal for the '<em><b>Cidade</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENDERECO__CIDADE = eINSTANCE.getEndereco_Cidade();

		/**
		 * The meta object literal for the '<em><b>CEP</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENDERECO__CEP = eINSTANCE.getEndereco_CEP();

		/**
		 * The meta object literal for the '{@link sisgom.bean.impl.FornecedorImpl <em>Fornecedor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sisgom.bean.impl.FornecedorImpl
		 * @see sisgom.bean.impl.BeanPackageImpl#getFornecedor()
		 * @generated
		 */
		EClass FORNECEDOR = eINSTANCE.getFornecedor();

		/**
		 * The meta object literal for the '<em><b>Inscricao Estadual</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORNECEDOR__INSCRICAO_ESTADUAL = eINSTANCE.getFornecedor_InscricaoEstadual();

		/**
		 * The meta object literal for the '{@link sisgom.bean.impl.FuncionarioImpl <em>Funcionario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sisgom.bean.impl.FuncionarioImpl
		 * @see sisgom.bean.impl.BeanPackageImpl#getFuncionario()
		 * @generated
		 */
		EClass FUNCIONARIO = eINSTANCE.getFuncionario();

		/**
		 * The meta object literal for the '<em><b>Matricula</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCIONARIO__MATRICULA = eINSTANCE.getFuncionario_Matricula();

		/**
		 * The meta object literal for the '{@link sisgom.bean.impl.ClienteImpl <em>Cliente</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sisgom.bean.impl.ClienteImpl
		 * @see sisgom.bean.impl.BeanPackageImpl#getCliente()
		 * @generated
		 */
		EClass CLIENTE = eINSTANCE.getCliente();

		/**
		 * The meta object literal for the '<em><b>Veiculo</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENTE__VEICULO = eINSTANCE.getCliente_Veiculo();

		/**
		 * The meta object literal for the '{@link sisgom.bean.impl.ContatoImpl <em>Contato</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sisgom.bean.impl.ContatoImpl
		 * @see sisgom.bean.impl.BeanPackageImpl#getContato()
		 * @generated
		 */
		EClass CONTATO = eINSTANCE.getContato();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTATO__ID = eINSTANCE.getContato_Id();

		/**
		 * The meta object literal for the '<em><b>Telefone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTATO__TELEFONE = eINSTANCE.getContato_Telefone();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTATO__EMAIL = eINSTANCE.getContato_Email();

		/**
		 * The meta object literal for the '{@link sisgom.bean.impl.ServicoImpl <em>Servico</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sisgom.bean.impl.ServicoImpl
		 * @see sisgom.bean.impl.BeanPackageImpl#getServico()
		 * @generated
		 */
		EClass SERVICO = eINSTANCE.getServico();

		/**
		 * The meta object literal for the '<em><b>Codigo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICO__CODIGO = eINSTANCE.getServico_Codigo();

		/**
		 * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICO__NOME = eINSTANCE.getServico_Nome();

		/**
		 * The meta object literal for the '<em><b>Valor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICO__VALOR = eINSTANCE.getServico_Valor();

		/**
		 * The meta object literal for the '{@link sisgom.bean.impl.OrdemDeServicoImpl <em>Ordem De Servico</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sisgom.bean.impl.OrdemDeServicoImpl
		 * @see sisgom.bean.impl.BeanPackageImpl#getOrdemDeServico()
		 * @generated
		 */
		EClass ORDEM_DE_SERVICO = eINSTANCE.getOrdemDeServico();

		/**
		 * The meta object literal for the '<em><b>Codigo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDEM_DE_SERVICO__CODIGO = eINSTANCE.getOrdemDeServico_Codigo();

		/**
		 * The meta object literal for the '<em><b>Data Entrada Veiculo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDEM_DE_SERVICO__DATA_ENTRADA_VEICULO = eINSTANCE.getOrdemDeServico_DataEntradaVeiculo();

		/**
		 * The meta object literal for the '<em><b>Veiculo</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDEM_DE_SERVICO__VEICULO = eINSTANCE.getOrdemDeServico_Veiculo();

		/**
		 * The meta object literal for the '<em><b>Itens De Servico</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDEM_DE_SERVICO__ITENS_DE_SERVICO = eINSTANCE.getOrdemDeServico_ItensDeServico();

		/**
		 * The meta object literal for the '{@link sisgom.bean.impl.PecaImpl <em>Peca</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sisgom.bean.impl.PecaImpl
		 * @see sisgom.bean.impl.BeanPackageImpl#getPeca()
		 * @generated
		 */
		EClass PECA = eINSTANCE.getPeca();

		/**
		 * The meta object literal for the '<em><b>Codigo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PECA__CODIGO = eINSTANCE.getPeca_Codigo();

		/**
		 * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PECA__NOME = eINSTANCE.getPeca_Nome();

		/**
		 * The meta object literal for the '<em><b>Valor Compra</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PECA__VALOR_COMPRA = eINSTANCE.getPeca_ValorCompra();

		/**
		 * The meta object literal for the '<em><b>Valor Venda</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PECA__VALOR_VENDA = eINSTANCE.getPeca_ValorVenda();

		/**
		 * The meta object literal for the '<em><b>Fornecedor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PECA__FORNECEDOR = eINSTANCE.getPeca_Fornecedor();

		/**
		 * The meta object literal for the '{@link sisgom.bean.impl.VeiculoImpl <em>Veiculo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sisgom.bean.impl.VeiculoImpl
		 * @see sisgom.bean.impl.BeanPackageImpl#getVeiculo()
		 * @generated
		 */
		EClass VEICULO = eINSTANCE.getVeiculo();

		/**
		 * The meta object literal for the '<em><b>Chassis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEICULO__CHASSIS = eINSTANCE.getVeiculo_Chassis();

		/**
		 * The meta object literal for the '<em><b>Modelo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEICULO__MODELO = eINSTANCE.getVeiculo_Modelo();

		/**
		 * The meta object literal for the '<em><b>Ano</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEICULO__ANO = eINSTANCE.getVeiculo_Ano();

		/**
		 * The meta object literal for the '<em><b>Cor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEICULO__COR = eINSTANCE.getVeiculo_Cor();

		/**
		 * The meta object literal for the '{@link sisgom.bean.impl.ItensDeServicoImpl <em>Itens De Servico</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sisgom.bean.impl.ItensDeServicoImpl
		 * @see sisgom.bean.impl.BeanPackageImpl#getItensDeServico()
		 * @generated
		 */
		EClass ITENS_DE_SERVICO = eINSTANCE.getItensDeServico();

		/**
		 * The meta object literal for the '<em><b>Funcionario</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITENS_DE_SERVICO__FUNCIONARIO = eINSTANCE.getItensDeServico_Funcionario();

		/**
		 * The meta object literal for the '<em><b>Servico</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITENS_DE_SERVICO__SERVICO = eINSTANCE.getItensDeServico_Servico();

		/**
		 * The meta object literal for the '<em><b>Peca</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITENS_DE_SERVICO__PECA = eINSTANCE.getItensDeServico_Peca();

		/**
		 * The meta object literal for the '<em><b>Valor Servico</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITENS_DE_SERVICO__VALOR_SERVICO = eINSTANCE.getItensDeServico_ValorServico();

		/**
		 * The meta object literal for the '<em><b>Valor Peca</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITENS_DE_SERVICO__VALOR_PECA = eINSTANCE.getItensDeServico_ValorPeca();

		/**
		 * The meta object literal for the '{@link sisgom.bean.TipoCobranca <em>Tipo Cobranca</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sisgom.bean.TipoCobranca
		 * @see sisgom.bean.impl.BeanPackageImpl#getTipoCobranca()
		 * @generated
		 */
		EEnum TIPO_COBRANCA = eINSTANCE.getTipoCobranca();

	}

} //BeanPackage
