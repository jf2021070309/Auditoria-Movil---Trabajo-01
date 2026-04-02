package com.facebook.ads.redexgen.X;

import android.view.View;
/* loaded from: assets/audience_network.dex */
public final class AL extends Q8 {
    public AL(C1046Xo c1046Xo) {
        super(c1046Xo);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int newHeightSpec, int i2) {
        if (View.MeasureSpec.getMode(newHeightSpec) == 1073741824) {
            i2 = newHeightSpec;
        } else if (View.MeasureSpec.getMode(i2) == 1073741824) {
            newHeightSpec = i2;
        }
        super.onMeasure(newHeightSpec, i2);
    }
}
