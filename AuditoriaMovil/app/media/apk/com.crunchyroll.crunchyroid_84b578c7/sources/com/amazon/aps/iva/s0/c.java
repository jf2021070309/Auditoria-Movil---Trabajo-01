package com.amazon.aps.iva.s0;

import com.amazon.aps.iva.zb0.d;
import java.util.Map;
import java.util.NoSuchElementException;
/* compiled from: PersistentHashMapBuilderContentIterators.kt */
/* loaded from: classes.dex */
public final class c<K, V> extends b<K, V> implements d.a {
    public final i<K, V> d;
    public V e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(i<K, V> iVar, K k, V v) {
        super(k, v);
        com.amazon.aps.iva.yb0.j.f(iVar, "parentIterator");
        this.d = iVar;
        this.e = v;
    }

    @Override // com.amazon.aps.iva.s0.b, java.util.Map.Entry
    public final V getValue() {
        return this.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazon.aps.iva.s0.b, java.util.Map.Entry
    public final V setValue(V v) {
        int i;
        V v2 = this.e;
        this.e = v;
        g<K, V, Map.Entry<K, V>> gVar = this.d.b;
        f<K, V> fVar = gVar.e;
        K k = this.b;
        if (fVar.containsKey(k)) {
            boolean z = gVar.d;
            if (z) {
                if (z) {
                    u uVar = gVar.b[gVar.c];
                    Object obj = uVar.b[uVar.d];
                    fVar.put(k, v);
                    if (obj != null) {
                        i = obj.hashCode();
                    } else {
                        i = 0;
                    }
                    gVar.d(i, fVar.d, obj, 0);
                } else {
                    throw new NoSuchElementException();
                }
            } else {
                fVar.put(k, v);
            }
            gVar.h = fVar.f;
        }
        return v2;
    }
}
