/**
 */
package sisgom.bean.tests;

import junit.textui.TestRunner;

import sisgom.bean.BeanFactory;
import sisgom.bean.Funcionario;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Funcionario</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FuncionarioTest extends PessoaBaseTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FuncionarioTest.class);
	}

	/**
	 * Constructs a new Funcionario test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FuncionarioTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Funcionario test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Funcionario getFixture() {
		return (Funcionario)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BeanFactory.eINSTANCE.createFuncionario());
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

} //FuncionarioTest
