package com.facebook.ads.redexgen.X;

import android.icu.util.TimeZone;
import android.os.Build;
/* loaded from: assets/audience_network.dex */
public class YF implements InterfaceC03956v {
    public final /* synthetic */ YD A00;

    public YF(YD yd) {
        this.A00 = yd;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03956v
    public final C7A A5I() {
        if (Build.VERSION.SDK_INT < 24) {
            return this.A00.A07(AnonymousClass76.A05);
        }
        return this.A00.A03(TimeZone.getDefault().getRawOffset() / 1000.0f);
    }
}
