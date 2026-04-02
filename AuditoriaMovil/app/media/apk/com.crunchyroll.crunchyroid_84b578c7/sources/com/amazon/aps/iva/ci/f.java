package com.amazon.aps.iva.ci;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.xw.q;
import com.amazon.aps.iva.xw.t0;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
/* compiled from: MusicAssetsSpacingDecoration.kt */
/* loaded from: classes.dex */
public final class f extends RecyclerView.o {
    public static final f a = new f();

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        int a2;
        j.f(rect, "outRect");
        j.f(view, "view");
        j.f(recyclerView, "parent");
        j.f(b0Var, "state");
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == -1) {
            return;
        }
        if (childAdapterPosition == b0Var.b() - 1) {
            a2 = t0.a(R.dimen.music_assets_list_padding_bottom, recyclerView);
        } else {
            a2 = t0.a(R.dimen.music_assets_list_item_padding_bottom, recyclerView);
        }
        int i = a2;
        int a3 = t0.a(R.dimen.music_assets_list_item_margin_horizontal, recyclerView);
        int a4 = t0.a(R.dimen.music_assets_list_item_margin_horizontal, recyclerView);
        Context context = recyclerView.getContext();
        j.e(context, "parent.context");
        w.P(rect, a3, 0, a4, i, q.f(context));
    }
}
