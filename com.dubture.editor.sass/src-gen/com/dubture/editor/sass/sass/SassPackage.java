/**
 */
package com.dubture.editor.sass.sass;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.dubture.editor.sass.sass.SassFactory
 * @model kind="package"
 * @generated
 */
public interface SassPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "sass";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.dubture.com/editor/sass/Sass";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "sass";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SassPackage eINSTANCE = com.dubture.editor.sass.sass.impl.SassPackageImpl.init();

  /**
   * The meta object id for the '{@link com.dubture.editor.sass.sass.impl.SassImpl <em>Sass</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.dubture.editor.sass.sass.impl.SassImpl
   * @see com.dubture.editor.sass.sass.impl.SassPackageImpl#getSass()
   * @generated
   */
  int SASS = 0;

  /**
   * The feature id for the '<em><b>Statements</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SASS__STATEMENTS = 0;

  /**
   * The number of structural features of the '<em>Sass</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SASS_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link com.dubture.editor.sass.sass.Sass <em>Sass</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sass</em>'.
   * @see com.dubture.editor.sass.sass.Sass
   * @generated
   */
  EClass getSass();

  /**
   * Returns the meta object for the attribute list '{@link com.dubture.editor.sass.sass.Sass#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Statements</em>'.
   * @see com.dubture.editor.sass.sass.Sass#getStatements()
   * @see #getSass()
   * @generated
   */
  EAttribute getSass_Statements();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SassFactory getSassFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.dubture.editor.sass.sass.impl.SassImpl <em>Sass</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.dubture.editor.sass.sass.impl.SassImpl
     * @see com.dubture.editor.sass.sass.impl.SassPackageImpl#getSass()
     * @generated
     */
    EClass SASS = eINSTANCE.getSass();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SASS__STATEMENTS = eINSTANCE.getSass_Statements();

  }

} //SassPackage
