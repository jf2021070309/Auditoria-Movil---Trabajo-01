package com.amazon.aps.iva.x20;

import com.amazon.aps.iva.i20.d;
import com.amazon.aps.iva.k50.j;
import com.amazon.aps.iva.us.u;
import com.amazon.aps.iva.us.v;
/* compiled from: CrPlusFreeMembershipPlanPresenter.kt */
/* loaded from: classes2.dex */
public final class c extends com.amazon.aps.iva.wy.b<Object> implements b {
    public final u b;
    public final com.amazon.aps.iva.i20.c c;
    public final j d;

    public c(a aVar, v vVar, d dVar, j jVar) {
        super(aVar, new com.amazon.aps.iva.wy.j[0]);
        this.b = vVar;
        this.c = dVar;
        this.d = jVar;
    }

    @Override // com.amazon.aps.iva.x20.b
    public final void j(com.amazon.aps.iva.fs.b bVar) {
        u.a.a(this.b, bVar, null, 6);
        j.a.a(this.d, null, 3);
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        this.c.c();
    }
}
