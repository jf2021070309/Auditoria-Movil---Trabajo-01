package com.amazon.aps.iva.x30;

import android.os.Bundle;
import com.ellation.crunchyroll.presentation.search.result.summary.SearchResultSummaryActivity;
import com.google.android.gms.actions.SearchIntents;
/* compiled from: SearchPresenter.kt */
/* loaded from: classes2.dex */
public final class b extends com.amazon.aps.iva.wy.b<z> implements a {
    public final com.amazon.aps.iva.p30.b b;

    public b(SearchResultSummaryActivity searchResultSummaryActivity, com.amazon.aps.iva.p30.b bVar) {
        super(searchResultSummaryActivity, new com.amazon.aps.iva.wy.j[0]);
        this.b = bVar;
    }

    @Override // com.amazon.aps.iva.x30.a
    public final void F(String str) {
        com.amazon.aps.iva.yb0.j.f(str, SearchIntents.EXTRA_QUERY);
        getView().Bf();
        getView().B8(str);
        if (!com.amazon.aps.iva.oe0.m.b0(str)) {
            this.b.L(str);
        } else {
            getView().bb();
        }
    }

    @Override // com.amazon.aps.iva.x30.a
    public final void onCreate(Bundle bundle) {
        if (bundle == null) {
            getView().bb();
        }
        getView().Bf();
        this.b.c();
    }
}
