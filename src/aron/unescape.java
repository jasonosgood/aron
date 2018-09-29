package aron;


// TODO: circle back and handle more char codes per https://stackoverflow.com/a/4298836

public class unescape
{
	public static final String unescape( String old )
	{
		StringBuilder nu = new StringBuilder( old.length() );

		for( int i = 0; i < old.length(); i++ )
		{
			int cp = old.codePointAt( i );

			if( cp == '\\' )
			{
				i++;
				cp = old.codePointAt( i );
				switch( cp )
				{
					case '"':
						nu.append( '"' );
						break;

					case 'r':
						nu.append( '\r' );
						break;

					case 'n':
						nu.append( '\n' );
						break;

					case 't':
						nu.append( '\t' );
						break;

					case '\\':
						nu.append( '\\' );
						break;

					// passthru
					default:
						nu.append( '\\' );
						nu.append( Character.toChars( cp ));
						break;
				}
			}
			else
			{
				nu.append( Character.toChars( cp ));
			}
		}
		return nu.toString();
	}
}
