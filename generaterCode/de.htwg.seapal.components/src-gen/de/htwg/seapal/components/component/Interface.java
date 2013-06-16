/**
 */
package de.htwg.seapal.components.component;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.htwg.seapal.components.component.Interface#getProperties <em>Properties</em>}</li>
 *   <li>{@link de.htwg.seapal.components.component.Interface#getMethods <em>Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.htwg.seapal.components.component.ComponentPackage#getInterface()
 * @model
 * @generated
 */
public interface Interface extends Type
{
  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link de.htwg.seapal.components.component.Property}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see de.htwg.seapal.components.component.ComponentPackage#getInterface_Properties()
   * @model containment="true"
   * @generated
   */
  EList<Property> getProperties();

  /**
   * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
   * The list contents are of type {@link de.htwg.seapal.components.component.Method}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Methods</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Methods</em>' containment reference list.
   * @see de.htwg.seapal.components.component.ComponentPackage#getInterface_Methods()
   * @model containment="true"
   * @generated
   */
  EList<Method> getMethods();

} // Interface
