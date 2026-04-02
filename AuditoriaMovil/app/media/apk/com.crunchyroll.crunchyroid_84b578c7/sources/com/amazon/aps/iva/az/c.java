package com.amazon.aps.iva.az;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.p;
/* compiled from: ReloadableFlow.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.mvp.flow.shared.ReloadableFlowImpl$1", f = "ReloadableFlow.kt", l = {22}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class c extends i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
    public int h;
    public final /* synthetic */ d<Object, Object> i;

    /* compiled from: ReloadableFlow.kt */
    /* loaded from: classes2.dex */
    public static final class a implements com.amazon.aps.iva.ve0.g<Object> {
        public final /* synthetic */ d<Object, Object> b;

        public a(d<Object, Object> dVar) {
            this.b = dVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.amazon.aps.iva.ve0.g
        public final Object a(Object obj, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            d<Object, Object> dVar2 = this.b;
            dVar2.g = obj;
            Object invoke = dVar2.f.invoke(dVar2.c, obj, dVar);
            if (invoke == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
                return invoke;
            }
            return q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d<Object, Object> dVar, com.amazon.aps.iva.ob0.d<? super c> dVar2) {
        super(2, dVar2);
        this.i = dVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new c(this.i, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        return ((c) create(g0Var, dVar)).invokeSuspend(q.a);
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
            d<Object, Object> dVar = this.i;
            com.amazon.aps.iva.ve0.f<Object> fVar = dVar.e;
            a aVar2 = new a(dVar);
            this.h = 1;
            if (fVar.c(aVar2, this) == aVar) {
                return aVar;
            }
        }
        return q.a;
    }
}
