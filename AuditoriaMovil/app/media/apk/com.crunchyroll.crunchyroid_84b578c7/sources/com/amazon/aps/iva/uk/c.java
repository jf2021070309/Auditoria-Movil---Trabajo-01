package com.amazon.aps.iva.uk;

import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import com.amazon.aps.iva.i5.j;
/* compiled from: PlayerBufferingDataProvider.kt */
/* loaded from: classes2.dex */
public final class c implements a {
    public final androidx.lifecycle.c a;

    public c(LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl, com.amazon.aps.iva.ve0.f fVar) {
        this.a = j.b(new b(fVar), lifecycleCoroutineScopeImpl.c);
    }

    @Override // com.amazon.aps.iva.uk.a
    public final androidx.lifecycle.c a() {
        return this.a;
    }
}
