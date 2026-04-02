package com.amazon.aps.iva.bz;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.qb0.e;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.ve0.f;
import com.amazon.aps.iva.xb0.p;
/* compiled from: SharedZipFlow.kt */
@e(c = "com.ellation.crunchyroll.mvp.flow.zip.SharedZipFlowImpl$2", f = "SharedZipFlow.kt", l = {31}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class b extends i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
    public int h;
    public final /* synthetic */ f<g<Object>> i;
    public final /* synthetic */ d<Object, Object, Object> j;

    /* compiled from: SharedZipFlow.kt */
    /* loaded from: classes2.dex */
    public static final class a implements com.amazon.aps.iva.ve0.g<g<Object>> {
        public final /* synthetic */ d<Object, Object, Object> b;

        public a(d<Object, Object, Object> dVar) {
            this.b = dVar;
        }

        @Override // com.amazon.aps.iva.ve0.g
        public final Object a(g<Object> gVar, com.amazon.aps.iva.ob0.d dVar) {
            d<Object, Object, Object> dVar2 = this.b;
            dVar2.g = gVar;
            d.e(dVar2);
            return q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(f<? extends g<Object>> fVar, d<Object, Object, Object> dVar, com.amazon.aps.iva.ob0.d<? super b> dVar2) {
        super(2, dVar2);
        this.i = fVar;
        this.j = dVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new b(this.i, this.j, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        return ((b) create(g0Var, dVar)).invokeSuspend(q.a);
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
            a aVar2 = new a(this.j);
            this.h = 1;
            if (this.i.c(aVar2, this) == aVar) {
                return aVar;
            }
        }
        return q.a;
    }
}
