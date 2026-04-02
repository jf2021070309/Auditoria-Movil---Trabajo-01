package com.android.music;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
/* loaded from: classes.dex */
public class SquareFrameView extends RelativeLayout {
    public int a;

    /* renamed from: b  reason: collision with root package name */
    public int f3021b;

    public SquareFrameView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
        this.f3021b = 10000;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int i4 = this.a;
        if (i4 == measuredHeight && i4 == measuredWidth) {
            return;
        }
        int min = Math.min(this.f3021b, Math.min(measuredWidth, measuredHeight));
        this.a = min;
        setMeasuredDimension(min, min);
    }

    public void setMaxSize(int i2) {
        this.f3021b = i2;
    }
}
