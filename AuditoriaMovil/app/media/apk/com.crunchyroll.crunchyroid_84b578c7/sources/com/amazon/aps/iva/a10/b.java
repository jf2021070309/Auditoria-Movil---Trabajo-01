package com.amazon.aps.iva.a10;

import com.amazon.aps.iva.wy.j;
import com.amazon.aps.iva.x50.m;
/* compiled from: SyncingStartedMessagePresenter.kt */
/* loaded from: classes2.dex */
public final class b extends com.amazon.aps.iva.wy.b<c> {
    public final com.amazon.aps.iva.p00.a b;
    public final m c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.amazon.aps.iva.p00.a aVar, c cVar, m mVar) {
        super(cVar, new j[0]);
        com.amazon.aps.iva.yb0.j.f(cVar, "view");
        this.b = aVar;
        this.c = mVar;
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onDestroy() {
        this.c.a();
    }
}
