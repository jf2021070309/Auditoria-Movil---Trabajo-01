package com.amazon.aps.iva.tz;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.crunchyroll.crunchyroid.R;
/* compiled from: BrowseAllSpacingDecorator.kt */
/* loaded from: classes2.dex */
public final class h0 extends RecyclerView.o {
    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        int dimensionPixelSize;
        int dimensionPixelSize2;
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
        int itemViewType = adapter.getItemViewType(childAdapterPosition);
        int dimensionPixelSize3 = recyclerView.getResources().getDimensionPixelSize(R.dimen.browse_all_card_item_spacing);
        if (itemViewType != 10) {
            if (itemViewType != 11) {
                dimensionPixelSize = dimensionPixelSize3;
            } else if (childAdapterPosition == 0) {
                dimensionPixelSize = recyclerView.getResources().getDimensionPixelSize(R.dimen.browse_all_newest_list_spacing_top);
            } else {
                dimensionPixelSize = recyclerView.getResources().getDimensionPixelSize(R.dimen.browse_all_section_item_spacing_top);
            }
        } else if (childAdapterPosition == 0) {
            dimensionPixelSize = recyclerView.getResources().getDimensionPixelSize(R.dimen.browse_all_list_spacing_top);
        } else {
            dimensionPixelSize = recyclerView.getResources().getDimensionPixelSize(R.dimen.browse_all_section_item_spacing_top);
        }
        if (itemViewType != 10 && itemViewType != 11) {
            dimensionPixelSize2 = dimensionPixelSize3;
        } else {
            dimensionPixelSize2 = recyclerView.getResources().getDimensionPixelSize(R.dimen.browse_all_section_item_bottom_spacing);
        }
        rect.set(dimensionPixelSize3, dimensionPixelSize, dimensionPixelSize3, dimensionPixelSize2);
    }
}
