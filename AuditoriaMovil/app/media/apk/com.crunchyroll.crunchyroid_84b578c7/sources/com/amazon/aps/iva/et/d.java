package com.amazon.aps.iva.et;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.xw.q;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
/* compiled from: BentoItemDecoration.kt */
/* loaded from: classes2.dex */
public final class d extends RecyclerView.o {
    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        int i;
        int i2;
        int i3;
        j.f(rect, "outRect");
        j.f(view, "view");
        j.f(recyclerView, "parent");
        j.f(b0Var, "state");
        super.getItemOffsets(rect, view, recyclerView, b0Var);
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int dimensionPixelSize = recyclerView.getContext().getResources().getDimensionPixelSize(R.dimen.bento_carousel_margin_start);
        int dimensionPixelSize2 = recyclerView.getContext().getResources().getDimensionPixelSize(R.dimen.bento_detail_margin_end);
        int dimensionPixelOffset = recyclerView.getContext().getResources().getDimensionPixelOffset(R.dimen.bento_games_margin_horizontal);
        int dimensionPixelOffset2 = recyclerView.getContext().getResources().getDimensionPixelOffset(R.dimen.bento_games_margin_top);
        if (childAdapterPosition == 0) {
            i = dimensionPixelSize;
        } else {
            i = 0;
        }
        if (childAdapterPosition == 0) {
            i2 = dimensionPixelSize2;
        } else {
            i2 = dimensionPixelOffset;
        }
        if (childAdapterPosition == 0) {
            i3 = 0;
        } else {
            i3 = dimensionPixelOffset2;
        }
        Context context = recyclerView.getContext();
        j.e(context, "parent.context");
        w.P(rect, i, i3, i2, 0, q.f(context));
    }
}
