/**
 */
package fr.ubo.collector.util;

import fr.ubo.collector.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fr.ubo.collector.CollectorPackage
 * @generated
 */
public class CollectorSwitch<T> extends Switch<T>
{
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CollectorPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectorSwitch()
	{
		if (modelPackage == null)
		{
			modelPackage = CollectorPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage)
	{
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject)
	{
		switch (classifierID)
		{
			case CollectorPackage.DATA_COLLECTOR:
			{
				DataCollector dataCollector = (DataCollector) theEObject;
				T result = caseDataCollector(dataCollector);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case CollectorPackage.NAMED_ELEMENT:
			{
				NamedElement namedElement = (NamedElement) theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case CollectorPackage.DRONE:
			{
				Drone drone = (Drone) theEObject;
				T result = caseDrone(drone);
				if (result == null)
					result = caseNamedElement(drone);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case CollectorPackage.SENSOR:
			{
				Sensor sensor = (Sensor) theEObject;
				T result = caseSensor(sensor);
				if (result == null)
					result = caseNamedElement(sensor);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case CollectorPackage.MEASURED_VARIABLE:
			{
				MeasuredVariable measuredVariable = (MeasuredVariable) theEObject;
				T result = caseMeasuredVariable(measuredVariable);
				if (result == null)
					result = caseNamedElement(measuredVariable);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case CollectorPackage.PUBLISHER:
			{
				Publisher publisher = (Publisher) theEObject;
				T result = casePublisher(publisher);
				if (result == null)
					result = caseAddressableElement(publisher);
				if (result == null)
					result = caseNamedElement(publisher);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case CollectorPackage.SUBSCRIBER:
			{
				Subscriber subscriber = (Subscriber) theEObject;
				T result = caseSubscriber(subscriber);
				if (result == null)
					result = caseAddressableElement(subscriber);
				if (result == null)
					result = caseNamedElement(subscriber);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case CollectorPackage.PUB_BROKER:
			{
				PubBroker pubBroker = (PubBroker) theEObject;
				T result = casePubBroker(pubBroker);
				if (result == null)
					result = caseAddressableElement(pubBroker);
				if (result == null)
					result = caseNamedElement(pubBroker);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case CollectorPackage.SUB_BROKER:
			{
				SubBroker subBroker = (SubBroker) theEObject;
				T result = caseSubBroker(subBroker);
				if (result == null)
					result = caseAddressableElement(subBroker);
				if (result == null)
					result = caseNamedElement(subBroker);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case CollectorPackage.ADDRESSABLE_ELEMENT:
			{
				AddressableElement addressableElement = (AddressableElement) theEObject;
				T result = caseAddressableElement(addressableElement);
				if (result == null)
					result = caseNamedElement(addressableElement);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case CollectorPackage.ENDPOINT:
			{
				Endpoint endpoint = (Endpoint) theEObject;
				T result = caseEndpoint(endpoint);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case CollectorPackage.TCP_IP_ENDPOINT:
			{
				TcpIpEndpoint tcpIpEndpoint = (TcpIpEndpoint) theEObject;
				T result = caseTcpIpEndpoint(tcpIpEndpoint);
				if (result == null)
					result = caseEndpoint(tcpIpEndpoint);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			default:
				return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Collector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Collector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataCollector(DataCollector object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Drone</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Drone</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDrone(Drone object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensor(Sensor object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measured Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measured Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasuredVariable(MeasuredVariable object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Publisher</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Publisher</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublisher(Publisher object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subscriber</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subscriber</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubscriber(Subscriber object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pub Broker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pub Broker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePubBroker(PubBroker object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Broker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Broker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubBroker(SubBroker object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Addressable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Addressable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddressableElement(AddressableElement object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Endpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndpoint(Endpoint object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tcp Ip Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tcp Ip Endpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTcpIpEndpoint(TcpIpEndpoint object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object)
	{
		return null;
	}

} //CollectorSwitch
