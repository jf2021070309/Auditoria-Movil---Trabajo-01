package com.amazon.aps.iva.l00;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.ellation.crunchyroll.presentation.content.panel.PanelFeedRecyclerView;
/* compiled from: ViewExtensions.kt */
/* loaded from: classes2.dex */
public final class a implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ View b;
    public final /* synthetic */ int c;

    public a(View view, int i) {
        this.b = view;
        this.c = i;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        StaggeredGridLayoutManager gridLayoutManager;
        View view = this.b;
        if (view.getViewTreeObserver().isAlive() && view.getMeasuredWidth() > 0 && view.getMeasuredHeight() > 0) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            PanelFeedRecyclerView panelFeedRecyclerView = (PanelFeedRecyclerView) view;
            gridLayoutManager = panelFeedRecyclerView.getGridLayoutManager();
            gridLayoutManager.v(this.c);
            RecyclerView.h adapter = panelFeedRecyclerView.getAdapter();
            if (adapter != null) {
                adapter.notifyDataSetChanged();
            }
        }
    }
}
