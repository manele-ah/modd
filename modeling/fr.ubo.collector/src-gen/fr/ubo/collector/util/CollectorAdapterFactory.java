/**
 */
package fr.ubo.collector.util;

import fr.ubo.collector.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.ubo.collector.CollectorPackage
 * @generated
 */
public class CollectorAdapterFactory extends AdapterFactoryImpl
{
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CollectorPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectorAdapterFactory()
	{
		if (modelPackage == null)
		{
			modelPackage = CollectorPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object)
	{
		if (object == modelPackage)
		{
			return true;
		}
		if (object instanceof EObject)
		{
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollectorSwitch<Adapter> modelSwitch = new CollectorSwitch<Adapter>()
	{
		@Override
		public Adapter caseDataCollector(DataCollector object)
		{
			return createDataCollectorAdapter();
		}

		@Override
		public Adapter caseNamedElement(NamedElement object)
		{
			return createNamedElementAdapter();
		}

		@Override
		public Adapter caseDrone(Drone object)
		{
			return createDroneAdapter();
		}

		@Override
		public Adapter caseSensor(Sensor object)
		{
			return createSensorAdapter();
		}

		@Override
		public Adapter caseMeasuredVariable(MeasuredVariable object)
		{
			return createMeasuredVariableAdapter();
		}

		@Override
		public Adapter casePublisher(Publisher object)
		{
			return createPublisherAdapter();
		}

		@Override
		public Adapter caseSubscriber(Subscriber object)
		{
			return createSubscriberAdapter();
		}

		@Override
		public Adapter casePubBroker(PubBroker object)
		{
			return createPubBrokerAdapter();
		}

		@Override
		public Adapter caseSubBroker(SubBroker object)
		{
			return createSubBrokerAdapter();
		}

		@Override
		public Adapter caseAddressableElement(AddressableElement object)
		{
			return createAddressableElementAdapter();
		}

		@Override
		public Adapter caseEndpoint(Endpoint object)
		{
			return createEndpointAdapter();
		}

		@Override
		public Adapter caseTcpIpEndpoint(TcpIpEndpoint object)
		{
			return createTcpIpEndpointAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object)
		{
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target)
	{
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.ubo.collector.DataCollector <em>Data Collector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.ubo.collector.DataCollector
	 * @generated
	 */
	public Adapter createDataCollectorAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.ubo.collector.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.ubo.collector.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.ubo.collector.Drone <em>Drone</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.ubo.collector.Drone
	 * @generated
	 */
	public Adapter createDroneAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.ubo.collector.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.ubo.collector.Sensor
	 * @generated
	 */
	public Adapter createSensorAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.ubo.collector.MeasuredVariable <em>Measured Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.ubo.collector.MeasuredVariable
	 * @generated
	 */
	public Adapter createMeasuredVariableAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.ubo.collector.Publisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.ubo.collector.Publisher
	 * @generated
	 */
	public Adapter createPublisherAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.ubo.collector.Subscriber <em>Subscriber</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.ubo.collector.Subscriber
	 * @generated
	 */
	public Adapter createSubscriberAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.ubo.collector.PubBroker <em>Pub Broker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.ubo.collector.PubBroker
	 * @generated
	 */
	public Adapter createPubBrokerAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.ubo.collector.SubBroker <em>Sub Broker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.ubo.collector.SubBroker
	 * @generated
	 */
	public Adapter createSubBrokerAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.ubo.collector.AddressableElement <em>Addressable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.ubo.collector.AddressableElement
	 * @generated
	 */
	public Adapter createAddressableElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.ubo.collector.Endpoint <em>Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.ubo.collector.Endpoint
	 * @generated
	 */
	public Adapter createEndpointAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.ubo.collector.TcpIpEndpoint <em>Tcp Ip Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.ubo.collector.TcpIpEndpoint
	 * @generated
	 */
	public Adapter createTcpIpEndpointAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter()
	{
		return null;
	}

} //CollectorAdapterFactory
