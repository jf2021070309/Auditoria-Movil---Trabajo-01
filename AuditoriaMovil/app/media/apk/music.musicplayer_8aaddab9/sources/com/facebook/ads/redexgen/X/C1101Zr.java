package com.facebook.ads.redexgen.X;

import android.os.Build;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Zr  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1101Zr implements InterfaceC03956v {
    public final /* synthetic */ ZX A00;

    public C1101Zr(ZX zx) {
        this.A00 = zx;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03956v
    public final C7A A5I() {
        if (Build.VERSION.SDK_INT < 21) {
            return this.A00.A07(AnonymousClass76.A05);
        }
        String[] strArr = Build.SUPPORTED_ABIS;
        if (strArr != null) {
            return this.A00.A0E(Arrays.asList(strArr));
        }
        return this.A00.A07(AnonymousClass76.A07);
    }
}
