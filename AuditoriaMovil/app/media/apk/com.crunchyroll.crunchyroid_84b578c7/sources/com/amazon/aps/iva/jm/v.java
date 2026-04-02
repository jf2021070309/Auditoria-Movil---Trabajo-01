package com.amazon.aps.iva.jm;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.crunchyroll.crunchyroid.R;
/* compiled from: AvatarsSpacingDecoration.kt */
/* loaded from: classes2.dex */
public final class v extends RecyclerView.o {
    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        com.amazon.aps.iva.yb0.j.f(rect, "outRect");
        com.amazon.aps.iva.yb0.j.f(view, "view");
        com.amazon.aps.iva.yb0.j.f(recyclerView, "parent");
        com.amazon.aps.iva.yb0.j.f(b0Var, "state");
        if (recyclerView.getChildViewHolder(view).getLayoutPosition() == -1) {
            return;
        }
        int dimension = ((int) recyclerView.getResources().getDimension(R.dimen.avatar_item_spacing)) / 2;
        rect.left = dimension;
        rect.right = dimension;
    }
}
