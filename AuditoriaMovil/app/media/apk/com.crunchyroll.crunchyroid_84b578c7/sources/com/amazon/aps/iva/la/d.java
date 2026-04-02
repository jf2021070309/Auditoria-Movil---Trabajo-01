package com.amazon.aps.iva.la;

import com.amazon.aps.iva.ef0.e;
import com.amazon.aps.iva.ef0.h;
import com.amazon.aps.iva.ef0.i;
import com.amazon.aps.iva.ef0.x;
import com.amazon.aps.iva.la.c;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.io.EOFException;
import java.io.IOException;
/* compiled from: JsonUtf8Reader.java */
/* loaded from: classes.dex */
public final class d extends c {
    public static final i m;
    public static final i n;
    public static final i o;
    public final h g;
    public final e h;
    public int i = 0;
    public long j;
    public int k;
    public String l;

    static {
        i iVar = i.e;
        m = i.a.c("'\\");
        n = i.a.c("\"\\");
        o = i.a.c("{}[]:, \n\t\r\f/\\;#=");
        i.a.c("\n\r");
        i.a.c("*/");
    }

    public d(x xVar) {
        this.g = xVar;
        this.h = xVar.c;
        v(6);
    }

    @Override // com.amazon.aps.iva.la.c
    public final void A() throws IOException {
        int i = 0;
        do {
            int i2 = this.i;
            if (i2 == 0) {
                i2 = D();
            }
            if (i2 == 3) {
                v(1);
            } else if (i2 == 1) {
                v(3);
            } else {
                if (i2 == 4) {
                    i--;
                    if (i >= 0) {
                        this.b--;
                    } else {
                        throw new a("Expected a value but was " + t() + " at path " + i());
                    }
                } else if (i2 == 2) {
                    i--;
                    if (i >= 0) {
                        this.b--;
                    } else {
                        throw new a("Expected a value but was " + t() + " at path " + i());
                    }
                } else {
                    e eVar = this.h;
                    if (i2 != 14 && i2 != 10) {
                        if (i2 != 9 && i2 != 13) {
                            if (i2 != 8 && i2 != 12) {
                                if (i2 == 17) {
                                    eVar.e(this.k);
                                } else if (i2 == 18) {
                                    throw new a("Expected a value but was " + t() + " at path " + i());
                                }
                            } else {
                                N(m);
                            }
                        } else {
                            N(n);
                        }
                    } else {
                        long U = this.g.U(o);
                        if (U == -1) {
                            U = eVar.c;
                        }
                        eVar.e(U);
                    }
                }
                this.i = 0;
            }
            i++;
            this.i = 0;
        } while (i != 0);
        int[] iArr = this.e;
        int i3 = this.b;
        int i4 = i3 - 1;
        iArr[i4] = iArr[i4] + 1;
        this.d[i3 - 1] = "null";
    }

    public final void C() throws IOException {
        B("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x0193, code lost:
        if (G(r1) != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0195, code lost:
        if (r4 != 2) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0197, code lost:
        if (r6 == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x019d, code lost:
        if (r10 != Long.MIN_VALUE) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x019f, code lost:
        if (r7 == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x01a5, code lost:
        if (r10 != 0) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x01a7, code lost:
        if (r7 != false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x01a9, code lost:
        if (r7 == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x01ac, code lost:
        r10 = -r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x01ad, code lost:
        r17.j = r10;
        r5.e(r3);
        r8 = 16;
        r17.i = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01b8, code lost:
        if (r4 == 2) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x01bb, code lost:
        if (r4 == 4) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x01be, code lost:
        if (r4 != 7) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x01c0, code lost:
        r17.k = r3;
        r8 = 17;
        r17.i = 17;
     */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01f8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0112 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int D() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.la.d.D():int");
    }

    public final int F(String str, c.a aVar) {
        int length = aVar.a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(aVar.a[i])) {
                this.i = 0;
                this.d[this.b - 1] = str;
                return i;
            }
        }
        return -1;
    }

    public final boolean G(int i) throws IOException {
        if (i != 9 && i != 10 && i != 12 && i != 13 && i != 32) {
            if (i != 35) {
                if (i != 44) {
                    if (i != 47 && i != 61) {
                        if (i != 123 && i != 125 && i != 58) {
                            if (i != 59) {
                                switch (i) {
                                    case 91:
                                    case 93:
                                        return false;
                                    case ModuleDescriptor.MODULE_VERSION /* 92 */:
                                        break;
                                    default:
                                        return true;
                                }
                            }
                        } else {
                            return false;
                        }
                    }
                } else {
                    return false;
                }
            }
            C();
            throw null;
        }
        return false;
    }

    public final String H() throws IOException {
        String str;
        int i = this.i;
        if (i == 0) {
            i = D();
        }
        if (i == 14) {
            str = L();
        } else if (i == 13) {
            str = K(n);
        } else if (i == 12) {
            str = K(m);
        } else if (i == 15) {
            str = this.l;
        } else {
            throw new a("Expected a name but was " + t() + " at path " + i());
        }
        this.i = 0;
        this.d[this.b - 1] = str;
        return str;
    }

    public final int I(boolean z) throws IOException {
        int i = 0;
        while (true) {
            int i2 = i + 1;
            h hVar = this.g;
            if (hVar.w(i2)) {
                long j = i;
                e eVar = this.h;
                byte i3 = eVar.i(j);
                if (i3 != 10 && i3 != 32 && i3 != 13 && i3 != 9) {
                    eVar.e(i2 - 1);
                    if (i3 == 47) {
                        if (!hVar.w(2L)) {
                            return i3;
                        }
                        C();
                        throw null;
                    } else if (i3 != 35) {
                        return i3;
                    } else {
                        C();
                        throw null;
                    }
                }
                i = i2;
            } else if (!z) {
                return -1;
            } else {
                throw new EOFException("End of input");
            }
        }
    }

    public final String K(i iVar) throws IOException {
        StringBuilder sb = null;
        while (true) {
            long U = this.g.U(iVar);
            if (U != -1) {
                e eVar = this.h;
                if (eVar.i(U) == 92) {
                    if (sb == null) {
                        sb = new StringBuilder();
                    }
                    sb.append(eVar.B(U));
                    eVar.readByte();
                    sb.append(M());
                } else if (sb == null) {
                    String B = eVar.B(U);
                    eVar.readByte();
                    return B;
                } else {
                    sb.append(eVar.B(U));
                    eVar.readByte();
                    return sb.toString();
                }
            } else {
                B("Unterminated string");
                throw null;
            }
        }
    }

    public final String L() throws IOException {
        long U = this.g.U(o);
        int i = (U > (-1L) ? 1 : (U == (-1L) ? 0 : -1));
        e eVar = this.h;
        if (i != 0) {
            return eVar.B(U);
        }
        return eVar.A();
    }

    public final char M() throws IOException {
        int i;
        int i2;
        h hVar = this.g;
        if (hVar.w(1L)) {
            e eVar = this.h;
            byte readByte = eVar.readByte();
            if (readByte != 10 && readByte != 34 && readByte != 39 && readByte != 47 && readByte != 92) {
                if (readByte != 98) {
                    if (readByte != 102) {
                        if (readByte == 110) {
                            return '\n';
                        }
                        if (readByte != 114) {
                            if (readByte != 116) {
                                if (readByte == 117) {
                                    if (hVar.w(4L)) {
                                        char c = 0;
                                        for (int i3 = 0; i3 < 4; i3++) {
                                            byte i4 = eVar.i(i3);
                                            char c2 = (char) (c << 4);
                                            if (i4 >= 48 && i4 <= 57) {
                                                i2 = i4 - 48;
                                            } else {
                                                if (i4 >= 97 && i4 <= 102) {
                                                    i = i4 - 97;
                                                } else if (i4 < 65 || i4 > 70) {
                                                    B("\\u".concat(eVar.B(4L)));
                                                    throw null;
                                                } else {
                                                    i = i4 - 65;
                                                }
                                                i2 = i + 10;
                                            }
                                            c = (char) (i2 + c2);
                                        }
                                        eVar.e(4L);
                                        return c;
                                    }
                                    throw new EOFException("Unterminated escape sequence at path " + i());
                                }
                                B("Invalid escape sequence: \\" + ((char) readByte));
                                throw null;
                            }
                            return '\t';
                        }
                        return '\r';
                    }
                    return '\f';
                }
                return '\b';
            }
            return (char) readByte;
        }
        B("Unterminated escape sequence");
        throw null;
    }

    public final void N(i iVar) throws IOException {
        while (true) {
            long U = this.g.U(iVar);
            if (U != -1) {
                e eVar = this.h;
                if (eVar.i(U) == 92) {
                    eVar.e(U + 1);
                    M();
                } else {
                    eVar.e(U + 1);
                    return;
                }
            } else {
                B("Unterminated string");
                throw null;
            }
        }
    }

    @Override // com.amazon.aps.iva.la.c
    public final void a() throws IOException {
        int i = this.i;
        if (i == 0) {
            i = D();
        }
        if (i == 3) {
            v(1);
            this.e[this.b - 1] = 0;
            this.i = 0;
            return;
        }
        throw new a("Expected BEGIN_ARRAY but was " + t() + " at path " + i());
    }

    @Override // com.amazon.aps.iva.la.c
    public final void c() throws IOException {
        int i = this.i;
        if (i == 0) {
            i = D();
        }
        if (i == 1) {
            v(3);
            this.i = 0;
            return;
        }
        throw new a("Expected BEGIN_OBJECT but was " + t() + " at path " + i());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.i = 0;
        this.c[0] = 8;
        this.b = 1;
        this.h.a();
        this.g.close();
    }

    @Override // com.amazon.aps.iva.la.c
    public final void f() throws IOException {
        int i = this.i;
        if (i == 0) {
            i = D();
        }
        if (i == 4) {
            int i2 = this.b - 1;
            this.b = i2;
            int[] iArr = this.e;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.i = 0;
            return;
        }
        throw new a("Expected END_ARRAY but was " + t() + " at path " + i());
    }

    @Override // com.amazon.aps.iva.la.c
    public final void h() throws IOException {
        int i = this.i;
        if (i == 0) {
            i = D();
        }
        if (i == 2) {
            int i2 = this.b - 1;
            this.b = i2;
            this.d[i2] = null;
            int[] iArr = this.e;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.i = 0;
            return;
        }
        throw new a("Expected END_OBJECT but was " + t() + " at path " + i());
    }

    @Override // com.amazon.aps.iva.la.c
    public final boolean k() throws IOException {
        int i = this.i;
        if (i == 0) {
            i = D();
        }
        if (i != 2 && i != 4 && i != 18) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.la.c
    public final boolean m() throws IOException {
        int i = this.i;
        if (i == 0) {
            i = D();
        }
        if (i == 5) {
            this.i = 0;
            int[] iArr = this.e;
            int i2 = this.b - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.i = 0;
            int[] iArr2 = this.e;
            int i3 = this.b - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            throw new a("Expected a boolean but was " + t() + " at path " + i());
        }
    }

    @Override // com.amazon.aps.iva.la.c
    public final double n() throws IOException {
        int i = this.i;
        if (i == 0) {
            i = D();
        }
        if (i == 16) {
            this.i = 0;
            int[] iArr = this.e;
            int i2 = this.b - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.j;
        }
        if (i == 17) {
            this.l = this.h.B(this.k);
        } else if (i == 9) {
            this.l = K(n);
        } else if (i == 8) {
            this.l = K(m);
        } else if (i == 10) {
            this.l = L();
        } else if (i != 11) {
            throw new a("Expected a double but was " + t() + " at path " + i());
        }
        this.i = 11;
        try {
            double parseDouble = Double.parseDouble(this.l);
            if (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble)) {
                this.l = null;
                this.i = 0;
                int[] iArr2 = this.e;
                int i3 = this.b - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseDouble;
            }
            throw new b("JSON forbids NaN and infinities: " + parseDouble + " at path " + i());
        } catch (NumberFormatException unused) {
            throw new a("Expected a double but was " + this.l + " at path " + i());
        }
    }

    @Override // com.amazon.aps.iva.la.c
    public final int p() throws IOException {
        String K;
        int i = this.i;
        if (i == 0) {
            i = D();
        }
        if (i == 16) {
            long j = this.j;
            int i2 = (int) j;
            if (j == i2) {
                this.i = 0;
                int[] iArr = this.e;
                int i3 = this.b - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new a("Expected an int but was " + this.j + " at path " + i());
        }
        if (i == 17) {
            this.l = this.h.B(this.k);
        } else if (i != 9 && i != 8) {
            if (i != 11) {
                throw new a("Expected an int but was " + t() + " at path " + i());
            }
        } else {
            if (i == 9) {
                K = K(n);
            } else {
                K = K(m);
            }
            this.l = K;
            try {
                int parseInt = Integer.parseInt(K);
                this.i = 0;
                int[] iArr2 = this.e;
                int i4 = this.b - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.i = 11;
        try {
            double parseDouble = Double.parseDouble(this.l);
            int i5 = (int) parseDouble;
            if (i5 == parseDouble) {
                this.l = null;
                this.i = 0;
                int[] iArr3 = this.e;
                int i6 = this.b - 1;
                iArr3[i6] = iArr3[i6] + 1;
                return i5;
            }
            throw new a("Expected an int but was " + this.l + " at path " + i());
        } catch (NumberFormatException unused2) {
            throw new a("Expected an int but was " + this.l + " at path " + i());
        }
    }

    @Override // com.amazon.aps.iva.la.c
    public final String s() throws IOException {
        String B;
        int i = this.i;
        if (i == 0) {
            i = D();
        }
        if (i == 10) {
            B = L();
        } else if (i == 9) {
            B = K(n);
        } else if (i == 8) {
            B = K(m);
        } else if (i == 11) {
            B = this.l;
            this.l = null;
        } else if (i == 16) {
            B = Long.toString(this.j);
        } else if (i == 17) {
            B = this.h.B(this.k);
        } else {
            throw new a("Expected a string but was " + t() + " at path " + i());
        }
        this.i = 0;
        int[] iArr = this.e;
        int i2 = this.b - 1;
        iArr[i2] = iArr[i2] + 1;
        return B;
    }

    @Override // com.amazon.aps.iva.la.c
    public final c.b t() throws IOException {
        int i = this.i;
        if (i == 0) {
            i = D();
        }
        switch (i) {
            case 1:
                return c.b.BEGIN_OBJECT;
            case 2:
                return c.b.END_OBJECT;
            case 3:
                return c.b.BEGIN_ARRAY;
            case 4:
                return c.b.END_ARRAY;
            case 5:
            case 6:
                return c.b.BOOLEAN;
            case 7:
                return c.b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return c.b.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return c.b.NAME;
            case 16:
            case 17:
                return c.b.NUMBER;
            case 18:
                return c.b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public final String toString() {
        return "JsonReader(" + this.g + ")";
    }

    @Override // com.amazon.aps.iva.la.c
    public final int x(c.a aVar) throws IOException {
        int i = this.i;
        if (i == 0) {
            i = D();
        }
        if (i < 12 || i > 15) {
            return -1;
        }
        if (i == 15) {
            return F(this.l, aVar);
        }
        int g = this.g.g(aVar.b);
        if (g != -1) {
            this.i = 0;
            this.d[this.b - 1] = aVar.a[g];
            return g;
        }
        String str = this.d[this.b - 1];
        String H = H();
        int F = F(H, aVar);
        if (F == -1) {
            this.i = 15;
            this.l = H;
            this.d[this.b - 1] = str;
        }
        return F;
    }

    @Override // com.amazon.aps.iva.la.c
    public final void y() throws IOException {
        int i = this.i;
        if (i == 0) {
            i = D();
        }
        if (i == 14) {
            long U = this.g.U(o);
            int i2 = (U > (-1L) ? 1 : (U == (-1L) ? 0 : -1));
            e eVar = this.h;
            if (i2 == 0) {
                U = eVar.c;
            }
            eVar.e(U);
        } else if (i == 13) {
            N(n);
        } else if (i == 12) {
            N(m);
        } else if (i != 15) {
            throw new a("Expected a name but was " + t() + " at path " + i());
        }
        this.i = 0;
        this.d[this.b - 1] = "null";
    }
}
