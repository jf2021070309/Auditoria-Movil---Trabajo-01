package com.amazon.aps.iva.v4;

import java.util.Iterator;
import java.util.Map;
/* compiled from: MapFieldSchemaLite.java */
/* loaded from: classes.dex */
public final class l0 implements k0 {
    @Override // com.amazon.aps.iva.v4.k0
    public final j0 a() {
        j0 j0Var = j0.c;
        if (j0Var.isEmpty()) {
            return new j0();
        }
        return new j0(j0Var);
    }

    @Override // com.amazon.aps.iva.v4.k0
    public final j0 forMapData(Object obj) {
        return (j0) obj;
    }

    @Override // com.amazon.aps.iva.v4.k0
    public final void forMapMetadata(Object obj) {
        ((i0) obj).getClass();
    }

    @Override // com.amazon.aps.iva.v4.k0
    public final j0 forMutableMapData(Object obj) {
        return (j0) obj;
    }

    @Override // com.amazon.aps.iva.v4.k0
    public final int getSerializedSize(int i, Object obj, Object obj2) {
        j0 j0Var = (j0) obj;
        i0 i0Var = (i0) obj2;
        if (!j0Var.isEmpty()) {
            Iterator it = j0Var.entrySet().iterator();
            if (!it.hasNext()) {
                return 0;
            }
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            i0Var.getClass();
            k.t(i);
            throw null;
        }
        return 0;
    }

    @Override // com.amazon.aps.iva.v4.k0
    public final boolean isImmutable(Object obj) {
        return !((j0) obj).b;
    }

    @Override // com.amazon.aps.iva.v4.k0
    public final j0 mergeFrom(Object obj, Object obj2) {
        j0 j0Var = (j0) obj;
        j0 j0Var2 = (j0) obj2;
        if (!j0Var2.isEmpty()) {
            if (!j0Var.b) {
                if (j0Var.isEmpty()) {
                    j0Var = new j0();
                } else {
                    j0Var = new j0(j0Var);
                }
            }
            j0Var.c();
            if (!j0Var2.isEmpty()) {
                j0Var.putAll(j0Var2);
            }
        }
        return j0Var;
    }

    @Override // com.amazon.aps.iva.v4.k0
    public final Object toImmutable(Object obj) {
        ((j0) obj).b = false;
        return obj;
    }
}
