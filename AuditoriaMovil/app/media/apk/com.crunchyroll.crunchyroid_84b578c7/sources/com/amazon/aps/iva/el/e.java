package com.amazon.aps.iva.el;

import com.crunchyroll.player.presentation.playerview.InternalPlayerViewLayout;
/* compiled from: InternalPlayerViewLayout.kt */
/* loaded from: classes2.dex */
public final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ InternalPlayerViewLayout h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(InternalPlayerViewLayout internalPlayerViewLayout) {
        super(0);
        this.h = internalPlayerViewLayout;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.kb0.q invoke() {
        b0 b0Var = this.h.D;
        if (b0Var != null) {
            b0Var.G4();
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
