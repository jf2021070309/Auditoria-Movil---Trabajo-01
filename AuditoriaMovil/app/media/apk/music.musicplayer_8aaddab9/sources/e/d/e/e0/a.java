package e.d.e.e0;

import ch.qos.logback.core.CoreConstants;
import e.d.e.c0.q;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;
/* loaded from: classes2.dex */
public class a implements Closeable {
    public static final char[] a = ")]}'\n".toCharArray();

    /* renamed from: b  reason: collision with root package name */
    public final Reader f7898b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f7899c = false;

    /* renamed from: d  reason: collision with root package name */
    public final char[] f7900d = new char[1024];

    /* renamed from: e  reason: collision with root package name */
    public int f7901e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f7902f = 0;

    /* renamed from: g  reason: collision with root package name */
    public int f7903g = 0;

    /* renamed from: h  reason: collision with root package name */
    public int f7904h = 0;

    /* renamed from: i  reason: collision with root package name */
    public int f7905i = 0;

    /* renamed from: j  reason: collision with root package name */
    public long f7906j;

    /* renamed from: k  reason: collision with root package name */
    public int f7907k;

    /* renamed from: l  reason: collision with root package name */
    public String f7908l;

    /* renamed from: m  reason: collision with root package name */
    public int[] f7909m;

    /* renamed from: n  reason: collision with root package name */
    public int f7910n;
    public String[] o;
    public int[] p;

    /* renamed from: e.d.e.e0.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0172a extends q {
    }

    static {
        q.a = new C0172a();
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.f7909m = iArr;
        this.f7910n = 0;
        this.f7910n = 0 + 1;
        iArr[0] = 6;
        this.o = new String[32];
        this.p = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.f7898b = reader;
    }

    public String B() {
        return " at line " + (this.f7903g + 1) + " column " + ((this.f7901e - this.f7904h) + 1) + " path " + v();
    }

    public boolean H() throws IOException {
        int i2 = this.f7905i;
        if (i2 == 0) {
            i2 = i();
        }
        if (i2 == 5) {
            this.f7905i = 0;
            int[] iArr = this.p;
            int i3 = this.f7910n - 1;
            iArr[i3] = iArr[i3] + 1;
            return true;
        } else if (i2 != 6) {
            StringBuilder y = e.a.d.a.a.y("Expected a boolean but was ");
            y.append(g0());
            y.append(B());
            throw new IllegalStateException(y.toString());
        } else {
            this.f7905i = 0;
            int[] iArr2 = this.p;
            int i4 = this.f7910n - 1;
            iArr2[i4] = iArr2[i4] + 1;
            return false;
        }
    }

    public double I() throws IOException {
        int i2 = this.f7905i;
        if (i2 == 0) {
            i2 = i();
        }
        if (i2 == 15) {
            this.f7905i = 0;
            int[] iArr = this.p;
            int i3 = this.f7910n - 1;
            iArr[i3] = iArr[i3] + 1;
            return this.f7906j;
        }
        if (i2 == 16) {
            this.f7908l = new String(this.f7900d, this.f7901e, this.f7907k);
            this.f7901e += this.f7907k;
        } else if (i2 == 8 || i2 == 9) {
            this.f7908l = d0(i2 == 8 ? CoreConstants.SINGLE_QUOTE_CHAR : CoreConstants.DOUBLE_QUOTE_CHAR);
        } else if (i2 == 10) {
            this.f7908l = f0();
        } else if (i2 != 11) {
            StringBuilder y = e.a.d.a.a.y("Expected a double but was ");
            y.append(g0());
            y.append(B());
            throw new IllegalStateException(y.toString());
        }
        this.f7905i = 11;
        double parseDouble = Double.parseDouble(this.f7908l);
        if (!this.f7899c && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            throw new d("JSON forbids NaN and infinities: " + parseDouble + B());
        }
        this.f7908l = null;
        this.f7905i = 0;
        int[] iArr2 = this.p;
        int i4 = this.f7910n - 1;
        iArr2[i4] = iArr2[i4] + 1;
        return parseDouble;
    }

    public int K() throws IOException {
        int i2 = this.f7905i;
        if (i2 == 0) {
            i2 = i();
        }
        if (i2 == 15) {
            long j2 = this.f7906j;
            int i3 = (int) j2;
            if (j2 != i3) {
                StringBuilder y = e.a.d.a.a.y("Expected an int but was ");
                y.append(this.f7906j);
                y.append(B());
                throw new NumberFormatException(y.toString());
            }
            this.f7905i = 0;
            int[] iArr = this.p;
            int i4 = this.f7910n - 1;
            iArr[i4] = iArr[i4] + 1;
            return i3;
        }
        if (i2 == 16) {
            this.f7908l = new String(this.f7900d, this.f7901e, this.f7907k);
            this.f7901e += this.f7907k;
        } else if (i2 != 8 && i2 != 9 && i2 != 10) {
            StringBuilder y2 = e.a.d.a.a.y("Expected an int but was ");
            y2.append(g0());
            y2.append(B());
            throw new IllegalStateException(y2.toString());
        } else {
            if (i2 == 10) {
                this.f7908l = f0();
            } else {
                this.f7908l = d0(i2 == 8 ? CoreConstants.SINGLE_QUOTE_CHAR : CoreConstants.DOUBLE_QUOTE_CHAR);
            }
            try {
                int parseInt = Integer.parseInt(this.f7908l);
                this.f7905i = 0;
                int[] iArr2 = this.p;
                int i5 = this.f7910n - 1;
                iArr2[i5] = iArr2[i5] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.f7905i = 11;
        double parseDouble = Double.parseDouble(this.f7908l);
        int i6 = (int) parseDouble;
        if (i6 != parseDouble) {
            StringBuilder y3 = e.a.d.a.a.y("Expected an int but was ");
            y3.append(this.f7908l);
            y3.append(B());
            throw new NumberFormatException(y3.toString());
        }
        this.f7908l = null;
        this.f7905i = 0;
        int[] iArr3 = this.p;
        int i7 = this.f7910n - 1;
        iArr3[i7] = iArr3[i7] + 1;
        return i6;
    }

    public long M() throws IOException {
        int i2 = this.f7905i;
        if (i2 == 0) {
            i2 = i();
        }
        if (i2 == 15) {
            this.f7905i = 0;
            int[] iArr = this.p;
            int i3 = this.f7910n - 1;
            iArr[i3] = iArr[i3] + 1;
            return this.f7906j;
        }
        if (i2 == 16) {
            this.f7908l = new String(this.f7900d, this.f7901e, this.f7907k);
            this.f7901e += this.f7907k;
        } else if (i2 != 8 && i2 != 9 && i2 != 10) {
            StringBuilder y = e.a.d.a.a.y("Expected a long but was ");
            y.append(g0());
            y.append(B());
            throw new IllegalStateException(y.toString());
        } else {
            if (i2 == 10) {
                this.f7908l = f0();
            } else {
                this.f7908l = d0(i2 == 8 ? CoreConstants.SINGLE_QUOTE_CHAR : CoreConstants.DOUBLE_QUOTE_CHAR);
            }
            try {
                long parseLong = Long.parseLong(this.f7908l);
                this.f7905i = 0;
                int[] iArr2 = this.p;
                int i4 = this.f7910n - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.f7905i = 11;
        double parseDouble = Double.parseDouble(this.f7908l);
        long j2 = (long) parseDouble;
        if (j2 != parseDouble) {
            StringBuilder y2 = e.a.d.a.a.y("Expected a long but was ");
            y2.append(this.f7908l);
            y2.append(B());
            throw new NumberFormatException(y2.toString());
        }
        this.f7908l = null;
        this.f7905i = 0;
        int[] iArr3 = this.p;
        int i5 = this.f7910n - 1;
        iArr3[i5] = iArr3[i5] + 1;
        return j2;
    }

    public String Q() throws IOException {
        String d0;
        int i2 = this.f7905i;
        if (i2 == 0) {
            i2 = i();
        }
        if (i2 == 14) {
            d0 = f0();
        } else if (i2 == 12) {
            d0 = d0(CoreConstants.SINGLE_QUOTE_CHAR);
        } else if (i2 != 13) {
            StringBuilder y = e.a.d.a.a.y("Expected a name but was ");
            y.append(g0());
            y.append(B());
            throw new IllegalStateException(y.toString());
        } else {
            d0 = d0(CoreConstants.DOUBLE_QUOTE_CHAR);
        }
        this.f7905i = 0;
        this.o[this.f7910n - 1] = d0;
        return d0;
    }

    public final int W(boolean z) throws IOException {
        char[] cArr = this.f7900d;
        int i2 = this.f7901e;
        int i3 = this.f7902f;
        while (true) {
            boolean z2 = true;
            if (i2 == i3) {
                this.f7901e = i2;
                if (!u(1)) {
                    if (z) {
                        StringBuilder y = e.a.d.a.a.y("End of input");
                        y.append(B());
                        throw new EOFException(y.toString());
                    }
                    return -1;
                }
                i2 = this.f7901e;
                i3 = this.f7902f;
            }
            int i4 = i2 + 1;
            char c2 = cArr[i2];
            if (c2 == '\n') {
                this.f7903g++;
                this.f7904h = i4;
            } else if (c2 != ' ' && c2 != '\r' && c2 != '\t') {
                if (c2 == '/') {
                    this.f7901e = i4;
                    if (i4 == i3) {
                        this.f7901e = i4 - 1;
                        boolean u = u(2);
                        this.f7901e++;
                        if (!u) {
                            return c2;
                        }
                    }
                    h();
                    int i5 = this.f7901e;
                    char c3 = cArr[i5];
                    if (c3 == '*') {
                        this.f7901e = i5 + 1;
                        while (true) {
                            if (this.f7901e + 2 > this.f7902f && !u(2)) {
                                z2 = false;
                                break;
                            }
                            char[] cArr2 = this.f7900d;
                            int i6 = this.f7901e;
                            if (cArr2[i6] != '\n') {
                                for (int i7 = 0; i7 < 2; i7++) {
                                    if (this.f7900d[this.f7901e + i7] != "*/".charAt(i7)) {
                                        break;
                                    }
                                }
                                break;
                            }
                            this.f7903g++;
                            this.f7904h = i6 + 1;
                            this.f7901e++;
                        }
                        if (!z2) {
                            m0("Unterminated comment");
                            throw null;
                        }
                        i2 = this.f7901e + 2;
                        i3 = this.f7902f;
                    } else if (c3 != '/') {
                        return c2;
                    } else {
                        this.f7901e = i5 + 1;
                        k0();
                        i2 = this.f7901e;
                        i3 = this.f7902f;
                    }
                } else if (c2 != '#') {
                    this.f7901e = i4;
                    return c2;
                } else {
                    this.f7901e = i4;
                    h();
                    k0();
                    i2 = this.f7901e;
                    i3 = this.f7902f;
                }
            }
            i2 = i4;
        }
    }

    public void a() throws IOException {
        int i2 = this.f7905i;
        if (i2 == 0) {
            i2 = i();
        }
        if (i2 == 3) {
            h0(1);
            this.p[this.f7910n - 1] = 0;
            this.f7905i = 0;
            return;
        }
        StringBuilder y = e.a.d.a.a.y("Expected BEGIN_ARRAY but was ");
        y.append(g0());
        y.append(B());
        throw new IllegalStateException(y.toString());
    }

    public void a0() throws IOException {
        int i2 = this.f7905i;
        if (i2 == 0) {
            i2 = i();
        }
        if (i2 != 7) {
            StringBuilder y = e.a.d.a.a.y("Expected null but was ");
            y.append(g0());
            y.append(B());
            throw new IllegalStateException(y.toString());
        }
        this.f7905i = 0;
        int[] iArr = this.p;
        int i3 = this.f7910n - 1;
        iArr[i3] = iArr[i3] + 1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f7905i = 0;
        this.f7909m[0] = 8;
        this.f7910n = 1;
        this.f7898b.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005d, code lost:
        if (r2 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005f, code lost:
        r2 = new java.lang.StringBuilder(java.lang.Math.max((r3 - r4) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
        r2.append(r0, r4, r3 - r4);
        r10.f7901e = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String d0(char r11) throws java.io.IOException {
        /*
            r10 = this;
            char[] r0 = r10.f7900d
            r1 = 0
            r2 = r1
        L4:
            int r3 = r10.f7901e
            int r4 = r10.f7902f
        L8:
            r5 = r4
            r4 = r3
        La:
            r6 = 16
            r7 = 1
            if (r3 >= r5) goto L5d
            int r8 = r3 + 1
            char r3 = r0[r3]
            if (r3 != r11) goto L29
            r10.f7901e = r8
            int r8 = r8 - r4
            int r8 = r8 - r7
            if (r2 != 0) goto L21
            java.lang.String r11 = new java.lang.String
            r11.<init>(r0, r4, r8)
            return r11
        L21:
            r2.append(r0, r4, r8)
            java.lang.String r11 = r2.toString()
            return r11
        L29:
            r9 = 92
            if (r3 != r9) goto L50
            r10.f7901e = r8
            int r8 = r8 - r4
            int r8 = r8 - r7
            if (r2 != 0) goto L41
            int r2 = r8 + 1
            int r2 = r2 * 2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = java.lang.Math.max(r2, r6)
            r3.<init>(r2)
            r2 = r3
        L41:
            r2.append(r0, r4, r8)
            char r3 = r10.i0()
            r2.append(r3)
            int r3 = r10.f7901e
            int r4 = r10.f7902f
            goto L8
        L50:
            r6 = 10
            if (r3 != r6) goto L5b
            int r3 = r10.f7903g
            int r3 = r3 + r7
            r10.f7903g = r3
            r10.f7904h = r8
        L5b:
            r3 = r8
            goto La
        L5d:
            if (r2 != 0) goto L6d
            int r2 = r3 - r4
            int r2 = r2 * 2
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r2 = java.lang.Math.max(r2, r6)
            r5.<init>(r2)
            r2 = r5
        L6d:
            int r5 = r3 - r4
            r2.append(r0, r4, r5)
            r10.f7901e = r3
            boolean r3 = r10.u(r7)
            if (r3 == 0) goto L7b
            goto L4
        L7b:
            java.lang.String r11 = "Unterminated string"
            r10.m0(r11)
            goto L82
        L81:
            throw r1
        L82:
            goto L81
        */
        throw new UnsupportedOperationException("Method not decompiled: e.d.e.e0.a.d0(char):java.lang.String");
    }

    public String e0() throws IOException {
        String str;
        int i2 = this.f7905i;
        if (i2 == 0) {
            i2 = i();
        }
        if (i2 == 10) {
            str = f0();
        } else if (i2 == 8) {
            str = d0(CoreConstants.SINGLE_QUOTE_CHAR);
        } else if (i2 == 9) {
            str = d0(CoreConstants.DOUBLE_QUOTE_CHAR);
        } else if (i2 == 11) {
            str = this.f7908l;
            this.f7908l = null;
        } else if (i2 == 15) {
            str = Long.toString(this.f7906j);
        } else if (i2 != 16) {
            StringBuilder y = e.a.d.a.a.y("Expected a string but was ");
            y.append(g0());
            y.append(B());
            throw new IllegalStateException(y.toString());
        } else {
            str = new String(this.f7900d, this.f7901e, this.f7907k);
            this.f7901e += this.f7907k;
        }
        this.f7905i = 0;
        int[] iArr = this.p;
        int i3 = this.f7910n - 1;
        iArr[i3] = iArr[i3] + 1;
        return str;
    }

    public void f() throws IOException {
        int i2 = this.f7905i;
        if (i2 == 0) {
            i2 = i();
        }
        if (i2 == 1) {
            h0(3);
            this.f7905i = 0;
            return;
        }
        StringBuilder y = e.a.d.a.a.y("Expected BEGIN_OBJECT but was ");
        y.append(g0());
        y.append(B());
        throw new IllegalStateException(y.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
        h();
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String f0() throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = 0
        L3:
            int r3 = r6.f7901e
            int r4 = r3 + r2
            int r5 = r6.f7902f
            if (r4 >= r5) goto L4e
            char[] r4 = r6.f7900d
            int r3 = r3 + r2
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L5c
            r4 = 10
            if (r3 == r4) goto L5c
            r4 = 12
            if (r3 == r4) goto L5c
            r4 = 13
            if (r3 == r4) goto L5c
            r4 = 32
            if (r3 == r4) goto L5c
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5c
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5c
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5c
            r4 = 58
            if (r3 == r4) goto L5c
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5c;
                case 92: goto L4a;
                case 93: goto L5c;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r6.h()
            goto L5c
        L4e:
            char[] r3 = r6.f7900d
            int r3 = r3.length
            if (r2 >= r3) goto L5e
            int r3 = r2 + 1
            boolean r3 = r6.u(r3)
            if (r3 == 0) goto L5c
            goto L3
        L5c:
            r0 = r2
            goto L7e
        L5e:
            if (r1 != 0) goto L6b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r1.<init>(r3)
        L6b:
            char[] r3 = r6.f7900d
            int r4 = r6.f7901e
            r1.append(r3, r4, r2)
            int r3 = r6.f7901e
            int r3 = r3 + r2
            r6.f7901e = r3
            r2 = 1
            boolean r2 = r6.u(r2)
            if (r2 != 0) goto L2
        L7e:
            if (r1 != 0) goto L8a
            java.lang.String r1 = new java.lang.String
            char[] r2 = r6.f7900d
            int r3 = r6.f7901e
            r1.<init>(r2, r3, r0)
            goto L95
        L8a:
            char[] r2 = r6.f7900d
            int r3 = r6.f7901e
            r1.append(r2, r3, r0)
            java.lang.String r1 = r1.toString()
        L95:
            int r2 = r6.f7901e
            int r2 = r2 + r0
            r6.f7901e = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e.d.e.e0.a.f0():java.lang.String");
    }

    public b g0() throws IOException {
        int i2 = this.f7905i;
        if (i2 == 0) {
            i2 = i();
        }
        switch (i2) {
            case 1:
                return b.BEGIN_OBJECT;
            case 2:
                return b.END_OBJECT;
            case 3:
                return b.BEGIN_ARRAY;
            case 4:
                return b.END_ARRAY;
            case 5:
            case 6:
                return b.BOOLEAN;
            case 7:
                return b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return b.STRING;
            case 12:
            case 13:
            case 14:
                return b.NAME;
            case 15:
            case 16:
                return b.NUMBER;
            case 17:
                return b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public final void h() throws IOException {
        if (this.f7899c) {
            return;
        }
        m0("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    public final void h0(int i2) {
        int i3 = this.f7910n;
        int[] iArr = this.f7909m;
        if (i3 == iArr.length) {
            int i4 = i3 * 2;
            this.f7909m = Arrays.copyOf(iArr, i4);
            this.p = Arrays.copyOf(this.p, i4);
            this.o = (String[]) Arrays.copyOf(this.o, i4);
        }
        int[] iArr2 = this.f7909m;
        int i5 = this.f7910n;
        this.f7910n = i5 + 1;
        iArr2[i5] = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:159:0x0205, code lost:
        if (z(r6) != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0207, code lost:
        if (r13 != 2) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0209, code lost:
        if (r15 == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x020f, code lost:
        if (r10 != Long.MIN_VALUE) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0211, code lost:
        if (r16 == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0217, code lost:
        if (r10 != 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0219, code lost:
        if (r16 != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x021b, code lost:
        if (r16 == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x021e, code lost:
        r10 = -r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x021f, code lost:
        r19.f7906j = r10;
        r19.f7901e += r9;
        r6 = 15;
        r19.f7905i = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x022b, code lost:
        if (r13 == 2) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x022e, code lost:
        if (r13 == 4) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0231, code lost:
        if (r13 != 7) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0233, code lost:
        r19.f7907k = r9;
        r6 = 16;
        r19.f7905i = 16;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0174 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0266 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0267  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int i() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 795
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.d.e.e0.a.i():int");
    }

    public final char i0() throws IOException {
        int i2;
        int i3;
        if (this.f7901e == this.f7902f && !u(1)) {
            m0("Unterminated escape sequence");
            throw null;
        }
        char[] cArr = this.f7900d;
        int i4 = this.f7901e;
        int i5 = i4 + 1;
        this.f7901e = i5;
        char c2 = cArr[i4];
        if (c2 == '\n') {
            this.f7903g++;
            this.f7904h = i5;
        } else if (c2 != '\"' && c2 != '\'' && c2 != '/' && c2 != '\\') {
            if (c2 != 'b') {
                if (c2 != 'f') {
                    if (c2 != 'n') {
                        if (c2 != 'r') {
                            if (c2 != 't') {
                                if (c2 != 'u') {
                                    m0("Invalid escape sequence");
                                    throw null;
                                } else if (i5 + 4 > this.f7902f && !u(4)) {
                                    m0("Unterminated escape sequence");
                                    throw null;
                                } else {
                                    char c3 = 0;
                                    int i6 = this.f7901e;
                                    int i7 = i6 + 4;
                                    while (i6 < i7) {
                                        char c4 = this.f7900d[i6];
                                        char c5 = (char) (c3 << 4);
                                        if (c4 < '0' || c4 > '9') {
                                            if (c4 >= 'a' && c4 <= 'f') {
                                                i2 = c4 - 'a';
                                            } else if (c4 < 'A' || c4 > 'F') {
                                                StringBuilder y = e.a.d.a.a.y("\\u");
                                                y.append(new String(this.f7900d, this.f7901e, 4));
                                                throw new NumberFormatException(y.toString());
                                            } else {
                                                i2 = c4 - 'A';
                                            }
                                            i3 = i2 + 10;
                                        } else {
                                            i3 = c4 - '0';
                                        }
                                        c3 = (char) (i3 + c5);
                                        i6++;
                                    }
                                    this.f7901e += 4;
                                    return c3;
                                }
                            }
                            return '\t';
                        }
                        return '\r';
                    }
                    return '\n';
                }
                return '\f';
            }
            return '\b';
        }
        return c2;
    }

    public final void j0(char c2) throws IOException {
        char[] cArr = this.f7900d;
        do {
            int i2 = this.f7901e;
            int i3 = this.f7902f;
            while (i2 < i3) {
                int i4 = i2 + 1;
                char c3 = cArr[i2];
                if (c3 == c2) {
                    this.f7901e = i4;
                    return;
                } else if (c3 == '\\') {
                    this.f7901e = i4;
                    i0();
                    i2 = this.f7901e;
                    i3 = this.f7902f;
                } else {
                    if (c3 == '\n') {
                        this.f7903g++;
                        this.f7904h = i4;
                    }
                    i2 = i4;
                }
            }
            this.f7901e = i2;
        } while (u(1));
        m0("Unterminated string");
        throw null;
    }

    public final void k0() throws IOException {
        char c2;
        do {
            if (this.f7901e >= this.f7902f && !u(1)) {
                return;
            }
            char[] cArr = this.f7900d;
            int i2 = this.f7901e;
            int i3 = i2 + 1;
            this.f7901e = i3;
            c2 = cArr[i2];
            if (c2 == '\n') {
                this.f7903g++;
                this.f7904h = i3;
                return;
            }
        } while (c2 != '\r');
    }

    public void l0() throws IOException {
        int i2 = 0;
        do {
            int i3 = this.f7905i;
            if (i3 == 0) {
                i3 = i();
            }
            if (i3 == 3) {
                h0(1);
            } else if (i3 == 1) {
                h0(3);
            } else {
                if (i3 == 4) {
                    this.f7910n--;
                } else if (i3 == 2) {
                    this.f7910n--;
                } else {
                    if (i3 == 14 || i3 == 10) {
                        do {
                            int i4 = 0;
                            while (true) {
                                int i5 = this.f7901e + i4;
                                if (i5 < this.f7902f) {
                                    char c2 = this.f7900d[i5];
                                    if (c2 != '\t' && c2 != '\n' && c2 != '\f' && c2 != '\r' && c2 != ' ') {
                                        if (c2 != '#') {
                                            if (c2 != ',') {
                                                if (c2 != '/' && c2 != '=') {
                                                    if (c2 != '{' && c2 != '}' && c2 != ':') {
                                                        if (c2 != ';') {
                                                            switch (c2) {
                                                                case '[':
                                                                case ']':
                                                                    break;
                                                                case '\\':
                                                                    break;
                                                                default:
                                                                    i4++;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    this.f7901e = i5;
                                }
                            }
                            h();
                            this.f7901e += i4;
                        } while (u(1));
                    } else if (i3 == 8 || i3 == 12) {
                        j0(CoreConstants.SINGLE_QUOTE_CHAR);
                    } else if (i3 == 9 || i3 == 13) {
                        j0(CoreConstants.DOUBLE_QUOTE_CHAR);
                    } else if (i3 == 16) {
                        this.f7901e += this.f7907k;
                    }
                    this.f7905i = 0;
                }
                i2--;
                this.f7905i = 0;
            }
            i2++;
            this.f7905i = 0;
        } while (i2 != 0);
        int[] iArr = this.p;
        int i6 = this.f7910n;
        int i7 = i6 - 1;
        iArr[i7] = iArr[i7] + 1;
        this.o[i6 - 1] = "null";
    }

    public void m() throws IOException {
        int i2 = this.f7905i;
        if (i2 == 0) {
            i2 = i();
        }
        if (i2 != 4) {
            StringBuilder y = e.a.d.a.a.y("Expected END_ARRAY but was ");
            y.append(g0());
            y.append(B());
            throw new IllegalStateException(y.toString());
        }
        int i3 = this.f7910n - 1;
        this.f7910n = i3;
        int[] iArr = this.p;
        int i4 = i3 - 1;
        iArr[i4] = iArr[i4] + 1;
        this.f7905i = 0;
    }

    public final IOException m0(String str) throws IOException {
        StringBuilder y = e.a.d.a.a.y(str);
        y.append(B());
        throw new d(y.toString());
    }

    public void r() throws IOException {
        int i2 = this.f7905i;
        if (i2 == 0) {
            i2 = i();
        }
        if (i2 != 2) {
            StringBuilder y = e.a.d.a.a.y("Expected END_OBJECT but was ");
            y.append(g0());
            y.append(B());
            throw new IllegalStateException(y.toString());
        }
        int i3 = this.f7910n - 1;
        this.f7910n = i3;
        this.o[i3] = null;
        int[] iArr = this.p;
        int i4 = i3 - 1;
        iArr[i4] = iArr[i4] + 1;
        this.f7905i = 0;
    }

    public String toString() {
        return getClass().getSimpleName() + B();
    }

    public final boolean u(int i2) throws IOException {
        int i3;
        int i4;
        char[] cArr = this.f7900d;
        int i5 = this.f7904h;
        int i6 = this.f7901e;
        this.f7904h = i5 - i6;
        int i7 = this.f7902f;
        if (i7 != i6) {
            int i8 = i7 - i6;
            this.f7902f = i8;
            System.arraycopy(cArr, i6, cArr, 0, i8);
        } else {
            this.f7902f = 0;
        }
        this.f7901e = 0;
        do {
            Reader reader = this.f7898b;
            int i9 = this.f7902f;
            int read = reader.read(cArr, i9, cArr.length - i9);
            if (read == -1) {
                return false;
            }
            i3 = this.f7902f + read;
            this.f7902f = i3;
            if (this.f7903g == 0 && (i4 = this.f7904h) == 0 && i3 > 0 && cArr[0] == 65279) {
                this.f7901e++;
                this.f7904h = i4 + 1;
                i2++;
                continue;
            }
        } while (i3 < i2);
        return true;
    }

    public String v() {
        StringBuilder sb = new StringBuilder();
        sb.append(CoreConstants.DOLLAR);
        int i2 = this.f7910n;
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = this.f7909m[i3];
            if (i4 == 1 || i4 == 2) {
                sb.append('[');
                sb.append(this.p[i3]);
                sb.append(']');
            } else if (i4 == 3 || i4 == 4 || i4 == 5) {
                sb.append(CoreConstants.DOT);
                String[] strArr = this.o;
                if (strArr[i3] != null) {
                    sb.append(strArr[i3]);
                }
            }
        }
        return sb.toString();
    }

    public boolean y() throws IOException {
        int i2 = this.f7905i;
        if (i2 == 0) {
            i2 = i();
        }
        return (i2 == 2 || i2 == 4) ? false : true;
    }

    public final boolean z(char c2) throws IOException {
        if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r' || c2 == ' ') {
            return false;
        }
        if (c2 != '#') {
            if (c2 == ',') {
                return false;
            }
            if (c2 != '/' && c2 != '=') {
                if (c2 == '{' || c2 == '}' || c2 == ':') {
                    return false;
                }
                if (c2 != ';') {
                    switch (c2) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        h();
        return false;
    }
}
