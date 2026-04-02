package com.amazon.aps.iva.kx;

import com.amazon.aps.iva.yb0.j;
/* compiled from: InAppUpdatesDependenciesImpl.kt */
/* loaded from: classes2.dex */
public final class b implements com.amazon.aps.iva.my.b {
    public final com.amazon.aps.iva.xb0.a<Boolean> a;

    public b(c cVar) {
        j.f(cVar, "canShowInAppUpdates");
        this.a = cVar;
    }

    @Override // com.amazon.aps.iva.my.b
    public final com.amazon.aps.iva.xb0.a<Boolean> a() {
        return this.a;
    }
}
