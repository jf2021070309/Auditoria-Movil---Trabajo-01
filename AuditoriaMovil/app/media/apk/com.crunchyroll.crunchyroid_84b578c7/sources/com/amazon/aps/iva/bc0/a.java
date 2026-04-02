package com.amazon.aps.iva.bc0;

import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.yb0.j;
/* compiled from: ObservableProperty.kt */
/* loaded from: classes4.dex */
public abstract class a<V> implements b {
    public V a;

    public a(V v) {
        this.a = v;
    }

    public void a(Object obj, l lVar, Object obj2) {
        j.f(lVar, "property");
    }

    public void b(l lVar) {
        j.f(lVar, "property");
    }

    public final void c(Object obj, l<?> lVar, V v) {
        j.f(lVar, "property");
        V v2 = this.a;
        b(lVar);
        this.a = v;
        a(v2, lVar, v);
    }

    @Override // com.amazon.aps.iva.bc0.b
    public final V getValue(Object obj, l<?> lVar) {
        j.f(lVar, "property");
        return this.a;
    }

    public final String toString() {
        return defpackage.b.b(new StringBuilder("ObservableProperty(value="), this.a, ')');
    }
}
