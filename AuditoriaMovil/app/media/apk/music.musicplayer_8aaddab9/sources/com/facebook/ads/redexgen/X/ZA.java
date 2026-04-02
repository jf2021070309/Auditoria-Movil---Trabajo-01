package com.facebook.ads.redexgen.X;

import android.os.Build;
import java.util.Locale;
/* loaded from: assets/audience_network.dex */
public class ZA implements InterfaceC03956v {
    public final /* synthetic */ Z8 A00;

    public ZA(Z8 z8) {
        this.A00 = z8;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03956v
    public final C7A A5I() {
        if (Build.VERSION.SDK_INT < 21) {
            return this.A00.A07(AnonymousClass76.A05);
        }
        return this.A00.A08(Locale.getDefault().getScript());
    }
}
