package com.amazon.aps.iva.el;

import com.crunchyroll.player.presentation.playerview.InternalPlayerViewLayout;
/* compiled from: PlayerGesturesLayout.kt */
/* loaded from: classes2.dex */
public final class g0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Integer, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ InternalPlayerViewLayout h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(InternalPlayerViewLayout internalPlayerViewLayout) {
        super(1);
        this.h = internalPlayerViewLayout;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(Integer num) {
        this.h.setResizeMode(num.intValue());
        return com.amazon.aps.iva.kb0.q.a;
    }
}
