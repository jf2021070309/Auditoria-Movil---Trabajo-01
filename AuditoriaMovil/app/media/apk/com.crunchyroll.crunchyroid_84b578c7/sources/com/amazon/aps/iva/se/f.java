package com.amazon.aps.iva.se;

import com.amazon.aps.iva.k50.l;
import com.amazon.aps.iva.k50.m;
import com.amazon.aps.iva.wy.j;
/* compiled from: OnHoldNotificationPresenter.kt */
/* loaded from: classes.dex */
public final class f extends com.amazon.aps.iva.wy.b<g> implements e {
    public final l b;
    public final com.amazon.aps.iva.ve.e c;
    public final b d;

    public f(d dVar, m mVar, com.amazon.aps.iva.ve.e eVar, c cVar) {
        super(dVar, new j[0]);
        this.b = mVar;
        this.c = eVar;
        this.d = cVar;
    }

    @Override // com.amazon.aps.iva.se.e
    public final void P(com.amazon.aps.iva.fs.b bVar) {
        getView().close();
    }

    @Override // com.amazon.aps.iva.se.e
    public final void d(com.amazon.aps.iva.fs.b bVar) {
        this.b.a();
        this.d.d(bVar);
        getView().close();
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        if (!this.c.k3()) {
            getView().y();
        }
        this.d.c();
    }
}
