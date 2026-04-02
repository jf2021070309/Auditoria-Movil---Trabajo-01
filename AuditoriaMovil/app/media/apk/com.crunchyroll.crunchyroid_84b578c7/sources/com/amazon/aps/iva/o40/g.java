package com.amazon.aps.iva.o40;

import com.google.android.gms.cast.MediaError;
/* compiled from: ShowContentInteractor.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.showpage.interactor.ShowContentInteractorImpl", f = "ShowContentInteractor.kt", l = {MediaError.DetailedErrorCode.SEGMENT_NETWORK, 115}, m = "getContentContainer")
/* loaded from: classes2.dex */
public final class g extends com.amazon.aps.iva.qb0.c {
    public h h;
    public com.amazon.aps.iva.ze0.c i;
    public /* synthetic */ Object j;
    public final /* synthetic */ h k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, com.amazon.aps.iva.ob0.d<? super g> dVar) {
        super(dVar);
        this.k = hVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.f(this);
    }
}
