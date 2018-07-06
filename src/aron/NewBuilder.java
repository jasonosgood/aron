package aron;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import static java.lang.System.out;

public class NewBuilder extends ARONBaseListener
{
    @Override public void enterEveryRule(ParserRuleContext ctx)
    {
        out.println( ctx );
    }

    @Override public void exitEveryRule(ParserRuleContext ctx)
    {
        out.println( ctx );
    }

    @Override public void visitTerminal(TerminalNode node)
    {
        out.println( node );
    }

    @Override public void visitErrorNode(ErrorNode node)
    {
        out.println( node );
    }

}
