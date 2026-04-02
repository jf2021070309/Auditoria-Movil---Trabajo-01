package com.amazon.aps.iva.yb0;

import com.amazon.aps.iva.fc0.o;
/* compiled from: PropertyReference2.java */
/* loaded from: classes4.dex */
public abstract class w extends y implements com.amazon.aps.iva.fc0.o {
    public w(Class cls, String str, String str2) {
        super(b.NO_RECEIVER, cls, str, str2, 0);
    }

    @Override // com.amazon.aps.iva.yb0.b
    public final com.amazon.aps.iva.fc0.c computeReflected() {
        return e0.a.h(this);
    }

    @Override // com.amazon.aps.iva.fc0.o
    public final o.a getGetter() {
        return ((com.amazon.aps.iva.fc0.o) getReflected()).getGetter();
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((x) this).getGetter().call(obj, obj2);
    }
}
