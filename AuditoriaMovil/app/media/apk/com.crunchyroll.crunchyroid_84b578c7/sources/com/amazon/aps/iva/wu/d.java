package com.amazon.aps.iva.wu;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.se0.m0;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.d0;
/* compiled from: SingleJobRunner.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.coroutine.SingleJobRunner$launchIfNotRunning$2", f = "SingleJobRunner.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class d extends i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
    public /* synthetic */ Object h;
    public final /* synthetic */ d0<m0<Object>> i;
    public final /* synthetic */ e<Object, Object> j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ l<com.amazon.aps.iva.ob0.d<Object>, Object> l;

    /* compiled from: SingleJobRunner.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.coroutine.SingleJobRunner$launchIfNotRunning$2$1", f = "SingleJobRunner.kt", l = {19}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends i implements p<g0, com.amazon.aps.iva.ob0.d<Object>, Object> {
        public int h;
        public final /* synthetic */ l<com.amazon.aps.iva.ob0.d<Object>, Object> i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super com.amazon.aps.iva.ob0.d<Object>, ? extends Object> lVar, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
            this.i = lVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new a(this.i, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<Object> dVar) {
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
                this.h = 1;
                obj = this.i.invoke(this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return obj;
        }
    }

    /* compiled from: SingleJobRunner.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements l<Throwable, q> {
        public final /* synthetic */ e<Object, Object> h;
        public final /* synthetic */ Object i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e<Object, Object> eVar, Object obj) {
            super(1);
            this.h = eVar;
            this.i = obj;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(Throwable th) {
            this.h.a.remove(this.i);
            return q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(d0<m0<Object>> d0Var, e<Object, Object> eVar, Object obj, l<? super com.amazon.aps.iva.ob0.d<Object>, ? extends Object> lVar, com.amazon.aps.iva.ob0.d<? super d> dVar) {
        super(2, dVar);
        this.i = d0Var;
        this.j = eVar;
        this.k = obj;
        this.l = lVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        d dVar2 = new d(this.i, this.j, this.k, this.l, dVar);
        dVar2.h = obj;
        return dVar2;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        return ((d) create(g0Var, dVar)).invokeSuspend(q.a);
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [T, com.amazon.aps.iva.se0.n0] */
    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        x.i0(obj);
        ?? b2 = com.amazon.aps.iva.se0.i.b((g0) this.h, null, null, new a(this.l, null), 3);
        d0<m0<Object>> d0Var = this.i;
        d0Var.b = b2;
        e<Object, Object> eVar = this.j;
        Object obj2 = this.k;
        ((m0) b2).s0(new b(eVar, obj2));
        eVar.a.put(obj2, d0Var.b);
        return q.a;
    }
}
