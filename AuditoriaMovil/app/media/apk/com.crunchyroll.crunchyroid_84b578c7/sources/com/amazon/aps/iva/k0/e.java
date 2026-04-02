package com.amazon.aps.iva.k0;

import com.amazon.aps.iva.c2.a0;
import com.amazon.aps.iva.c2.b0;
import com.amazon.aps.iva.h2.k;
import com.amazon.aps.iva.j0.f1;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.o2.a;
/* compiled from: ParagraphLayoutCache.kt */
/* loaded from: classes.dex */
public final class e {
    public String a;
    public a0 b;
    public k.a c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public long h;
    public com.amazon.aps.iva.o2.c i;
    public com.amazon.aps.iva.c2.a j;
    public boolean k;
    public long l;
    public b m;
    public com.amazon.aps.iva.c2.k n;
    public com.amazon.aps.iva.o2.l o;
    public long p;
    public int q;
    public int r;

    public e(String str, a0 a0Var, k.a aVar, int i, boolean z, int i2, int i3) {
        com.amazon.aps.iva.yb0.j.f(str, "text");
        com.amazon.aps.iva.yb0.j.f(a0Var, "style");
        com.amazon.aps.iva.yb0.j.f(aVar, "fontFamilyResolver");
        this.a = str;
        this.b = a0Var;
        this.c = aVar;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
        this.h = a.a;
        this.l = com.amazon.aps.iva.o2.k.a(0, 0);
        this.p = a.C0554a.c(0, 0);
        this.q = -1;
        this.r = -1;
    }

    public final int a(int i, com.amazon.aps.iva.o2.l lVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "layoutDirection");
        int i2 = this.q;
        int i3 = this.r;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        int a = f1.a(b(com.amazon.aps.iva.o2.b.a(0, i, 0, Integer.MAX_VALUE), lVar).getHeight());
        this.q = i;
        this.r = a;
        return a;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.amazon.aps.iva.c2.a b(long r10, com.amazon.aps.iva.o2.l r12) {
        /*
            r9 = this;
            com.amazon.aps.iva.c2.k r12 = r9.d(r12)
            boolean r0 = r9.e
            int r1 = r9.d
            float r2 = r12.b()
            long r7 = com.amazon.aps.iva.a9.k0.g(r10, r0, r1, r2)
            boolean r10 = r9.e
            int r11 = r9.d
            int r0 = r9.f
            r1 = 2
            r2 = 1
            r3 = 0
            if (r10 != 0) goto L24
            if (r11 != r1) goto L1f
            r10 = r2
            goto L20
        L1f:
            r10 = r3
        L20:
            if (r10 == 0) goto L24
            r10 = r2
            goto L25
        L24:
            r10 = r3
        L25:
            if (r10 == 0) goto L29
            r5 = r2
            goto L2d
        L29:
            if (r0 >= r2) goto L2c
            r0 = r2
        L2c:
            r5 = r0
        L2d:
            if (r11 != r1) goto L31
            r6 = r2
            goto L32
        L31:
            r6 = r3
        L32:
            com.amazon.aps.iva.c2.a r10 = new com.amazon.aps.iva.c2.a
            r4 = r12
            com.amazon.aps.iva.k2.d r4 = (com.amazon.aps.iva.k2.d) r4
            r3 = r10
            r3.<init>(r4, r5, r6, r7)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.k0.e.b(long, com.amazon.aps.iva.o2.l):com.amazon.aps.iva.c2.a");
    }

    public final void c() {
        this.j = null;
        this.n = null;
        this.o = null;
        this.q = -1;
        this.r = -1;
        this.p = a.C0554a.c(0, 0);
        this.l = com.amazon.aps.iva.o2.k.a(0, 0);
        this.k = false;
    }

    public final com.amazon.aps.iva.c2.k d(com.amazon.aps.iva.o2.l lVar) {
        com.amazon.aps.iva.c2.k kVar = this.n;
        if (kVar == null || lVar != this.o || kVar.a()) {
            this.o = lVar;
            String str = this.a;
            a0 a = b0.a(this.b, lVar);
            com.amazon.aps.iva.o2.c cVar = this.i;
            com.amazon.aps.iva.yb0.j.c(cVar);
            k.a aVar = this.c;
            z zVar = z.b;
            kVar = com.amazon.aps.iva.c2.l.a(a, aVar, cVar, str, zVar, zVar);
        }
        this.n = kVar;
        return kVar;
    }
}
