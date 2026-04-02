package com.amazon.aps.iva.b40;

import com.amazon.aps.iva.i5.v;
/* compiled from: SettingsDoNotSellViewModel.kt */
/* loaded from: classes2.dex */
public final class k extends com.amazon.aps.iva.ez.b implements j {
    public final com.amazon.aps.iva.w50.a b;
    public final v<Boolean> c;

    public k(com.amazon.aps.iva.w50.b bVar) {
        super(new com.amazon.aps.iva.wy.j[0]);
        this.b = bVar;
        this.c = new v<>(Boolean.valueOf(bVar.b()));
    }

    @Override // com.amazon.aps.iva.b40.j
    public final v L6() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.b40.j
    public final void a8(boolean z) {
        this.b.a(z);
        this.c.k(Boolean.valueOf(z));
    }
}
