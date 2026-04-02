package com.amazon.aps.iva.lk;

import com.amazon.aps.iva.a6.m;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.fa0.k;
import com.amazon.aps.iva.ga0.h;
import com.amazon.aps.iva.ga0.n;
import com.amazon.aps.iva.ka0.a0;
import com.amazon.aps.iva.ka0.c0;
import com.amazon.aps.iva.ka0.u;
import com.amazon.aps.iva.ka0.y;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
/* compiled from: MuxController.kt */
@com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.player.exoplayercomponent.mux.MuxControllerImpl$init$4$2", f = "MuxController.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class c extends i implements p<com.amazon.aps.iva.mk.c, com.amazon.aps.iva.ob0.d<? super q>, Object> {
    public /* synthetic */ Object h;
    public final /* synthetic */ b i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, com.amazon.aps.iva.ob0.d<? super c> dVar) {
        super(2, dVar);
        this.i = bVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        c cVar = new c(this.i, dVar);
        cVar.h = obj;
        return cVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.mk.c cVar, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        return ((c) create(cVar, dVar)).invokeSuspend(q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.ga0.e eVar;
        String str;
        com.amazon.aps.iva.ga0.f fVar;
        h hVar;
        com.amazon.aps.iva.ga0.i iVar;
        com.amazon.aps.iva.ga0.g gVar;
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        x.i0(obj);
        com.amazon.aps.iva.mk.c cVar = (com.amazon.aps.iva.mk.c) this.h;
        b bVar = this.i;
        c0<m> c0Var = bVar.c;
        com.amazon.aps.iva.ga0.d dVar = null;
        if (c0Var != null) {
            eVar = c0Var.b.e;
            j.e(eVar, "muxStats.customerData");
        } else {
            eVar = null;
        }
        if (eVar != null && (gVar = eVar.e) != null) {
            str = gVar.a("vid");
        } else {
            str = null;
        }
        if (!j.a(str, cVar.a)) {
            c0<m> c0Var2 = bVar.c;
            if (c0Var2 != null) {
                com.amazon.aps.iva.ga0.g o0 = com.amazon.aps.iva.cq.b.o0(cVar);
                y yVar = c0Var2.f;
                yVar.getClass();
                yVar.c = u.INIT;
                yVar.e = null;
                yVar.v = 0;
                yVar.u = 0;
                yVar.w = 0;
                yVar.x.clear();
                a0 a0Var = yVar.a;
                com.amazon.aps.iva.ga0.e eVar2 = a0Var.e;
                eVar2.e = o0;
                eVar2.e(o0);
                com.amazon.aps.iva.ga0.e eVar3 = a0Var.e;
                a0Var.d(new com.amazon.aps.iva.fa0.u(a0Var.f(), 1));
                a0Var.d(new k(a0Var.f(), 2));
                a0Var.e = eVar3;
                com.amazon.aps.iva.ea0.a aVar2 = new com.amazon.aps.iva.ea0.a();
                com.amazon.aps.iva.ga0.e eVar4 = a0Var.e;
                com.amazon.aps.iva.ga0.g gVar2 = eVar4.e;
                if (gVar2 != null) {
                    aVar2.e = gVar2;
                }
                com.amazon.aps.iva.ga0.d dVar2 = eVar4.h;
                if (dVar2 != null) {
                    aVar2.i = dVar2;
                }
                h hVar2 = eVar4.f;
                if (hVar2 != null) {
                    aVar2.f = hVar2;
                }
                n nVar = new n();
                a0Var.h = nVar;
                aVar2.d = nVar;
                a0Var.d(aVar2);
                a0Var.i = null;
                a0Var.j = 0;
                a0Var.k = null;
            }
        } else {
            c0<m> c0Var3 = bVar.c;
            if (c0Var3 != null) {
                com.amazon.aps.iva.ga0.g o02 = com.amazon.aps.iva.cq.b.o0(cVar);
                if (eVar != null) {
                    fVar = eVar.d;
                } else {
                    fVar = null;
                }
                if (eVar != null) {
                    hVar = eVar.f;
                } else {
                    hVar = null;
                }
                if (eVar != null) {
                    iVar = eVar.g;
                } else {
                    iVar = null;
                }
                if (eVar != null) {
                    dVar = eVar.h;
                }
                c0Var3.b.h(new com.amazon.aps.iva.ga0.e(fVar, o02, hVar, iVar, dVar));
            }
        }
        return q.a;
    }
}
