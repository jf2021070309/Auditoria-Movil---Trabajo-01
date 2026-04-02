package com.ellation.crunchyroll.downloading.queue;

import com.amazon.aps.iva.kb0.q;
/* compiled from: LocalVideosManagerQueue.kt */
/* loaded from: classes2.dex */
public final class l extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<q> {
    public final /* synthetic */ LocalVideosManagerQueueImpl h;
    public final /* synthetic */ String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(LocalVideosManagerQueueImpl localVideosManagerQueueImpl, String str) {
        super(0);
        this.h = localVideosManagerQueueImpl;
        this.i = str;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final q invoke() {
        this.h.f6(this.i);
        return q.a;
    }
}
