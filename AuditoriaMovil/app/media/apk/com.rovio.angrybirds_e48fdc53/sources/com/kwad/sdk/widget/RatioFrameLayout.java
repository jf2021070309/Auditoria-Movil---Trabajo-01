package com.kwad.sdk.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.msdk.adapter.pangle.PangleAdapterUtils;
/* loaded from: classes3.dex */
public class RatioFrameLayout extends FrameLayout {
    private double aqX;

    public RatioFrameLayout(Context context) {
        this(context, null);
    }

    public RatioFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RatioFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.aqX = PangleAdapterUtils.CPM_DEFLAUT_VALUE;
    }

    public double getRatio() {
        return this.aqX;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.aqX != PangleAdapterUtils.CPM_DEFLAUT_VALUE) {
            int size = View.MeasureSpec.getSize(i);
            Log.d("RatioFrameLayout", "widthSize:" + size);
            i2 = View.MeasureSpec.makeMeasureSpec((int) (((double) size) * this.aqX), 1073741824);
        }
        super.onMeasure(i, i2);
    }

    public void setRatio(double d) {
        this.aqX = d;
    }
}
