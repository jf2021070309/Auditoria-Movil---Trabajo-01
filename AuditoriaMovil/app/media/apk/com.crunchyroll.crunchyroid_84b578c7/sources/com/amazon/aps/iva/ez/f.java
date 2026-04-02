package com.amazon.aps.iva.ez;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.p;
import androidx.lifecycle.u;
import com.amazon.aps.iva.i5.f0;
/* compiled from: ViewModelFactory.kt */
/* loaded from: classes2.dex */
public final class f<T extends f0> implements com.amazon.aps.iva.bc0.b<Object, T> {
    public final Class<T> a;
    public final Fragment b;
    public final com.amazon.aps.iva.xb0.l<p, T> c;
    public T d;

    public f(Fragment fragment, Class cls, com.amazon.aps.iva.xb0.l lVar) {
        com.amazon.aps.iva.yb0.j.f(fragment, "fragment");
        this.a = cls;
        this.b = fragment;
        this.c = lVar;
    }

    @Override // com.amazon.aps.iva.bc0.b
    /* renamed from: a */
    public final T getValue(Object obj, com.amazon.aps.iva.fc0.l<?> lVar) {
        u.b bVar;
        com.amazon.aps.iva.yb0.j.f(obj, "thisRef");
        com.amazon.aps.iva.yb0.j.f(lVar, "property");
        if (this.d == null) {
            Fragment fragment = this.b;
            Class<T> cls = this.a;
            com.amazon.aps.iva.xb0.l<p, T> lVar2 = this.c;
            if (lVar2 != null) {
                bVar = new k(cls, lVar2, fragment);
            } else {
                bVar = null;
            }
            if (bVar == null) {
                bVar = fragment.getDefaultViewModelProviderFactory();
            }
            com.amazon.aps.iva.yb0.j.e(bVar, "viewModelFactory ?: frag…tViewModelProviderFactory");
            this.d = (T) new u(fragment, bVar).a(cls);
        }
        T t = this.d;
        if (t != null) {
            return t;
        }
        throw new IllegalStateException(defpackage.e.e("Property ", lVar.getName(), " could not be read"));
    }
}
