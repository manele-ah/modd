/**
 */
package fr.ubo.collector;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subscriber</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.ubo.collector.Subscriber#getPeriod <em>Period</em>}</li>
 *   <li>{@link fr.ubo.collector.Subscriber#getAggregation <em>Aggregation</em>}</li>
 *   <li>{@link fr.ubo.collector.Subscriber#getMonitoredMeasure <em>Monitored Measure</em>}</li>
 * </ul>
 *
 * @see fr.ubo.collector.CollectorPackage#getSubscriber()
 * @model
 * @generated
 */
public interface Subscriber extends NamedElement, AddressableElement
{
	/**
	 * Returns the value of the '<em><b>Period</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' attribute.
	 * @see #setPeriod(double)
	 * @see fr.ubo.collector.CollectorPackage#getSubscriber_Period()
	 * @model default="2" required="true"
	 * @generated
	 */
	double getPeriod();

	/**
	 * Sets the value of the '{@link fr.ubo.collector.Subscriber#getPeriod <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' attribute.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(double value);

	/**
	 * Returns the value of the '<em><b>Aggregation</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.ubo.collector.Aggregation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aggregation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregation</em>' attribute.
	 * @see fr.ubo.collector.Aggregation
	 * @see #setAggregation(Aggregation)
	 * @see fr.ubo.collector.CollectorPackage#getSubscriber_Aggregation()
	 * @model required="true"
	 * @generated
	 */
	Aggregation getAggregation();

	/**
	 * Sets the value of the '{@link fr.ubo.collector.Subscriber#getAggregation <em>Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregation</em>' attribute.
	 * @see fr.ubo.collector.Aggregation
	 * @see #getAggregation()
	 * @generated
	 */
	void setAggregation(Aggregation value);

	/**
	 * Returns the value of the '<em><b>Monitored Measure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Monitored Measure</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitored Measure</em>' reference.
	 * @see #setMonitoredMeasure(MeasuredVariable)
	 * @see fr.ubo.collector.CollectorPackage#getSubscriber_MonitoredMeasure()
	 * @model required="true"
	 * @generated
	 */
	MeasuredVariable getMonitoredMeasure();

	/**
	 * Sets the value of the '{@link fr.ubo.collector.Subscriber#getMonitoredMeasure <em>Monitored Measure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monitored Measure</em>' reference.
	 * @see #getMonitoredMeasure()
	 * @generated
	 */
	void setMonitoredMeasure(MeasuredVariable value);

} // Subscriber
