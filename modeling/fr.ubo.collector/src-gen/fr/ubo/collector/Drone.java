/**
 */
package fr.ubo.collector;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Drone</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.ubo.collector.Drone#getSensorsDrone <em>Sensors Drone</em>}</li>
 * </ul>
 *
 * @see fr.ubo.collector.CollectorPackage#getDrone()
 * @model
 * @generated
 */
public interface Drone extends NamedElement
{
	/**
	 * Returns the value of the '<em><b>Sensors Drone</b></em>' containment reference list.
	 * The list contents are of type {@link fr.ubo.collector.Sensor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensors Drone</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensors Drone</em>' containment reference list.
	 * @see fr.ubo.collector.CollectorPackage#getDrone_SensorsDrone()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Sensor> getSensorsDrone();

} // Drone
