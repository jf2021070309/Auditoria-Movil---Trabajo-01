package com.amazon.aps.iva.h40;

import com.amazon.aps.iva.fz.l;
import com.amazon.aps.iva.i5.v;
import java.util.List;
/* compiled from: NotificationSettingsViewModel.kt */
/* loaded from: classes2.dex */
public final class i extends com.amazon.aps.iva.ez.b implements h {
    public final c b;
    public final v<l> c;

    public i(d dVar) {
        super(dVar);
        this.b = dVar;
        this.c = new v<>(null);
    }

    @Override // com.amazon.aps.iva.h40.h
    public final v O2() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.h40.h
    public final List<a> R() {
        return this.b.R();
    }

    @Override // com.amazon.aps.iva.h40.h
    public final void b3(l lVar) {
        this.c.k(lVar);
    }

    @Override // com.amazon.aps.iva.h40.h
    public final boolean e(l lVar) {
        return this.b.e(lVar);
    }

    @Override // com.amazon.aps.iva.h40.h
    public final void h(l lVar) {
        this.b.h(lVar);
    }

    @Override // com.amazon.aps.iva.h40.h
    public final void i() {
        this.b.i();
    }
}
