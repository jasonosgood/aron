package aron;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.tree.xpath.XPath;

import java.io.FileInputStream;
import java.util.Collection;

import static aron.ARONParser.*;
import arondemo.Fruit;

public class Main
{

    public static void main( String[] args ) throws Exception
    {
        FileInputStream in = new FileInputStream( "./src/arondemo/demo.aron" );
        CharStream cs = CharStreams.fromStream( in );
        ARONLexer lexer = new ARONLexer( cs );
        CommonTokenStream tokens = new CommonTokenStream( lexer );
        ARONParser parser = new ARONParser( tokens );
        parser.setBuildParseTree(true);

        RootContext rc = parser.root();

        ARONReader ar = new ARONReader();
        ar.process( rc );

//        ARONBaseVisitor bv = new ARONBaseVisitor();
//        bv.visit( rc );

//        ParseTree pt = rc;
//
//        XPath p = new XPath(parser, "//root/imports/klass" );
//        Collection<ParseTree> ugh =  p.evaluate(rc);
//
//        for( ParseTree mini : ugh ) {
//            System.out.println(mini.toStringTree(parser));
//            String klassName = mini.getText();
//            System.out.println( klassName );
//        }
//        System.out.println(rc.toStringTree(parser));
//
        for( IncludesContext include : rc.includes() )
        {
            String url = include.getText();
            System.out.println( url );
//            includes( url );
        }
        for( ImportsContext imports : rc.imports() )
        {
            KlassContext kc = imports.klass();
            String klassName = kc.getText();
            System.out.println( klassName );
        }

    }
}
