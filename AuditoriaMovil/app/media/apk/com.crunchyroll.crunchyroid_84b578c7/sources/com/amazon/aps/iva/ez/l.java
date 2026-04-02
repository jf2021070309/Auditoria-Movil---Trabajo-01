package com.amazon.aps.iva.ez;

import androidx.lifecycle.p;
import androidx.lifecycle.u;
import com.amazon.aps.iva.i5.f0;
/* compiled from: ViewModelFactory.kt */
/* loaded from: classes2.dex */
public final class l {
    public static final <T extends f0> T a(androidx.fragment.app.h hVar, Class<T> cls, com.amazon.aps.iva.xb0.l<? super p, ? extends T> lVar) {
        u.b bVar;
        com.amazon.aps.iva.yb0.j.f(hVar, "<this>");
        com.amazon.aps.iva.yb0.j.f(cls, "valueClass");
        if (lVar != null) {
            bVar = new k(cls, lVar, hVar);
        } else {
            bVar = null;
        }
        if (bVar == null) {
            bVar = hVar.getDefaultViewModelProviderFactory();
        }
        com.amazon.aps.iva.yb0.j.e(bVar, "viewModelFactory ?: this…tViewModelProviderFactory");
        return (T) new u(hVar, bVar).a(cls);
    }
}
