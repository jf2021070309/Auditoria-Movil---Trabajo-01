package com.amazon.aps.iva.f1;

import com.amazon.aps.iva.o0.t1;
import okhttp3.internal.ws.WebSocketProtocol;
/* compiled from: Color.kt */
/* loaded from: classes.dex */
public final class x {
    public static final long b = defpackage.i.e(4278190080L);
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;
    public static final long g;
    public static final /* synthetic */ int h = 0;
    public final long a;

    static {
        defpackage.i.e(4282664004L);
        defpackage.i.e(4287137928L);
        defpackage.i.e(4291611852L);
        c = defpackage.i.e(4294967295L);
        d = defpackage.i.e(4294901760L);
        defpackage.i.e(4278255360L);
        e = defpackage.i.e(4278190335L);
        defpackage.i.e(4294967040L);
        defpackage.i.e(4278255615L);
        defpackage.i.e(4294902015L);
        f = defpackage.i.d(0);
        g = defpackage.i.b(0.0f, 0.0f, 0.0f, 0.0f, com.amazon.aps.iva.g1.g.s);
    }

    public /* synthetic */ x(long j) {
        this.a = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long a(long r7, com.amazon.aps.iva.g1.c r9) {
        /*
            java.lang.String r0 = "colorSpace"
            com.amazon.aps.iva.yb0.j.f(r9, r0)
            com.amazon.aps.iva.g1.c r0 = f(r7)
            boolean r1 = com.amazon.aps.iva.yb0.j.a(r9, r0)
            if (r1 == 0) goto L10
            return r7
        L10:
            java.lang.String r1 = "$this$connect"
            com.amazon.aps.iva.yb0.j.f(r0, r1)
            com.amazon.aps.iva.g1.u r1 = com.amazon.aps.iva.g1.g.c
            if (r0 != r1) goto L25
            if (r9 != r1) goto L1e
            com.amazon.aps.iva.g1.h r9 = com.amazon.aps.iva.g1.i.e
            goto L5b
        L1e:
            com.amazon.aps.iva.g1.l r1 = com.amazon.aps.iva.g1.g.t
            if (r9 != r1) goto L2e
            com.amazon.aps.iva.g1.i r9 = com.amazon.aps.iva.g1.i.f
            goto L5b
        L25:
            com.amazon.aps.iva.g1.l r2 = com.amazon.aps.iva.g1.g.t
            if (r0 != r2) goto L2e
            if (r9 != r1) goto L2e
            com.amazon.aps.iva.g1.i r9 = com.amazon.aps.iva.g1.i.g
            goto L5b
        L2e:
            if (r0 != r9) goto L38
            com.amazon.aps.iva.g1.h r9 = com.amazon.aps.iva.g1.i.e
            com.amazon.aps.iva.g1.h r9 = new com.amazon.aps.iva.g1.h
            r9.<init>(r0)
            goto L5b
        L38:
            long r1 = com.amazon.aps.iva.g1.b.a
            long r3 = r0.b
            boolean r3 = com.amazon.aps.iva.g1.b.a(r3, r1)
            r4 = 0
            if (r3 == 0) goto L55
            long r5 = r9.b
            boolean r1 = com.amazon.aps.iva.g1.b.a(r5, r1)
            if (r1 == 0) goto L55
            com.amazon.aps.iva.g1.i$b r1 = new com.amazon.aps.iva.g1.i$b
            com.amazon.aps.iva.g1.u r0 = (com.amazon.aps.iva.g1.u) r0
            com.amazon.aps.iva.g1.u r9 = (com.amazon.aps.iva.g1.u) r9
            r1.<init>(r0, r9, r4)
            goto L5a
        L55:
            com.amazon.aps.iva.g1.i r1 = new com.amazon.aps.iva.g1.i
            r1.<init>(r0, r9, r4)
        L5a:
            r9 = r1
        L5b:
            float r0 = h(r7)
            float r1 = g(r7)
            float r2 = e(r7)
            float r7 = d(r7)
            long r7 = r9.a(r0, r1, r2, r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.f1.x.a(long, com.amazon.aps.iva.g1.c):long");
    }

    public static long b(long j, float f2) {
        return defpackage.i.b(h(j), g(j), e(j), f2, f(j));
    }

    public static final boolean c(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    public static final float d(long j) {
        float R;
        float f2;
        if ((63 & j) == 0) {
            R = (float) com.amazon.aps.iva.aq.k.R((j >>> 56) & 255);
            f2 = 255.0f;
        } else {
            R = (float) com.amazon.aps.iva.aq.k.R((j >>> 6) & 1023);
            f2 = 1023.0f;
        }
        return R / f2;
    }

    public static final float e(long j) {
        if ((63 & j) == 0) {
            return ((float) com.amazon.aps.iva.aq.k.R((j >>> 32) & 255)) / 255.0f;
        }
        return f0.b((short) ((j >>> 16) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    public static final com.amazon.aps.iva.g1.c f(long j) {
        float[] fArr = com.amazon.aps.iva.g1.g.a;
        return com.amazon.aps.iva.g1.g.u[(int) (j & 63)];
    }

    public static final float g(long j) {
        if ((63 & j) == 0) {
            return ((float) com.amazon.aps.iva.aq.k.R((j >>> 40) & 255)) / 255.0f;
        }
        return f0.b((short) ((j >>> 32) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    public static final float h(long j) {
        if ((63 & j) == 0) {
            return ((float) com.amazon.aps.iva.aq.k.R((j >>> 48) & 255)) / 255.0f;
        }
        return f0.b((short) ((j >>> 48) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    public static String i(long j) {
        StringBuilder sb = new StringBuilder("Color(");
        sb.append(h(j));
        sb.append(", ");
        sb.append(g(j));
        sb.append(", ");
        sb.append(e(j));
        sb.append(", ");
        sb.append(d(j));
        sb.append(", ");
        return t1.b(sb, f(j).a, ')');
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        if (this.a != ((x) obj).a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return i(this.a);
    }
}
