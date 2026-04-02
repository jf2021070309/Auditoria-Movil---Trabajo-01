package com.amazon.aps.iva.k0;

import com.amazon.aps.iva.c2.a0;
import com.amazon.aps.iva.c2.b;
import com.amazon.aps.iva.c2.b0;
import com.amazon.aps.iva.c2.x;
import com.amazon.aps.iva.c2.y;
import com.amazon.aps.iva.h2.k;
import com.amazon.aps.iva.j0.f1;
import com.amazon.aps.iva.lb0.z;
import java.util.List;
/* compiled from: MultiParagraphLayoutCache.kt */
/* loaded from: classes.dex */
public final class d {
    public com.amazon.aps.iva.c2.b a;
    public a0 b;
    public k.a c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public List<b.C0158b<com.amazon.aps.iva.c2.p>> h;
    public b i;
    public long j;
    public com.amazon.aps.iva.o2.c k;
    public com.amazon.aps.iva.c2.g l;
    public com.amazon.aps.iva.o2.l m;
    public y n;
    public int o;
    public int p;

    public d(com.amazon.aps.iva.c2.b bVar, a0 a0Var, k.a aVar, int i, boolean z, int i2, int i3, List list) {
        com.amazon.aps.iva.yb0.j.f(bVar, "text");
        com.amazon.aps.iva.yb0.j.f(a0Var, "style");
        com.amazon.aps.iva.yb0.j.f(aVar, "fontFamilyResolver");
        this.a = bVar;
        this.b = a0Var;
        this.c = aVar;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
        this.h = list;
        this.j = a.a;
        this.o = -1;
        this.p = -1;
    }

    public final int a(int i, com.amazon.aps.iva.o2.l lVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "layoutDirection");
        int i2 = this.o;
        int i3 = this.p;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        int a = f1.a(b(com.amazon.aps.iva.o2.b.a(0, i, 0, Integer.MAX_VALUE), lVar).e);
        this.o = i;
        this.p = a;
        return a;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.amazon.aps.iva.c2.f b(long r8, com.amazon.aps.iva.o2.l r10) {
        /*
            r7 = this;
            com.amazon.aps.iva.c2.g r1 = r7.c(r10)
            com.amazon.aps.iva.c2.f r10 = new com.amazon.aps.iva.c2.f
            boolean r0 = r7.e
            int r2 = r7.d
            float r3 = r1.b()
            long r2 = com.amazon.aps.iva.a9.k0.g(r8, r0, r2, r3)
            boolean r8 = r7.e
            int r9 = r7.d
            int r0 = r7.f
            r4 = 2
            r5 = 1
            r6 = 0
            if (r8 != 0) goto L26
            if (r9 != r4) goto L21
            r8 = r5
            goto L22
        L21:
            r8 = r6
        L22:
            if (r8 == 0) goto L26
            r8 = r5
            goto L27
        L26:
            r8 = r6
        L27:
            if (r8 == 0) goto L2b
            r8 = r5
            goto L2f
        L2b:
            if (r0 >= r5) goto L2e
            r0 = r5
        L2e:
            r8 = r0
        L2f:
            if (r9 != r4) goto L32
            goto L33
        L32:
            r5 = r6
        L33:
            r0 = r10
            r4 = r8
            r0.<init>(r1, r2, r4, r5)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.k0.d.b(long, com.amazon.aps.iva.o2.l):com.amazon.aps.iva.c2.f");
    }

    public final com.amazon.aps.iva.c2.g c(com.amazon.aps.iva.o2.l lVar) {
        com.amazon.aps.iva.c2.g gVar = this.l;
        if (gVar == null || lVar != this.m || gVar.a()) {
            this.m = lVar;
            com.amazon.aps.iva.c2.b bVar = this.a;
            a0 a = b0.a(this.b, lVar);
            com.amazon.aps.iva.o2.c cVar = this.k;
            com.amazon.aps.iva.yb0.j.c(cVar);
            k.a aVar = this.c;
            List list = this.h;
            if (list == null) {
                list = z.b;
            }
            gVar = new com.amazon.aps.iva.c2.g(bVar, a, list, cVar, aVar);
        }
        this.l = gVar;
        return gVar;
    }

    public final y d(com.amazon.aps.iva.o2.l lVar, long j, com.amazon.aps.iva.c2.f fVar) {
        com.amazon.aps.iva.c2.b bVar = this.a;
        a0 a0Var = this.b;
        List list = this.h;
        if (list == null) {
            list = z.b;
        }
        int i = this.f;
        boolean z = this.e;
        int i2 = this.d;
        com.amazon.aps.iva.o2.c cVar = this.k;
        com.amazon.aps.iva.yb0.j.c(cVar);
        return new y(new x(bVar, a0Var, list, i, z, i2, cVar, lVar, this.c, j), fVar, com.amazon.aps.iva.o2.b.c(j, com.amazon.aps.iva.o2.k.a(f1.a(fVar.d), f1.a(fVar.e))));
    }
}
