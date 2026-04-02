package com.amazon.aps.iva.ba0;

import com.amazon.aps.iva.bc0.b;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.yb0.j;
import java.lang.ref.WeakReference;
/* compiled from: Weak.kt */
/* loaded from: classes4.dex */
public final class a<T> implements b {
    public WeakReference<T> a;

    public a(T t) {
        this.a = new WeakReference<>(t);
    }

    @Override // com.amazon.aps.iva.bc0.b
    public final T getValue(Object obj, l<?> lVar) {
        j.f(obj, "thisRef");
        j.f(lVar, "property");
        return this.a.get();
    }
}
