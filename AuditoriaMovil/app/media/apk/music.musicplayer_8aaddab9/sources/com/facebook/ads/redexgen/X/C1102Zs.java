package com.facebook.ads.redexgen.X;

import android.os.Build;
/* renamed from: com.facebook.ads.redexgen.X.Zs  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1102Zs implements InterfaceC03956v {
    public final /* synthetic */ ZX A00;

    public C1102Zs(ZX zx) {
        this.A00 = zx;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03956v
    public final C7A A5I() {
        if (Build.VERSION.SDK_INT < 26) {
            return this.A00.A08(Build.SERIAL);
        }
        return this.A00.A08(Build.getSerial());
    }
}
