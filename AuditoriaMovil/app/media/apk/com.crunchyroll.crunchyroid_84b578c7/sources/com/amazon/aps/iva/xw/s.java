package com.amazon.aps.iva.xw;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
/* compiled from: FragmentArgumentDelegate.kt */
/* loaded from: classes2.dex */
public final class s<T> implements com.amazon.aps.iva.bc0.b {
    public final String a;
    public T b;

    public s(String str) {
        this.a = str;
    }

    @Override // com.amazon.aps.iva.bc0.b
    /* renamed from: a */
    public final T getValue(Fragment fragment, com.amazon.aps.iva.fc0.l<?> lVar) {
        com.amazon.aps.iva.yb0.j.f(fragment, "thisRef");
        com.amazon.aps.iva.yb0.j.f(lVar, "property");
        if (this.b == null) {
            Bundle arguments = fragment.getArguments();
            if (arguments != null) {
                T t = (T) arguments.get(this.a);
                com.amazon.aps.iva.yb0.j.d(t, "null cannot be cast to non-null type T of com.ellation.crunchyroll.extension.FragmentArgumentDelegate");
                this.b = t;
            } else {
                throw new IllegalStateException(defpackage.e.e("Cannot read property ", lVar.getName(), " if no arguments have been set"));
            }
        }
        T t2 = this.b;
        if (t2 != null) {
            return t2;
        }
        throw new IllegalStateException(defpackage.e.e("Property ", lVar.getName(), " could not be read"));
    }

    public final void b(Fragment fragment, com.amazon.aps.iva.fc0.l<?> lVar, T t) {
        com.amazon.aps.iva.yb0.j.f(fragment, "thisRef");
        com.amazon.aps.iva.yb0.j.f(lVar, "property");
        com.amazon.aps.iva.yb0.j.f(t, "value");
        if (fragment.getArguments() == null) {
            fragment.setArguments(new Bundle());
        }
        Bundle arguments = fragment.getArguments();
        if (arguments != null) {
            arguments.putAll(com.amazon.aps.iva.k3.e.a(new com.amazon.aps.iva.kb0.j(this.a, t)));
        }
    }
}
