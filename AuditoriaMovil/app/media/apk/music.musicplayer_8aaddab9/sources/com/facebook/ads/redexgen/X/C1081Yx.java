package com.facebook.ads.redexgen.X;

import android.content.pm.PackageManager;
/* renamed from: com.facebook.ads.redexgen.X.Yx  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1081Yx implements InterfaceC03956v {
    public final /* synthetic */ C1069Yl A00;

    public C1081Yx(C1069Yl c1069Yl) {
        this.A00 = c1069Yl;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03956v
    public final C7A A5I() {
        PackageManager packageManager;
        PackageManager packageManager2;
        packageManager = this.A00.A02;
        if (packageManager != null) {
            C1069Yl c1069Yl = this.A00;
            packageManager2 = c1069Yl.A02;
            return c1069Yl.A0F(packageManager2.isSafeMode());
        }
        return this.A00.A07(AnonymousClass76.A07);
    }
}
