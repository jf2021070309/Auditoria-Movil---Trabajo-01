package com.amazon.aps.iva.hl;
/* compiled from: StreamsLimitOverlayAnalytics.kt */
/* loaded from: classes2.dex */
public final class p0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<String> {
    public static final p0 h = new p0();

    public p0() {
        super(0);
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final String invoke() {
        com.amazon.aps.iva.cj.h hVar = com.amazon.aps.iva.cj.n.e;
        if (hVar != null) {
            return ((com.amazon.aps.iva.nk.j) hVar.getState().getValue()).h.i;
        }
        com.amazon.aps.iva.yb0.j.m("player");
        throw null;
    }
}
