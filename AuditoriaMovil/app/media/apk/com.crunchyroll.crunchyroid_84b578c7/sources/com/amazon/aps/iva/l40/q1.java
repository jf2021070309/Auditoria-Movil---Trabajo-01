package com.amazon.aps.iva.l40;
/* compiled from: ShowPageViewModel.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.showpage.ShowPageViewModelImpl", f = "ShowPageViewModel.kt", l = {283}, m = "loadCta")
/* loaded from: classes2.dex */
public final class q1 extends com.amazon.aps.iva.qb0.c {
    public v1 h;
    public /* synthetic */ Object i;
    public final /* synthetic */ v1 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(v1 v1Var, com.amazon.aps.iva.ob0.d<? super q1> dVar) {
        super(dVar);
        this.j = v1Var;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return v1.O8(this.j, this);
    }
}
