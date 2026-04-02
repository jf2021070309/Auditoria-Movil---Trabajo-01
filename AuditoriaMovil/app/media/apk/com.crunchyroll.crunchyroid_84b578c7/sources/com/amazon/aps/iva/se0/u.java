package com.amazon.aps.iva.se0;
/* compiled from: CompletableDeferred.kt */
/* loaded from: classes4.dex */
public final class u<T> extends o1 implements t<T> {
    public u(j1 j1Var) {
        super(true);
        e0(j1Var);
    }

    @Override // com.amazon.aps.iva.se0.t
    public final boolean F(Throwable th) {
        return g0(new w(th, false));
    }

    @Override // com.amazon.aps.iva.se0.m0
    public final Object K(com.amazon.aps.iva.ob0.d<? super T> dVar) {
        Object B = B(dVar);
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        return B;
    }
}
