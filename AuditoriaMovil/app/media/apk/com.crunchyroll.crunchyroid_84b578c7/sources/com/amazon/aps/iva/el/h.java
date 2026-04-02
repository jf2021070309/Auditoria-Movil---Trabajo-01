package com.amazon.aps.iva.el;

import com.amazon.aps.iva.o0.e0;
import com.crunchyroll.player.presentation.playerview.InternalPlayerViewLayout;
/* compiled from: InternalPlayerViewLayout.kt */
/* loaded from: classes2.dex */
public final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ InternalPlayerViewLayout h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(InternalPlayerViewLayout internalPlayerViewLayout) {
        super(2);
        this.h = internalPlayerViewLayout;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
        com.amazon.aps.iva.o0.i iVar2 = iVar;
        if ((num.intValue() & 11) == 2 && iVar2.h()) {
            iVar2.A();
        } else {
            e0.b bVar = com.amazon.aps.iva.o0.e0.a;
            InternalPlayerViewLayout internalPlayerViewLayout = this.h;
            com.amazon.aps.iva.hl.e.a(internalPlayerViewLayout.K, new e(internalPlayerViewLayout), new f(internalPlayerViewLayout), new g(internalPlayerViewLayout), null, null, null, null, null, null, iVar2, 0, 1008);
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
