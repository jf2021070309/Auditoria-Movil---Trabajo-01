package com.amazon.aps.iva.we0;

import com.amazon.aps.iva.ob0.g;
/* compiled from: SafeCollector.kt */
/* loaded from: classes4.dex */
public final class o<T> extends com.amazon.aps.iva.qb0.c implements com.amazon.aps.iva.ve0.g<T> {
    public final com.amazon.aps.iva.ve0.g<T> h;
    public final com.amazon.aps.iva.ob0.g i;
    public final int j;
    public com.amazon.aps.iva.ob0.g k;
    public com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> l;

    /* compiled from: SafeCollector.kt */
    /* loaded from: classes4.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<Integer, g.b, Integer> {
        public static final a h = new a();

        public a() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Integer invoke(Integer num, g.b bVar) {
            return Integer.valueOf(num.intValue() + 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o(com.amazon.aps.iva.ve0.g<? super T> gVar, com.amazon.aps.iva.ob0.g gVar2) {
        super(m.b, com.amazon.aps.iva.ob0.h.b);
        this.h = gVar;
        this.i = gVar2;
        this.j = ((Number) gVar2.fold(0, a.h)).intValue();
    }

    @Override // com.amazon.aps.iva.ve0.g
    public final Object a(T t, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        try {
            Object h = h(dVar, t);
            if (h == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
                return h;
            }
            return com.amazon.aps.iva.kb0.q.a;
        } catch (Throwable th) {
            this.k = new l(dVar.getContext(), th);
            throw th;
        }
    }

    @Override // com.amazon.aps.iva.qb0.a, com.amazon.aps.iva.qb0.d
    public final com.amazon.aps.iva.qb0.d getCallerFrame() {
        com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar = this.l;
        if (dVar instanceof com.amazon.aps.iva.qb0.d) {
            return (com.amazon.aps.iva.qb0.d) dVar;
        }
        return null;
    }

    @Override // com.amazon.aps.iva.qb0.c, com.amazon.aps.iva.ob0.d
    public final com.amazon.aps.iva.ob0.g getContext() {
        com.amazon.aps.iva.ob0.g gVar = this.k;
        if (gVar == null) {
            return com.amazon.aps.iva.ob0.h.b;
        }
        return gVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    public final Object h(com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar, T t) {
        com.amazon.aps.iva.ob0.g context = dVar.getContext();
        com.amazon.aps.iva.a60.b.p(context);
        com.amazon.aps.iva.ob0.g gVar = this.k;
        if (gVar != context) {
            if (!(gVar instanceof l)) {
                if (((Number) context.fold(0, new q(this))).intValue() == this.j) {
                    this.k = context;
                } else {
                    throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.i + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
                }
            } else {
                throw new IllegalStateException(com.amazon.aps.iva.oe0.i.T("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((l) gVar).b + ", but then emission attempt of value '" + t + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
        }
        this.l = dVar;
        Object invoke = p.a.invoke(this.h, t, this);
        if (!com.amazon.aps.iva.yb0.j.a(invoke, com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED)) {
            this.l = null;
        }
        return invoke;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        Throwable a2 = com.amazon.aps.iva.kb0.k.a(obj);
        if (a2 != null) {
            this.k = new l(getContext(), a2);
        }
        com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar = this.l;
        if (dVar != null) {
            dVar.resumeWith(obj);
        }
        return com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
    }

    @Override // com.amazon.aps.iva.qb0.c, com.amazon.aps.iva.qb0.a
    public final void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
