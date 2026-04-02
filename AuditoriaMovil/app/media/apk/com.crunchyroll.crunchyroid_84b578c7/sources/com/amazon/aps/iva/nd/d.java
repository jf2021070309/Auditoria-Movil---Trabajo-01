package com.amazon.aps.iva.nd;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.yb0.j;
/* compiled from: VerticalPaddingDecoration.kt */
/* loaded from: classes.dex */
public final class d extends RecyclerView.o {
    public final int a;

    public d(int i) {
        this.a = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        j.f(rect, "outRect");
        j.f(view, "view");
        j.f(recyclerView, "parent");
        j.f(b0Var, "state");
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == -1) {
            return;
        }
        int i = this.a;
        if (childAdapterPosition == 0) {
            rect.top = i;
        }
        RecyclerView.h adapter = recyclerView.getAdapter();
        if (adapter != null && childAdapterPosition == adapter.getItemCount() - 1) {
            rect.bottom = i;
        }
    }
}
