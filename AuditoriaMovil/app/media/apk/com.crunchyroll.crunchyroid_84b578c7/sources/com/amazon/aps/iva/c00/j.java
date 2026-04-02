package com.amazon.aps.iva.c00;

import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: StreamsInteractor.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.content.StreamsInteractorImpl", f = "StreamsInteractor.kt", l = {53}, m = "getStreams")
/* loaded from: classes2.dex */
public final class j extends com.amazon.aps.iva.qb0.c {
    public PlayableAsset h;
    public /* synthetic */ Object i;
    public final /* synthetic */ h j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(h hVar, com.amazon.aps.iva.ob0.d<? super j> dVar) {
        super(dVar);
        this.j = hVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.m(null, false, this);
    }
}
