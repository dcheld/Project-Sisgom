/**
 */
package sisgom.bean.tests;

import junit.textui.TestRunner;

import sisgom.bean.BeanFactory;
import sisgom.bean.Cliente;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Cliente</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClienteTest extends PessoaBaseTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ClienteTest.class);
	}

	/**
	 * Constructs a new Cliente test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClienteTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Cliente test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Cliente getFixture() {
		return (Cliente)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BeanFactory.eINSTANCE.createCliente());
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

} //ClienteTest
