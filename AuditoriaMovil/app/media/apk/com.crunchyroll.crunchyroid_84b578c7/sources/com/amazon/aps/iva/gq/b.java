package com.amazon.aps.iva.gq;

import com.amazon.aps.iva.sp.h;
import com.amazon.aps.iva.yb0.j;
/* compiled from: MapperSerializer.kt */
/* loaded from: classes2.dex */
public final class b<T> implements h<T> {
    public final a<T> b;
    public final h<T> c;

    public b(a<T> aVar, h<T> hVar) {
        j.f(aVar, "eventMapper");
        this.b = aVar;
        this.c = hVar;
    }

    @Override // com.amazon.aps.iva.sp.h
    public final String serialize(T t) {
        j.f(t, "model");
        T a = this.b.a(t);
        if (a == null) {
            return null;
        }
        return this.c.serialize(a);
    }
}
