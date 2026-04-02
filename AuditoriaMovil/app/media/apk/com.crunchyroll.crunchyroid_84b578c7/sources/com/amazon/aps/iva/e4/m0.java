package com.amazon.aps.iva.e4;

import com.amazon.aps.iva.e4.j0;
import java.util.Map;
/* compiled from: MapFieldSchemaLite.java */
/* loaded from: classes.dex */
public final class m0 implements l0 {
    @Override // com.amazon.aps.iva.e4.l0
    public final k0 a() {
        return k0.c.d();
    }

    @Override // com.amazon.aps.iva.e4.l0
    public final k0 forMapData(Object obj) {
        return (k0) obj;
    }

    @Override // com.amazon.aps.iva.e4.l0
    public final j0.a<?, ?> forMapMetadata(Object obj) {
        return ((j0) obj).a;
    }

    @Override // com.amazon.aps.iva.e4.l0
    public final k0 forMutableMapData(Object obj) {
        return (k0) obj;
    }

    @Override // com.amazon.aps.iva.e4.l0
    public final int getSerializedSize(int i, Object obj, Object obj2) {
        k0 k0Var = (k0) obj;
        j0 j0Var = (j0) obj2;
        int i2 = 0;
        if (!k0Var.isEmpty()) {
            for (Map.Entry entry : k0Var.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                j0Var.getClass();
                int t = l.t(i);
                int a = j0.a(j0Var.a, key, value);
                i2 += l.v(a) + a + t;
            }
        }
        return i2;
    }

    @Override // com.amazon.aps.iva.e4.l0
    public final boolean isImmutable(Object obj) {
        return !((k0) obj).b;
    }

    @Override // com.amazon.aps.iva.e4.l0
    public final k0 mergeFrom(Object obj, Object obj2) {
        k0 k0Var = (k0) obj;
        k0 k0Var2 = (k0) obj2;
        if (!k0Var2.isEmpty()) {
            if (!k0Var.b) {
                k0Var = k0Var.d();
            }
            k0Var.c();
            if (!k0Var2.isEmpty()) {
                k0Var.putAll(k0Var2);
            }
        }
        return k0Var;
    }

    @Override // com.amazon.aps.iva.e4.l0
    public final Object toImmutable(Object obj) {
        ((k0) obj).b = false;
        return obj;
    }
}
