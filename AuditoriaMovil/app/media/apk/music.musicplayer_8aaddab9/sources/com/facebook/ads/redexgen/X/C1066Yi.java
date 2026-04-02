package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.os.PowerManager;
/* renamed from: com.facebook.ads.redexgen.X.Yi  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1066Yi implements InterfaceC03956v {
    public final /* synthetic */ C1065Yh A00;

    public C1066Yi(C1065Yh c1065Yh) {
        this.A00 = c1065Yh;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03956v
    public final C7A A5I() {
        PowerManager powerManager;
        PowerManager powerManager2;
        if (Build.VERSION.SDK_INT >= 21) {
            powerManager = this.A00.A00;
            if (powerManager != null) {
                C1065Yh c1065Yh = this.A00;
                powerManager2 = c1065Yh.A00;
                return c1065Yh.A0F(powerManager2.isPowerSaveMode());
            }
            return this.A00.A07(AnonymousClass76.A07);
        }
        return this.A00.A07(AnonymousClass76.A05);
    }
}
