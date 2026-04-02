package com.amazon.aps.iva.dv;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.xw.t0;
import com.crunchyroll.crunchyroid.R;
/* compiled from: CrunchylistSpacingDecoration.kt */
/* loaded from: classes2.dex */
public final class l extends RecyclerView.o {
    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        com.amazon.aps.iva.yb0.j.f(rect, "outRect");
        com.amazon.aps.iva.yb0.j.f(view, "view");
        com.amazon.aps.iva.yb0.j.f(recyclerView, "parent");
        com.amazon.aps.iva.yb0.j.f(b0Var, "state");
        if (recyclerView.getChildAdapterPosition(view) == -1) {
            return;
        }
        rect.set(0, 0, 0, t0.a(R.dimen.crunchylist_show_item_margin_vertical, recyclerView));
    }
}
