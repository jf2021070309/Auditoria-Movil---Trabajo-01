package com.amazon.aps.iva.az;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.xb0.q;
import com.amazon.aps.iva.yb0.j;
/* compiled from: ReloadableFlow.kt */
/* loaded from: classes2.dex */
public final class d<D, T> extends h<T> implements b<T> {
    public final g0 d;
    public final com.amazon.aps.iva.ve0.f<D> e;
    public final q<com.amazon.aps.iva.ve0.g<? super T>, D, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> f;
    public D g;

    /* compiled from: ReloadableFlow.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.mvp.flow.shared.ReloadableFlowImpl$reload$1", f = "ReloadableFlow.kt", l = {32, 34}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends i implements p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public final /* synthetic */ boolean i;
        public final /* synthetic */ d<D, T> j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z, d<D, T> dVar, com.amazon.aps.iva.ob0.d<? super a> dVar2) {
            super(2, dVar2);
            this.i = z;
            this.j = dVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new a(this.i, this.j, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            e<T> eVar;
            T t;
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            if (i != 0) {
                if (i != 1 && i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.i0(obj);
            } else {
                x.i0(obj);
                boolean z = this.i;
                d<D, T> dVar = this.j;
                if (z && (t = (eVar = dVar.c).c) != null) {
                    j.c(t);
                    this.h = 1;
                    if (eVar.a(t, this) == aVar) {
                        return aVar;
                    }
                } else {
                    D d = dVar.g;
                    if (d != null) {
                        q<com.amazon.aps.iva.ve0.g<? super T>, D, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> qVar = dVar.f;
                        this.h = 2;
                        if (qVar.invoke(dVar.c, d, this) == aVar) {
                            return aVar;
                        }
                    }
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Object obj, q qVar, g0 g0Var, com.amazon.aps.iva.ve0.f fVar) {
        super(obj, 2);
        j.f(fVar, "sourceFlow");
        this.d = g0Var;
        this.e = fVar;
        this.f = qVar;
        com.amazon.aps.iva.se0.i.d(g0Var, null, null, new c(this, null), 3);
    }

    public final void e(boolean z) {
        com.amazon.aps.iva.se0.i.d(this.d, null, null, new a(z, this, null), 3);
    }
}
