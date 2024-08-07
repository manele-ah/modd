/**
 */
package fr.ubo.collector.provider;

import fr.ubo.collector.util.CollectorAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CollectorItemProviderAdapterFactory extends CollectorAdapterFactory
	implements ComposeableAdapterFactory, IChangeNotifier, IDisposable
{
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectorItemProviderAdapterFactory()
	{
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.ubo.collector.DataCollector} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataCollectorItemProvider dataCollectorItemProvider;

	/**
	 * This creates an adapter for a {@link fr.ubo.collector.DataCollector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDataCollectorAdapter()
	{
		if (dataCollectorItemProvider == null)
		{
			dataCollectorItemProvider = new DataCollectorItemProvider(this);
		}

		return dataCollectorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.ubo.collector.NamedElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamedElementItemProvider namedElementItemProvider;

	/**
	 * This creates an adapter for a {@link fr.ubo.collector.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNamedElementAdapter()
	{
		if (namedElementItemProvider == null)
		{
			namedElementItemProvider = new NamedElementItemProvider(this);
		}

		return namedElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.ubo.collector.Drone} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DroneItemProvider droneItemProvider;

	/**
	 * This creates an adapter for a {@link fr.ubo.collector.Drone}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDroneAdapter()
	{
		if (droneItemProvider == null)
		{
			droneItemProvider = new DroneItemProvider(this);
		}

		return droneItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.ubo.collector.Sensor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensorItemProvider sensorItemProvider;

	/**
	 * This creates an adapter for a {@link fr.ubo.collector.Sensor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSensorAdapter()
	{
		if (sensorItemProvider == null)
		{
			sensorItemProvider = new SensorItemProvider(this);
		}

		return sensorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.ubo.collector.MeasuredVariable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasuredVariableItemProvider measuredVariableItemProvider;

	/**
	 * This creates an adapter for a {@link fr.ubo.collector.MeasuredVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMeasuredVariableAdapter()
	{
		if (measuredVariableItemProvider == null)
		{
			measuredVariableItemProvider = new MeasuredVariableItemProvider(this);
		}

		return measuredVariableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.ubo.collector.Publisher} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PublisherItemProvider publisherItemProvider;

	/**
	 * This creates an adapter for a {@link fr.ubo.collector.Publisher}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPublisherAdapter()
	{
		if (publisherItemProvider == null)
		{
			publisherItemProvider = new PublisherItemProvider(this);
		}

		return publisherItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.ubo.collector.Subscriber} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubscriberItemProvider subscriberItemProvider;

	/**
	 * This creates an adapter for a {@link fr.ubo.collector.Subscriber}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSubscriberAdapter()
	{
		if (subscriberItemProvider == null)
		{
			subscriberItemProvider = new SubscriberItemProvider(this);
		}

		return subscriberItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.ubo.collector.PubBroker} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PubBrokerItemProvider pubBrokerItemProvider;

	/**
	 * This creates an adapter for a {@link fr.ubo.collector.PubBroker}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPubBrokerAdapter()
	{
		if (pubBrokerItemProvider == null)
		{
			pubBrokerItemProvider = new PubBrokerItemProvider(this);
		}

		return pubBrokerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.ubo.collector.SubBroker} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubBrokerItemProvider subBrokerItemProvider;

	/**
	 * This creates an adapter for a {@link fr.ubo.collector.SubBroker}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSubBrokerAdapter()
	{
		if (subBrokerItemProvider == null)
		{
			subBrokerItemProvider = new SubBrokerItemProvider(this);
		}

		return subBrokerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.ubo.collector.AddressableElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddressableElementItemProvider addressableElementItemProvider;

	/**
	 * This creates an adapter for a {@link fr.ubo.collector.AddressableElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAddressableElementAdapter()
	{
		if (addressableElementItemProvider == null)
		{
			addressableElementItemProvider = new AddressableElementItemProvider(this);
		}

		return addressableElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.ubo.collector.TcpIpEndpoint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TcpIpEndpointItemProvider tcpIpEndpointItemProvider;

	/**
	 * This creates an adapter for a {@link fr.ubo.collector.TcpIpEndpoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTcpIpEndpointAdapter()
	{
		if (tcpIpEndpointItemProvider == null)
		{
			tcpIpEndpointItemProvider = new TcpIpEndpointItemProvider(this);
		}

		return tcpIpEndpointItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory()
	{
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory)
	{
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type)
	{
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type)
	{
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type)
	{
		if (isFactoryForType(type))
		{
			Object adapter = super.adapt(object, type);
			if ( ! (type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter)))
			{
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener)
	{
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener)
	{
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification)
	{
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null)
		{
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose()
	{
		if (dataCollectorItemProvider != null)
			dataCollectorItemProvider.dispose();
		if (namedElementItemProvider != null)
			namedElementItemProvider.dispose();
		if (droneItemProvider != null)
			droneItemProvider.dispose();
		if (sensorItemProvider != null)
			sensorItemProvider.dispose();
		if (measuredVariableItemProvider != null)
			measuredVariableItemProvider.dispose();
		if (publisherItemProvider != null)
			publisherItemProvider.dispose();
		if (subscriberItemProvider != null)
			subscriberItemProvider.dispose();
		if (pubBrokerItemProvider != null)
			pubBrokerItemProvider.dispose();
		if (subBrokerItemProvider != null)
			subBrokerItemProvider.dispose();
		if (addressableElementItemProvider != null)
			addressableElementItemProvider.dispose();
		if (tcpIpEndpointItemProvider != null)
			tcpIpEndpointItemProvider.dispose();
	}

}
