package com.amazon.aps.iva.ji;

import com.amazon.aps.iva.ob0.d;
import com.amazon.aps.iva.qb0.e;
import com.google.zxing.aztec.encoder.Encoder;
/* compiled from: WatchMusicInteractor.kt */
@e(c = "com.crunchyroll.music.watch.WatchMusicInteractorImpl", f = "WatchMusicInteractor.kt", l = {32, Encoder.DEFAULT_EC_PERCENT}, m = "getMusicAsset")
/* loaded from: classes.dex */
public final class c extends com.amazon.aps.iva.qb0.c {
    public /* synthetic */ Object h;
    public final /* synthetic */ b i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, d<? super c> dVar) {
        super(dVar);
        this.i = bVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.v0(null, null, this);
    }
}
