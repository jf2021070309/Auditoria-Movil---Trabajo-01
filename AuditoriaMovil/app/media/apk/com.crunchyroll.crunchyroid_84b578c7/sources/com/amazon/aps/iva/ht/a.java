package com.amazon.aps.iva.ht;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.xw.q;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
/* compiled from: FeedCarouselItemDecoration.kt */
/* loaded from: classes2.dex */
public final class a extends RecyclerView.o {
    public final Integer a;

    public a(Integer num) {
        this.a = num;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        int i;
        j.f(rect, "outRect");
        j.f(view, "view");
        j.f(recyclerView, "parent");
        j.f(b0Var, "state");
        super.getItemOffsets(rect, view, recyclerView, b0Var);
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == -1) {
            return;
        }
        int dimensionPixelSize = recyclerView.getContext().getResources().getDimensionPixelSize(R.dimen.carousel_horizontal_item_padding);
        int dimensionPixelSize2 = recyclerView.getContext().getResources().getDimensionPixelSize(R.dimen.feed_horizontal_padding);
        if (childAdapterPosition == 0) {
            i = dimensionPixelSize2;
        } else {
            i = dimensionPixelSize;
        }
        Integer num = this.a;
        if (num != null) {
            dimensionPixelSize2 = num.intValue();
        } else if (childAdapterPosition != b0Var.b() - 1) {
            dimensionPixelSize2 = 0;
        }
        int i2 = dimensionPixelSize2;
        Context context = recyclerView.getContext();
        j.e(context, "parent.context");
        w.P(rect, i, 0, i2, 0, q.f(context));
    }
}
