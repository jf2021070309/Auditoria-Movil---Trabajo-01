package com.amazon.aps.iva.jv;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.xw.t0;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
/* compiled from: CrunchylistSearchSpacingDecoration.kt */
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
        if (childAdapterPosition == -1) {
            return;
        }
        if (childAdapterPosition == b0Var.b() - 1) {
            a = t0.a(R.dimen.crunchylist_search_list_padding_last_item, recyclerView);
        } else {
            a = t0.a(R.dimen.crunchylist_search_list_padding_bottom, recyclerView);
        }
        rect.set(0, 0, 0, a);
    }
}
