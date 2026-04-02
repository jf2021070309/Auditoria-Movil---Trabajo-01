package com.amazon.aps.iva.qe;

import com.amazon.aps.iva.k50.l;
import com.amazon.aps.iva.k50.m;
import com.crunchyroll.billingnotifications.ingrace.InGraceNotificationActivity;
/* compiled from: InGraceNotificationPresenter.kt */
/* loaded from: classes.dex */
public final class f extends com.amazon.aps.iva.wy.b<g> implements e {
    public final d b;
    public final b c;
    public final com.amazon.aps.iva.ve.e d;
    public final l e;

    public f(InGraceNotificationActivity inGraceNotificationActivity, d dVar, b bVar, com.amazon.aps.iva.ve.e eVar, m mVar) {
        super(inGraceNotificationActivity, new com.amazon.aps.iva.wy.j[0]);
        this.b = dVar;
        this.c = bVar;
        this.d = eVar;
        this.e = mVar;
    }

    @Override // com.amazon.aps.iva.qe.e
    public final void d2(com.amazon.aps.iva.fs.b bVar) {
        this.c.r(bVar);
        getView().finish();
    }

    @Override // com.amazon.aps.iva.qe.e
    public final void l1(com.amazon.aps.iva.fs.b bVar) {
        this.e.a();
        this.c.h(bVar);
        getView().finish();
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        d dVar = this.b;
        getView().Ug(dVar.b);
        long j = 60;
        long a = ((dVar.a() / 1000) / j) / j;
        long j2 = a / 24;
        boolean z = dVar instanceof i;
        int i = dVar.c;
        if (z) {
            if (dVar.b()) {
                getView().h9(i, j2);
            } else {
                getView().Ta(i);
            }
        } else if (dVar instanceof h) {
            if (a == 0) {
                getView().s7(i, 1L);
            } else {
                getView().s7(i, a);
            }
        }
        if (!this.d.k3()) {
            getView().Kg();
            getView().y();
        }
        if (dVar instanceof h) {
            getView().Kg();
        }
        this.c.c();
    }
}
