package com.amazon.aps.iva.op;

import com.amazon.aps.iva.yb0.j;
/* compiled from: NoOpEventMapper.kt */
/* loaded from: classes2.dex */
public final class a<T> implements com.amazon.aps.iva.gq.a<T> {
    @Override // com.amazon.aps.iva.gq.a
    public final T a(T t) {
        j.f(t, "event");
        return t;
    }

    public final boolean equals(Object obj) {
        return obj instanceof a;
    }

    public final int hashCode() {
        return 0;
    }
}
