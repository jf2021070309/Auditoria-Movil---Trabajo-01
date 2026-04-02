package com.amazon.aps.iva.az;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.ve0.f0;
/* compiled from: StateFlowCollector.kt */
/* loaded from: classes2.dex */
public final class e<T> implements com.amazon.aps.iva.ve0.g<T> {
    public final com.amazon.aps.iva.ve0.g<T> b;
    public T c;

    /* JADX WARN: Multi-variable type inference failed */
    public e(Object obj, f0 f0Var) {
        this.b = f0Var;
        this.c = obj;
    }

    @Override // com.amazon.aps.iva.ve0.g
    public final Object a(T t, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        this.c = t;
        Object a = this.b.a(t, dVar);
        if (a == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return a;
        }
        return q.a;
    }
}
