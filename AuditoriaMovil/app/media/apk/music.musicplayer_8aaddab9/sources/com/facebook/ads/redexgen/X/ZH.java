package com.facebook.ads.redexgen.X;

import android.app.KeyguardManager;
import android.os.Build;
/* loaded from: assets/audience_network.dex */
public class ZH implements InterfaceC03956v {
    public final /* synthetic */ ZD A00;

    public ZH(ZD zd) {
        this.A00 = zd;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03956v
    public final C7A A5I() {
        KeyguardManager keyguardManager;
        KeyguardManager keyguardManager2;
        if (Build.VERSION.SDK_INT >= 22) {
            keyguardManager = this.A00.A00;
            if (keyguardManager == null) {
                return this.A00.A07(AnonymousClass76.A07);
            }
            ZD zd = this.A00;
            keyguardManager2 = zd.A00;
            return zd.A0F(keyguardManager2.isDeviceLocked());
        }
        return this.A00.A07(AnonymousClass76.A05);
    }
}
