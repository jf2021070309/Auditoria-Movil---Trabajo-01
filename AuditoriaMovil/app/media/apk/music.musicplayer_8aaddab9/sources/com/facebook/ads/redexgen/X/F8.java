package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
/* loaded from: assets/audience_network.dex */
public class F8 extends C1232bz {
    public final /* synthetic */ F7 A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F8(F7 f7, Context context) {
        super(context);
        this.A00 = f7;
    }

    @Override // com.facebook.ads.redexgen.X.C1232bz, com.facebook.ads.redexgen.X.AbstractC03294g
    public final void A0I(View view, C03314i c03314i, C03274e c03274e) {
        F7 f7 = this.A00;
        int[] A0H = f7.A0H(((AbstractC1218bk) f7).A00.getLayoutManager(), view);
        int i2 = A0H[0];
        int i3 = A0H[1];
        int A0M = A0M(Math.max(Math.abs(i2), Math.abs(i3)));
        if (A0M > 0) {
            c03274e.A04(i2, i3, A0M, ((C1232bz) this).A04);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C1232bz
    public final float A0J(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // com.facebook.ads.redexgen.X.C1232bz
    public final int A0L(int i2) {
        return Math.min(100, super.A0L(i2));
    }
}
