package com.amazon.aps.iva.hl;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.nf.c;
import com.amazon.aps.iva.ve0.v0;
/* compiled from: RestrictionOverlayProvider.kt */
@com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.player.presentation.restrictionoverlay.RestrictionOverlayProviderImpl$getOverlayData$3", f = "RestrictionOverlayProvider.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class g0 extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.nk.j, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public /* synthetic */ Object h;
    public final /* synthetic */ k0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(k0 k0Var, com.amazon.aps.iva.ob0.d<? super g0> dVar) {
        super(2, dVar);
        this.i = k0Var;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        g0 g0Var = new g0(this.i, dVar);
        g0Var.h = obj;
        return g0Var;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.nk.j jVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((g0) create(jVar, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.nf.c cVar;
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        com.amazon.aps.iva.ab.x.i0(obj);
        com.amazon.aps.iva.nk.j jVar = (com.amazon.aps.iva.nk.j) this.h;
        com.amazon.aps.iva.dk.c cVar2 = jVar.j;
        k0 k0Var = this.i;
        v0 v0Var = k0Var.e;
        boolean z = true;
        if (cVar2 == null) {
            if (jVar.g != com.amazon.aps.iva.nk.e.IDLE) {
                z = false;
            }
            c cVar3 = k0Var.b;
            if (cVar3.Q3() && z) {
                cVar = c.C0538c.a;
            } else {
                cVar3.m8();
                cVar = c.e.a;
            }
        } else {
            com.amazon.aps.iva.kj.e a = com.amazon.aps.iva.cj.x.a(k0Var.a.getValue().h);
            if (a.t == null) {
                cVar = c.C0538c.a;
            } else if (jVar.h.m == com.amazon.aps.iva.qj.m.INCOMPLETE) {
                cVar = c.b.a;
            } else {
                r rVar = k0Var.c;
                com.amazon.aps.iva.nf.c c = rVar.c(a);
                if (c == null) {
                    if (cVar2 instanceof com.amazon.aps.iva.dk.b) {
                        cVar = k0.c(cVar2);
                    } else if (cVar2 instanceof com.amazon.aps.iva.dk.e) {
                        if (((com.amazon.aps.iva.dk.e) cVar2).c != 420) {
                            z = false;
                        }
                        if (z) {
                            cVar = rVar.a();
                        } else {
                            cVar = k0.c(cVar2);
                        }
                    } else if (cVar2 instanceof com.amazon.aps.iva.dk.d) {
                        boolean contains = f1.J(6004).contains(Integer.valueOf(cVar2.c));
                        String str = cVar2.f;
                        if (contains) {
                            cVar = new c.h(str);
                        } else {
                            cVar = new c.l(str);
                        }
                    } else if (cVar2 instanceof com.amazon.aps.iva.dk.f) {
                        cVar = new c.l(cVar2.b);
                    } else {
                        throw new com.amazon.aps.iva.kb0.h();
                    }
                } else {
                    cVar = c;
                }
            }
        }
        v0Var.setValue(cVar);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
