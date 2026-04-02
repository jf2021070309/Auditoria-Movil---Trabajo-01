package com.ellation.crunchyroll.presentation.watchlist;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import kotlin.Metadata;
/* compiled from: WatchlistRecyclerView.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"Lcom/ellation/crunchyroll/presentation/watchlist/WatchlistRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroidx/recyclerview/widget/GridLayoutManager;", "getLayoutManager", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class WatchlistRecyclerView extends RecyclerView {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WatchlistRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        j.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatchlistRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j.f(context, "context");
        setHasFixedSize(true);
        setLayoutManager(new GridLayoutManager(context, getResources().getInteger(R.integer.watchlist_columns)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public GridLayoutManager getLayoutManager() {
        RecyclerView.p layoutManager = super.getLayoutManager();
        j.d(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        return (GridLayoutManager) layoutManager;
    }
}
