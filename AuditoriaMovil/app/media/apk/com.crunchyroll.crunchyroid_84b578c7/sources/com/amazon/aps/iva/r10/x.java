package com.amazon.aps.iva.r10;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.crunchyroll.crunchyroid.R;
/* compiled from: HistoryItemDecoration.kt */
/* loaded from: classes2.dex */
public final class x extends RecyclerView.o {
    public final int a;

    public x(Context context) {
        this.a = com.amazon.aps.iva.xw.q.d(R.dimen.history_item_spacing, context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        com.amazon.aps.iva.yb0.j.f(rect, "outRect");
        com.amazon.aps.iva.yb0.j.f(view, "view");
        com.amazon.aps.iva.yb0.j.f(recyclerView, "parent");
        com.amazon.aps.iva.yb0.j.f(b0Var, "state");
        if (recyclerView.getChildViewHolder(view).getLayoutPosition() == -1) {
            return;
        }
        int i = this.a;
        rect.top = i / 2;
        rect.left = i / 2;
        rect.right = i / 2;
        rect.bottom = i / 2;
    }
}
