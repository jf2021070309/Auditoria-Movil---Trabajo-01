package com.amazon.aps.iva.c00;

import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: StreamsInteractor.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.content.OfflineStreamsInteractorImpl", f = "StreamsInteractor.kt", l = {97}, m = "getStreams")
/* loaded from: classes2.dex */
public final class d extends com.amazon.aps.iva.qb0.c {
    public PlayableAsset h;
    public /* synthetic */ Object i;
    public final /* synthetic */ b j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar, com.amazon.aps.iva.ob0.d<? super d> dVar) {
        super(dVar);
        this.j = bVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.m(null, this);
    }
}
