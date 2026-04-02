package com.amazon.aps.iva.gy;
/* compiled from: PanelItemInteractor.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.feed.interactor.PanelItemInteractor", f = "PanelItemInteractor.kt", l = {95}, m = "getUpNext")
/* loaded from: classes2.dex */
public final class u extends com.amazon.aps.iva.qb0.c {
    public /* synthetic */ Object h;
    public final /* synthetic */ v i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar, com.amazon.aps.iva.ob0.d<? super u> dVar) {
        super(dVar);
        this.i = vVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.C(null, null, this);
    }
}
