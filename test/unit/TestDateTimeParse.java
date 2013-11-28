package unit;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import aron.ARONReader;

public class TestDateTimeParse {

	public static void main(String[] args) throws ParseException {
		
		// TODO: Figure out way to preserve timezone offset thru parse
		
//		{
//			SimpleDateFormat sdf = new SimpleDateFormat( "yyyy-MM-dd'T'HH:mm:ssZ", Locale.ROOT );
//			String gorp = "2013-11-28T10:10:10-0800";
//			System.out.println( sdf.parse( gorp ));
//			
//		}
//		
//		{
//			SimpleDateFormat sdf = new SimpleDateFormat( "yyMMddHHmmssZ" );
//			String gorp = "010704120856-0400";
//			System.out.println( sdf.parse( gorp ));
//			
//		}
		
			
		
		Date now = new Date();
		
		ARONReader aron = new ARONReader();
		
		System.out.println( aron.parseDate( "2013-11-28" ));
		System.out.println( aron.parseDate( "2013-11-28T10:00" ));
		System.out.println( aron.parseDate( "2013-11-28T10:10:10" ));
		System.out.println( aron.parseDate( "2013-11-28T10:10:10+0600" ));
		System.out.println( aron.parseDate( "2013-11-28T10:10:10.001" ));
		System.out.println( aron.parseDate( "2013-11-28T10:10:10.001+0600" ));
		System.out.println( aron.parseDate( "2013-11-28T10:10:10Z" ));
//		
	}

}
