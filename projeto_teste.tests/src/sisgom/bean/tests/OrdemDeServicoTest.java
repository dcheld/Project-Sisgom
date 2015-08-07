/**
 */
package sisgom.bean.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import sisgom.bean.BeanFactory;
import sisgom.bean.OrdemDeServico;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Ordem De Servico</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OrdemDeServicoTest extends TestCase {

	/**
	 * The fixture for this Ordem De Servico test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrdemDeServico fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OrdemDeServicoTest.class);
	}

	/**
	 * Constructs a new Ordem De Servico test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrdemDeServicoTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Ordem De Servico test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(OrdemDeServico fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Ordem De Servico test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrdemDeServico getFixture() {
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
		setFixture(BeanFactory.eINSTANCE.createOrdemDeServico());
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

} //OrdemDeServicoTest
