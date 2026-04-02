package com.amazon.aps.iva.j0;

import com.amazon.aps.iva.c2.b;
import com.amazon.aps.iva.h2.k;
import java.util.List;
/* compiled from: TextDelegate.kt */
/* loaded from: classes.dex */
public final class e1 {
    public final com.amazon.aps.iva.c2.b a;
    public final com.amazon.aps.iva.c2.a0 b;
    public final int c;
    public final int d;
    public final boolean e;
    public final int f;
    public final com.amazon.aps.iva.o2.c g;
    public final k.a h;
    public final List<b.C0158b<com.amazon.aps.iva.c2.p>> i;
    public com.amazon.aps.iva.c2.g j;
    public com.amazon.aps.iva.o2.l k;

    public e1(com.amazon.aps.iva.c2.b bVar, com.amazon.aps.iva.c2.a0 a0Var, int i, int i2, boolean z, int i3, com.amazon.aps.iva.o2.c cVar, k.a aVar, List list) {
        boolean z2;
        boolean z3;
        com.amazon.aps.iva.yb0.j.f(bVar, "text");
        com.amazon.aps.iva.yb0.j.f(a0Var, "style");
        com.amazon.aps.iva.yb0.j.f(cVar, "density");
        com.amazon.aps.iva.yb0.j.f(aVar, "fontFamilyResolver");
        com.amazon.aps.iva.yb0.j.f(list, "placeholders");
        this.a = bVar;
        this.b = a0Var;
        this.c = i;
        this.d = i2;
        this.e = z;
        this.f = i3;
        this.g = cVar;
        this.h = aVar;
        this.i = list;
        if (i > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (i2 > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                if (i2 <= i) {
                    return;
                }
                throw new IllegalStateException("Check failed.".toString());
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final void a(com.amazon.aps.iva.o2.l lVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "layoutDirection");
        com.amazon.aps.iva.c2.g gVar = this.j;
        if (gVar == null || lVar != this.k || gVar.a()) {
            this.k = lVar;
            gVar = new com.amazon.aps.iva.c2.g(this.a, com.amazon.aps.iva.c2.b0.a(this.b, lVar), this.i, this.g, this.h);
        }
        this.j = gVar;
    }
}
