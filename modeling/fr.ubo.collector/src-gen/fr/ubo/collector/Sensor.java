/**
 */
package fr.ubo.collector;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.ubo.collector.Sensor#getSensorMeasuredVariables <em>Sensor Measured Variables</em>}</li>
 * </ul>
 *
 * @see fr.ubo.collector.CollectorPackage#getSensor()
 * @model
 * @generated
 */
public interface Sensor extends NamedElement
{
	/**
	 * Returns the value of the '<em><b>Sensor Measured Variables</b></em>' containment reference list.
	 * The list contents are of type {@link fr.ubo.collector.MeasuredVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensor Measured Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor Measured Variables</em>' containment reference list.
	 * @see fr.ubo.collector.CollectorPackage#getSensor_SensorMeasuredVariables()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<MeasuredVariable> getSensorMeasuredVariables();

} // Sensor
