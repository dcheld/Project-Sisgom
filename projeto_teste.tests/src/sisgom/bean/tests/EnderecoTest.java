/**
 */
package sisgom.bean.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import sisgom.bean.BeanFactory;
import sisgom.bean.Endereco;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Endereco</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EnderecoTest extends TestCase {

	/**
	 * The fixture for this Endereco test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Endereco fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EnderecoTest.class);
	}

	/**
	 * Constructs a new Endereco test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnderecoTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Endereco test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Endereco fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Endereco test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Endereco getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BeanFactory.eINSTANCE.createEndereco());
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

} //EnderecoTest
