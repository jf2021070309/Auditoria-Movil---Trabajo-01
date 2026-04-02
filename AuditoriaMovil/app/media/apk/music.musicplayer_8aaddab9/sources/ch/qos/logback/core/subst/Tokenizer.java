package ch.qos.logback.core.subst;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.spi.ScanException;
import ch.qos.logback.core.subst.Token;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class Tokenizer {
    public final String pattern;
    public final int patternLength;
    public a state = a.LITERAL_STATE;
    public int pointer = 0;

    /* loaded from: classes.dex */
    public enum a {
        LITERAL_STATE,
        START_STATE,
        DEFAULT_VAL_STATE
    }

    public Tokenizer(String str) {
        this.pattern = str;
        this.patternLength = str.length();
    }

    private void addLiteralToken(List<Token> list, StringBuilder sb) {
        if (sb.length() == 0) {
            return;
        }
        list.add(new Token(Token.Type.LITERAL, sb.toString()));
    }

    private void handleDefaultValueState(char c2, List<Token> list, StringBuilder sb) {
        a aVar;
        Token token;
        if (c2 != '$') {
            if (c2 != '-') {
                sb.append(CoreConstants.COLON_CHAR);
                if (c2 != '{') {
                    sb.append(c2);
                    aVar = a.LITERAL_STATE;
                } else {
                    addLiteralToken(list, sb);
                    sb.setLength(0);
                    token = Token.CURLY_LEFT_TOKEN;
                }
            } else {
                token = Token.DEFAULT_SEP_TOKEN;
            }
            list.add(token);
            aVar = a.LITERAL_STATE;
        } else {
            sb.append(CoreConstants.COLON_CHAR);
            addLiteralToken(list, sb);
            sb.setLength(0);
            aVar = a.START_STATE;
        }
        this.state = aVar;
    }

    private void handleLiteralState(char c2, List<Token> list, StringBuilder sb) {
        a aVar;
        Token token;
        if (c2 == '$') {
            addLiteralToken(list, sb);
            sb.setLength(0);
            aVar = a.START_STATE;
        } else if (c2 != ':') {
            if (c2 == '{') {
                addLiteralToken(list, sb);
                token = Token.CURLY_LEFT_TOKEN;
            } else if (c2 != '}') {
                sb.append(c2);
                return;
            } else {
                addLiteralToken(list, sb);
                token = Token.CURLY_RIGHT_TOKEN;
            }
            list.add(token);
            sb.setLength(0);
            return;
        } else {
            addLiteralToken(list, sb);
            sb.setLength(0);
            aVar = a.DEFAULT_VAL_STATE;
        }
        this.state = aVar;
    }

    private void handleStartState(char c2, List<Token> list, StringBuilder sb) {
        if (c2 == '{') {
            list.add(Token.START_TOKEN);
        } else {
            sb.append(CoreConstants.DOLLAR);
            sb.append(c2);
        }
        this.state = a.LITERAL_STATE;
    }

    public List<Token> tokenize() throws ScanException {
        char c2;
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i2 = this.pointer;
            if (i2 >= this.patternLength) {
                break;
            }
            char charAt = this.pattern.charAt(i2);
            this.pointer++;
            int ordinal = this.state.ordinal();
            if (ordinal == 0) {
                handleLiteralState(charAt, arrayList, sb);
            } else if (ordinal == 1) {
                handleStartState(charAt, arrayList, sb);
            } else if (ordinal == 2) {
                handleDefaultValueState(charAt, arrayList, sb);
            }
        }
        int ordinal2 = this.state.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 != 1) {
                if (ordinal2 == 2) {
                    c2 = CoreConstants.COLON_CHAR;
                }
                return arrayList;
            }
            c2 = CoreConstants.DOLLAR;
            sb.append(c2);
        }
        addLiteralToken(arrayList, sb);
        return arrayList;
    }
}
