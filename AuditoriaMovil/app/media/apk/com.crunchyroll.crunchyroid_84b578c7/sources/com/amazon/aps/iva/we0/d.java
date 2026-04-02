package com.amazon.aps.iva.we0;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.se0.b0;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.se0.h0;
/* compiled from: ChannelFlow.kt */
@com.amazon.aps.iva.qb0.e(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", f = "ChannelFlow.kt", l = {123}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class d extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ com.amazon.aps.iva.ve0.g<Object> j;
    public final /* synthetic */ f<Object> k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.amazon.aps.iva.ob0.d dVar, com.amazon.aps.iva.ve0.g gVar, f fVar) {
        super(2, dVar);
        this.j = gVar;
        this.k = fVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        d dVar2 = new d(dVar, this.j, this.k);
        dVar2.i = obj;
        return dVar2;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((d) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        if (i != 0) {
            if (i == 1) {
                x.i0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            x.i0(obj);
            g0 g0Var = (g0) this.i;
            f<Object> fVar = this.k;
            int i2 = fVar.c;
            if (i2 == -3) {
                i2 = -2;
            }
            h0 h0Var = h0.ATOMIC;
            e eVar = new e(fVar, null);
            com.amazon.aps.iva.ue0.p pVar = new com.amazon.aps.iva.ue0.p(b0.b(g0Var, fVar.b), com.amazon.aps.iva.dg.b.c(i2, fVar.d, 4));
            h0Var.invoke(eVar, pVar, pVar);
            this.h = 1;
            Object P = com.amazon.aps.iva.cq.b.P(this.j, pVar, true, this);
            if (P != obj2) {
                P = com.amazon.aps.iva.kb0.q.a;
            }
            if (P == obj2) {
                return obj2;
            }
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
