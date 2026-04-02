package com.amazon.aps.iva.fj;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.p;
/* compiled from: PlayerComponent.kt */
@com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.player.component.PlayerComponent$registerEventBus$1", f = "PlayerComponent.kt", l = {18}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class d extends i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
    public int h;
    public final /* synthetic */ f<g> i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f<g> fVar, com.amazon.aps.iva.ob0.d<? super d> dVar) {
        super(2, dVar);
        this.i = fVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new d(this.i, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        return ((d) create(g0Var, dVar)).invokeSuspend(q.a);
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
            if (f.h(this.i, this) == aVar) {
                return aVar;
            }
        }
        return q.a;
    }
}
