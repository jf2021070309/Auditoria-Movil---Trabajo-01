package com.amazon.aps.iva.ue;

import com.amazon.aps.iva.k50.l;
import com.amazon.aps.iva.k50.m;
/* compiled from: RenewNotificationPresenter.kt */
/* loaded from: classes.dex */
public final class i extends com.amazon.aps.iva.wy.b<j> implements h {
    public final g b;
    public final l c;
    public final com.amazon.aps.iva.ve.e d;
    public final d e;

    public i(f fVar, g gVar, m mVar, com.amazon.aps.iva.ve.e eVar, d dVar) {
        super(fVar, new com.amazon.aps.iva.wy.j[0]);
        this.b = gVar;
        this.c = mVar;
        this.d = eVar;
        this.e = dVar;
    }

    @Override // com.amazon.aps.iva.ue.h
    public final void P(com.amazon.aps.iva.fs.b bVar) {
        getView().close();
    }

    @Override // com.amazon.aps.iva.ue.h
    public final void d(com.amazon.aps.iva.fs.b bVar) {
        this.c.a();
        this.e.d(bVar);
        getView().close();
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        if (!this.d.k3()) {
            getView().y();
        }
        long j = 60;
        long a = ((this.b.a() / 1000) / j) / j;
        long j2 = a / 24;
        if (j2 > 0) {
            getView().ab(j2);
        } else if (a == 0) {
            getView().Y8(1L);
        } else {
            getView().Y8(a);
        }
        this.e.c();
    }
}
