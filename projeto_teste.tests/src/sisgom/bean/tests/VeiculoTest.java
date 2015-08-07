/**
 */
package sisgom.bean.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import sisgom.bean.BeanFactory;
import sisgom.bean.Veiculo;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Veiculo</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VeiculoTest extends TestCase {

	/**
	 * The fixture for this Veiculo test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Veiculo fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VeiculoTest.class);
	}

	/**
	 * Constructs a new Veiculo test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VeiculoTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Veiculo test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Veiculo fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Veiculo test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Veiculo getFixture() {
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
		setFixture(BeanFactory.eINSTANCE.createVeiculo());
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

} //VeiculoTest
