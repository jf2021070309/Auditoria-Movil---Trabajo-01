package com.amazon.aps.iva.bw;

import com.google.zxing.aztec.encoder.Encoder;
/* compiled from: SecureDownloadingStreamsInteractor.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.drm.SecureDownloadingStreamsInteractorImpl", f = "SecureDownloadingStreamsInteractor.kt", l = {Encoder.DEFAULT_EC_PERCENT}, m = "getStreams")
/* loaded from: classes2.dex */
public final class o extends com.amazon.aps.iva.qb0.c {
    public String h;
    public /* synthetic */ Object i;
    public final /* synthetic */ p j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, com.amazon.aps.iva.ob0.d<? super o> dVar) {
        super(dVar);
        this.j = pVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(null, this);
    }
}
