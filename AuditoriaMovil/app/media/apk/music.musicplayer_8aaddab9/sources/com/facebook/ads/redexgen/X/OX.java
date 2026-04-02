package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;
/* loaded from: assets/audience_network.dex */
public final class OX {
    public static final int A00 = ML.A00();

    public static void A00(C1046Xo c1046Xo, ViewGroup viewGroup, String str) {
        new AsyncTaskC0925St(viewGroup, c1046Xo).A07(str);
        View view = new View(c1046Xo);
        view.setId(A00);
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ML.A0R(view, c1046Xo);
        viewGroup.addView(view, 0);
    }
}
