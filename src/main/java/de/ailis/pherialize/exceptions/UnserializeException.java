/*
 * $Id$
 * Copyright (C) 2009 Klaus Reimer <k@ailis.de>
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to
 * deal in the Software without restriction, including without limitation the
 * rights to use, copy, modify, merge, publish, distribute, sublicense, and/or
 * sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS
 * IN THE SOFTWARE.
 */

package de.ailis.pherialize.exceptions;



/**
 * Exception thrown when someting goes wrong while unserializing.
 * 
 * @author Klaus Reimer (k@ailis.de)
 * @version $Revision$
 */

public class UnserializeException extends PherializeException
{
    /** Serial version UID */
    private static final long serialVersionUID = -7127648595193318947L;
    public final int position;

    /**
     * Constructor
     * @param position
     */

    public UnserializeException(int position)
    {
        super();
        this.position = position;
    }


    /**
     * Constructor
     *
     * @param position
     * @param message
     */

    public UnserializeException(final String message, int position)
    {
        super(message);
        this.position = position;
    }


    /**
     * Constructor
     *  @param message
     *            The exception message
     * @param cause
     * @param position
     */

    public UnserializeException(final String message, final Throwable cause, int position)
    {
        super(message, cause);
        this.position = position;
    }


    /**
     * Constructor
     *
     * @param cause
     *            The root cause
     * @param position
     */

    public UnserializeException(final Throwable cause, int position)
    {
        super(cause);
        this.position = position;
    }
}
