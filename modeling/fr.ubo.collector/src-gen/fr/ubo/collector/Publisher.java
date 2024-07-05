/**
 */
package fr.ubo.collector;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Publisher</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.ubo.collector.Publisher#getPublishedMeasures <em>Published Measures</em>}</li>
 *   <li>{@link fr.ubo.collector.Publisher#getPeriod <em>Period</em>}</li>
 * </ul>
 *
 * @see fr.ubo.collector.CollectorPackage#getPublisher()
 * @model
 * @generated
 */
public interface Publisher extends NamedElement, AddressableElement
{
	/**
	 * Returns the value of the '<em><b>Published Measures</b></em>' reference list.
	 * The list contents are of type {@link fr.ubo.collector.MeasuredVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Published Measures</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Published Measures</em>' reference list.
	 * @see fr.ubo.collector.CollectorPackage#getPublisher_PublishedMeasures()
	 * @model required="true"
	 * @generated
	 */
	EList<MeasuredVariable> getPublishedMeasures();

	/**
	 * Returns the value of the '<em><b>Period</b></em>' attribute.
	 * The default value is <code>"0.04"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' attribute.
	 * @see #setPeriod(double)
	 * @see fr.ubo.collector.CollectorPackage#getPublisher_Period()
	 * @model default="0.04" required="true"
	 * @generated
	 */
	double getPeriod();

	/**
	 * Sets the value of the '{@link fr.ubo.collector.Publisher#getPeriod <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' attribute.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(double value);

} // Publisher
