package com.amazon.aps.iva.d10;

import com.amazon.aps.iva.d10.k;
/* compiled from: DownloadedPanelsInteractor.kt */
/* loaded from: classes2.dex */
public final class n extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<k.a, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ i h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(i iVar) {
        super(1);
        this.h = iVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(k.a aVar) {
        k.a aVar2 = aVar;
        com.amazon.aps.iva.yb0.j.f(aVar2, "$this$notify");
        aVar2.b.invoke(this.h);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
