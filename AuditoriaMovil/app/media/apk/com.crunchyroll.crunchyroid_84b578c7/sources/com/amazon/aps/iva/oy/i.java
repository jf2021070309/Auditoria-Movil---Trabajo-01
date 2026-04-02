package com.amazon.aps.iva.oy;

import com.amazon.aps.iva.i5.v;
/* compiled from: InAppUpdatesMonitor.kt */
/* loaded from: classes2.dex */
public final class i implements f {
    public final com.amazon.aps.iva.my.a b;
    public final k c;
    public final v<a> d = new v<>();

    public i(com.amazon.aps.iva.kx.a aVar, l lVar, p pVar, com.amazon.aps.iva.xe0.d dVar) {
        this.b = aVar;
        this.c = lVar;
        com.amazon.aps.iva.se0.i.d(dVar, null, null, new g(pVar, this, null), 3);
        pVar.d(new h(this));
    }

    @Override // com.amazon.aps.iva.oy.f
    public final v<a> a() {
        return this.d;
    }
}
