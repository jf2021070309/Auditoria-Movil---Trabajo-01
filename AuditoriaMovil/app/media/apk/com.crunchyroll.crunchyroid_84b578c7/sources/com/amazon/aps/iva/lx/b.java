package com.amazon.aps.iva.lx;

import com.amazon.aps.iva.cx.p;
import com.amazon.aps.iva.n60.b;
import com.amazon.aps.iva.yb0.i;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.application.a;
/* compiled from: MusicFeatureFactory.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class b extends i implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.n60.b> {
    public b(d dVar) {
        super(0, dVar, d.class, "getScreenReloadDebouncer", "getScreenReloadDebouncer()Lcom/ellation/feature/screensreloading/ScreenReloadDebouncer;", 0);
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.n60.b invoke() {
        d dVar = d.a;
        ((d) this.receiver).getClass();
        com.ellation.crunchyroll.application.a aVar = a.C0959a.a;
        if (aVar != null) {
            Object c = aVar.c().c(p.class, "app_resume_screens_reload_intervals");
            if (c != null) {
                return b.a.a((p) c);
            }
            throw new NullPointerException("null cannot be cast to non-null type com.ellation.crunchyroll.features.configs.ScreenReloadIntervalsImpl");
        }
        j.m("instance");
        throw null;
    }
}
