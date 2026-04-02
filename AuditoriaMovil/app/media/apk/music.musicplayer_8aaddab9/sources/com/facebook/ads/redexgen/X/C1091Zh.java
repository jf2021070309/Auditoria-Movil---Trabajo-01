package com.facebook.ads.redexgen.X;

import android.os.Build;
/* renamed from: com.facebook.ads.redexgen.X.Zh  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1091Zh implements InterfaceC03956v {
    public final /* synthetic */ ZX A00;

    public C1091Zh(ZX zx) {
        this.A00 = zx;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03956v
    public final C7A A5I() {
        if (Build.VERSION.SDK_INT < 23) {
            return this.A00.A07(AnonymousClass76.A05);
        }
        return this.A00.A08(Build.VERSION.BASE_OS);
    }
}
