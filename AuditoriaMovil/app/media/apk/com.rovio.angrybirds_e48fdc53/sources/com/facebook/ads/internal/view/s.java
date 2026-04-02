package com.facebook.ads.internal.view;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
/* loaded from: classes2.dex */
public class s extends TextView {
    private float a;
    private float b;

    public s(Context context) {
        super(context);
        this.b = 8.0f;
        super.setSingleLine();
        super.setMaxLines(1);
        this.a = getTextSize() / com.facebook.ads.internal.q.a.v.b;
        setEllipsize(TextUtils.TruncateAt.END);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int measuredHeight = getMeasuredHeight();
        int measuredWidth = getMeasuredWidth();
        for (float f = this.a; f >= this.b; f -= 0.5f) {
            super.setTextSize(f);
            measure(0, 0);
            if (getMeasuredWidth() <= i5) {
                break;
            }
        }
        if (getMeasuredWidth() > i5) {
            measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
    }

    public void setMinTextSize(float f) {
        if (f <= this.a) {
            this.b = f;
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
    }

    @Override // android.widget.TextView
    public void setTextSize(float f) {
        this.a = f;
        super.setTextSize(f);
    }
}
