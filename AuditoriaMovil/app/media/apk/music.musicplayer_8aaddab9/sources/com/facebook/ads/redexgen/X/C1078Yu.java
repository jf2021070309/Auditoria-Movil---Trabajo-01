package com.facebook.ads.redexgen.X;

import android.content.pm.PackageInfo;
/* renamed from: com.facebook.ads.redexgen.X.Yu  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1078Yu implements InterfaceC03956v {
    public final /* synthetic */ C1069Yl A00;

    public C1078Yu(C1069Yl c1069Yl) {
        this.A00 = c1069Yl;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03956v
    public final C7A A5I() {
        PackageInfo packageInfo;
        PackageInfo packageInfo2;
        packageInfo = this.A00.A01;
        if (packageInfo != null) {
            C1069Yl c1069Yl = this.A00;
            packageInfo2 = c1069Yl.A01;
            return c1069Yl.A06(packageInfo2.firstInstallTime);
        }
        return this.A00.A07(AnonymousClass76.A07);
    }
}
