package com.amazon.aps.iva.y0;

import com.amazon.aps.iva.zb0.d;
import java.util.ConcurrentModificationException;
import java.util.Map;
/* compiled from: SnapshotStateMap.kt */
/* loaded from: classes.dex */
public final class c0 implements Map.Entry<Object, Object>, d.a {
    public final Object b;
    public Object c;
    public final /* synthetic */ d0<Object, Object> d;

    public c0(d0<Object, Object> d0Var) {
        this.d = d0Var;
        Map.Entry<? extends Object, ? extends Object> entry = d0Var.e;
        com.amazon.aps.iva.yb0.j.c(entry);
        this.b = entry.getKey();
        Map.Entry<? extends Object, ? extends Object> entry2 = d0Var.e;
        com.amazon.aps.iva.yb0.j.c(entry2);
        this.c = entry2.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.c;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        d0<Object, Object> d0Var = this.d;
        if (d0Var.b.b().d == d0Var.d) {
            Object obj2 = this.c;
            d0Var.b.put(this.b, obj);
            this.c = obj;
            return obj2;
        }
        throw new ConcurrentModificationException();
    }
}
