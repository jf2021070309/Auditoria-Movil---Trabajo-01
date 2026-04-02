package com.amazon.aps.iva.yb0;

import com.amazon.aps.iva.fc0.m;
/* compiled from: PropertyReference0.java */
/* loaded from: classes4.dex */
public abstract class s extends y implements com.amazon.aps.iva.fc0.m {
    public s() {
    }

    @Override // com.amazon.aps.iva.yb0.b
    public com.amazon.aps.iva.fc0.c computeReflected() {
        return e0.a.f(this);
    }

    @Override // com.amazon.aps.iva.fc0.m
    public Object getDelegate() {
        return ((com.amazon.aps.iva.fc0.m) getReflected()).getDelegate();
    }

    @Override // com.amazon.aps.iva.xb0.a
    public Object invoke() {
        return get();
    }

    public s(Object obj) {
        super(obj);
    }

    @Override // com.amazon.aps.iva.fc0.m
    public m.a getGetter() {
        return ((com.amazon.aps.iva.fc0.m) getReflected()).mo26getGetter();
    }

    public s(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
