package com.ellation.crunchyroll.downloading.queue;

import com.amazon.aps.iva.kb0.q;
import com.ellation.crunchyroll.downloading.e0;
/* compiled from: LocalVideosManagerQueue.kt */
/* loaded from: classes2.dex */
public final class j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Throwable, q> {
    public final /* synthetic */ LocalVideosManagerQueueImpl h;
    public final /* synthetic */ e0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(LocalVideosManagerQueueImpl localVideosManagerQueueImpl, e0 e0Var) {
        super(1);
        this.h = localVideosManagerQueueImpl;
        this.i = e0Var;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(Throwable th) {
        com.amazon.aps.iva.yb0.j.f(th, "it");
        LocalVideosManagerQueueImpl localVideosManagerQueueImpl = this.h;
        if (!localVideosManagerQueueImpl.f) {
            localVideosManagerQueueImpl.c.p(this.i.e());
        }
        return q.a;
    }
}
