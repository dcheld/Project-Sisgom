/**
 */
package sisgom.bean.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import sisgom.bean.BeanFactory;
import sisgom.bean.Contato;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Contato</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContatoTest extends TestCase {

	/**
	 * The fixture for this Contato test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Contato fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ContatoTest.class);
	}

	/**
	 * Constructs a new Contato test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContatoTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Contato test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Contato fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Contato test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Contato getFixture() {
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
		setFixture(BeanFactory.eINSTANCE.createContato());
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

} //ContatoTest
