package org.olamy.challenge.vehicule;

/**
 * @author Olivier Lamy
 */
public class NonValidLineException
    extends Exception
{
    private long lineNumber;

    public NonValidLineException( String s, long lineNumber )
    {
        super( s );
        this.lineNumber = lineNumber;
    }

    public long getLineNumber()
    {
        return lineNumber;
    }
}
