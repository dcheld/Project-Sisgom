/**
 */
package sisgom.bean.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import sisgom.bean.BeanFactory;
import sisgom.bean.Servico;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Servico</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServicoTest extends TestCase {

	/**
	 * The fixture for this Servico test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Servico fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ServicoTest.class);
	}

	/**
	 * Constructs a new Servico test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServicoTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Servico test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Servico fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Servico test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Servico getFixture() {
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
		setFixture(BeanFactory.eINSTANCE.createServico());
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

} //ServicoTest
