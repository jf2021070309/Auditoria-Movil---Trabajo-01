package com.kwad.components.core.page.recycle;

import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.kwad.sdk.utils.ao;
/* loaded from: classes.dex */
public final class f {
    final RecyclerView On;
    final RecyclerView.LayoutManager Oo;

    private f(RecyclerView recyclerView) {
        this.On = recyclerView;
        this.Oo = recyclerView.getLayoutManager();
    }

    private View a(int i, int i2, boolean z, boolean z2) {
        OrientationHelper createVerticalHelper = this.Oo.canScrollVertically() ? OrientationHelper.createVerticalHelper(this.Oo) : OrientationHelper.createHorizontalHelper(this.Oo);
        int startAfterPadding = createVerticalHelper.getStartAfterPadding();
        int endAfterPadding = createVerticalHelper.getEndAfterPadding();
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View childAt = this.Oo.getChildAt(i);
            int decoratedStart = createVerticalHelper.getDecoratedStart(childAt);
            int decoratedEnd = createVerticalHelper.getDecoratedEnd(childAt);
            if (decoratedStart < endAfterPadding && decoratedEnd > startAfterPadding) {
                return childAt;
            }
            i += i3;
        }
        return null;
    }

    public static f b(RecyclerView recyclerView) {
        ao.checkNotNull(recyclerView);
        return new f(recyclerView);
    }

    public final int findFirstVisibleItemPosition() {
        View a = a(0, this.Oo.getChildCount(), false, true);
        if (a == null) {
            return -1;
        }
        return this.On.getChildAdapterPosition(a);
    }

    public final int findLastVisibleItemPosition() {
        View a = a(this.Oo.getChildCount() - 1, -1, false, true);
        if (a == null) {
            return -1;
        }
        return this.On.getChildAdapterPosition(a);
    }
}
