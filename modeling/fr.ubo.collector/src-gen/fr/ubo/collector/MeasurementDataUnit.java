/**
 */
package fr.ubo.collector;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Measurement Data Unit</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.ubo.collector.CollectorPackage#getMeasurementDataUnit()
 * @model
 * @generated
 */
public enum MeasurementDataUnit implements Enumerator
{
	/**
	 * The '<em><b>METER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #METER_VALUE
	 * @generated
	 * @ordered
	 */
	METER(0, "METER", "METER"),

	/**
	 * The '<em><b>METER PER SECOND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #METER_PER_SECOND_VALUE
	 * @generated
	 * @ordered
	 */
	METER_PER_SECOND(1, "METER_PER_SECOND", "METER_PER_SECOND"),

	/**
	 * The '<em><b>METER PER SECOND SQUARED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #METER_PER_SECOND_SQUARED_VALUE
	 * @generated
	 * @ordered
	 */
	METER_PER_SECOND_SQUARED(2, "METER_PER_SECOND_SQUARED", "METER_PER_SECOND_SQUARED"),

	/**
	 * The '<em><b>DEGREE CELSIUS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEGREE_CELSIUS_VALUE
	 * @generated
	 * @ordered
	 */
	DEGREE_CELSIUS(3, "DEGREE_CELSIUS", "DEGREE_CELSIUS"),

	/**
	 * The '<em><b>RADIAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RADIAN_VALUE
	 * @generated
	 * @ordered
	 */
	RADIAN(4, "RADIAN", "RADIAN"),

	/**
	 * The '<em><b>RADIAN PER SECOND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RADIAN_PER_SECOND_VALUE
	 * @generated
	 * @ordered
	 */
	RADIAN_PER_SECOND(5, "RADIAN_PER_SECOND", "RADIAN_PER_SECOND"),

	/**
	 * The '<em><b>BAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BAR_VALUE
	 * @generated
	 * @ordered
	 */
	BAR(6, "BAR", "BAR"),

	/**
	 * The '<em><b>LITER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LITER_VALUE
	 * @generated
	 * @ordered
	 */
	LITER(7, "LITER", "LITER"),

	/**
	 * The '<em><b>GRAM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRAM_VALUE
	 * @generated
	 * @ordered
	 */
	GRAM(8, "GRAM", "GRAM"),

	/**
	 * The '<em><b>NONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(9, "NONE", "NONE");

	/**
	 * The '<em><b>METER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>METER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #METER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int METER_VALUE = 0;

	/**
	 * The '<em><b>METER PER SECOND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>METER PER SECOND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #METER_PER_SECOND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int METER_PER_SECOND_VALUE = 1;

	/**
	 * The '<em><b>METER PER SECOND SQUARED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>METER PER SECOND SQUARED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #METER_PER_SECOND_SQUARED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int METER_PER_SECOND_SQUARED_VALUE = 2;

	/**
	 * The '<em><b>DEGREE CELSIUS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DEGREE CELSIUS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEGREE_CELSIUS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DEGREE_CELSIUS_VALUE = 3;

	/**
	 * The '<em><b>RADIAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RADIAN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RADIAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RADIAN_VALUE = 4;

	/**
	 * The '<em><b>RADIAN PER SECOND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RADIAN PER SECOND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RADIAN_PER_SECOND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RADIAN_PER_SECOND_VALUE = 5;

	/**
	 * The '<em><b>BAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BAR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BAR_VALUE = 6;

	/**
	 * The '<em><b>LITER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LITER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LITER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LITER_VALUE = 7;

	/**
	 * The '<em><b>GRAM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GRAM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GRAM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GRAM_VALUE = 8;

	/**
	 * The '<em><b>NONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NONE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 9;

	/**
	 * An array of all the '<em><b>Measurement Data Unit</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MeasurementDataUnit[] VALUES_ARRAY = new MeasurementDataUnit[] { METER, METER_PER_SECOND,
		METER_PER_SECOND_SQUARED, DEGREE_CELSIUS, RADIAN, RADIAN_PER_SECOND, BAR, LITER, GRAM, NONE, };

	/**
	 * A public read-only list of all the '<em><b>Measurement Data Unit</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MeasurementDataUnit> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Measurement Data Unit</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MeasurementDataUnit get(String literal)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			MeasurementDataUnit result = VALUES_ARRAY[i];
			if (result.toString().equals(literal))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Measurement Data Unit</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MeasurementDataUnit getByName(String name)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			MeasurementDataUnit result = VALUES_ARRAY[i];
			if (result.getName().equals(name))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Measurement Data Unit</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MeasurementDataUnit get(int value)
	{
		switch (value)
		{
			case METER_VALUE:
				return METER;
			case METER_PER_SECOND_VALUE:
				return METER_PER_SECOND;
			case METER_PER_SECOND_SQUARED_VALUE:
				return METER_PER_SECOND_SQUARED;
			case DEGREE_CELSIUS_VALUE:
				return DEGREE_CELSIUS;
			case RADIAN_VALUE:
				return RADIAN;
			case RADIAN_PER_SECOND_VALUE:
				return RADIAN_PER_SECOND;
			case BAR_VALUE:
				return BAR;
			case LITER_VALUE:
				return LITER;
			case GRAM_VALUE:
				return GRAM;
			case NONE_VALUE:
				return NONE;
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
	private MeasurementDataUnit(int value, String name, String literal)
	{
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue()
	{
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral()
	{
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		return literal;
	}

} //MeasurementDataUnit
