package com.ellation.crunchyroll.downloading.queue;

import com.amazon.aps.iva.kb0.q;
import com.ellation.crunchyroll.downloading.e0;
import java.util.List;
/* compiled from: LocalVideosManagerQueue.kt */
/* loaded from: classes2.dex */
public final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<List<? extends e0>, q> {
    public final /* synthetic */ LocalVideosManagerQueueImpl h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(LocalVideosManagerQueueImpl localVideosManagerQueueImpl) {
        super(1);
        this.h = localVideosManagerQueueImpl;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(List<? extends e0> list) {
        List<? extends e0> list2 = list;
        com.amazon.aps.iva.yb0.j.f(list2, "it");
        this.h.notify(new com.amazon.aps.iva.mw.c(list2));
        return q.a;
    }
}
