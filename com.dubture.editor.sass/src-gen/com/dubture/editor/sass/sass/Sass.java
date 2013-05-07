/**
 */
package com.dubture.editor.sass.sass;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.dubture.editor.sass.sass.Sass#getStatements <em>Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.dubture.editor.sass.sass.SassPackage#getSass()
 * @model
 * @generated
 */
public interface Sass extends EObject
{
  /**
   * Returns the value of the '<em><b>Statements</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statements</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' attribute list.
   * @see com.dubture.editor.sass.sass.SassPackage#getSass_Statements()
   * @model unique="false"
   * @generated
   */
  EList<String> getStatements();

} // Sass
