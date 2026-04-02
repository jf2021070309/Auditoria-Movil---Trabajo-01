package com.amazon.aps.iva.ez;

import androidx.lifecycle.p;
import com.amazon.aps.iva.i5.f0;
/* compiled from: ViewModelFactory.kt */
/* loaded from: classes2.dex */
public final class a<T extends f0> implements com.amazon.aps.iva.bc0.b<Object, T> {
    public final Class<T> a;
    public final com.amazon.aps.iva.xb0.a<androidx.fragment.app.h> b;
    public final com.amazon.aps.iva.xb0.l<p, T> c;
    public T d;

    /* JADX WARN: Multi-variable type inference failed */
    public a(Class<T> cls, com.amazon.aps.iva.xb0.a<? extends androidx.fragment.app.h> aVar, com.amazon.aps.iva.xb0.l<? super p, ? extends T> lVar) {
        this.a = cls;
        this.b = aVar;
        this.c = lVar;
    }

    @Override // com.amazon.aps.iva.bc0.b
    /* renamed from: a */
    public final T getValue(Object obj, com.amazon.aps.iva.fc0.l<?> lVar) {
        com.amazon.aps.iva.yb0.j.f(obj, "thisRef");
        com.amazon.aps.iva.yb0.j.f(lVar, "property");
        if (this.d == null) {
            this.d = (T) l.a(this.b.invoke(), this.a, this.c);
        }
        T t = this.d;
        if (t != null) {
            return t;
        }
        throw new IllegalStateException(defpackage.e.e("Property ", lVar.getName(), " could not be read"));
    }
}
