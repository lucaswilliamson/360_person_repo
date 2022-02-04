package hi;

public class UnderAgeException extends Exception
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4554479932935169519L;

	/**
	 * 
	 */
	public UnderAgeException()
	{
		super("Parent is too Young");
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public UnderAgeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace)
	{
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 */
	public UnderAgeException(String message, Throwable cause)
	{
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 */
	public UnderAgeException(String message)
	{
		super(message);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cause
	 */
	public UnderAgeException(Throwable cause)
	{
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
