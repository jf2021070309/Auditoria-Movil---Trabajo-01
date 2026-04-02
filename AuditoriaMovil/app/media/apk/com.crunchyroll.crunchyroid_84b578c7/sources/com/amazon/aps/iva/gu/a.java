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
public final class a extends b {
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
            if (childAdapterPosition == 0) {
                t0.k(view, null, Integer.valueOf(recyclerView.getHeight() - t0.a(R.dimen.comments_list_padding_last_item, recyclerView)));
                return;
            }
            Context context = recyclerView.getContext();
            j.e(context, "parent.context");
            t0.k(view, null, Integer.valueOf(q.d(R.dimen.comments_loading_state_height, context)));
        } else if (num != null && num.intValue() == 1005) {
            t0.k(view, null, Integer.valueOf(recyclerView.getHeight() - t0.a(R.dimen.comments_list_padding_last_item, recyclerView)));
        }
    }
}
