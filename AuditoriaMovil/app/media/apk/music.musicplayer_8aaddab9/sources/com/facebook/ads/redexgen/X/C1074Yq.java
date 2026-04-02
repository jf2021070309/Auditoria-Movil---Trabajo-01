package com.facebook.ads.redexgen.X;

import android.content.pm.PackageInfo;
/* renamed from: com.facebook.ads.redexgen.X.Yq  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1074Yq implements InterfaceC03956v {
    public final /* synthetic */ C1069Yl A00;

    public C1074Yq(C1069Yl c1069Yl) {
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
            return c1069Yl.A08(packageInfo2.packageName);
        }
        return this.A00.A07(AnonymousClass76.A07);
    }
}
