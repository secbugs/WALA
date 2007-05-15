/*******************************************************************************
 * Copyright (c) 2002 - 2006 IBM Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package com.ibm.wala.dataflow.IFDS;

/**
 * A node in the exploded supergraph
 * 
 * Note that this representation is inefficient and should be used with care.
 * 
 * @author sfink
 */
public class ExplodedSupergraphNode<T> {

  private final T supergraphNode;

  private final int fact;

  /**
   * @param supergraphNode
   * @param fact
   */
  public ExplodedSupergraphNode(T supergraphNode, int fact) {
    this.supergraphNode = supergraphNode;
    this.fact = fact;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#equals(java.lang.Object)
   */
  public boolean equals(Object arg0) {
    if (arg0 == null) {
      return false;
    }
    if (getClass().equals(arg0.getClass())) {
      ExplodedSupergraphNode other = (ExplodedSupergraphNode) arg0;
      return supergraphNode.equals(other.supergraphNode) && fact == other.fact;
    } else {
      return false;
    }
  }

  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  public int hashCode() {
    return 8353 * supergraphNode.hashCode() + fact;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  public String toString() {
    return supergraphNode.toString() + "," + fact;
  }

  public int getFact() {
    return fact;
  }

  public T getSupergraphNode() {
    return supergraphNode;
  }
  
  
}
