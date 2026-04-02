package com.amazon.aps.iva.ve0;

import com.google.ads.AdSize;
/* compiled from: Collect.kt */
@com.amazon.aps.iva.qb0.e(c = "kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1", f = "Collect.kt", l = {AdSize.PORTRAIT_AD_HEIGHT}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class j extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public final /* synthetic */ f<Object> i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(f<Object> fVar, com.amazon.aps.iva.ob0.d<? super j> dVar) {
        super(2, dVar);
        this.i = fVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new j(this.i, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((j) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        if (i != 0) {
            if (i == 1) {
                com.amazon.aps.iva.ab.x.i0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.amazon.aps.iva.ab.x.i0(obj);
            this.h = 1;
            Object c = this.i.c(com.amazon.aps.iva.we0.n.b, this);
            if (c != obj2) {
                c = com.amazon.aps.iva.kb0.q.a;
            }
            if (c == obj2) {
                return obj2;
            }
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
