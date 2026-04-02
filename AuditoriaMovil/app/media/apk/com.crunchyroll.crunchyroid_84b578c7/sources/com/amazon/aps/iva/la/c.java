package com.amazon.aps.iva.la;

import com.amazon.aps.iva.b6.x;
import com.amazon.aps.iva.ef0.t;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
/* compiled from: JsonReader.java */
/* loaded from: classes.dex */
public abstract class c implements Closeable {
    public static final String[] f = new String[128];
    public int b;
    public int[] c = new int[32];
    public String[] d = new String[32];
    public int[] e = new int[32];

    /* compiled from: JsonReader.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final String[] a;
        public final t b;

        public a(String[] strArr, t tVar) {
            this.a = strArr;
            this.b = tVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x003a A[Catch: IOException -> 0x0069, TryCatch #0 {IOException -> 0x0069, blocks: (B:2:0x0000, B:3:0x000a, B:5:0x000d, B:7:0x001e, B:9:0x0026, B:21:0x0042, B:19:0x003a, B:20:0x003d, B:23:0x0047, B:24:0x004a, B:25:0x0059), top: B:30:0x0000 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static com.amazon.aps.iva.la.c.a a(java.lang.String... r12) {
            /*
                int r0 = r12.length     // Catch: java.io.IOException -> L69
                com.amazon.aps.iva.ef0.i[] r0 = new com.amazon.aps.iva.ef0.i[r0]     // Catch: java.io.IOException -> L69
                com.amazon.aps.iva.ef0.e r1 = new com.amazon.aps.iva.ef0.e     // Catch: java.io.IOException -> L69
                r1.<init>()     // Catch: java.io.IOException -> L69
                r2 = 0
                r3 = r2
            La:
                int r4 = r12.length     // Catch: java.io.IOException -> L69
                if (r3 >= r4) goto L59
                r4 = r12[r3]     // Catch: java.io.IOException -> L69
                java.lang.String[] r5 = com.amazon.aps.iva.la.c.f     // Catch: java.io.IOException -> L69
                r6 = 34
                r1.L(r6)     // Catch: java.io.IOException -> L69
                int r7 = r4.length()     // Catch: java.io.IOException -> L69
                r8 = r2
                r9 = r8
            L1c:
                if (r8 >= r7) goto L45
                char r10 = r4.charAt(r8)     // Catch: java.io.IOException -> L69
                r11 = 128(0x80, float:1.794E-43)
                if (r10 >= r11) goto L2b
                r10 = r5[r10]     // Catch: java.io.IOException -> L69
                if (r10 != 0) goto L38
                goto L42
            L2b:
                r11 = 8232(0x2028, float:1.1535E-41)
                if (r10 != r11) goto L32
                java.lang.String r10 = "\\u2028"
                goto L38
            L32:
                r11 = 8233(0x2029, float:1.1537E-41)
                if (r10 != r11) goto L42
                java.lang.String r10 = "\\u2029"
            L38:
                if (r9 >= r8) goto L3d
                r1.a0(r9, r8, r4)     // Catch: java.io.IOException -> L69
            L3d:
                r1.c0(r10)     // Catch: java.io.IOException -> L69
                int r9 = r8 + 1
            L42:
                int r8 = r8 + 1
                goto L1c
            L45:
                if (r9 >= r7) goto L4a
                r1.a0(r9, r7, r4)     // Catch: java.io.IOException -> L69
            L4a:
                r1.L(r6)     // Catch: java.io.IOException -> L69
                r1.readByte()     // Catch: java.io.IOException -> L69
                com.amazon.aps.iva.ef0.i r4 = r1.h0()     // Catch: java.io.IOException -> L69
                r0[r3] = r4     // Catch: java.io.IOException -> L69
                int r3 = r3 + 1
                goto La
            L59:
                com.amazon.aps.iva.la.c$a r1 = new com.amazon.aps.iva.la.c$a     // Catch: java.io.IOException -> L69
                java.lang.Object r12 = r12.clone()     // Catch: java.io.IOException -> L69
                java.lang.String[] r12 = (java.lang.String[]) r12     // Catch: java.io.IOException -> L69
                com.amazon.aps.iva.ef0.t r0 = com.amazon.aps.iva.ef0.t.a.b(r0)     // Catch: java.io.IOException -> L69
                r1.<init>(r12, r0)     // Catch: java.io.IOException -> L69
                return r1
            L69:
                r12 = move-exception
                java.lang.AssertionError r0 = new java.lang.AssertionError
                r0.<init>(r12)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.la.c.a.a(java.lang.String[]):com.amazon.aps.iva.la.c$a");
        }
    }

    /* compiled from: JsonReader.java */
    /* loaded from: classes.dex */
    public enum b {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    static {
        for (int i = 0; i <= 31; i++) {
            f[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public abstract void A() throws IOException;

    public final void B(String str) throws com.amazon.aps.iva.la.b {
        StringBuilder b2 = x.b(str, " at path ");
        b2.append(i());
        throw new com.amazon.aps.iva.la.b(b2.toString());
    }

    public abstract void a() throws IOException;

    public abstract void c() throws IOException;

    public abstract void f() throws IOException;

    public abstract void h() throws IOException;

    public final String i() {
        int i = this.b;
        int[] iArr = this.c;
        String[] strArr = this.d;
        int[] iArr2 = this.e;
        StringBuilder sb = new StringBuilder("$");
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 != 1 && i3 != 2) {
                if (i3 == 3 || i3 == 4 || i3 == 5) {
                    sb.append('.');
                    String str = strArr[i2];
                    if (str != null) {
                        sb.append(str);
                    }
                }
            } else {
                sb.append('[');
                sb.append(iArr2[i2]);
                sb.append(']');
            }
        }
        return sb.toString();
    }

    public abstract boolean k() throws IOException;

    public abstract boolean m() throws IOException;

    public abstract double n() throws IOException;

    public abstract int p() throws IOException;

    public abstract String s() throws IOException;

    public abstract b t() throws IOException;

    public final void v(int i) {
        int i2 = this.b;
        int[] iArr = this.c;
        if (i2 == iArr.length) {
            if (i2 != 256) {
                this.c = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.d;
                this.d = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.e;
                this.e = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                throw new com.amazon.aps.iva.la.a("Nesting too deep at " + i());
            }
        }
        int[] iArr3 = this.c;
        int i3 = this.b;
        this.b = i3 + 1;
        iArr3[i3] = i;
    }

    public abstract int x(a aVar) throws IOException;

    public abstract void y() throws IOException;
}
