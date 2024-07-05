/**
 */
package fr.ubo.collector;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Addressable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.ubo.collector.AddressableElement#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see fr.ubo.collector.CollectorPackage#getAddressableElement()
 * @model
 * @generated
 */
public interface AddressableElement extends NamedElement
{
	/**
	 * Returns the value of the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' containment reference.
	 * @see #setId(Endpoint)
	 * @see fr.ubo.collector.CollectorPackage#getAddressableElement_Id()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Endpoint getId();

	/**
	 * Sets the value of the '{@link fr.ubo.collector.AddressableElement#getId <em>Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' containment reference.
	 * @see #getId()
	 * @generated
	 */
	void setId(Endpoint value);

} // AddressableElement
