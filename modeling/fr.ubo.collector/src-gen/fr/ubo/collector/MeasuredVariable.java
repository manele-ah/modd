/**
 */
package fr.ubo.collector;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measured Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.ubo.collector.MeasuredVariable#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see fr.ubo.collector.CollectorPackage#getMeasuredVariable()
 * @model
 * @generated
 */
public interface MeasuredVariable extends NamedElement
{
	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.ubo.collector.MeasurementDataUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see fr.ubo.collector.MeasurementDataUnit
	 * @see #setUnit(MeasurementDataUnit)
	 * @see fr.ubo.collector.CollectorPackage#getMeasuredVariable_Unit()
	 * @model required="true"
	 * @generated
	 */
	MeasurementDataUnit getUnit();

	/**
	 * Sets the value of the '{@link fr.ubo.collector.MeasuredVariable#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see fr.ubo.collector.MeasurementDataUnit
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(MeasurementDataUnit value);

} // MeasuredVariable
