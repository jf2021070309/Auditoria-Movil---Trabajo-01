package com.amazon.aps.iva.te;

import com.amazon.aps.iva.k50.l;
import com.amazon.aps.iva.k50.m;
import com.amazon.aps.iva.wy.j;
/* compiled from: OnHoldNotificationMembershipPresenter.kt */
/* loaded from: classes.dex */
public final class f extends com.amazon.aps.iva.wy.b<g> implements e {
    public final com.amazon.aps.iva.ve.e b;
    public final l c;
    public final b d;

    public f(d dVar, com.amazon.aps.iva.ve.e eVar, m mVar, c cVar) {
        super(dVar, new j[0]);
        this.b = eVar;
        this.c = mVar;
        this.d = cVar;
    }

    @Override // com.amazon.aps.iva.te.e
    public final void d(com.amazon.aps.iva.fs.b bVar) {
        this.c.a();
        this.d.d(bVar);
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        if (!this.b.k3()) {
            getView().y();
        }
        this.d.c();
    }
}
