package com.amazon.aps.iva.n10;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.crunchyroll.crunchyroid.R;
/* compiled from: GenreFeedSpacingItemDecoration.kt */
/* loaded from: classes2.dex */
public final class g extends RecyclerView.o {
    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        boolean z;
        int dimensionPixelSize;
        com.amazon.aps.iva.yb0.j.f(rect, "outRect");
        com.amazon.aps.iva.yb0.j.f(view, "view");
        com.amazon.aps.iva.yb0.j.f(recyclerView, "parent");
        com.amazon.aps.iva.yb0.j.f(b0Var, "state");
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == -1) {
            return;
        }
        RecyclerView.h adapter = recyclerView.getAdapter();
        com.amazon.aps.iva.yb0.j.c(adapter);
        if (adapter.getItemViewType(childAdapterPosition) == 1014) {
            dimensionPixelSize = 0;
        } else {
            RecyclerView.h adapter2 = recyclerView.getAdapter();
            com.amazon.aps.iva.yb0.j.c(adapter2);
            boolean z2 = true;
            if (adapter2.getItemViewType(0) == 1014) {
                z = true;
            } else {
                z = false;
            }
            if (!z ? childAdapterPosition != 0 : childAdapterPosition != 1) {
                z2 = false;
            }
            if (z2) {
                dimensionPixelSize = recyclerView.getResources().getDimensionPixelSize(R.dimen.subgenre_carousel_margin_top);
            } else {
                dimensionPixelSize = recyclerView.getResources().getDimensionPixelSize(R.dimen.first_subgenre_carousel_margin_top);
            }
        }
        rect.set(0, dimensionPixelSize, 0, 0);
    }
}
