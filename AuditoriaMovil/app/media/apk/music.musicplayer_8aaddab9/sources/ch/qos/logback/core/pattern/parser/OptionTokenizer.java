package ch.qos.logback.core.pattern.parser;

import ch.qos.logback.core.pattern.util.AsIsEscapeUtil;
import ch.qos.logback.core.pattern.util.IEscapeUtil;
import ch.qos.logback.core.spi.ScanException;
import d.a.a.b.c.a.b;
import d.a.a.b.c.a.c;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class OptionTokenizer {
    private static final int EXPECTING_STATE = 0;
    private static final int QUOTED_COLLECTING_STATE = 2;
    private static final int RAW_COLLECTING_STATE = 1;
    public final IEscapeUtil escapeUtil;
    public final String pattern;
    public final int patternLength;
    public char quoteChar;
    public int state;
    public final c tokenStream;

    public OptionTokenizer(c cVar) {
        this(cVar, new AsIsEscapeUtil());
    }

    public OptionTokenizer(c cVar, IEscapeUtil iEscapeUtil) {
        this.state = 0;
        this.tokenStream = cVar;
        this.pattern = cVar.a;
        this.patternLength = cVar.f4958b;
        this.escapeUtil = iEscapeUtil;
    }

    public void emitOptionToken(List<b> list, List<String> list2) {
        list.add(new b(1006, list2));
        this.tokenStream.f4960d = c.a.LITERAL_STATE;
    }

    public void escape(String str, StringBuffer stringBuffer) {
        c cVar = this.tokenStream;
        int i2 = cVar.f4961e;
        if (i2 < this.patternLength) {
            String str2 = this.pattern;
            cVar.f4961e = i2 + 1;
            this.escapeUtil.escape(str, stringBuffer, str2.charAt(i2), this.tokenStream.f4961e);
        }
    }

    public void tokenize(char c2, List<b> list) throws ScanException {
        String trim;
        StringBuffer stringBuffer = new StringBuffer();
        ArrayList arrayList = new ArrayList();
        while (this.tokenStream.f4961e < this.patternLength) {
            int i2 = this.state;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        char c3 = this.quoteChar;
                        if (c2 == c3) {
                            trim = stringBuffer.toString();
                            arrayList.add(trim);
                            stringBuffer.setLength(0);
                            this.state = 0;
                        } else {
                            if (c2 == '\\') {
                                escape(String.valueOf(c3), stringBuffer);
                            }
                            stringBuffer.append(c2);
                        }
                    }
                } else if (c2 != ',') {
                    if (c2 == '}') {
                        arrayList.add(stringBuffer.toString().trim());
                        emitOptionToken(list, arrayList);
                        return;
                    }
                    stringBuffer.append(c2);
                } else {
                    trim = stringBuffer.toString().trim();
                    arrayList.add(trim);
                    stringBuffer.setLength(0);
                    this.state = 0;
                }
            } else if (c2 != '\t' && c2 != '\n' && c2 != '\r' && c2 != ' ') {
                if (c2 == '\"' || c2 == '\'') {
                    this.state = 2;
                    this.quoteChar = c2;
                } else if (c2 == ',') {
                    continue;
                } else if (c2 == '}') {
                    emitOptionToken(list, arrayList);
                    return;
                } else {
                    stringBuffer.append(c2);
                    this.state = 1;
                }
            }
            c2 = this.pattern.charAt(this.tokenStream.f4961e);
            this.tokenStream.f4961e++;
        }
        if (c2 != '}') {
            throw new ScanException("Unexpected end of pattern string in OptionTokenizer");
        }
        int i3 = this.state;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new ScanException("Unexpected end of pattern string in OptionTokenizer");
            }
            arrayList.add(stringBuffer.toString().trim());
        }
        emitOptionToken(list, arrayList);
    }
}
