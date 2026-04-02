package ch.qos.logback.core.subst;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.spi.ScanException;
import ch.qos.logback.core.subst.Node;
import ch.qos.logback.core.subst.Token;
import e.a.d.a.a;
import java.util.List;
/* loaded from: classes.dex */
public class Parser {
    public int pointer = 0;
    public final List<Token> tokenList;

    public Parser(List<Token> list) {
        this.tokenList = list;
    }

    private Node C() throws ScanException {
        Node E = E();
        if (isDefaultToken(peekAtCurentToken())) {
            advanceTokenPointer();
            E.append(makeNewLiteralNode(":-"));
            E.append(E());
        }
        return E;
    }

    private Node E() throws ScanException {
        Node T = T();
        if (T == null) {
            return null;
        }
        Node Eopt = Eopt();
        if (Eopt != null) {
            T.append(Eopt);
        }
        return T;
    }

    private Node Eopt() throws ScanException {
        if (peekAtCurentToken() == null) {
            return null;
        }
        return E();
    }

    private Node T() throws ScanException {
        Token peekAtCurentToken = peekAtCurentToken();
        int ordinal = peekAtCurentToken.type.ordinal();
        if (ordinal == 0) {
            advanceTokenPointer();
            return makeNewLiteralNode(peekAtCurentToken.payload);
        } else if (ordinal == 1) {
            advanceTokenPointer();
            Node V = V();
            expectCurlyRight(peekAtCurentToken());
            advanceTokenPointer();
            return V;
        } else if (ordinal != 2) {
            return null;
        } else {
            advanceTokenPointer();
            Node C = C();
            expectCurlyRight(peekAtCurentToken());
            advanceTokenPointer();
            Node makeNewLiteralNode = makeNewLiteralNode(CoreConstants.LEFT_ACCOLADE);
            makeNewLiteralNode.append(C);
            makeNewLiteralNode.append(makeNewLiteralNode(CoreConstants.RIGHT_ACCOLADE));
            return makeNewLiteralNode;
        }
    }

    private Node V() throws ScanException {
        Node node = new Node(Node.a.VARIABLE, E());
        if (isDefaultToken(peekAtCurentToken())) {
            advanceTokenPointer();
            node.defaultPart = E();
        }
        return node;
    }

    private boolean isDefaultToken(Token token) {
        return token != null && token.type == Token.Type.DEFAULT;
    }

    private Node makeNewLiteralNode(String str) {
        return new Node(Node.a.LITERAL, str);
    }

    public void advanceTokenPointer() {
        this.pointer++;
    }

    public void expectCurlyRight(Token token) throws ScanException {
        expectNotNull(token, "}");
        if (token.type != Token.Type.CURLY_RIGHT) {
            throw new ScanException("Expecting }");
        }
    }

    public void expectNotNull(Token token, String str) {
        if (token == null) {
            throw new IllegalArgumentException(a.l("All tokens consumed but was expecting \"", str, "\""));
        }
    }

    public Node parse() throws ScanException {
        List<Token> list = this.tokenList;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return E();
    }

    public Token peekAtCurentToken() {
        if (this.pointer < this.tokenList.size()) {
            return this.tokenList.get(this.pointer);
        }
        return null;
    }
}
