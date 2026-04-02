package com.amazon.aps.iva.eb;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.u;
/* compiled from: HorizontalScrollingController.java */
/* loaded from: classes.dex */
public final class c extends u {
    public final /* synthetic */ com.amazon.aps.iva.fb.b a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c = 150;
    public final /* synthetic */ com.beloo.widget.chipslayoutmanager.a d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.beloo.widget.chipslayoutmanager.a aVar, Context context, com.amazon.aps.iva.fb.b bVar, int i) {
        super(context);
        this.d = aVar;
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
        return new PointF(f, 0.0f);
    }

    @Override // androidx.recyclerview.widget.u, androidx.recyclerview.widget.RecyclerView.a0
    public final void onTargetFound(View view, RecyclerView.b0 b0Var, RecyclerView.a0.a aVar) {
        super.onTargetFound(view, b0Var, aVar);
        com.beloo.widget.chipslayoutmanager.a aVar2 = this.d;
        aVar.b(aVar2.e.getDecoratedLeft(view) - aVar2.e.getPaddingLeft(), 0, new LinearInterpolator(), this.c);
    }
}
