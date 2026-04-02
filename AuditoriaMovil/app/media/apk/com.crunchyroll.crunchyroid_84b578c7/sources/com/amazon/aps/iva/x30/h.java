package com.amazon.aps.iva.x30;

import androidx.recyclerview.widget.GridLayoutManager;
import com.crunchyroll.crunchyroid.R;
/* compiled from: SearchResultSummaryFragment.kt */
/* loaded from: classes2.dex */
public final class h extends GridLayoutManager.c {
    public final /* synthetic */ com.ellation.crunchyroll.presentation.search.result.summary.c c;

    public h(com.ellation.crunchyroll.presentation.search.result.summary.c cVar) {
        this.c = cVar;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.c
    public final int c(int i) {
        boolean z;
        com.ellation.crunchyroll.presentation.search.result.summary.c cVar = this.c;
        com.amazon.aps.iva.s30.g gVar = cVar.j;
        if (gVar != null) {
            com.amazon.aps.iva.s30.h d = gVar.d(i);
            com.amazon.aps.iva.yb0.j.e(d, "super.getItem(position)");
            com.amazon.aps.iva.s30.h hVar = d;
            if (hVar instanceof com.amazon.aps.iva.s30.m) {
                z = true;
            } else {
                z = hVar instanceof com.amazon.aps.iva.s30.l;
            }
            if (z) {
                return cVar.getResources().getInteger(R.integer.top_search_result_column_span);
            }
            if (hVar instanceof com.amazon.aps.iva.s30.a) {
                return cVar.getResources().getInteger(R.integer.series_search_result_column_span);
            }
            if (hVar instanceof com.amazon.aps.iva.s30.c) {
                return cVar.getResources().getInteger(R.integer.episode_search_result_column_span);
            }
            if (hVar instanceof com.amazon.aps.iva.s30.j) {
                return cVar.getResources().getInteger(R.integer.music_search_result_column_span);
            }
            GridLayoutManager gridLayoutManager = cVar.k;
            if (gridLayoutManager != null) {
                return gridLayoutManager.b;
            }
            com.amazon.aps.iva.yb0.j.m("layoutManager");
            throw null;
        }
        com.amazon.aps.iva.yb0.j.m("searchResultAdapter");
        throw null;
    }
}
