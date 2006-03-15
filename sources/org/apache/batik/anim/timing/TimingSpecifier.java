/*

   Copyright 2006  The Apache Software Foundation 

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.

 */
package org.apache.batik.anim.timing;

/**
 * An abstract class for SMIL timing specifiers.
 *
 * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a>
 * @version $Id$
 */
public abstract class TimingSpecifier {

    /**
     * The element that owns this timing specifier.
     */
    protected TimedElement owner;

    /**
     * Whether this timing specifier is for a begin time or an end time.
     */
    protected boolean isBegin;

    /**
     * Creates a new TimingSpecifier object.
     */
    protected TimingSpecifier(TimedElement owner, boolean isBegin) {
        this.owner = owner;
        this.isBegin = isBegin;
    }

    /**
     * Initializes this timing specifier by adding the initial instance time
     * to the owner's instance time list or setting up any event listeners.
     * This should be overriden in descendant classes.
     */
    public void initialize() {
    }

    /**
     * Deinitializes this timing specifier by removing any event listeners.
     * This should be overriden in descendant classes.
     */
    public void deinitialize() {
    }

    /**
     * Called by the timebase element when it creates a new Interval.
     * This should be overridden in descendant classes that generate
     * time instances based on the interval of a timebase element.
     */
    void newInterval(Interval interval) {
        // XXX ...
    }

    /**
     * Called by the timebase element when it deletes an Interval.
     * This should be overridden in descendant classes that generate
     * time instances based on the interval of a timebase element.
     */
    void removeInterval(Interval interval) {
        // XXX ...
    }

    /**
     * Called by an {@link InstanceTime} created by this TimingSpecifier
     * to indicate that its value has changed.
     */
    void handleTimebaseUpdate(InstanceTime instanceTime, float newTime) {
        // XXX ...
    }
}