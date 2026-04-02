package com.amazon.aps.iva.sv;

import com.ellation.crunchyroll.downloading.queue.LocalVideosManagerQueue;
/* compiled from: DownloadsManagerFactory.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class b0 extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.p<String, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public b0(LocalVideosManagerQueue localVideosManagerQueue) {
        super(2, localVideosManagerQueue, LocalVideosManagerQueue.class, "renewLicense", "renewLicense(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(String str, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((LocalVideosManagerQueue) this.receiver).T6(str, dVar);
    }
}
