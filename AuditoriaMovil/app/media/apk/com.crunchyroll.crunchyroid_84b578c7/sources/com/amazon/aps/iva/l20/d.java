package com.amazon.aps.iva.l20;

import com.amazon.aps.iva.k50.l;
import com.amazon.aps.iva.k50.m;
import com.amazon.aps.iva.wy.j;
/* compiled from: CancellationRescueDialogPresenter.kt */
/* loaded from: classes2.dex */
public final class d extends com.amazon.aps.iva.wy.b<e> implements c {
    public final l b;

    public d(e eVar, m mVar) {
        super(eVar, new j[0]);
        this.b = mVar;
    }

    @Override // com.amazon.aps.iva.l20.c
    public final void N4(com.amazon.aps.iva.fs.b bVar) {
        this.b.a();
        getView().closeScreen();
    }

    @Override // com.amazon.aps.iva.l20.c
    public final void c() {
        getView().close();
        onDismiss();
    }

    @Override // com.amazon.aps.iva.l20.c
    public final void onDismiss() {
        this.b.a();
        getView().closeScreen();
    }
}
