package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.os.Trace;
import com.google.android.gms.common.ConnectionResult;
/* renamed from: com.facebook.ads.redexgen.X.Iv  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0673Iv {
    public static void A00() {
        if (C0676Iy.A02 >= 18) {
            A01();
        }
    }

    @TargetApi(ConnectionResult.SERVICE_UPDATING)
    public static void A01() {
        Trace.endSection();
    }

    public static void A02(String str) {
        if (C0676Iy.A02 >= 18) {
            A03(str);
        }
    }

    @TargetApi(ConnectionResult.SERVICE_UPDATING)
    public static void A03(String str) {
        Trace.beginSection(str);
    }
}
