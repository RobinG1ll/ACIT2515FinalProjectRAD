/**
 * ACIT 2515 Java Shark - Final Project - RADadmin
 *
 * @author Robin Gill - A00823034
 * @author Abraham Al Jundi - A00988199
 * @author Daniel Kole - A00994261
 */

public class ExceptionReadingPcapFiles extends Exception{

    public ExceptionReadingPcapFiles()
    {
    }

    public ExceptionReadingPcapFiles(String message)
    {
        super(message);
    }

    public ExceptionReadingPcapFiles(Throwable cause)
    {
        super(cause);
    }

    public ExceptionReadingPcapFiles(String message, Throwable cause)
    {
        super(message, cause);
    }

    public ExceptionReadingPcapFiles(String message, Throwable cause,
                           boolean enableSuppression, boolean writableStackTrace)
    {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
