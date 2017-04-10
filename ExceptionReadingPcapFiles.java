package Final;

/**
 * Created by Daniel on 2017-04-06.
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
