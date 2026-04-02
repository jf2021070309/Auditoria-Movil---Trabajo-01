package com.amazon.aps.iva.oj;

import com.amazon.aps.iva.ab.t;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.ob0.d;
import com.amazon.aps.iva.qb0.e;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.ve0.h0;
import com.amazon.aps.iva.ve0.l0;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.common.ConnectionResult;
/* compiled from: PlayerEventBusImpl.kt */
/* loaded from: classes.dex */
public final class b implements com.amazon.aps.iva.oj.a {
    public final g0 a;
    public final l0 b = t.g(0, 0, null, 7);

    /* compiled from: PlayerEventBusImpl.kt */
    @e(c = "com.crunchyroll.player.eventbus.PlayerEventBusImpl$produceEvent$1", f = "PlayerEventBusImpl.kt", l = {ConnectionResult.API_DISABLED}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends i implements p<g0, d<? super q>, Object> {
        public int h;
        public final /* synthetic */ com.amazon.aps.iva.pj.a j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.amazon.aps.iva.pj.a aVar, d<? super a> dVar) {
            super(2, dVar);
            this.j = aVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final d<q> create(Object obj, d<?> dVar) {
            return new a(this.j, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, d<? super q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(q.a);
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
                l0 l0Var = b.this.b;
                this.h = 1;
                if (l0Var.a(this.j, this) == aVar) {
                    return aVar;
                }
            }
            return q.a;
        }
    }

    public b(g0 g0Var) {
        this.a = g0Var;
    }

    @Override // com.amazon.aps.iva.oj.a
    public final h0 a() {
        return new h0(this.b);
    }

    @Override // com.amazon.aps.iva.oj.a
    public final void b(String str, com.amazon.aps.iva.pj.a aVar) {
        j.f(str, "producer");
        j.f(aVar, "event");
        com.amazon.aps.iva.se0.i.d(this.a, null, null, new a(aVar, null), 3);
    }
}
