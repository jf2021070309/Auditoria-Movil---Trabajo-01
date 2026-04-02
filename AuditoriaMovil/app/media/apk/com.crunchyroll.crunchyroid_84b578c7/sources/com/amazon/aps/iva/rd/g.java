package com.amazon.aps.iva.rd;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import java.util.List;
/* compiled from: WidgetsUpdateAgent.kt */
/* loaded from: classes.dex */
public final class g implements f, com.amazon.aps.iva.mf.a {
    public final com.amazon.aps.iva.rd.a b;
    public final com.amazon.aps.iva.sd.c c;

    /* compiled from: WidgetsUpdateAgent.kt */
    /* loaded from: classes.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.l<List<? extends com.amazon.aps.iva.nz.a>, q> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(List<? extends com.amazon.aps.iva.nz.a> list) {
            j.f(list, "it");
            g gVar = g.this;
            if (gVar.b.a()) {
                gVar.c.a();
            }
            return q.a;
        }
    }

    public g(com.amazon.aps.iva.rd.a aVar, com.amazon.aps.iva.sd.c cVar, com.amazon.aps.iva.nz.b bVar, com.crunchyroll.connectivity.d dVar) {
        this.b = aVar;
        this.c = cVar;
        dVar.a(this);
        bVar.a(new c(), new a());
    }

    @Override // com.amazon.aps.iva.rd.f
    public final void a() {
        this.c.a();
    }

    public final void c() {
        this.c.a();
    }

    @Override // com.amazon.aps.iva.mf.a
    public final void onConnectionRestored() {
        this.c.a();
    }

    @Override // com.amazon.aps.iva.rd.f
    public final void onSignOut() {
        this.c.a();
    }

    @Override // com.amazon.aps.iva.mf.a
    public final void onConnectionLost() {
    }

    @Override // com.amazon.aps.iva.mf.a
    public final void onConnectionRefresh(boolean z) {
    }

    @Override // com.amazon.aps.iva.mf.a
    public final void onConnectionUpdated(boolean z) {
    }
}
