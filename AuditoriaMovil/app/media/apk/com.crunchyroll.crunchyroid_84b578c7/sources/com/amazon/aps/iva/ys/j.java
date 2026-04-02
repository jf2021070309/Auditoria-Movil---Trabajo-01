package com.amazon.aps.iva.ys;

import java.io.IOException;
/* compiled from: InitializationEventDispatcher.kt */
/* loaded from: classes2.dex */
public final class j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<l, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ Throwable h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(IOException iOException) {
        super(1);
        this.h = iOException;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(l lVar) {
        l lVar2 = lVar;
        com.amazon.aps.iva.yb0.j.f(lVar2, "$this$notify");
        lVar2.k2(this.h);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
