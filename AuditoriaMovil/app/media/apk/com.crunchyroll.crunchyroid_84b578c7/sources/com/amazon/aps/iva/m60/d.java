package com.amazon.aps.iva.m60;

import com.amazon.aps.iva.yb0.j;
/* compiled from: ScreenOrientationView.kt */
/* loaded from: classes2.dex */
public final class d implements c {
    public final com.amazon.aps.iva.k.c b;

    public d(com.amazon.aps.iva.k.c cVar) {
        j.f(cVar, "activity");
        this.b = cVar;
    }

    @Override // com.amazon.aps.iva.m60.c
    public final void j8() {
        this.b.setRequestedOrientation(2);
    }

    @Override // com.amazon.aps.iva.m60.c
    public final void vg() {
        this.b.setRequestedOrientation(7);
    }
}
