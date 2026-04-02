package com.amazon.aps.iva.bz;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.qb0.e;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.p;
/* compiled from: SharedZipFlow.kt */
@e(c = "com.ellation.crunchyroll.mvp.flow.zip.SharedZipFlowImpl$onUpdated$1$1", f = "SharedZipFlow.kt", l = {52}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class c extends i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
    public int h;
    public final /* synthetic */ d<Object, Object, Object> i;
    public final /* synthetic */ g<Object> j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d<Object, Object, Object> dVar, g<Object> gVar, com.amazon.aps.iva.ob0.d<? super c> dVar2) {
        super(2, dVar2);
        this.i = dVar;
        this.j = gVar;
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
            this.h = 1;
            if (this.i.a(this.j, this) == aVar) {
                return aVar;
            }
        }
        return q.a;
    }
}
