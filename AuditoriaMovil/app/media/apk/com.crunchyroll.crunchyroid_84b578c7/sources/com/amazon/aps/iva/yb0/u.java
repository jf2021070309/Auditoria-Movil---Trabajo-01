package com.amazon.aps.iva.yb0;

import com.amazon.aps.iva.fc0.n;
/* compiled from: PropertyReference1.java */
/* loaded from: classes4.dex */
public abstract class u extends y implements com.amazon.aps.iva.fc0.n {
    @Override // com.amazon.aps.iva.yb0.b
    public final com.amazon.aps.iva.fc0.c computeReflected() {
        return e0.c(this);
    }

    @Override // com.amazon.aps.iva.fc0.n
    public final n.a getGetter() {
        return ((com.amazon.aps.iva.fc0.n) getReflected()).getGetter();
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final Object invoke(Object obj) {
        return get(obj);
    }
}
