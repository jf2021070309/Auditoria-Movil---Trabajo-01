package com.amazon.aps.iva.ei;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewStub;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.xw.q;
import com.amazon.aps.iva.xw.t0;
import com.crunchyroll.crunchyroid.R;
/* compiled from: FeaturedMusicListSpacingDecoration.kt */
/* loaded from: classes.dex */
public final class f extends RecyclerView.o {
    public static final f a = new f();

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        int a2;
        com.amazon.aps.iva.yb0.j.f(rect, "outRect");
        com.amazon.aps.iva.yb0.j.f(view, "view");
        com.amazon.aps.iva.yb0.j.f(recyclerView, "parent");
        com.amazon.aps.iva.yb0.j.f(b0Var, "state");
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition != -1 && !(view instanceof ViewStub)) {
            if (childAdapterPosition == b0Var.b() - 1) {
                a2 = 0;
            } else {
                a2 = t0.a(R.dimen.featured_list_item_margin_bottom, recyclerView);
            }
            int i = a2;
            int a3 = t0.a(R.dimen.featured_list_item_margin_horizontal, recyclerView);
            int a4 = t0.a(R.dimen.featured_list_item_margin_horizontal, recyclerView);
            Context context = recyclerView.getContext();
            com.amazon.aps.iva.yb0.j.e(context, "parent.context");
            w.P(rect, a3, 0, a4, i, q.f(context));
        }
    }
}
