package com.amazon.aps.iva.dw;

import com.ellation.crunchyroll.downloading.e0;
import com.ellation.crunchyroll.downloading.exoplayer.ExoPlayerLocalVideosManagerImpl;
/* compiled from: ExoPlayerLocalVideosManagerImpl.kt */
/* loaded from: classes2.dex */
public final class n extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<e0, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ ExoPlayerLocalVideosManagerImpl h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ExoPlayerLocalVideosManagerImpl exoPlayerLocalVideosManagerImpl) {
        super(1);
        this.h = exoPlayerLocalVideosManagerImpl;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(e0 e0Var) {
        e0 e0Var2 = e0Var;
        com.amazon.aps.iva.yb0.j.f(e0Var2, "it");
        this.h.notify(new m(e0Var2));
        return com.amazon.aps.iva.kb0.q.a;
    }
}
