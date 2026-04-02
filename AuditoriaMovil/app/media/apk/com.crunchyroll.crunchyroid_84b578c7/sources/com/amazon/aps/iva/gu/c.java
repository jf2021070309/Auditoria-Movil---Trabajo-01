package com.amazon.aps.iva.gu;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.xw.q;
import com.amazon.aps.iva.xw.t0;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
/* compiled from: LoadingStateDecoration.kt */
/* loaded from: classes2.dex */
public final class c extends b {
    public final void f(RecyclerView recyclerView, View view) {
        View view2;
        int a = t0.a(R.dimen.comments_list_padding_bottom, recyclerView);
        int a2 = t0.a(R.dimen.comments_list_padding_last_item, recyclerView);
        int a3 = t0.a(R.dimen.comments_parent_comment_minimum_height, recyclerView);
        int i = 0;
        RecyclerView.f0 findViewHolderForLayoutPosition = recyclerView.findViewHolderForLayoutPosition(0);
        if (findViewHolderForLayoutPosition != null && (view2 = findViewHolderForLayoutPosition.itemView) != null) {
            i = view2.getHeight();
        }
        view.setMinimumHeight(view.getPaddingBottom() + view.getPaddingTop() + (((recyclerView.getHeight() - Math.max(a3, i)) - a) - a2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        Integer num;
        j.f(rect, "outRect");
        j.f(view, "view");
        j.f(recyclerView, "parent");
        j.f(b0Var, "state");
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == -1) {
            return;
        }
        RecyclerView.h adapter = recyclerView.getAdapter();
        if (adapter != null) {
            num = Integer.valueOf(adapter.getItemViewType(childAdapterPosition));
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 1004) {
            if (childAdapterPosition == 1) {
                f(recyclerView, view);
                return;
            }
            Context context = recyclerView.getContext();
            j.e(context, "parent.context");
            t0.k(view, null, Integer.valueOf(q.d(R.dimen.comments_loading_state_height, context)));
        } else if (num != null && num.intValue() == 1005) {
            f(recyclerView, view);
        }
    }
}
