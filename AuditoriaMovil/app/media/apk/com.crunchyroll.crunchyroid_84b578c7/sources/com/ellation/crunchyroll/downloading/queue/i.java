package com.ellation.crunchyroll.downloading.queue;

import com.amazon.aps.iva.kb0.q;
import com.ellation.crunchyroll.api.cms.model.streams.Stream;
import com.ellation.crunchyroll.downloading.e0;
/* compiled from: LocalVideosManagerQueue.kt */
/* loaded from: classes2.dex */
public final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Stream, q> {
    public final /* synthetic */ LocalVideosManagerQueueImpl h;
    public final /* synthetic */ e0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(LocalVideosManagerQueueImpl localVideosManagerQueueImpl, e0 e0Var) {
        super(1);
        this.h = localVideosManagerQueueImpl;
        this.i = e0Var;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(Stream stream) {
        Stream stream2 = stream;
        com.amazon.aps.iva.yb0.j.f(stream2, "stream");
        e0 e0Var = this.i;
        com.amazon.aps.iva.mw.e eVar = new com.amazon.aps.iva.mw.e(e0Var);
        LocalVideosManagerQueueImpl localVideosManagerQueueImpl = this.h;
        localVideosManagerQueueImpl.notify(eVar);
        localVideosManagerQueueImpl.b.j4(e0Var.e(), stream2);
        return q.a;
    }
}
