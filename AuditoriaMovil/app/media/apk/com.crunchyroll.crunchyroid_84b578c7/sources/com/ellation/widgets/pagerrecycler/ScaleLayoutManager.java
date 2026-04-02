package com.ellation.widgets.pagerrecycler;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* compiled from: ScaleLayoutManager.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/ellation/widgets/pagerrecycler/ScaleLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ScaleLayoutManager extends LinearLayoutManager {
    public final float a;
    public final float b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScaleLayoutManager(Context context) {
        super(context, 0, false);
        j.f(context, "context");
        this.a = 0.05f;
        this.b = 1.0f;
    }

    public final void a() {
        float width = getWidth() / 2.0f;
        float f = this.b * width;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            j.d(childAt, "null cannot be cast to non-null type android.view.View");
            float min = 1.0f - ((this.a * Math.min(f, Math.abs(width - ((getDecoratedLeft(childAt) + getDecoratedRight(childAt)) / 2.0f)))) / f);
            childAt.setScaleX(min);
            childAt.setScaleY(min);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public final void onLayoutCompleted(RecyclerView.b0 b0Var) {
        super.onLayoutCompleted(b0Var);
        a();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public final int scrollHorizontallyBy(int i, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (getOrientation() == 0) {
            int scrollHorizontallyBy = super.scrollHorizontallyBy(i, wVar, b0Var);
            a();
            return scrollHorizontallyBy;
        }
        return 0;
    }
}
