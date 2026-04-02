package com.facebook.ads.redexgen.X;

import android.os.Build;
/* renamed from: com.facebook.ads.redexgen.X.Zp  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1099Zp implements InterfaceC03956v {
    public final /* synthetic */ ZX A00;

    public C1099Zp(ZX zx) {
        this.A00 = zx;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03956v
    public final C7A A5I() {
        return this.A00.A06(Build.TIME / 1000);
    }
}
