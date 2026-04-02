package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.widget.EdgeEffect;
/* renamed from: com.facebook.ads.redexgen.X.3i  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C03063i {
    public static final C03053h A00;

    static {
        if (Build.VERSION.SDK_INT >= 21) {
            A00 = new C1235c3();
        } else {
            A00 = new C03053h();
        }
    }

    public static void A00(EdgeEffect edgeEffect, float f2, float f3) {
        A00.A00(edgeEffect, f2, f3);
    }
}
