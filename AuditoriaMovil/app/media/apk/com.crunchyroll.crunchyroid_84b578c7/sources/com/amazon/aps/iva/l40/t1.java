package com.amazon.aps.iva.l40;
/* compiled from: ShowPageViewModel.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.showpage.ShowPageViewModelImpl", f = "ShowPageViewModel.kt", l = {139, 141, 150}, m = "loadSeasons")
/* loaded from: classes2.dex */
public final class t1 extends com.amazon.aps.iva.qb0.c {
    public v1 h;
    public Object i;
    public Object j;
    public /* synthetic */ Object k;
    public final /* synthetic */ v1 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(v1 v1Var, com.amazon.aps.iva.ob0.d<? super t1> dVar) {
        super(dVar);
        this.l = v1Var;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return v1.P8(this.l, null, null, this);
    }
}
