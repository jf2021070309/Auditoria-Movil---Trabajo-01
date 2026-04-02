package com.facebook.ads.redexgen.X;

import android.app.ActivityManager;
/* renamed from: com.facebook.ads.redexgen.X.ak  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1156ak implements InterfaceC03956v {
    public final /* synthetic */ C1155aj A00;

    public C1156ak(C1155aj c1155aj) {
        this.A00 = c1155aj;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03956v
    public final C7A A5I() {
        ActivityManager activityManager;
        activityManager = this.A00.A02;
        if (activityManager != null) {
            return this.A00.A0F(ActivityManager.isRunningInTestHarness());
        }
        return this.A00.A07(AnonymousClass76.A07);
    }
}
