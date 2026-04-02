package com.facebook.ads.redexgen.X;

import android.icu.util.TimeZone;
import android.os.Build;
/* loaded from: assets/audience_network.dex */
public class YG implements InterfaceC03956v {
    public final /* synthetic */ YD A00;

    public YG(YD yd) {
        this.A00 = yd;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03956v
    public final C7A A5I() {
        if (Build.VERSION.SDK_INT < 24) {
            return this.A00.A07(AnonymousClass76.A05);
        }
        return this.A00.A08(TimeZone.getDefault().getID());
    }
}
