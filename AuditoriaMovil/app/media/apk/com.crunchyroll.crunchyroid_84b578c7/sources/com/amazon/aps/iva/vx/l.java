package com.amazon.aps.iva.vx;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.crunchyroll.crunchyroid.R;
/* compiled from: HomeFeedView.kt */
/* loaded from: classes2.dex */
public final class l extends RecyclerView.o {
    public final int a;

    public l(Resources resources) {
        this.a = resources.getDimensionPixelOffset(R.dimen.feed_item_vertical_spacing);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        com.amazon.aps.iva.yb0.j.f(rect, "outRect");
        com.amazon.aps.iva.yb0.j.f(view, "view");
        com.amazon.aps.iva.yb0.j.f(recyclerView, "parent");
        com.amazon.aps.iva.yb0.j.f(b0Var, "state");
        if (recyclerView.getChildAdapterPosition(view) == 0) {
            return;
        }
        rect.set(0, 0, 0, this.a);
    }
}
