/*****************************************************************************
 * Copyright (C) The Apache Software Foundation. All rights reserved.        *
 * ------------------------------------------------------------------------- *
 * This software is published under the terms of the Apache Software License *
 * version 1.1, a copy of which has been included with this distribution in  *
 * the LICENSE file.                                                         *
 *****************************************************************************/

package org.apache.batik.refimpl.bridge;

import java.awt.Cursor;
import org.apache.batik.bridge.UserAgent;
import org.apache.batik.gvt.event.EventDispatcher;
import org.w3c.dom.Element;
import org.w3c.dom.svg.SVGAElement;

/**
 * The default implementation of the user agent.
 *
 * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a>
 * @version $Id$
 */
public class DefaultUserAgent implements UserAgent {

    /**
     * Returns the <code>EventDispatcher</code> used by the
     * <code>UserAgent</code> to dispatch events on GVT.
     */
    public EventDispatcher getEventDispatcher() {
        return null;
    }

    /**
     * Displays an error message in the User Agent interface.
     */
    public void displayError(String message) {
        System.err.println(message);
    }

    /**
     * Displays a message in the User Agent interface.
     */
    public void displayMessage(String message) {
        System.out.println(message);
    }

    /**
     * Returns the pixel to mm factor.
     */
    public float getPixelToMM() {
        return 0.33f;
    }

    /**
     * Returns the language settings.
     */
    public String getLanguages() {
        return "en";
    }

    /**
     * Returns the user stylesheet uri.
     * @return null if no user style sheet was specified.
     */
    public String getUserStyleSheetURI() {
        return null;
    }

    /**
     * Opens a link.
     * @param elt The activated link element.
     */
    public void openLink(SVGAElement elt) {
        System.out.println("UnsupportedOperationException");
    }

    /**
     * Informs the user agent to change the cursor.
     * @param cursor the new cursor
     */
    public void setSVGCursor(Cursor cursor) {
        System.out.println("UnsupportedOperationException");
    }
}
