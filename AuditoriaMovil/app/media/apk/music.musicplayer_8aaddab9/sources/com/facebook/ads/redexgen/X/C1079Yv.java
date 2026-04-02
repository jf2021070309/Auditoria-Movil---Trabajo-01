package com.facebook.ads.redexgen.X;

import android.content.pm.PackageManager;
import android.os.Build;
/* renamed from: com.facebook.ads.redexgen.X.Yv  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1079Yv implements InterfaceC03956v {
    public final /* synthetic */ C1069Yl A00;

    public C1079Yv(C1069Yl c1069Yl) {
        this.A00 = c1069Yl;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03956v
    public final C7A A5I() {
        PackageManager packageManager;
        PackageManager packageManager2;
        if (Build.VERSION.SDK_INT >= 26) {
            packageManager = this.A00.A02;
            if (packageManager != null) {
                C1069Yl c1069Yl = this.A00;
                packageManager2 = c1069Yl.A02;
                return c1069Yl.A0F(packageManager2.canRequestPackageInstalls());
            }
            return this.A00.A07(AnonymousClass76.A07);
        }
        return this.A00.A07(AnonymousClass76.A05);
    }
}
