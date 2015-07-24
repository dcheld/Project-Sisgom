/**
 */
package sisgom.bean;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Tipo Cobranca</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see sisgom.bean.BeanPackage#getTipoCobranca()
 * @model
 * @generated
 */
public enum TipoCobranca implements Enumerator {
	/**
	 * The '<em><b>Por Hora</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POR_HORA_VALUE
	 * @generated
	 * @ordered
	 */
	POR_HORA(0, "PorHora", "PorHora"),

	/**
	 * The '<em><b>Por Unidade</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POR_UNIDADE_VALUE
	 * @generated
	 * @ordered
	 */
	POR_UNIDADE(1, "PorUnidade", "PorUnidade");

	/**
	 * The '<em><b>Por Hora</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Por Hora</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POR_HORA
	 * @model name="PorHora"
	 * @generated
	 * @ordered
	 */
	public static final int POR_HORA_VALUE = 0;

	/**
	 * The '<em><b>Por Unidade</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Por Unidade</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POR_UNIDADE
	 * @model name="PorUnidade"
	 * @generated
	 * @ordered
	 */
	public static final int POR_UNIDADE_VALUE = 1;

	/**
	 * An array of all the '<em><b>Tipo Cobranca</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TipoCobranca[] VALUES_ARRAY =
		new TipoCobranca[] {
			POR_HORA,
			POR_UNIDADE,
		};

	/**
	 * A public read-only list of all the '<em><b>Tipo Cobranca</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TipoCobranca> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Tipo Cobranca</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TipoCobranca get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TipoCobranca result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tipo Cobranca</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TipoCobranca getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TipoCobranca result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tipo Cobranca</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TipoCobranca get(int value) {
		switch (value) {
			case POR_HORA_VALUE: return POR_HORA;
			case POR_UNIDADE_VALUE: return POR_UNIDADE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TipoCobranca(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //TipoCobranca
