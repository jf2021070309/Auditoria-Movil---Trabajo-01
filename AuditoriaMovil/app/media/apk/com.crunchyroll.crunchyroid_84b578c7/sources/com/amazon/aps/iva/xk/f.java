package com.amazon.aps.iva.xk;

import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import com.amazon.aps.iva.i5.j;
import com.amazon.aps.iva.i5.v;
import com.amazon.aps.iva.ve0.c0;
/* compiled from: PlayerMaturityLabelDataProvider.kt */
/* loaded from: classes2.dex */
public final class f implements d {
    public final androidx.lifecycle.c a;

    public f(com.amazon.aps.iva.cj.h hVar, v vVar, LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl) {
        this.a = j.b(com.amazon.aps.iva.dg.b.m(new c0(hVar.getState(), j.a(vVar), new e(null))), lifecycleCoroutineScopeImpl.c);
    }

    @Override // com.amazon.aps.iva.xk.d
    public final androidx.lifecycle.c a() {
        return this.a;
    }
}
