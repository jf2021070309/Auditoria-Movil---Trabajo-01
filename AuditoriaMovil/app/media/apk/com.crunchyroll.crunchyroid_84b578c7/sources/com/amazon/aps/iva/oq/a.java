package com.amazon.aps.iva.oq;

import com.amazon.aps.iva.up.f;
/* compiled from: DatadogUserInfoProvider.kt */
/* loaded from: classes2.dex */
public final class a implements b {
    public final com.amazon.aps.iva.sp.c<com.amazon.aps.iva.eq.b> a;
    public com.amazon.aps.iva.eq.b b = new com.amazon.aps.iva.eq.b(0);

    public a(f fVar) {
        this.a = fVar;
    }

    @Override // com.amazon.aps.iva.oq.d
    public final com.amazon.aps.iva.eq.b b() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.oq.b
    public final void d(com.amazon.aps.iva.eq.b bVar) {
        this.b = bVar;
        this.a.b(bVar);
    }
}
