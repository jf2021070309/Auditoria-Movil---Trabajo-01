package com.facebook.ads.redexgen.X;

import android.util.AttributeSet;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
/* loaded from: assets/audience_network.dex */
public abstract class N9 extends RelativeLayout implements Q0 {
    @Nullable
    public Q8 A00;

    public N9(C1046Xo c1046Xo) {
        super(c1046Xo);
    }

    public N9(C1046Xo c1046Xo, AttributeSet attributeSet, int i2) {
        super(c1046Xo, attributeSet, i2);
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
    }

    public void A07() {
    }

    public void A08() {
    }

    @Override // com.facebook.ads.redexgen.X.Q0
    public final void A8o(Q8 q8) {
        this.A00 = q8;
        A07();
    }

    @Override // com.facebook.ads.redexgen.X.Q0
    public final void AFL(Q8 q8) {
        A08();
        this.A00 = null;
    }

    @Nullable
    public Q8 getVideoView() {
        return this.A00;
    }
}
