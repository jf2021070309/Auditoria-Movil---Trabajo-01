package com.amazon.aps.iva.bz;

import com.amazon.aps.iva.az.h;
import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.qo.x;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.se0.i;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
/* compiled from: SharedZipFlow.kt */
/* loaded from: classes2.dex */
public final class d<T, D, R> extends h<g<? extends R>> {
    public final p<T, D, R> d;
    public final g0 e;
    public g<? extends T> f;
    public g<? extends D> g;

    public d(x.i iVar, g0 g0Var, com.amazon.aps.iva.az.d dVar, com.amazon.aps.iva.az.d dVar2) {
        super(new g.b(null), 2);
        this.d = iVar;
        this.e = g0Var;
        this.f = new g.b(null);
        this.g = new g.b(null);
        i.d(g0Var, null, null, new a(dVar, this, null), 3);
        i.d(g0Var, null, null, new b(dVar2, this, null), 3);
    }

    public static final void e(d dVar) {
        g bVar;
        synchronized (dVar) {
            g<? extends T> gVar = dVar.f;
            g<? extends D> gVar2 = dVar.g;
            if (gVar instanceof g.a) {
                bVar = new g.a(null, ((g.a) gVar).a);
            } else if (gVar2 instanceof g.a) {
                bVar = new g.a(null, ((g.a) gVar2).a);
            } else {
                if (!(gVar instanceof g.b) && !(gVar2 instanceof g.b)) {
                    g.c<? extends T> a = gVar.a();
                    j.c(a);
                    T t = a.a;
                    g.c<? extends D> a2 = gVar2.a();
                    j.c(a2);
                    bVar = new g.c(dVar.d.invoke(t, a2.a), null);
                }
                bVar = new g.b(null);
            }
            i.d(dVar.e, null, null, new c(dVar, bVar, null), 3);
        }
    }
}
