package e.d.e.e0;

import ch.qos.logback.core.CoreConstants;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.Objects;
/* loaded from: classes2.dex */
public class c implements Closeable, Flushable {
    public static final String[] a = new String[128];

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f7911b;

    /* renamed from: c  reason: collision with root package name */
    public final Writer f7912c;

    /* renamed from: d  reason: collision with root package name */
    public int[] f7913d = new int[32];

    /* renamed from: e  reason: collision with root package name */
    public int f7914e = 0;

    /* renamed from: f  reason: collision with root package name */
    public String f7915f;

    /* renamed from: g  reason: collision with root package name */
    public String f7916g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f7917h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f7918i;

    /* renamed from: j  reason: collision with root package name */
    public String f7919j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f7920k;

    static {
        for (int i2 = 0; i2 <= 31; i2++) {
            a[i2] = String.format("\\u%04x", Integer.valueOf(i2));
        }
        String[] strArr = a;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f7911b = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        B(6);
        this.f7916g = ":";
        this.f7920k = true;
        Objects.requireNonNull(writer, "out == null");
        this.f7912c = writer;
    }

    public final void B(int i2) {
        int i3 = this.f7914e;
        int[] iArr = this.f7913d;
        if (i3 == iArr.length) {
            this.f7913d = Arrays.copyOf(iArr, i3 * 2);
        }
        int[] iArr2 = this.f7913d;
        int i4 = this.f7914e;
        this.f7914e = i4 + 1;
        iArr2[i4] = i2;
    }

    public final void H(int i2) {
        this.f7913d[this.f7914e - 1] = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r8.f7918i
            if (r0 == 0) goto L7
            java.lang.String[] r0 = e.d.e.e0.c.f7911b
            goto L9
        L7:
            java.lang.String[] r0 = e.d.e.e0.c.a
        L9:
            java.io.Writer r1 = r8.f7912c
            r2 = 34
            r1.write(r2)
            int r1 = r9.length()
            r3 = 0
            r4 = 0
        L16:
            if (r3 >= r1) goto L45
            char r5 = r9.charAt(r3)
            r6 = 128(0x80, float:1.794E-43)
            if (r5 >= r6) goto L25
            r5 = r0[r5]
            if (r5 != 0) goto L32
            goto L42
        L25:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L2c
            java.lang.String r5 = "\\u2028"
            goto L32
        L2c:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L42
            java.lang.String r5 = "\\u2029"
        L32:
            if (r4 >= r3) goto L3b
            java.io.Writer r6 = r8.f7912c
            int r7 = r3 - r4
            r6.write(r9, r4, r7)
        L3b:
            java.io.Writer r4 = r8.f7912c
            r4.write(r5)
            int r4 = r3 + 1
        L42:
            int r3 = r3 + 1
            goto L16
        L45:
            if (r4 >= r1) goto L4d
            java.io.Writer r0 = r8.f7912c
            int r1 = r1 - r4
            r0.write(r9, r4, r1)
        L4d:
            java.io.Writer r9 = r8.f7912c
            r9.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.d.e.e0.c.I(java.lang.String):void");
    }

    public c K(long j2) throws IOException {
        d0();
        a();
        this.f7912c.write(Long.toString(j2));
        return this;
    }

    public c M(Boolean bool) throws IOException {
        if (bool == null) {
            return y();
        }
        d0();
        a();
        this.f7912c.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public c Q(Number number) throws IOException {
        if (number == null) {
            return y();
        }
        d0();
        String obj = number.toString();
        if (this.f7917h || !(obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN"))) {
            a();
            this.f7912c.append((CharSequence) obj);
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
    }

    public c W(String str) throws IOException {
        if (str == null) {
            return y();
        }
        d0();
        a();
        I(str);
        return this;
    }

    public final void a() throws IOException {
        int z = z();
        if (z == 1) {
            H(2);
            v();
        } else if (z == 2) {
            this.f7912c.append(CoreConstants.COMMA_CHAR);
            v();
        } else if (z == 4) {
            this.f7912c.append((CharSequence) this.f7916g);
            H(5);
        } else {
            if (z != 6) {
                if (z != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.f7917h) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            H(7);
        }
    }

    public c a0(boolean z) throws IOException {
        d0();
        a();
        this.f7912c.write(z ? "true" : "false");
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f7912c.close();
        int i2 = this.f7914e;
        if (i2 > 1 || (i2 == 1 && this.f7913d[i2 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f7914e = 0;
    }

    public final void d0() throws IOException {
        if (this.f7919j != null) {
            int z = z();
            if (z == 5) {
                this.f7912c.write(44);
            } else if (z != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            v();
            H(4);
            I(this.f7919j);
            this.f7919j = null;
        }
    }

    public c f() throws IOException {
        d0();
        a();
        B(1);
        this.f7912c.write(91);
        return this;
    }

    public void flush() throws IOException {
        if (this.f7914e == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f7912c.flush();
    }

    public c h() throws IOException {
        d0();
        a();
        B(3);
        this.f7912c.write(123);
        return this;
    }

    public final c i(int i2, int i3, char c2) throws IOException {
        int z = z();
        if (z == i3 || z == i2) {
            if (this.f7919j != null) {
                StringBuilder y = e.a.d.a.a.y("Dangling name: ");
                y.append(this.f7919j);
                throw new IllegalStateException(y.toString());
            }
            this.f7914e--;
            if (z == i3) {
                v();
            }
            this.f7912c.write(c2);
            return this;
        }
        throw new IllegalStateException("Nesting problem.");
    }

    public c m() throws IOException {
        i(1, 2, ']');
        return this;
    }

    public c r() throws IOException {
        i(3, 5, '}');
        return this;
    }

    public c u(String str) throws IOException {
        Objects.requireNonNull(str, "name == null");
        if (this.f7919j == null) {
            if (this.f7914e != 0) {
                this.f7919j = str;
                return this;
            }
            throw new IllegalStateException("JsonWriter is closed.");
        }
        throw new IllegalStateException();
    }

    public final void v() throws IOException {
        if (this.f7915f == null) {
            return;
        }
        this.f7912c.write(10);
        int i2 = this.f7914e;
        for (int i3 = 1; i3 < i2; i3++) {
            this.f7912c.write(this.f7915f);
        }
    }

    public c y() throws IOException {
        if (this.f7919j != null) {
            if (!this.f7920k) {
                this.f7919j = null;
                return this;
            }
            d0();
        }
        a();
        this.f7912c.write("null");
        return this;
    }

    public final int z() {
        int i2 = this.f7914e;
        if (i2 != 0) {
            return this.f7913d[i2 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }
}
