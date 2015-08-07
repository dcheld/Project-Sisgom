/**
 */
package sisgom.bean.tests;

import junit.textui.TestRunner;

import sisgom.bean.BeanFactory;
import sisgom.bean.Fornecedor;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Fornecedor</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FornecedorTest extends PessoaBaseTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FornecedorTest.class);
	}

	/**
	 * Constructs a new Fornecedor test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FornecedorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Fornecedor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Fornecedor getFixture() {
		return (Fornecedor)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BeanFactory.eINSTANCE.createFornecedor());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //FornecedorTest
