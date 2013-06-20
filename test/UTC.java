import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


public class UTC {

	/**
	 * @param args
	 */
	public static void main(String[] args)
		throws Exception
	{
		Date now = new Date();
		
//		SimpleDateFormat sdf = new SimpleDateFormat( "yyyy-MM-dd'T'HH:mm:ssz", Locale.ROOT );
//		SimpleDateFormat sdf = new SimpleDateFormat( "yyyy-MM-dd'T'HH:mm:ssZ", Locale.ROOT );
		SimpleDateFormat sdf = new SimpleDateFormat( "yyyy-MM-dd'T'HH:mm:ss", Locale.ROOT );
		System.out.println( sdf.format( now ) + "   " + now.getTimezoneOffset() );
//		String utc = "2000-01-01T12:00:00+0000";
//		String utc = "2000-01-01T12:00:00-0000";
//		String utc = "2000-01-01T12:00:00";
		String utc = "2000-01-01T12:00";
//		String utc = "2000-01-01T12:00:00Z";
		// ""
		Date result = sdf.parse( utc );
		System.out.println( result );

	}

}
