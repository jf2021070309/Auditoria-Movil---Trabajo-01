package com.ellation.crunchyroll.downloading.queue;

import com.amazon.aps.iva.kb0.q;
import com.ellation.crunchyroll.downloading.e0;
/* compiled from: LocalVideosManagerQueue.kt */
/* loaded from: classes2.dex */
public final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<e0, q> {
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<e0, q> h;
    public final /* synthetic */ LocalVideosManagerQueueImpl i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(LocalVideosManagerQueueImpl localVideosManagerQueueImpl, com.amazon.aps.iva.xb0.l lVar) {
        super(1);
        this.h = lVar;
        this.i = localVideosManagerQueueImpl;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(e0 e0Var) {
        e0 e0Var2 = e0Var;
        com.amazon.aps.iva.yb0.j.f(e0Var2, "it");
        this.h.invoke(LocalVideosManagerQueueImpl.a(this.i, e0Var2));
        return q.a;
    }
}
