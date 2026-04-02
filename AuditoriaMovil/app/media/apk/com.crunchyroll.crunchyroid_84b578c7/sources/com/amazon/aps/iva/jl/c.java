package com.amazon.aps.iva.jl;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.p;
/* compiled from: CellularController.kt */
@com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.player.presentation.streamovercellular.CellularControllerImpl$2", f = "CellularController.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class c extends com.amazon.aps.iva.qb0.i implements p<Boolean, com.amazon.aps.iva.ob0.d<? super q>, Object> {
    public /* synthetic */ boolean h;
    public final /* synthetic */ d i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, com.amazon.aps.iva.ob0.d<? super c> dVar2) {
        super(2, dVar2);
        this.i = dVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        c cVar = new c(this.i, dVar);
        cVar.h = ((Boolean) obj).booleanValue();
        return cVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(Boolean bool, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        return ((c) create(Boolean.valueOf(bool.booleanValue()), dVar)).invokeSuspend(q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        x.i0(obj);
        if (this.h) {
            d dVar = this.i;
            if (!dVar.a()) {
                dVar.h.k(Boolean.TRUE);
                dVar.d.a().pause();
            }
        }
        return q.a;
    }
}
