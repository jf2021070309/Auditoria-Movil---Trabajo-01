package com.amazon.aps.iva.yb0;

import com.amazon.aps.iva.fc0.j;
import com.amazon.aps.iva.fc0.n;
/* compiled from: MutablePropertyReference1.java */
/* loaded from: classes4.dex */
public abstract class o extends q implements com.amazon.aps.iva.fc0.j {
    @Override // com.amazon.aps.iva.yb0.b
    public final com.amazon.aps.iva.fc0.c computeReflected() {
        return e0.b(this);
    }

    @Override // com.amazon.aps.iva.fc0.n
    public final n.a getGetter() {
        return ((com.amazon.aps.iva.fc0.j) getReflected()).getGetter();
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final Object invoke(Object obj) {
        return ((p) this).get(obj);
    }

    @Override // com.amazon.aps.iva.fc0.h
    public final j.a getSetter() {
        return ((com.amazon.aps.iva.fc0.j) getReflected()).getSetter();
    }
}
