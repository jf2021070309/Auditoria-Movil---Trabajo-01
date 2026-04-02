package com.amazon.aps.iva.v30;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.presentation.search.result.detail.SearchResultDetailActivity;
/* compiled from: SearchResultDetailActivity.kt */
/* loaded from: classes2.dex */
public final class c extends GridLayoutManager.c {
    public final /* synthetic */ SearchResultDetailActivity c;

    public c(SearchResultDetailActivity searchResultDetailActivity) {
        this.c = searchResultDetailActivity;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.c
    public final int c(int i) {
        SearchResultDetailActivity.a aVar = SearchResultDetailActivity.D;
        SearchResultDetailActivity searchResultDetailActivity = this.c;
        com.amazon.aps.iva.s30.h d = searchResultDetailActivity.pi().d(i);
        com.amazon.aps.iva.yb0.j.e(d, "super.getItem(position)");
        com.amazon.aps.iva.s30.h hVar = d;
        if (hVar instanceof com.amazon.aps.iva.s30.c) {
            return searchResultDetailActivity.getResources().getInteger(R.integer.episode_search_result_column_span);
        }
        if (hVar instanceof com.amazon.aps.iva.s30.a) {
            return searchResultDetailActivity.getResources().getInteger(R.integer.series_search_result_column_span);
        }
        if (hVar instanceof com.amazon.aps.iva.s30.j) {
            return searchResultDetailActivity.getResources().getInteger(R.integer.music_search_result_column_span);
        }
        RecyclerView.p layoutManager = searchResultDetailActivity.oi().getLayoutManager();
        com.amazon.aps.iva.yb0.j.d(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        return ((GridLayoutManager) layoutManager).b;
    }
}
