package com.amazon.aps.iva.v1;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import com.crunchyroll.crunchyroid.R;
/* compiled from: ViewLayerContainer.android.kt */
/* loaded from: classes.dex */
public class l1 extends ViewGroup {
    public boolean b;

    public l1(Context context) {
        super(context);
        setClipChildren(false);
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    public final void a(com.amazon.aps.iva.f1.u uVar, View view, long j) {
        com.amazon.aps.iva.yb0.j.f(uVar, "canvas");
        com.amazon.aps.iva.yb0.j.f(view, "view");
        Canvas canvas = com.amazon.aps.iva.f1.h.a;
        super.drawChild(((com.amazon.aps.iva.f1.g) uVar).a, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(canvas, "canvas");
        int childCount = super.getChildCount();
        int i = 0;
        while (true) {
            if (i < childCount) {
                View childAt = getChildAt(i);
                com.amazon.aps.iva.yb0.j.d(childAt, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
                if (((androidx.compose.ui.platform.f) childAt).i) {
                    z = true;
                    break;
                }
                i++;
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            this.b = true;
            try {
                super.dispatchDraw(canvas);
            } finally {
                this.b = false;
            }
        }
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        if (this.b) {
            return super.getChildCount();
        }
        return 0;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
