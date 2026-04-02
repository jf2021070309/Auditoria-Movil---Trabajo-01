package com.amazon.aps.iva.s50;

import androidx.lifecycle.p;
import com.amazon.aps.iva.yb0.l;
/* compiled from: ShowRatingView.kt */
/* loaded from: classes2.dex */
public final class a extends l implements com.amazon.aps.iva.xb0.l<p, com.amazon.aps.iva.n50.d> {
    public final /* synthetic */ com.amazon.aps.iva.m50.b h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.amazon.aps.iva.m50.b bVar) {
        super(1);
        this.h = bVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.n50.d invoke(p pVar) {
        p pVar2 = pVar;
        com.amazon.aps.iva.yb0.j.f(pVar2, "it");
        return new com.amazon.aps.iva.n50.d(pVar2, this.h);
    }
}
