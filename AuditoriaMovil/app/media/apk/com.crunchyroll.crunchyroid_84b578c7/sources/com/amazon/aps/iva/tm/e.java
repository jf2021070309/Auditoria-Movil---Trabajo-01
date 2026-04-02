package com.amazon.aps.iva.tm;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.g8.m0;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.m0.f2;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.tm.c;
import com.amazon.aps.iva.xb0.p;
/* compiled from: SwitchProfileDialog.kt */
@com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.profiles.presentation.switchprofile.SwitchProfileDialog$onCreateView$1$1$1", f = "SwitchProfileDialog.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class e extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
    public /* synthetic */ Object h;
    public final /* synthetic */ m0 i;
    public final /* synthetic */ c j;
    public final /* synthetic */ g0 k;
    public final /* synthetic */ f2 l;

    /* compiled from: SwitchProfileDialog.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<q> {
        public final /* synthetic */ g0 h;
        public final /* synthetic */ f2 i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f2 f2Var, g0 g0Var) {
            super(0);
            this.h = g0Var;
            this.i = f2Var;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            com.amazon.aps.iva.se0.i.d(this.h, null, null, new d(this.i, null), 3);
            return q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(m0 m0Var, c cVar, g0 g0Var, f2 f2Var, com.amazon.aps.iva.ob0.d<? super e> dVar) {
        super(2, dVar);
        this.i = m0Var;
        this.j = cVar;
        this.k = g0Var;
        this.l = f2Var;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        e eVar = new e(this.i, this.j, this.k, this.l, dVar);
        eVar.h = obj;
        return eVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        return ((e) create(g0Var, dVar)).invokeSuspend(q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        x.i0(obj);
        c.a aVar2 = c.c;
        new com.amazon.aps.iva.nm.i(this.i, this.j.ci(), new a(this.l, this.k)).a((g0) this.h);
        return q.a;
    }
}
