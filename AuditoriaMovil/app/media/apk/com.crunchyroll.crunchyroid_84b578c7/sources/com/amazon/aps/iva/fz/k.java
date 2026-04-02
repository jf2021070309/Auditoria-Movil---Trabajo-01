package com.amazon.aps.iva.fz;

import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.us.w;
/* compiled from: NotificationSettings.kt */
/* loaded from: classes2.dex */
public final class k implements j {
    public final com.amazon.aps.iva.gz.a a;
    public final com.amazon.aps.iva.bo.f b;
    public final w c;

    public k(com.amazon.aps.iva.gz.a aVar, com.amazon.aps.iva.bo.f fVar, w wVar) {
        com.amazon.aps.iva.yb0.j.f(wVar, "userSessionAnalytics");
        this.a = aVar;
        this.b = fVar;
        this.c = wVar;
    }

    @Override // com.amazon.aps.iva.fz.j
    public final void e(l lVar) {
        this.a.a(this.b.b(), lVar.getSerializedValue());
        this.c.d(j());
    }

    @Override // com.amazon.aps.iva.fz.j
    public final void h(l lVar) {
        this.a.b(this.b.b(), lVar.getSerializedValue());
        this.c.d(j());
    }

    @Override // com.amazon.aps.iva.fz.j
    public final void i() {
        l[] values;
        for (l lVar : l.values()) {
            this.a.b(this.b.b(), lVar.getSerializedValue());
        }
        this.c.d(j());
    }

    @Override // com.amazon.aps.iva.fz.j
    public final String j() {
        return x.B0(this.a.c(this.b.b()), ", ", null, null, null, 62);
    }

    @Override // com.amazon.aps.iva.fz.j
    public final void k() {
        l[] values;
        for (l lVar : l.values()) {
            this.a.a(this.b.b(), lVar.getSerializedValue());
        }
    }

    @Override // com.amazon.aps.iva.fz.j
    public final boolean l(l lVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "type");
        return !this.a.c(this.b.b()).contains(lVar.getSerializedValue());
    }
}
