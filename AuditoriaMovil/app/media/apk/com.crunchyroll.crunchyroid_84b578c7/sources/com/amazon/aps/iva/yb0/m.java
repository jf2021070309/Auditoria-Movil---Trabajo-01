package com.amazon.aps.iva.yb0;

import com.amazon.aps.iva.fc0.i;
import com.amazon.aps.iva.fc0.m;
/* compiled from: MutablePropertyReference0.java */
/* loaded from: classes4.dex */
public abstract class m extends q implements com.amazon.aps.iva.fc0.i {
    public m() {
    }

    @Override // com.amazon.aps.iva.yb0.b
    public com.amazon.aps.iva.fc0.c computeReflected() {
        return e0.a.d(this);
    }

    @Override // com.amazon.aps.iva.fc0.m
    public Object getDelegate() {
        return ((com.amazon.aps.iva.fc0.i) getReflected()).getDelegate();
    }

    @Override // com.amazon.aps.iva.xb0.a
    public Object invoke() {
        return get();
    }

    public m(Object obj) {
        super(obj);
    }

    @Override // com.amazon.aps.iva.fc0.m
    public m.a getGetter() {
        return ((com.amazon.aps.iva.fc0.i) getReflected()).mo26getGetter();
    }

    @Override // com.amazon.aps.iva.fc0.h
    public i.a getSetter() {
        return ((com.amazon.aps.iva.fc0.i) getReflected()).getSetter();
    }

    public m(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
