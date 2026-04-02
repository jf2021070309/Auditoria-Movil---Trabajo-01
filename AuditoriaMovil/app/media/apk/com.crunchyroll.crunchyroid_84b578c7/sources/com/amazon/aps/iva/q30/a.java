package com.amazon.aps.iva.q30;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.crunchyroll.crunchyroid.R;
/* compiled from: RecentSearchesView.kt */
/* loaded from: classes2.dex */
public final class a extends RecyclerView.o {
    public final int a;
    public final int b;

    public a(Resources resources) {
        this.a = resources.getDimensionPixelOffset(R.dimen.recent_search_item_margin_right);
        this.b = resources.getDimensionPixelOffset(R.dimen.recent_search_item_margin_bottom);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        com.amazon.aps.iva.yb0.j.f(rect, "outRect");
        com.amazon.aps.iva.yb0.j.f(view, "view");
        com.amazon.aps.iva.yb0.j.f(recyclerView, "parent");
        com.amazon.aps.iva.yb0.j.f(b0Var, "state");
        rect.left = 0;
        rect.right = this.a;
        rect.top = 0;
        rect.bottom = this.b;
    }
}
