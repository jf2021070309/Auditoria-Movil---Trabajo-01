package com.amazon.aps.iva.el;

import android.content.Context;
import com.amazon.aps.iva.ve0.u0;
import com.crunchyroll.player.presentation.playerview.InternalPlayerViewLayout;
/* compiled from: InternalPlayerViewLayout.kt */
/* loaded from: classes2.dex */
public final class y extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<androidx.lifecycle.p, com.amazon.aps.iva.kl.r> {
    public final /* synthetic */ InternalPlayerViewLayout h;
    public final /* synthetic */ Context i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(InternalPlayerViewLayout internalPlayerViewLayout, Context context) {
        super(1);
        this.h = internalPlayerViewLayout;
        this.i = context;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kl.r invoke(androidx.lifecycle.p pVar) {
        p0 viewModel;
        p0 viewModel2;
        com.amazon.aps.iva.dl.d controlsVisibilityViewModel;
        com.amazon.aps.iva.yb0.j.f(pVar, "it");
        InternalPlayerViewLayout internalPlayerViewLayout = this.h;
        viewModel = internalPlayerViewLayout.getViewModel();
        com.amazon.aps.iva.ve0.f a = com.amazon.aps.iva.i5.j.a(viewModel.e);
        viewModel2 = internalPlayerViewLayout.getViewModel();
        u0<com.amazon.aps.iva.kj.e> u0Var = viewModel2.f;
        controlsVisibilityViewModel = internalPlayerViewLayout.getControlsVisibilityViewModel();
        com.amazon.aps.iva.ve0.f a2 = com.amazon.aps.iva.i5.j.a(controlsVisibilityViewModel.d);
        com.amazon.aps.iva.ql.g gVar = com.amazon.aps.iva.ql.g.g;
        if (gVar != null) {
            com.amazon.aps.iva.yy.a aVar = gVar.d;
            com.amazon.aps.iva.cj.h hVar = com.amazon.aps.iva.cj.n.e;
            if (hVar != null) {
                com.amazon.aps.iva.ij.g e = hVar.e();
                Context context = this.i;
                com.amazon.aps.iva.yb0.j.f(context, "context");
                com.amazon.aps.iva.kl.t tVar = new com.amazon.aps.iva.kl.t(context, new com.amazon.aps.iva.mt.m(context));
                com.amazon.aps.iva.cj.h hVar2 = com.amazon.aps.iva.cj.n.e;
                if (hVar2 != null) {
                    return new com.amazon.aps.iva.kl.r(a, u0Var, a2, aVar, e, tVar, hVar2.a());
                }
                com.amazon.aps.iva.yb0.j.m("player");
                throw null;
            }
            com.amazon.aps.iva.yb0.j.m("player");
            throw null;
        }
        com.amazon.aps.iva.yb0.j.m("instance");
        throw null;
    }
}
