package com.amazon.aps.iva.e0;

import com.amazon.aps.iva.b0.n0;
import com.amazon.aps.iva.f0.r;
import com.amazon.aps.iva.s1.w0;
/* compiled from: LazyListState.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.lazy.LazyListState$scrollToItem$2", f = "LazyListState.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class h0 extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<n0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public final /* synthetic */ g0 h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(g0 g0Var, int i, int i2, com.amazon.aps.iva.ob0.d<? super h0> dVar) {
        super(2, dVar);
        this.h = g0Var;
        this.i = i;
        this.j = i2;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new h0(this.h, this.i, this.j, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(n0 n0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((h0) create(n0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        com.amazon.aps.iva.ab.x.i0(obj);
        g0 g0Var = this.h;
        f0 f0Var = g0Var.a;
        f0Var.a(this.i, this.j);
        f0Var.d = null;
        o oVar = g0Var.n;
        oVar.a.clear();
        oVar.b = r.a.a;
        oVar.c = -1;
        w0 w0Var = g0Var.k;
        if (w0Var != null) {
            w0Var.d();
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
