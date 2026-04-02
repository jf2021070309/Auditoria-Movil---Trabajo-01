package com.amazon.aps.iva.xw;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
/* compiled from: FragmentArgumentDelegate.kt */
/* loaded from: classes2.dex */
public final class u<T> implements com.amazon.aps.iva.bc0.b {
    public final String a;

    public u(String str) {
        this.a = str;
    }

    @Override // com.amazon.aps.iva.bc0.b
    /* renamed from: a */
    public final T getValue(Fragment fragment, com.amazon.aps.iva.fc0.l<?> lVar) {
        com.amazon.aps.iva.yb0.j.f(fragment, "thisRef");
        com.amazon.aps.iva.yb0.j.f(lVar, "property");
        Bundle arguments = fragment.getArguments();
        if (arguments != null) {
            return (T) arguments.get(this.a);
        }
        return null;
    }

    public final void b(Fragment fragment, com.amazon.aps.iva.fc0.l<?> lVar, T t) {
        com.amazon.aps.iva.yb0.j.f(fragment, "thisRef");
        com.amazon.aps.iva.yb0.j.f(lVar, "property");
        if (fragment.getArguments() == null) {
            fragment.setArguments(new Bundle());
        }
        Bundle arguments = fragment.getArguments();
        if (arguments != null) {
            arguments.putAll(com.amazon.aps.iva.k3.e.a(new com.amazon.aps.iva.kb0.j(this.a, t)));
        }
    }
}
