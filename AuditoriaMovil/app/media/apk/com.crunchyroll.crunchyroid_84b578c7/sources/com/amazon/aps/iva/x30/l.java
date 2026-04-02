package com.amazon.aps.iva.x30;

import com.google.firebase.analytics.FirebaseAnalytics;
/* compiled from: SearchResultSummaryInteractor.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.search.result.summary.SearchResultSummaryInteractorImpl", f = "SearchResultSummaryInteractor.kt", l = {55}, m = FirebaseAnalytics.Event.SEARCH)
/* loaded from: classes2.dex */
public final class l extends com.amazon.aps.iva.qb0.c {
    public k h;
    public /* synthetic */ Object i;
    public final /* synthetic */ k j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(k kVar, com.amazon.aps.iva.ob0.d<? super l> dVar) {
        super(dVar);
        this.j = kVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.V(null, 0, this);
    }
}
