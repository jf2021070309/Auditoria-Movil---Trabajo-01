package d.a.a.b.c.a;

import ch.qos.logback.core.pattern.parser.OptionTokenizer;
import ch.qos.logback.core.pattern.util.IEscapeUtil;
import ch.qos.logback.core.pattern.util.RestrictedEscapeUtil;
import ch.qos.logback.core.spi.ScanException;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class c {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4958b;

    /* renamed from: c  reason: collision with root package name */
    public final IEscapeUtil f4959c;

    /* renamed from: d  reason: collision with root package name */
    public a f4960d;

    /* renamed from: e  reason: collision with root package name */
    public int f4961e;

    /* loaded from: classes.dex */
    public enum a {
        LITERAL_STATE,
        FORMAT_MODIFIER_STATE,
        KEYWORD_STATE,
        OPTION_STATE,
        RIGHT_PARENTHESIS_STATE
    }

    public c(String str, IEscapeUtil iEscapeUtil) {
        new RestrictedEscapeUtil();
        this.f4960d = a.LITERAL_STATE;
        this.f4961e = 0;
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("null or empty pattern string not allowed");
        }
        this.a = str;
        this.f4958b = str.length();
        this.f4959c = iEscapeUtil;
    }

    public final void a(int i2, StringBuffer stringBuffer, List<b> list) {
        if (stringBuffer.length() > 0) {
            list.add(new b(i2, stringBuffer.toString()));
            stringBuffer.setLength(0);
        }
    }

    public void b(String str, StringBuffer stringBuffer) {
        int i2 = this.f4961e;
        if (i2 < this.f4958b) {
            String str2 = this.a;
            this.f4961e = i2 + 1;
            this.f4959c.escape(str, stringBuffer, str2.charAt(i2), this.f4961e);
        }
    }

    public List<b> c() throws ScanException {
        a aVar;
        a aVar2;
        a aVar3;
        ArrayList arrayList = new ArrayList();
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            int i2 = this.f4961e;
            if (i2 >= this.f4958b) {
                break;
            }
            char charAt = this.a.charAt(i2);
            this.f4961e++;
            int ordinal = this.f4960d.ordinal();
            if (ordinal == 0) {
                if (charAt == '%') {
                    a(1000, stringBuffer, arrayList);
                    arrayList.add(b.f4954c);
                    aVar3 = a.FORMAT_MODIFIER_STATE;
                } else if (charAt == ')') {
                    a(1000, stringBuffer, arrayList);
                    aVar3 = a.RIGHT_PARENTHESIS_STATE;
                } else if (charAt != '\\') {
                    stringBuffer.append(charAt);
                } else {
                    b("%()", stringBuffer);
                }
                this.f4960d = aVar3;
            } else if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        new OptionTokenizer(this).tokenize(charAt, arrayList);
                    } else if (ordinal == 4) {
                        arrayList.add(b.a);
                        if (charAt != ')') {
                            if (charAt == '\\') {
                                b("%{}", stringBuffer);
                            } else if (charAt != '{') {
                                stringBuffer.append(charAt);
                            } else {
                                aVar = a.OPTION_STATE;
                                this.f4960d = aVar;
                            }
                            aVar = a.LITERAL_STATE;
                            this.f4960d = aVar;
                        }
                    }
                } else if (Character.isJavaIdentifierPart(charAt)) {
                    stringBuffer.append(charAt);
                } else {
                    if (charAt == '{') {
                        a(1004, stringBuffer, arrayList);
                        aVar2 = a.OPTION_STATE;
                    } else {
                        if (charAt == '(') {
                            a(1005, stringBuffer, arrayList);
                        } else {
                            a(1004, stringBuffer, arrayList);
                            if (charAt == '%') {
                                arrayList.add(b.f4954c);
                                aVar2 = a.FORMAT_MODIFIER_STATE;
                            } else if (charAt == ')') {
                                aVar2 = a.RIGHT_PARENTHESIS_STATE;
                            } else if (charAt == '\\') {
                                int i3 = this.f4961e;
                                if (i3 < this.f4958b) {
                                    String str = this.a;
                                    this.f4961e = i3 + 1;
                                    this.f4959c.escape("%()", stringBuffer, str.charAt(i3), this.f4961e);
                                }
                            } else {
                                stringBuffer.append(charAt);
                            }
                        }
                        aVar2 = a.LITERAL_STATE;
                    }
                    this.f4960d = aVar2;
                }
            } else if (charAt == '(') {
                a(1002, stringBuffer, arrayList);
                arrayList.add(b.f4953b);
                this.f4960d = a.LITERAL_STATE;
            } else {
                if (Character.isJavaIdentifierStart(charAt)) {
                    a(1002, stringBuffer, arrayList);
                    this.f4960d = a.KEYWORD_STATE;
                }
                stringBuffer.append(charAt);
            }
        }
        int ordinal2 = this.f4960d.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 != 1) {
                if (ordinal2 == 2) {
                    arrayList.add(new b(1004, stringBuffer.toString()));
                } else if (ordinal2 != 3) {
                    if (ordinal2 == 4) {
                        arrayList.add(b.a);
                    }
                }
            }
            throw new ScanException("Unexpected end of pattern string");
        }
        a(1000, stringBuffer, arrayList);
        return arrayList;
    }
}
