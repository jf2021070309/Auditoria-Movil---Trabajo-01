package com.amazon.aps.iva.ex;

import com.amazon.aps.iva.gn.c;
import com.amazon.aps.iva.i50.b;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.presentation.showpage.ShowPageActivity;
/* compiled from: CrunchylistsFeatureFactory.kt */
/* loaded from: classes2.dex */
public final class e implements com.amazon.aps.iva.xu.e {
    public final /* synthetic */ androidx.fragment.app.h a;

    public e(androidx.fragment.app.h hVar) {
        this.a = hVar;
    }

    @Override // com.amazon.aps.iva.xu.e
    public final void a(Panel panel) {
        j.f(panel, "panel");
        androidx.fragment.app.h hVar = this.a;
        j.f(hVar, "context");
        b.a.a(new com.amazon.aps.iva.i50.c(hVar, new com.amazon.aps.iva.i50.a(hVar, true)), panel, com.amazon.aps.iva.no.a.OVERFLOW_WATCH_NOW, null, 12);
    }

    @Override // com.amazon.aps.iva.xu.e
    public final void b(Panel panel) {
        j.f(panel, "panel");
        h.a.getClass();
        g gVar = new g(this.a);
        com.amazon.aps.iva.ts.b.a.getClass();
        c.a.a(gVar, com.amazon.aps.iva.ts.a.j).V(panel);
    }

    @Override // com.amazon.aps.iva.xu.e
    public final void t(Panel panel) {
        j.f(panel, "panel");
        ShowPageActivity.K.getClass();
        ShowPageActivity.a.a(this.a, panel);
    }
}
