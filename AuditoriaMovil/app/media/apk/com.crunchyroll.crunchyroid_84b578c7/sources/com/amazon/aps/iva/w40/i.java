package com.amazon.aps.iva.w40;

import com.amazon.aps.iva.uz.h;
/* compiled from: SimulcastAdapter.kt */
/* loaded from: classes2.dex */
public final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ l h;
    public final /* synthetic */ com.amazon.aps.iva.uz.h i;
    public final /* synthetic */ int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(l lVar, com.amazon.aps.iva.uz.h hVar, int i) {
        super(0);
        this.h = lVar;
        this.i = hVar;
        this.j = i;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.kb0.q invoke() {
        this.h.c.invoke(((h.c.C0774c) this.i).c, Integer.valueOf(this.j));
        return com.amazon.aps.iva.kb0.q.a;
    }
}
