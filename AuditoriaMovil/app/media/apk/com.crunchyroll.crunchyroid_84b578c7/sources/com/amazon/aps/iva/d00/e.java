package com.amazon.aps.iva.d00;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.xw.t0;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
/* compiled from: AssetsSpacingDecoration.kt */
/* loaded from: classes2.dex */
public final class e extends RecyclerView.o {
    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        int a;
        j.f(rect, "outRect");
        j.f(view, "view");
        j.f(recyclerView, "parent");
        j.f(b0Var, "state");
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int a2 = t0.a(R.dimen.show_page_asset_card_margin_horizontal, recyclerView);
        if (childAdapterPosition == -1) {
            rect.set(a2, rect.top, a2, rect.bottom);
            return;
        }
        RecyclerView.h adapter = recyclerView.getAdapter();
        j.c(adapter);
        int itemViewType = adapter.getItemViewType(childAdapterPosition);
        if (itemViewType != 101 && itemViewType != 104) {
            if (itemViewType != 107) {
                rect.set(a2, rect.top, a2, t0.a(R.dimen.show_page_asset_card_margin_bottom, recyclerView));
                return;
            }
            return;
        }
        if (childAdapterPosition == 0) {
            a = rect.top;
        } else {
            a = t0.a(R.dimen.show_page_season_margin_top, recyclerView);
        }
        rect.set(a2, a, a2, t0.a(R.dimen.show_page_season_margin_bottom, recyclerView));
    }
}
