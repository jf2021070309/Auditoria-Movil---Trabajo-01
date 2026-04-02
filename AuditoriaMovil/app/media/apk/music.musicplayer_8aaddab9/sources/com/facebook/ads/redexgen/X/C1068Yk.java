package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.os.PowerManager;
/* renamed from: com.facebook.ads.redexgen.X.Yk  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1068Yk implements InterfaceC03956v {
    public final /* synthetic */ C1065Yh A00;

    public C1068Yk(C1065Yh c1065Yh) {
        this.A00 = c1065Yh;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03956v
    public final C7A A5I() {
        PowerManager powerManager;
        boolean A04;
        powerManager = this.A00.A00;
        if (powerManager != null && Build.VERSION.SDK_INT >= 7) {
            C1065Yh c1065Yh = this.A00;
            A04 = c1065Yh.A04();
            return c1065Yh.A0F(A04);
        }
        return this.A00.A07(AnonymousClass76.A07);
    }
}
