package arondemo;

import aron.ARONBaseVisitor;
import aron.ARONLexer;
import aron.ARONParser;
import aron.ARONReader;
import aron.Document;
import aron.MyVisitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.File;
import java.io.InputStream;
import java.net.URI;

public class
Loader
{
	public static final void main( String[] args )
		throws Exception
	{
		String filename = "./src/arondemo/demo.aron";
//		String filename = "./src/arondemo/demo-override.aron";
		File file = new File( filename );

		URI uri = file.getCanonicalFile().toURI();
		InputStream in = uri.toURL().openStream();

		Document doc = new Document( uri );
		CharStream cs = CharStreams.fromStream( in );
		ARONLexer lexer = new ARONLexer( cs );
		CommonTokenStream tokens = new CommonTokenStream( lexer );
		ARONParser parser = new ARONParser( tokens );

		ARONParser.DocumentContext t = parser.document();

		MyVisitor v = new MyVisitor();
		t.accept( v );

	}
}
