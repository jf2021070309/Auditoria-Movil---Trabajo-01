package com.amazon.aps.iva.ic;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.ue0.o;
import com.amazon.aps.iva.ue0.q;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: Flows.kt */
@com.amazon.aps.iva.qb0.e(c = "com.bumptech.glide.integration.ktx.FlowsKt$flow$2", f = "Flows.kt", l = {236}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class c extends com.amazon.aps.iva.qb0.i implements p<q<? super d<Object>>, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ com.amazon.aps.iva.ab.a j;
    public final /* synthetic */ com.amazon.aps.iva.ec.f<Object> k;
    public final /* synthetic */ com.amazon.aps.iva.ec.g l;

    /* compiled from: Flows.kt */
    /* loaded from: classes.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.ec.g h;
        public final /* synthetic */ b<Object> i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.amazon.aps.iva.ec.g gVar, b<Object> bVar) {
            super(0);
            this.h = gVar;
            this.i = bVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            this.h.a(this.i);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.amazon.aps.iva.ab.a aVar, com.amazon.aps.iva.ec.f<Object> fVar, com.amazon.aps.iva.ec.g gVar, com.amazon.aps.iva.ob0.d<? super c> dVar) {
        super(2, dVar);
        this.j = aVar;
        this.k = fVar;
        this.l = gVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        c cVar = new c(this.j, this.k, this.l, dVar);
        cVar.i = obj;
        return cVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(q<? super d<Object>> qVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((c) create(qVar, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
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
            q qVar = (q) this.i;
            b bVar = new b(qVar, this.j);
            com.amazon.aps.iva.ec.f<Object> fVar = this.k;
            j.f(fVar, "<this>");
            fVar.C(bVar, bVar, fVar, new com.amazon.aps.iva.m8.d(1));
            a aVar2 = new a(this.l, bVar);
            this.h = 1;
            if (o.a(qVar, aVar2, this) == aVar) {
                return aVar;
            }
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
