package com.ellation.widgets.behavior;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.p3.g0;
import com.amazon.aps.iva.p3.r0;
import com.amazon.aps.iva.yb0.j;
import java.util.WeakHashMap;
/* compiled from: HideBottomViewOnScrollBehavior.kt */
/* loaded from: classes2.dex */
public final class a extends RecyclerView.u {
    public final /* synthetic */ HideBottomViewOnScrollBehavior b;

    public a(HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior) {
        this.b = hideBottomViewOnScrollBehavior;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        j.f(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, i, i2);
        this.b.getClass();
        if (!recyclerView.canScrollVertically(1)) {
            WeakHashMap<View, r0> weakHashMap = g0.a;
            recyclerView.stopNestedScroll(1);
        }
    }
}
