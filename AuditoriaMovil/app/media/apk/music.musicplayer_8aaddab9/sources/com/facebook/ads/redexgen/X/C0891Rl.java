package com.facebook.ads.redexgen.X;

import android.widget.ImageView;
import android.widget.RelativeLayout;
/* renamed from: com.facebook.ads.redexgen.X.Rl  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0891Rl extends OR {
    public final ImageView A00;
    public final C1046Xo A01;

    public C0891Rl(C1046Xo c1046Xo) {
        super(c1046Xo);
        this.A01 = c1046Xo;
        this.A00 = new ImageView(c1046Xo);
        this.A00.setAdjustViewBounds(true);
        addView(this.A00, new RelativeLayout.LayoutParams(-2, -1));
    }

    public final void A00(String str) {
        AsyncTaskC0925St asyncTaskC0925St = new AsyncTaskC0925St(this.A00, this.A01);
        asyncTaskC0925St.A04();
        asyncTaskC0925St.A07(str);
    }
}
