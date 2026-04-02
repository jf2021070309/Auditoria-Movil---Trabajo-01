package com.amazon.aps.iva.x30;

import androidx.recyclerview.widget.RecyclerView;
import com.ellation.crunchyroll.presentation.search.result.summary.c;
/* compiled from: SearchResultSummaryFragment.kt */
/* loaded from: classes2.dex */
public final class i extends RecyclerView.u {
    public final /* synthetic */ com.ellation.crunchyroll.presentation.search.result.summary.c b;

    public i(com.ellation.crunchyroll.presentation.search.result.summary.c cVar) {
        this.b = cVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        com.amazon.aps.iva.yb0.j.f(recyclerView, "recyclerView");
        c.a aVar = com.ellation.crunchyroll.presentation.search.result.summary.c.u;
        this.b.di().l4(i2);
    }
}
