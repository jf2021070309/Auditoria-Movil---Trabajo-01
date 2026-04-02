package com.amazon.aps.iva.hl;

import android.app.Activity;
import android.content.Context;
import com.amazon.aps.iva.cj.n;
import com.amazon.aps.iva.ve0.v0;
import com.crunchyroll.cast.castlistener.VideoCastController;
/* compiled from: RestrictionOverlayModule.kt */
/* loaded from: classes2.dex */
public final class b0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<androidx.lifecycle.p, o0> {
    public final /* synthetic */ com.amazon.aps.iva.tk.a h;
    public final /* synthetic */ Context i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(Context context, com.amazon.aps.iva.el.p0 p0Var) {
        super(1);
        this.h = p0Var;
        this.i = context;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final o0 invoke(androidx.lifecycle.p pVar) {
        com.amazon.aps.iva.yb0.j.f(pVar, "it");
        com.amazon.aps.iva.cj.h hVar = com.amazon.aps.iva.cj.n.e;
        if (hVar != null) {
            v0 state = hVar.getState();
            Context context = this.i;
            com.amazon.aps.iva.yb0.j.f(context, "context");
            Activity a = com.amazon.aps.iva.xw.q.a(context);
            com.amazon.aps.iva.yb0.j.d(a, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            c cVar = (c) com.amazon.aps.iva.ez.l.a((androidx.fragment.app.h) a, d.class, b.h);
            com.amazon.aps.iva.cj.p pVar2 = com.amazon.aps.iva.cj.n.f;
            if (pVar2 != null) {
                w a2 = pVar2.a();
                com.amazon.aps.iva.cj.h hVar2 = com.amazon.aps.iva.cj.n.e;
                if (hVar2 != null) {
                    s sVar = new s(a2, hVar2.e(), n.a.a().e().c());
                    com.amazon.aps.iva.ye.f castStateProvider = n.a.a().a().getCastStateProvider();
                    VideoCastController createCastController = n.a.a().a().createCastController((Activity) context);
                    com.amazon.aps.iva.yb0.j.f(state, "playerStateFlow");
                    com.amazon.aps.iva.yb0.j.f(castStateProvider, "castStateProvider");
                    com.amazon.aps.iva.yb0.j.f(createCastController, "castController");
                    return new o0(this.h, new k0(state, cVar, sVar, castStateProvider, createCastController));
                }
                com.amazon.aps.iva.yb0.j.m("player");
                throw null;
            }
            com.amazon.aps.iva.yb0.j.m("feature");
            throw null;
        }
        com.amazon.aps.iva.yb0.j.m("player");
        throw null;
    }
}
