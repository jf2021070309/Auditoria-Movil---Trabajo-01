package com.amazon.aps.iva.m0;

import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
/* compiled from: Button.kt */
/* loaded from: classes.dex */
public final class k0 implements y {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;

    public k0(float f, float f2, float f3, float f4, float f5) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
    }

    @Override // com.amazon.aps.iva.m0.y
    public final com.amazon.aps.iva.z.l a(boolean z, com.amazon.aps.iva.c0.l lVar, com.amazon.aps.iva.o0.i iVar, int i) {
        float f;
        com.amazon.aps.iva.yb0.j.f(lVar, "interactionSource");
        iVar.s(-1588756907);
        e0.b bVar = com.amazon.aps.iva.o0.e0.a;
        iVar.s(-492369756);
        Object t = iVar.t();
        Object obj = i.a.a;
        if (t == obj) {
            t = new com.amazon.aps.iva.y0.u();
            iVar.n(t);
        }
        iVar.G();
        com.amazon.aps.iva.y0.u uVar = (com.amazon.aps.iva.y0.u) t;
        iVar.s(511388516);
        boolean H = iVar.H(lVar) | iVar.H(uVar);
        Object t2 = iVar.t();
        if (H || t2 == obj) {
            t2 = new h0(lVar, uVar, null);
            iVar.n(t2);
        }
        iVar.G();
        com.amazon.aps.iva.o0.x0.c(lVar, (com.amazon.aps.iva.xb0.p) t2, iVar);
        com.amazon.aps.iva.c0.j jVar = (com.amazon.aps.iva.c0.j) com.amazon.aps.iva.lb0.x.E0(uVar);
        if (!z) {
            f = this.c;
        } else if (jVar instanceof com.amazon.aps.iva.c0.o) {
            f = this.b;
        } else if (jVar instanceof com.amazon.aps.iva.c0.g) {
            f = this.d;
        } else if (jVar instanceof com.amazon.aps.iva.c0.d) {
            f = this.e;
        } else {
            f = this.a;
        }
        float f2 = f;
        iVar.s(-492369756);
        Object t3 = iVar.t();
        if (t3 == obj) {
            t3 = new com.amazon.aps.iva.z.b(new com.amazon.aps.iva.o2.e(f2), com.amazon.aps.iva.z.n1.c, (Object) null, 12);
            iVar.n(t3);
        }
        iVar.G();
        com.amazon.aps.iva.z.b bVar2 = (com.amazon.aps.iva.z.b) t3;
        if (!z) {
            iVar.s(-1598807317);
            com.amazon.aps.iva.o0.x0.c(new com.amazon.aps.iva.o2.e(f2), new i0(bVar2, f2, null), iVar);
            iVar.G();
        } else {
            iVar.s(-1598807146);
            com.amazon.aps.iva.o0.x0.c(new com.amazon.aps.iva.o2.e(f2), new j0(bVar2, this, f2, jVar, null), iVar);
            iVar.G();
        }
        com.amazon.aps.iva.z.l<T, V> lVar2 = bVar2.c;
        iVar.G();
        return lVar2;
    }
}
