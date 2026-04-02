package com.amazon.aps.iva.i5;
/* compiled from: FlowLiveData.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.lifecycle.FlowLiveDataConversions$asLiveData$1", f = "FlowLiveData.kt", l = {80}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class l extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<s<Object>, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ com.amazon.aps.iva.ve0.f<Object> j;

    /* compiled from: FlowLiveData.kt */
    /* loaded from: classes.dex */
    public static final class a<T> implements com.amazon.aps.iva.ve0.g {
        public final /* synthetic */ s<T> b;

        public a(s<T> sVar) {
            this.b = sVar;
        }

        @Override // com.amazon.aps.iva.ve0.g
        public final Object a(T t, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            Object a = this.b.a(t, dVar);
            if (a == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
                return a;
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.amazon.aps.iva.ve0.f<Object> fVar, com.amazon.aps.iva.ob0.d<? super l> dVar) {
        super(2, dVar);
        this.j = fVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        l lVar = new l(this.j, dVar);
        lVar.i = obj;
        return lVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(s<Object> sVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((l) create(sVar, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        if (i != 0) {
            if (i == 1) {
                com.amazon.aps.iva.ab.x.i0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.amazon.aps.iva.ab.x.i0(obj);
            a aVar2 = new a((s) this.i);
            this.h = 1;
            if (this.j.c(aVar2, this) == aVar) {
                return aVar;
            }
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
