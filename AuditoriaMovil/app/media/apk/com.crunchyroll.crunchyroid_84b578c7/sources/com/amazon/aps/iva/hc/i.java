package com.amazon.aps.iva.hc;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.p;
/* compiled from: GlideModifier.kt */
@com.amazon.aps.iva.qb0.e(c = "com.bumptech.glide.integration.compose.GlideNode$maybeAnimate$1", f = "GlideModifier.kt", l = {343}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class i extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
    public int h;
    public final /* synthetic */ e i;

    /* compiled from: GlideModifier.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<q> {
        public final /* synthetic */ e h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e eVar) {
            super(0);
            this.h = eVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            com.amazon.aps.iva.u1.p.a(this.h);
            return q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(e eVar, com.amazon.aps.iva.ob0.d<? super i> dVar) {
        super(2, dVar);
        this.i = eVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new i(this.i, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        return ((i) create(g0Var, dVar)).invokeSuspend(q.a);
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
            e eVar = this.i;
            n nVar = eVar.F;
            new a(eVar);
            this.h = 1;
            if (nVar.b() == aVar) {
                return aVar;
            }
        }
        return q.a;
    }
}
