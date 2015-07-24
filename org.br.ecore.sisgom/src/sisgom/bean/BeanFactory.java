/**
 */
package sisgom.bean;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see sisgom.bean.BeanPackage
 * @generated
 */
public interface BeanFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BeanFactory eINSTANCE = sisgom.bean.impl.BeanFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Endereco</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Endereco</em>'.
	 * @generated
	 */
	Endereco createEndereco();

	/**
	 * Returns a new object of class '<em>Fornecedor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fornecedor</em>'.
	 * @generated
	 */
	Fornecedor createFornecedor();

	/**
	 * Returns a new object of class '<em>Funcionario</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Funcionario</em>'.
	 * @generated
	 */
	Funcionario createFuncionario();

	/**
	 * Returns a new object of class '<em>Cliente</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cliente</em>'.
	 * @generated
	 */
	Cliente createCliente();

	/**
	 * Returns a new object of class '<em>Contato</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contato</em>'.
	 * @generated
	 */
	Contato createContato();

	/**
	 * Returns a new object of class '<em>Servico</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Servico</em>'.
	 * @generated
	 */
	Servico createServico();

	/**
	 * Returns a new object of class '<em>Ordem De Servico</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ordem De Servico</em>'.
	 * @generated
	 */
	OrdemDeServico createOrdemDeServico();

	/**
	 * Returns a new object of class '<em>Peca</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Peca</em>'.
	 * @generated
	 */
	Peca createPeca();

	/**
	 * Returns a new object of class '<em>Veiculo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Veiculo</em>'.
	 * @generated
	 */
	Veiculo createVeiculo();

	/**
	 * Returns a new object of class '<em>Itens De Servico</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Itens De Servico</em>'.
	 * @generated
	 */
	ItensDeServico createItensDeServico();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BeanPackage getBeanPackage();

} //BeanFactory
