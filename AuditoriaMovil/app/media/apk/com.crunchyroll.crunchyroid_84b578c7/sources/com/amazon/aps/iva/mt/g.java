package com.amazon.aps.iva.mt;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.se0.g0;
/* compiled from: ContinueWatchingCarousel.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.cards.continuewatching.ContinueWatchingCarousel$Content$1$2", f = "ContinueWatchingCarousel.kt", l = {84}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class g extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
    public int h;
    public final /* synthetic */ i i;
    public final /* synthetic */ com.amazon.aps.iva.e0.g0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.amazon.aps.iva.e0.g0 g0Var, i iVar, com.amazon.aps.iva.ob0.d dVar) {
        super(2, dVar);
        this.i = iVar;
        this.j = g0Var;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new g(this.j, this.i, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        return ((g) create(g0Var, dVar)).invokeSuspend(q.a);
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
            i iVar = this.i;
            if (iVar.getScrollPosition().b) {
                int i2 = iVar.getScrollPosition().a;
                this.h = 1;
                if (com.amazon.aps.iva.e0.g0.a(this.j, i2, this) == aVar) {
                    return aVar;
                }
            }
        }
        return q.a;
    }
}
