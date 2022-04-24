/**
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.mdsd.math;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Method Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mmmi.mdsd.math.ExternalMethodCall#getMethod <em>Method</em>}</li>
 *   <li>{@link dk.sdu.mmmi.mdsd.math.ExternalMethodCall#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @see dk.sdu.mmmi.mdsd.math.MathPackage#getExternalMethodCall()
 * @model
 * @generated
 */
public interface ExternalMethodCall extends Expression
{
  /**
   * Returns the value of the '<em><b>Method</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Method</em>' reference.
   * @see #setMethod(ExternalMethod)
   * @see dk.sdu.mmmi.mdsd.math.MathPackage#getExternalMethodCall_Method()
   * @model
   * @generated
   */
  ExternalMethod getMethod();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.mdsd.math.ExternalMethodCall#getMethod <em>Method</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Method</em>' reference.
   * @see #getMethod()
   * @generated
   */
  void setMethod(ExternalMethod value);

  /**
   * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
   * The list contents are of type {@link dk.sdu.mmmi.mdsd.math.Expression}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arguments</em>' containment reference list.
   * @see dk.sdu.mmmi.mdsd.math.MathPackage#getExternalMethodCall_Arguments()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getArguments();

} // ExternalMethodCall
