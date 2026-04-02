package com.ellation.crunchyroll.cast.skipnext;

import com.amazon.aps.iva.ob0.d;
import com.amazon.aps.iva.qb0.c;
import com.amazon.aps.iva.qb0.e;
import kotlin.Metadata;
/* compiled from: CastNextInteractor.kt */
@e(c = "com.ellation.crunchyroll.cast.skipnext.CastNextInteractorImpl", f = "CastNextInteractor.kt", l = {31, 32}, m = "preloadNextEpisodeData")
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CastNextInteractorImpl$preloadNextEpisodeData$1 extends c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CastNextInteractorImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CastNextInteractorImpl$preloadNextEpisodeData$1(CastNextInteractorImpl castNextInteractorImpl, d<? super CastNextInteractorImpl$preloadNextEpisodeData$1> dVar) {
        super(dVar);
        this.this$0 = castNextInteractorImpl;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.preloadNextEpisodeData(null, this);
    }
}
