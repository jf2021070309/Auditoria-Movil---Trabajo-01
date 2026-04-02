package com.amazon.aps.iva.gy;
/* compiled from: HomeFeedInteractor.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.feed.interactor.HomeFeedInteractorImpl", f = "HomeFeedInteractor.kt", l = {157}, m = "loadPanels")
/* loaded from: classes2.dex */
public final class i extends com.amazon.aps.iva.qb0.c {
    public /* synthetic */ Object h;
    public final /* synthetic */ h i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(h hVar, com.amazon.aps.iva.ob0.d<? super i> dVar) {
        super(dVar);
        this.i = hVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return h.C(this.i, null, this);
    }
}
