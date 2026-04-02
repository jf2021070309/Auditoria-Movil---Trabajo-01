package com.amazon.aps.iva.c00;

import com.amazon.aps.iva.i50.b;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.l;
import com.ellation.crunchyroll.model.Panel;
/* compiled from: PanelContentRouter.kt */
/* loaded from: classes2.dex */
public final class g implements f {
    public final com.amazon.aps.iva.i50.b a;
    public final l<Panel, q> b;

    /* JADX WARN: Multi-variable type inference failed */
    public g(com.amazon.aps.iva.i50.b bVar, l<? super Panel, q> lVar) {
        this.a = bVar;
        this.b = lVar;
    }

    @Override // com.amazon.aps.iva.c00.f
    public final void a(Panel panel, com.amazon.aps.iva.no.a aVar) {
        com.amazon.aps.iva.yb0.j.f(panel, "panel");
        if (panel.getResourceType().isAsset()) {
            b.a.a(this.a, panel, aVar, null, 12);
        } else {
            this.b.invoke(panel);
        }
    }
}
