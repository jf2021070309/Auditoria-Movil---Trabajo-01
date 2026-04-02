package com.amazon.aps.iva.yw;

import com.amazon.aps.iva.e4.l1;
/* compiled from: FeaturesProvider.kt */
/* loaded from: classes2.dex */
public final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ d0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(d0 d0Var) {
        super(0);
        this.h = d0Var;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.kb0.q invoke() {
        this.h.w.getClass();
        com.amazon.aps.iva.oy.b bVar = l1.c;
        if (bVar != null) {
            bVar.r5();
            return com.amazon.aps.iva.kb0.q.a;
        }
        com.amazon.aps.iva.yb0.j.m("inAppUpdatesManager");
        throw null;
    }
}
