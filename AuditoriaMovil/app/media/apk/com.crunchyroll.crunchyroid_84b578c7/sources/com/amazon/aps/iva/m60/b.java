package com.amazon.aps.iva.m60;

import com.amazon.aps.iva.wy.j;
/* compiled from: ScreenOrientationPresenter.kt */
/* loaded from: classes2.dex */
public final class b extends com.amazon.aps.iva.wy.b<c> implements a {
    public final boolean b;

    public b(boolean z, d dVar) {
        super(dVar, new j[0]);
        this.b = z;
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        if (this.b) {
            getView().j8();
        } else {
            getView().vg();
        }
    }
}
