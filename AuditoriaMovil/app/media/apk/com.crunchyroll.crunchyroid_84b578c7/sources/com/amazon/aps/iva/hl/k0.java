package com.amazon.aps.iva.hl;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.nf.c;
import com.amazon.aps.iva.ve0.u0;
import com.amazon.aps.iva.ve0.v0;
import com.crunchyroll.cast.castlistener.VideoCastController;
/* compiled from: RestrictionOverlayProvider.kt */
/* loaded from: classes2.dex */
public final class k0 {
    public final u0<com.amazon.aps.iva.nk.j> a;
    public final c b;
    public final r c;
    public final com.amazon.aps.iva.ye.f d;
    public final v0 e = com.amazon.aps.iva.ab.x.e(c.e.a);
    public final v0 f = com.amazon.aps.iva.ab.x.e(com.amazon.aps.iva.lb0.z.b);

    public k0(u0 u0Var, c cVar, s sVar, com.amazon.aps.iva.ye.f fVar, VideoCastController videoCastController) {
        this.a = u0Var;
        this.b = cVar;
        this.c = sVar;
        this.d = fVar;
        videoCastController.addEventListener(new d0(this));
    }

    public static com.amazon.aps.iva.nf.c c(com.amazon.aps.iva.dk.c cVar) {
        boolean contains = f1.K(403, 401).contains(Integer.valueOf(cVar.c));
        String str = cVar.f;
        if (contains) {
            return new c.l(str);
        }
        return new c.h(str);
    }

    public final v0 a(com.amazon.aps.iva.se0.g0 g0Var) {
        com.amazon.aps.iva.dg.b.A(g0Var, new com.amazon.aps.iva.ve0.a0(com.amazon.aps.iva.dg.b.n(new e0(this.a, this), f0.h), new g0(this, null)));
        return this.e;
    }

    public final v0 b(com.amazon.aps.iva.se0.g0 g0Var) {
        com.amazon.aps.iva.dg.b.A(g0Var, new com.amazon.aps.iva.ve0.a0(new h0(com.amazon.aps.iva.dg.b.n(this.a, i0.h)), new j0(this, null)));
        return this.f;
    }
}
