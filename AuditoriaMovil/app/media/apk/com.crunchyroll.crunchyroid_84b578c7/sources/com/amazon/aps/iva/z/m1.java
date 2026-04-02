package com.amazon.aps.iva.z;

import com.amazon.aps.iva.z.p;
/* compiled from: VectorConverters.kt */
/* loaded from: classes.dex */
public final class m1<T, V extends p> implements l1<T, V> {
    public final com.amazon.aps.iva.xb0.l<T, V> a;
    public final com.amazon.aps.iva.xb0.l<V, T> b;

    /* JADX WARN: Multi-variable type inference failed */
    public m1(com.amazon.aps.iva.xb0.l<? super T, ? extends V> lVar, com.amazon.aps.iva.xb0.l<? super V, ? extends T> lVar2) {
        com.amazon.aps.iva.yb0.j.f(lVar, "convertToVector");
        com.amazon.aps.iva.yb0.j.f(lVar2, "convertFromVector");
        this.a = lVar;
        this.b = lVar2;
    }

    @Override // com.amazon.aps.iva.z.l1
    public final com.amazon.aps.iva.xb0.l<T, V> a() {
        return this.a;
    }

    @Override // com.amazon.aps.iva.z.l1
    public final com.amazon.aps.iva.xb0.l<V, T> b() {
        return this.b;
    }
}
