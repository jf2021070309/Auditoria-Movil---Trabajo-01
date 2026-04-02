package com.amazon.aps.iva.we0;

import com.amazon.aps.iva.ab.x;
/* compiled from: ChannelFlow.kt */
/* loaded from: classes4.dex */
public final class u<T> implements com.amazon.aps.iva.ve0.g<T> {
    public final com.amazon.aps.iva.ob0.g b;
    public final Object c;
    public final a d;

    /* compiled from: ChannelFlow.kt */
    @com.amazon.aps.iva.qb0.e(c = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", f = "ChannelFlow.kt", l = {212}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<T, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public /* synthetic */ Object i;
        public final /* synthetic */ com.amazon.aps.iva.ve0.g<T> j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(com.amazon.aps.iva.ve0.g<? super T> gVar, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
            this.j = gVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            a aVar = new a(this.j, dVar);
            aVar.i = obj;
            return aVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(Object obj, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((a) create(obj, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
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
                Object obj2 = this.i;
                this.h = 1;
                if (this.j.a(obj2, this) == aVar) {
                    return aVar;
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public u(com.amazon.aps.iva.ve0.g<? super T> gVar, com.amazon.aps.iva.ob0.g gVar2) {
        this.b = gVar2;
        this.c = com.amazon.aps.iva.xe0.u.b(gVar2);
        this.d = new a(gVar, null);
    }

    @Override // com.amazon.aps.iva.ve0.g
    public final Object a(T t, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        Object t0 = x.t0(this.b, t, this.c, this.d, dVar);
        if (t0 == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return t0;
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
