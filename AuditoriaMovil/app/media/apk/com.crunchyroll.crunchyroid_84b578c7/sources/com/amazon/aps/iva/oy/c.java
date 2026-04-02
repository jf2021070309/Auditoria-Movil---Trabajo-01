package com.amazon.aps.iva.oy;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.se0.g0;
/* compiled from: InAppUpdatesManager.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.inappupdates.manager.InAppUpdatesManagerImpl$download$1", f = "InAppUpdatesManager.kt", l = {57}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class c extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
    public int h;
    public final /* synthetic */ d i;
    public final /* synthetic */ int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, int i, com.amazon.aps.iva.ob0.d<? super c> dVar2) {
        super(2, dVar2);
        this.i = dVar;
        this.j = i;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new c(this.i, this.j, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        return ((c) create(g0Var, dVar)).invokeSuspend(q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        if (i != 0) {
            if (i == 1) {
                x.i0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            x.i0(obj);
            e eVar = this.i.d;
            this.h = 1;
            if (eVar.c(this.j, this) == aVar) {
                return aVar;
            }
        }
        return q.a;
    }
}
