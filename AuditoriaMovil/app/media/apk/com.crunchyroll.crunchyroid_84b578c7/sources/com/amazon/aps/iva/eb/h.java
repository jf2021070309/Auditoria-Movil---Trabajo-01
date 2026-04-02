package com.amazon.aps.iva.eb;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.u;
/* compiled from: VerticalScrollingController.java */
/* loaded from: classes.dex */
public final class h extends u {
    public final /* synthetic */ com.amazon.aps.iva.fb.b a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c = 150;
    public final /* synthetic */ com.beloo.widget.chipslayoutmanager.c d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.beloo.widget.chipslayoutmanager.c cVar, Context context, com.amazon.aps.iva.fb.b bVar, int i) {
        super(context);
        this.d = cVar;
        this.a = bVar;
        this.b = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a0
    public final PointF computeScrollVectorForPosition(int i) {
        float f;
        if (this.b > this.a.b.intValue()) {
            f = 1.0f;
        } else {
            f = -1.0f;
        }
        return new PointF(0.0f, f);
    }

    @Override // androidx.recyclerview.widget.u, androidx.recyclerview.widget.RecyclerView.a0
    public final void onTargetFound(View view, RecyclerView.b0 b0Var, RecyclerView.a0.a aVar) {
        super.onTargetFound(view, b0Var, aVar);
        com.beloo.widget.chipslayoutmanager.c cVar = this.d;
        aVar.b(0, cVar.e.getDecoratedTop(view) - cVar.e.getPaddingTop(), new LinearInterpolator(), this.c);
    }
}
