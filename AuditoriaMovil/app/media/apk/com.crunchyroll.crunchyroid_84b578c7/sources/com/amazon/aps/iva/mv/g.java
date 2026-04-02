package com.amazon.aps.iva.mv;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.xw.t0;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
/* compiled from: CrunchylistsSpacingDecoration.kt */
/* loaded from: classes2.dex */
public final class g extends RecyclerView.o {
    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        j.f(rect, "outRect");
        j.f(view, "view");
        j.f(recyclerView, "parent");
        j.f(b0Var, "state");
        if (recyclerView.getChildAdapterPosition(view) == -1) {
            return;
        }
        rect.set(0, 0, 0, t0.a(R.dimen.crunchylists_item_padding_bottom, recyclerView));
    }
}
