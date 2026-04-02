package com.amazon.aps.iva.ke0;

import com.amazon.aps.iva.ke0.a;
/* compiled from: ArrayMapOwner.kt */
/* loaded from: classes4.dex */
public final class q<K, V, T extends V> extends a.AbstractC0443a<K, V, T> implements com.amazon.aps.iva.bc0.b<a<K, V>, V> {
    @Override // com.amazon.aps.iva.bc0.b
    public final Object getValue(Object obj, com.amazon.aps.iva.fc0.l lVar) {
        a aVar = (a) obj;
        com.amazon.aps.iva.yb0.j.f(aVar, "thisRef");
        com.amazon.aps.iva.yb0.j.f(lVar, "property");
        return aVar.b().get(this.b);
    }
}
