/*
 * Copyright (c) 2004 World Wide Web Consortium,
 *
 * (Massachusetts Institute of Technology, European Research Consortium for
 * Informatics and Mathematics, Keio University). All Rights Reserved. This
 * work is distributed under the W3C(r) Software License [1] in the hope that
 * it will be useful, but WITHOUT ANY WARRANTY; without even the implied
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 *
 * [1] http://www.w3.org/Consortium/Legal/2002/copyright-software-20021231
 *
 * Modifications:
 *   February 21, 2005
 *     - Moved interface to org.apache.batik.dom.dom3 package.
 *
 * The original version of this file is available at:
 *   http://www.w3.org/TR/2003/NOTE-DOM-Level-3-Events-20031107/java-binding.zip
 */

package org.apache.batik.dom.dom3;

/**
 *  <code>DOMErrorHandler</code> is a callback interface that the DOM 
 * implementation can call when reporting errors that happens while 
 * processing XML data, or when doing some other processing (e.g. validating 
 * a document). A <code>DOMErrorHandler</code> object can be attached to a 
 * <code>Document</code> using the "error-handler" on the 
 * <code>DOMConfiguration</code> interface. If more than one error needs to 
 * be reported during an operation, the sequence and numbers of the errors 
 * passed to the error handler are implementation dependent. 
 * <p> The application that is using the DOM implementation is expected to 
 * implement this interface. 
 * <p>See also the <a href='http://www.w3.org/TR/2004/REC-DOM-Level-3-Core-20040407'>Document Object Model (DOM) Level 3 Core Specification</a>.
 * @since DOM Level 3
 */
public interface DOMErrorHandler extends org.w3c.dom.DOMErrorHandler {
}