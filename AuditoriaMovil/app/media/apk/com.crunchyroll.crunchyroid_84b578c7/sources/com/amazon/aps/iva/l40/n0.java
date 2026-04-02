package com.amazon.aps.iva.l40;

import com.ellation.crunchyroll.model.PlayheadTimeProviderKt;
/* compiled from: ShowPagePresenter.kt */
/* loaded from: classes2.dex */
public final class n0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ v h;
    public final /* synthetic */ com.amazon.aps.iva.o00.e i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(v vVar, com.amazon.aps.iva.o00.e eVar) {
        super(0);
        this.h = vVar;
        this.i = eVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.kb0.q invoke() {
        com.amazon.aps.iva.i50.b bVar = this.h.e;
        com.amazon.aps.iva.o00.e eVar = this.i;
        bVar.b(eVar.a, PlayheadTimeProviderKt.getPlayheadMs(eVar), eVar.c, com.amazon.aps.iva.no.a.SHOW_WATCH_BUTTON);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
