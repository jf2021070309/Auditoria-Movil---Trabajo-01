package com.amazon.aps.iva.o0;

import java.util.ArrayList;
/* compiled from: Applier.kt */
/* loaded from: classes.dex */
public abstract class a<T> implements d<T> {
    public final T a;
    public final ArrayList b = new ArrayList();
    public T c;

    public a(T t) {
        this.a = t;
        this.c = t;
    }

    @Override // com.amazon.aps.iva.o0.d
    public final void clear() {
        this.b.clear();
        this.c = this.a;
        i();
    }

    @Override // com.amazon.aps.iva.o0.d
    public final T e() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.o0.d
    public final void g(T t) {
        this.b.add(this.c);
        this.c = t;
    }

    @Override // com.amazon.aps.iva.o0.d
    public final void h() {
        ArrayList arrayList = this.b;
        if (!arrayList.isEmpty()) {
            this.c = (T) arrayList.remove(arrayList.size() - 1);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public abstract void i();
}
