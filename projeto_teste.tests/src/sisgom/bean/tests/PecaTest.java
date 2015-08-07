/**
 */
package sisgom.bean.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import sisgom.bean.BeanFactory;
import sisgom.bean.Peca;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Peca</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PecaTest extends TestCase {

	/**
	 * The fixture for this Peca test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Peca fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PecaTest.class);
	}

	/**
	 * Constructs a new Peca test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PecaTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Peca test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Peca fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Peca test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Peca getFixture() {
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
		setFixture(BeanFactory.eINSTANCE.createPeca());
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

} //PecaTest
