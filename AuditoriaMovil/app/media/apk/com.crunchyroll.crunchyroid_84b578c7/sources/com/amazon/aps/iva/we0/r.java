package com.amazon.aps.iva.we0;

import com.amazon.aps.iva.ue0.w;
/* compiled from: SendingCollector.kt */
/* loaded from: classes4.dex */
public final class r<T> implements com.amazon.aps.iva.ve0.g<T> {
    public final w<T> b;

    /* JADX WARN: Multi-variable type inference failed */
    public r(w<? super T> wVar) {
        this.b = wVar;
    }

    @Override // com.amazon.aps.iva.ve0.g
    public final Object a(T t, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        Object g = this.b.g(t, dVar);
        if (g == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return g;
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
