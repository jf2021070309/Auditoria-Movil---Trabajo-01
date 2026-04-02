package com.amazon.aps.iva.zt;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewStub;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.xw.q;
import com.amazon.aps.iva.xw.t0;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
/* compiled from: CommentsSpacingDecoration.kt */
/* loaded from: classes2.dex */
public final class b extends RecyclerView.o {
    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        int a;
        j.f(rect, "outRect");
        j.f(view, "view");
        j.f(recyclerView, "parent");
        j.f(b0Var, "state");
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition != -1 && !(view instanceof ViewStub)) {
            if (childAdapterPosition == b0Var.b() - 1) {
                a = t0.a(R.dimen.comments_list_padding_last_item, recyclerView);
            } else {
                a = t0.a(R.dimen.comments_list_padding_bottom, recyclerView);
            }
            int i = a;
            Context context = recyclerView.getContext();
            j.e(context, "parent.context");
            w.P(rect, 0, 0, 0, i, q.f(context));
        }
    }
}
