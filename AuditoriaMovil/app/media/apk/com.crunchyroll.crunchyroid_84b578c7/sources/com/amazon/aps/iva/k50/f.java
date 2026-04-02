package com.amazon.aps.iva.k50;

import com.ellation.crunchyroll.model.Panel;
/* compiled from: PanelContentRouter.kt */
/* loaded from: classes2.dex */
public final class f implements e {
    public final n a;
    public final h b;

    public f(com.amazon.aps.iva.ix.l lVar, com.amazon.aps.iva.ix.j jVar) {
        this.a = lVar;
        this.b = jVar;
    }

    @Override // com.amazon.aps.iva.k50.n
    public final void a(long j, Panel panel, boolean z) {
        com.amazon.aps.iva.yb0.j.f(panel, "panel");
        if (panel.getResourceType().isAsset()) {
            this.a.a(j, panel, z);
        } else {
            this.b.t(panel);
        }
    }

    @Override // com.amazon.aps.iva.k50.n
    public final void b(Panel panel) {
        com.amazon.aps.iva.yb0.j.f(panel, "panel");
        if (panel.getResourceType().isAsset()) {
            this.a.b(panel);
        } else {
            this.b.t(panel);
        }
    }

    @Override // com.amazon.aps.iva.k50.n
    public final void c(long j, Panel panel, boolean z) {
        com.amazon.aps.iva.yb0.j.f(panel, "panel");
        if (panel.getResourceType().isAsset()) {
            this.a.c(j, panel, z);
        } else {
            this.b.t(panel);
        }
    }

    @Override // com.amazon.aps.iva.k50.n
    public final void d(Panel panel) {
        com.amazon.aps.iva.yb0.j.f(panel, "panel");
        if (panel.getResourceType().isAsset()) {
            this.a.d(panel);
        } else {
            this.b.t(panel);
        }
    }
}
