package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.content.Context;
/* renamed from: com.facebook.ads.redexgen.X.5G  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C5G {
    public static C0R A00(Context context, C8W c8w) {
        C1045Xn sdkContext = A07(context);
        C0U A6h = c8w.A6h(sdkContext);
        if (A6h != null) {
            return A6h.A9R();
        }
        return new C1330de();
    }

    public static C1046Xo A01(Activity activity) {
        return new C1046Xo(activity, A08(), A00(activity, A08()));
    }

    public static C1046Xo A02(Context context) {
        return new C1046Xo(context, A08(), new C1330de());
    }

    public static C1046Xo A03(Context context) {
        return new C1046Xo(context, A08(), A00(context, A08()));
    }

    public static C1046Xo A04(Context context) {
        if (JQ.A0o(context)) {
            return new C1046Xo(context, A08(), A00(context, A08()));
        }
        return A02(context);
    }

    public static C1046Xo A05(Context context) {
        return new C1046Xo(context, A08(), A00(context, A08()));
    }

    public static E5 A06(Context context) {
        return new E5(context, A08(), A08().A6h(A07(context)));
    }

    public static C1045Xn A07(Context context) {
        return new C1045Xn(context, A08());
    }

    public static synchronized C8W A08() {
        XM A02;
        synchronized (C5G.class) {
            A02 = XM.A02();
        }
        return A02;
    }
}
