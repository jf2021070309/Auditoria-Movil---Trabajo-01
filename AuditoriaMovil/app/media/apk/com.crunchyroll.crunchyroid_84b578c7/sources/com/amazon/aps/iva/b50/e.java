package com.amazon.aps.iva.b50;

import android.view.View;
/* compiled from: WatchlistCardMenuProvider.kt */
/* loaded from: classes2.dex */
public final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<View, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ h h;
    public final /* synthetic */ t i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, t tVar) {
        super(1);
        this.h = hVar;
        this.i = tVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(View view) {
        View view2 = view;
        com.amazon.aps.iva.yb0.j.f(view2, "it");
        h hVar = this.h;
        com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.f50.e, com.amazon.aps.iva.kb0.q> lVar = hVar.a;
        t tVar = this.i;
        lVar.invoke(new com.amazon.aps.iva.f50.e(tVar.a, tVar.b, hVar.d.invoke(view2)));
        return com.amazon.aps.iva.kb0.q.a;
    }
}
