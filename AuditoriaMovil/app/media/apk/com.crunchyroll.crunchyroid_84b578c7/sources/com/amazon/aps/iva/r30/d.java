package com.amazon.aps.iva.r30;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.xw.q;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
/* compiled from: SearchResultItemDecoration.kt */
/* loaded from: classes2.dex */
public final class d extends RecyclerView.o {
    public final int a;

    public d(Context context) {
        j.f(context, "context");
        this.a = q.d(R.dimen.search_results_item_spacing, context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        j.f(rect, "outRect");
        j.f(view, "view");
        j.f(recyclerView, "parent");
        j.f(b0Var, "state");
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
