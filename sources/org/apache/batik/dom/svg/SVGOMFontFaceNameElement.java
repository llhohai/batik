/*****************************************************************************
 * Copyright (C) The Apache Software Foundation. All rights reserved.        *
 * ------------------------------------------------------------------------- *
 * This software is published under the terms of the Apache Software License *
 * version 1.1, a copy of which has been included with this distribution in  *
 * the LICENSE file.                                                         *
 *****************************************************************************/

package org.apache.batik.dom.svg;

import org.apache.batik.dom.AbstractDocument;

import org.w3c.dom.Node;
import org.w3c.dom.svg.SVGFontFaceNameElement;

/**
 * This class implements {@link SVGFontFaceNameElement}.
 *
 * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a>
 * @version $Id$
 */
public class SVGOMFontFaceNameElement
    extends    SVGOMElement
    implements SVGFontFaceNameElement {

    /**
     * Creates a new SVGOMFontFaceNameElement object.
     */
    protected SVGOMFontFaceNameElement() {
    }

    /**
     * Creates a new SVGOMFontFaceNameElement object.
     * @param prefix The namespace prefix.
     * @param owner The owner document.
     */
    public SVGOMFontFaceNameElement(String prefix, AbstractDocument owner) {
        super(prefix, owner);

    }

    /**
     * <b>DOM</b>: Implements {@link Node#getLocalName()}.
     */
    public String getLocalName() {
        return SVG_FONT_FACE_NAME_TAG;
    }

    /**
     * Returns a new uninitialized instance of this object's class.
     */
    protected Node newNode() {
        return new SVGOMFontFaceNameElement();
    }
}