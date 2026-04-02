package com.facebook.ads.redexgen.X;

import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
/* renamed from: com.facebook.ads.redexgen.X.At  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0484At extends C1232bz {
    public final /* synthetic */ C0478An A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0484At(C0478An c0478An, C1046Xo c1046Xo) {
        super(c1046Xo);
        this.A00 = c0478An;
    }

    @Override // com.facebook.ads.redexgen.X.C1232bz
    public final float A0J(DisplayMetrics displayMetrics) {
        float f2;
        f2 = this.A00.A00;
        return f2 / displayMetrics.densityDpi;
    }

    @Override // com.facebook.ads.redexgen.X.C1232bz
    public final int A0K() {
        return -1;
    }

    @Override // com.facebook.ads.redexgen.X.C1232bz
    public final int A0O(View view, int left) {
        int i2;
        C4T A08 = A08();
        if (!A08.A24()) {
            return 0;
        }
        C4U c4u = (C4U) view.getLayoutParams();
        int start = A08.A0k(view) - c4u.leftMargin;
        int end = A08.A0n(view) + c4u.rightMargin;
        int A0N = A0N(start, end, A08.A0e(), A08.A0h() - A08.A0f(), left);
        i2 = this.A00.A02;
        return A0N + i2;
    }

    @Override // com.facebook.ads.redexgen.X.C1232bz
    public final PointF A0P(int i2) {
        return this.A00.A44(i2);
    }
}
