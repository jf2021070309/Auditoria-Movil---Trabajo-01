package com.amazon.aps.iva.s;

import com.amazon.aps.iva.s.b;
import java.util.HashMap;
/* compiled from: FastSafeIterableMap.java */
/* loaded from: classes.dex */
public final class a<K, V> extends b<K, V> {
    public final HashMap<K, b.c<K, V>> f = new HashMap<>();

    @Override // com.amazon.aps.iva.s.b
    public final b.c<K, V> b(K k) {
        return this.f.get(k);
    }

    @Override // com.amazon.aps.iva.s.b
    public final V d(K k, V v) {
        b.c<K, V> b = b(k);
        if (b != null) {
            return b.c;
        }
        HashMap<K, b.c<K, V>> hashMap = this.f;
        b.c<K, V> cVar = new b.c<>(k, v);
        this.e++;
        b.c<K, V> cVar2 = this.c;
        if (cVar2 == null) {
            this.b = cVar;
            this.c = cVar;
        } else {
            cVar2.d = cVar;
            cVar.e = cVar2;
            this.c = cVar;
        }
        hashMap.put(k, cVar);
        return null;
    }

    @Override // com.amazon.aps.iva.s.b
    public final V e(K k) {
        V v = (V) super.e(k);
        this.f.remove(k);
        return v;
    }
}
