package com.amazon.aps.iva.wo;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.xw.t0;
import com.crunchyroll.crunchyroid.R;
/* compiled from: WatchScreenAssetsSpacingDecoration.kt */
/* loaded from: classes2.dex */
public final class k extends RecyclerView.o {
    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        int a;
        com.amazon.aps.iva.yb0.j.f(rect, "outRect");
        com.amazon.aps.iva.yb0.j.f(view, "view");
        com.amazon.aps.iva.yb0.j.f(recyclerView, "parent");
        com.amazon.aps.iva.yb0.j.f(b0Var, "state");
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int a2 = t0.a(R.dimen.watch_screen_assets_card_margin_horizontal, recyclerView);
        if (childAdapterPosition == -1) {
            rect.set(a2, rect.top, a2, rect.bottom);
            return;
        }
        RecyclerView.h adapter = recyclerView.getAdapter();
        com.amazon.aps.iva.yb0.j.c(adapter);
        if (adapter.getItemViewType(childAdapterPosition) == 1013) {
            if (childAdapterPosition == 0) {
                a = rect.top;
            } else {
                a = t0.a(R.dimen.watch_screen_assets_header_margin_top, recyclerView);
            }
            rect.set(a2, a, a2, t0.a(R.dimen.watch_screen_assets_header_margin_bottom, recyclerView));
            return;
        }
        rect.set(a2, rect.top, a2, t0.a(R.dimen.watch_screen_assets_card_margin_bottom, recyclerView));
    }
}
