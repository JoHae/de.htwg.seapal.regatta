/**
 */
package de.htwg.seapal.components.component;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rootpackage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.htwg.seapal.components.component.Rootpackage#getName <em>Name</em>}</li>
 *   <li>{@link de.htwg.seapal.components.component.Rootpackage#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.htwg.seapal.components.component.ComponentPackage#getRootpackage()
 * @model
 * @generated
 */
public interface Rootpackage extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see de.htwg.seapal.components.component.ComponentPackage#getRootpackage_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.htwg.seapal.components.component.Rootpackage#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link de.htwg.seapal.components.component.AbstractElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see de.htwg.seapal.components.component.ComponentPackage#getRootpackage_Elements()
   * @model containment="true"
   * @generated
   */
  EList<AbstractElement> getElements();

} // Rootpackage
