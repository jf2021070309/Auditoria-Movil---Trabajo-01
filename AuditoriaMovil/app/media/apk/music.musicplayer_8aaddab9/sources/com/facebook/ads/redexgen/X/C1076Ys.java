package com.facebook.ads.redexgen.X;

import android.content.pm.PackageInfo;
import android.os.Build;
/* renamed from: com.facebook.ads.redexgen.X.Ys  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1076Ys implements InterfaceC03956v {
    public final /* synthetic */ C1069Yl A00;

    public C1076Ys(C1069Yl c1069Yl) {
        this.A00 = c1069Yl;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03956v
    public final C7A A5I() {
        PackageInfo packageInfo;
        PackageInfo packageInfo2;
        PackageInfo packageInfo3;
        packageInfo = this.A00.A01;
        if (packageInfo != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                C1069Yl c1069Yl = this.A00;
                packageInfo3 = c1069Yl.A01;
                return c1069Yl.A06(packageInfo3.getLongVersionCode());
            }
            C1069Yl c1069Yl2 = this.A00;
            packageInfo2 = c1069Yl2.A01;
            return c1069Yl2.A04(packageInfo2.versionCode);
        }
        return this.A00.A07(AnonymousClass76.A07);
    }
}
