/**
 */
package fr.ubo.collector;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Collector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.ubo.collector.DataCollector#getDrone <em>Drone</em>}</li>
 *   <li>{@link fr.ubo.collector.DataCollector#getPubBroker <em>Pub Broker</em>}</li>
 *   <li>{@link fr.ubo.collector.DataCollector#getPublishers <em>Publishers</em>}</li>
 *   <li>{@link fr.ubo.collector.DataCollector#getSubscribers <em>Subscribers</em>}</li>
 *   <li>{@link fr.ubo.collector.DataCollector#getSubBroker <em>Sub Broker</em>}</li>
 * </ul>
 *
 * @see fr.ubo.collector.CollectorPackage#getDataCollector()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='differentNamesDrones differentNamesPubBrokers differentNamesSubBrokers differentNamesPublishers differentNamesSubscribers differentNamesSensors differentNamesMeasuredVariables'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot differentNamesDrones='\n\t\t\tDrone.allInstances() -&gt; forAll(drone_1, drone_2 | drone_1 &lt;&gt; drone_2 implies drone_1.name &lt;&gt; drone_2.name)' differentNamesPubBrokers='\n\t\t\tPubBroker.allInstances() -&gt; forAll(pub_broker_1, pub_broker_2 | pub_broker_1 &lt;&gt; pub_broker_2 implies pub_broker_1.name &lt;&gt; pub_broker_2.name)' differentNamesSubBrokers='\n\t\t\tSubBroker.allInstances() -&gt; forAll(sub_broker_1, sub_broker_2 | sub_broker_1 &lt;&gt; sub_broker_2 implies sub_broker_1.name &lt;&gt; sub_broker_2.name)' differentNamesPublishers='\n\t\t\tPublisher.allInstances() -&gt; forAll(pub_1, pub_2 | pub_1 &lt;&gt; pub_2 implies pub_1.name &lt;&gt; pub_2.name)' differentNamesSubscribers='\n\t\t\tSubscriber.allInstances() -&gt; forAll(sub_1, sub_2 | sub_1 &lt;&gt; sub_2 implies sub_1.name &lt;&gt; sub_2.name)' differentNamesSensors='\n\t\t\tSensor.allInstances() -&gt; forAll(sensor_1, sensor_2 | sensor_1 &lt;&gt; sensor_2 implies sensor_1.name &lt;&gt; sensor_2.name)' differentNamesMeasuredVariables='\n\t\t\tMeasuredVariable.allInstances() -&gt; forAll(variable_1, variable_2 | variable_1 &lt;&gt; variable_2 implies variable_1.name &lt;&gt; variable_2.name)'"
 * @generated
 */
public interface DataCollector extends EObject
{
	/**
	 * Returns the value of the '<em><b>Drone</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Drone</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drone</em>' containment reference.
	 * @see #setDrone(Drone)
	 * @see fr.ubo.collector.CollectorPackage#getDataCollector_Drone()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Drone getDrone();

	/**
	 * Sets the value of the '{@link fr.ubo.collector.DataCollector#getDrone <em>Drone</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Drone</em>' containment reference.
	 * @see #getDrone()
	 * @generated
	 */
	void setDrone(Drone value);

	/**
	 * Returns the value of the '<em><b>Pub Broker</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pub Broker</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pub Broker</em>' containment reference.
	 * @see #setPubBroker(PubBroker)
	 * @see fr.ubo.collector.CollectorPackage#getDataCollector_PubBroker()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PubBroker getPubBroker();

	/**
	 * Sets the value of the '{@link fr.ubo.collector.DataCollector#getPubBroker <em>Pub Broker</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pub Broker</em>' containment reference.
	 * @see #getPubBroker()
	 * @generated
	 */
	void setPubBroker(PubBroker value);

	/**
	 * Returns the value of the '<em><b>Publishers</b></em>' containment reference list.
	 * The list contents are of type {@link fr.ubo.collector.Publisher}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publishers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publishers</em>' containment reference list.
	 * @see fr.ubo.collector.CollectorPackage#getDataCollector_Publishers()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Publisher> getPublishers();

	/**
	 * Returns the value of the '<em><b>Subscribers</b></em>' containment reference list.
	 * The list contents are of type {@link fr.ubo.collector.Subscriber}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscribers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscribers</em>' containment reference list.
	 * @see fr.ubo.collector.CollectorPackage#getDataCollector_Subscribers()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Subscriber> getSubscribers();

	/**
	 * Returns the value of the '<em><b>Sub Broker</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Broker</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Broker</em>' containment reference.
	 * @see #setSubBroker(SubBroker)
	 * @see fr.ubo.collector.CollectorPackage#getDataCollector_SubBroker()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SubBroker getSubBroker();

	/**
	 * Sets the value of the '{@link fr.ubo.collector.DataCollector#getSubBroker <em>Sub Broker</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Broker</em>' containment reference.
	 * @see #getSubBroker()
	 * @generated
	 */
	void setSubBroker(SubBroker value);

} // DataCollector
