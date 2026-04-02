package ch.qos.logback.core.pattern.parser;

import ch.qos.logback.core.pattern.Converter;
import ch.qos.logback.core.pattern.FormatInfo;
import ch.qos.logback.core.pattern.IdentityCompositeConverter;
import ch.qos.logback.core.pattern.ReplacingCompositeConverter;
import ch.qos.logback.core.pattern.util.IEscapeUtil;
import ch.qos.logback.core.pattern.util.RegularEscapeUtil;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.spi.ScanException;
import d.a.a.b.c.a.a;
import d.a.a.b.c.a.b;
import d.a.a.b.c.a.c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class Parser<E> extends ContextAwareBase {
    public static final Map<String, String> DEFAULT_COMPOSITE_CONVERTER_MAP;
    public static final String MISSING_RIGHT_PARENTHESIS = "http://logback.qos.ch/codes.html#missingRightParenthesis";
    public static final String REPLACE_CONVERTER_WORD = "replace";
    public int pointer;
    public final List<b> tokenList;

    static {
        HashMap hashMap = new HashMap();
        DEFAULT_COMPOSITE_CONVERTER_MAP = hashMap;
        hashMap.put("BARE", IdentityCompositeConverter.class.getName());
        hashMap.put(REPLACE_CONVERTER_WORD, ReplacingCompositeConverter.class.getName());
    }

    public Parser(c cVar) throws ScanException {
        this.pointer = 0;
        this.tokenList = cVar.c();
    }

    public Parser(String str) throws ScanException {
        this(str, new RegularEscapeUtil());
    }

    public Parser(String str, IEscapeUtil iEscapeUtil) throws ScanException {
        this.pointer = 0;
        try {
            this.tokenList = new c(str, iEscapeUtil).c();
        } catch (IllegalArgumentException e2) {
            throw new ScanException("Failed to initialize Parser", e2);
        }
    }

    public FormattingNode C() throws ScanException {
        b curentToken = getCurentToken();
        expectNotNull(curentToken, "a LEFT_PARENTHESIS or KEYWORD");
        int i2 = curentToken.f4955d;
        if (i2 != 1004) {
            if (i2 == 1005) {
                advanceTokenPointer();
                return COMPOSITE(curentToken.f4956e.toString());
            }
            throw new IllegalStateException("Unexpected token " + curentToken);
        }
        return SINGLE();
    }

    public FormattingNode COMPOSITE(String str) throws ScanException {
        CompositeNode compositeNode = new CompositeNode(str);
        compositeNode.setChildNode(E());
        b nextToken = getNextToken();
        if (nextToken != null && nextToken.f4955d == 41) {
            b curentToken = getCurentToken();
            if (curentToken != null && curentToken.f4955d == 1006) {
                compositeNode.setOptions(curentToken.f4957f);
                advanceTokenPointer();
            }
            return compositeNode;
        }
        String str2 = "Expecting RIGHT_PARENTHESIS token but got " + nextToken;
        addError(str2);
        addError("See also http://logback.qos.ch/codes.html#missingRightParenthesis");
        throw new ScanException(str2);
    }

    public Node E() throws ScanException {
        Node T = T();
        if (T == null) {
            return null;
        }
        Node Eopt = Eopt();
        if (Eopt != null) {
            T.setNext(Eopt);
        }
        return T;
    }

    public Node Eopt() throws ScanException {
        if (getCurentToken() == null) {
            return null;
        }
        return E();
    }

    public FormattingNode SINGLE() throws ScanException {
        SimpleKeywordNode simpleKeywordNode = new SimpleKeywordNode(getNextToken().f4956e);
        b curentToken = getCurentToken();
        if (curentToken != null && curentToken.f4955d == 1006) {
            simpleKeywordNode.setOptions(curentToken.f4957f);
            advanceTokenPointer();
        }
        return simpleKeywordNode;
    }

    public Node T() throws ScanException {
        b curentToken = getCurentToken();
        expectNotNull(curentToken, "a LITERAL or '%'");
        int i2 = curentToken.f4955d;
        if (i2 != 37) {
            if (i2 != 1000) {
                return null;
            }
            advanceTokenPointer();
            return new Node(0, curentToken.f4956e);
        }
        advanceTokenPointer();
        b curentToken2 = getCurentToken();
        expectNotNull(curentToken2, "a FORMAT_MODIFIER, SIMPLE_KEYWORD or COMPOUND_KEYWORD");
        if (curentToken2.f4955d == 1002) {
            FormatInfo valueOf = FormatInfo.valueOf(curentToken2.f4956e);
            advanceTokenPointer();
            FormattingNode C = C();
            C.setFormatInfo(valueOf);
            return C;
        }
        return C();
    }

    public void advanceTokenPointer() {
        this.pointer++;
    }

    public Converter<E> compile(Node node, Map<String, String> map) {
        a aVar = new a(node, map);
        aVar.setContext(this.context);
        return aVar.f();
    }

    public void expectNotNull(b bVar, String str) {
        if (bVar == null) {
            throw new IllegalStateException(e.a.d.a.a.k("All tokens consumed but was expecting ", str));
        }
    }

    public b getCurentToken() {
        if (this.pointer < this.tokenList.size()) {
            return this.tokenList.get(this.pointer);
        }
        return null;
    }

    public b getNextToken() {
        if (this.pointer < this.tokenList.size()) {
            List<b> list = this.tokenList;
            int i2 = this.pointer;
            this.pointer = i2 + 1;
            return list.get(i2);
        }
        return null;
    }

    public Node parse() throws ScanException {
        return E();
    }
}
