package com.amazon.aps.iva.wl;

import com.amazon.aps.iva.p60.f;
import com.amazon.aps.iva.ql.a;
import com.amazon.aps.iva.ve0.v0;
import com.ellation.crunchyroll.api.GsonHolder;
/* compiled from: PlayerSubtitlesSettingsViewModel.kt */
/* loaded from: classes2.dex */
public final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<androidx.lifecycle.p, h> {
    public final /* synthetic */ androidx.fragment.app.h h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(androidx.fragment.app.h hVar) {
        super(1);
        this.h = hVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final h invoke(androidx.lifecycle.p pVar) {
        com.amazon.aps.iva.yb0.j.f(pVar, "it");
        androidx.fragment.app.h hVar = this.h;
        com.amazon.aps.iva.yb0.j.f(hVar, "context");
        com.amazon.aps.iva.lh.c cVar = com.amazon.aps.iva.lh.f.a;
        v0 v0Var = null;
        if (cVar != null) {
            com.amazon.aps.iva.lh.b bVar = new com.amazon.aps.iva.lh.b(cVar, new com.amazon.aps.iva.jh.h(com.amazon.aps.iva.o60.e.a(hVar)), f.a.a(hVar, GsonHolder.getInstance()));
            com.amazon.aps.iva.cj.h hVar2 = com.amazon.aps.iva.cj.n.e;
            if (hVar2 != null) {
                if (hVar2.c() != null) {
                    com.amazon.aps.iva.cj.h hVar3 = com.amazon.aps.iva.cj.n.e;
                    if (hVar3 != null) {
                        v0Var = hVar3.getState();
                    } else {
                        com.amazon.aps.iva.yb0.j.m("player");
                        throw null;
                    }
                }
                return new h(new d(bVar, v0Var), a.C0647a.a());
            }
            com.amazon.aps.iva.yb0.j.m("player");
            throw null;
        }
        com.amazon.aps.iva.yb0.j.m("store");
        throw null;
    }
}
