package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.ads.internal.api.AdNativeComponentView;
/* renamed from: com.facebook.ads.redexgen.X.Mq  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0767Mq extends AdNativeComponentView {
    public static final int A01 = (int) (C0739Lm.A00 * 1.0f);
    public final ImageView A00;

    public C0767Mq(C1046Xo c1046Xo) {
        super(c1046Xo);
        this.A00 = new N2(c1046Xo);
        this.A00.setScaleType(ImageView.ScaleType.CENTER_CROP);
        EnumC0742Lr.A04(this.A00, EnumC0742Lr.A0A);
        addView(this.A00, new ViewGroup.LayoutParams(-1, -1));
        ML.A0M(this.A00, -2130706433);
        int i2 = A01;
        setPadding(i2, i2, i2, i2);
    }

    @Override // com.facebook.ads.internal.api.AdNativeComponentView
    public View getAdContentsView() {
        return this.A00;
    }

    public ImageView getImageCardView() {
        return this.A00;
    }
}
