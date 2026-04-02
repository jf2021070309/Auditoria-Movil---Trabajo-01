package com.amazon.aps.iva.uw;

import com.amazon.aps.iva.i5.v;
import com.amazon.aps.iva.wy.j;
/* compiled from: EditModeViewModel.kt */
/* loaded from: classes2.dex */
public final class b extends com.amazon.aps.iva.ez.b implements a {
    public final v<Boolean> b;

    public b() {
        super(new j[0]);
        this.b = new v<>(Boolean.FALSE);
    }

    @Override // com.amazon.aps.iva.uw.a
    public final v a1() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.uw.a
    public final void u() {
        this.b.k(Boolean.FALSE);
    }

    @Override // com.amazon.aps.iva.uw.a
    public final void z() {
        this.b.k(Boolean.TRUE);
    }
}
