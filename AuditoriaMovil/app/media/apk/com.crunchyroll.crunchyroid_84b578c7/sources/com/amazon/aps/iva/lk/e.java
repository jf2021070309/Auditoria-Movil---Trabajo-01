package com.amazon.aps.iva.lk;

import com.amazon.aps.iva.a6.m;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.aq.k;
import com.amazon.aps.iva.fa0.l;
import com.amazon.aps.iva.ka0.a0;
import com.amazon.aps.iva.ka0.c0;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.nk.j;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.xb0.p;
/* compiled from: MuxController.kt */
@com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.player.exoplayercomponent.mux.MuxControllerImpl$init$4$4", f = "MuxController.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class e extends i implements p<j, com.amazon.aps.iva.ob0.d<? super q>, Object> {
    public /* synthetic */ Object h;
    public final /* synthetic */ b i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(b bVar, com.amazon.aps.iva.ob0.d<? super e> dVar) {
        super(2, dVar);
        this.i = bVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        e eVar = new e(this.i, dVar);
        eVar.h = obj;
        return eVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(j jVar, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        return ((e) create(jVar, dVar)).invokeSuspend(q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        x.i0(obj);
        com.amazon.aps.iva.dk.c cVar = ((j) this.h).j;
        if (cVar == null) {
            return q.a;
        }
        if (!cVar.d) {
            return q.a;
        }
        String str = cVar.f + " - " + cVar.e;
        c0<m> c0Var = this.i.c;
        if (c0Var != null) {
            com.amazon.aps.iva.ka0.q qVar = new com.amazon.aps.iva.ka0.q(cVar.c, str, k.G(cVar));
            a0 a0Var = c0Var.b;
            a0Var.getClass();
            a0Var.i = qVar.getMessage();
            a0Var.j = qVar.b;
            a0Var.k = qVar.c;
            com.amazon.aps.iva.ia0.b.a("MuxStats", "external error (" + Integer.toString(a0Var.j) + "): " + a0Var.i);
            a0Var.e();
            a0Var.d(new l(a0Var.f(), 0));
        }
        return q.a;
    }
}
