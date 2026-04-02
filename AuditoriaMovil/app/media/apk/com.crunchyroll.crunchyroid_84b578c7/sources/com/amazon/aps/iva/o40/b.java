package com.amazon.aps.iva.o40;
/* compiled from: ShowContentInteractor.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.showpage.interactor.OfflineShowContentInteractorImpl", f = "ShowContentInteractor.kt", l = {204, 206}, m = "getContentContainer")
/* loaded from: classes2.dex */
public final class b extends com.amazon.aps.iva.qb0.c {
    public a h;
    public /* synthetic */ Object i;
    public final /* synthetic */ a j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, com.amazon.aps.iva.ob0.d<? super b> dVar) {
        super(dVar);
        this.j = aVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.f(this);
    }
}
