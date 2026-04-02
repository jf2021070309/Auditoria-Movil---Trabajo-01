package com.amazon.aps.iva.ij;

import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import com.amazon.aps.iva.ve0.u0;
/* compiled from: PlaybackStateProvider.kt */
/* loaded from: classes.dex */
public final class f implements c {
    public final androidx.lifecycle.c a;
    public final androidx.lifecycle.c b;

    public f(u0 u0Var, LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl) {
        com.amazon.aps.iva.ve0.f m = com.amazon.aps.iva.dg.b.m(new d(u0Var));
        com.amazon.aps.iva.ob0.g gVar = lifecycleCoroutineScopeImpl.c;
        this.a = com.amazon.aps.iva.i5.j.b(m, gVar);
        this.b = com.amazon.aps.iva.i5.j.b(com.amazon.aps.iva.dg.b.m(new e(u0Var)), gVar);
    }

    @Override // com.amazon.aps.iva.ij.c
    public final androidx.lifecycle.c a() {
        return this.a;
    }

    @Override // com.amazon.aps.iva.ij.c
    public final androidx.lifecycle.c b() {
        return this.b;
    }
}
