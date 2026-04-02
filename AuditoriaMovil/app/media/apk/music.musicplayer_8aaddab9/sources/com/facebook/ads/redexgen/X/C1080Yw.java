package com.facebook.ads.redexgen.X;

import android.content.pm.PackageManager;
import android.os.Build;
/* renamed from: com.facebook.ads.redexgen.X.Yw  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1080Yw implements InterfaceC03956v {
    public static String[] A01 = {"eOUuWViEzFdpoMILAqmgKfGD", "kQ8zGky5wq3o9AT", "ncGQnuO4sM8XFQVxbr6Mt1Vf36DFujo3", "a4nYvm2BizGaG1Ug1SxTpBLIw0WxQ6vz", "jAlZY9MHNrHTDDv2DRP1sCieuZx8QBhv", "RCRcS7R4oQOTyLjlpIEX5API7Ni0gnf1", "stcG16G11KY1ooFu5mTwbs8KzP9kRkND", "k7goAJY4JhsqFIUQ56a5dCg3eq5QWQcp"};
    public final /* synthetic */ C1069Yl A00;

    public C1080Yw(C1069Yl c1069Yl) {
        this.A00 = c1069Yl;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03956v
    public final C7A A5I() {
        PackageManager packageManager;
        PackageManager packageManager2;
        PackageManager packageManager3;
        PackageManager packageManager4;
        if (Build.VERSION.SDK_INT >= 26) {
            packageManager = this.A00.A02;
            if (packageManager != null) {
                packageManager2 = this.A00.A02;
                if (packageManager2.getPackageInstaller() != null) {
                    packageManager3 = this.A00.A02;
                    if (packageManager3.getPackageInstaller().getSessionInfo(0) != null) {
                        C1069Yl c1069Yl = this.A00;
                        packageManager4 = c1069Yl.A02;
                        return c1069Yl.A04(packageManager4.getPackageInstaller().getSessionInfo(0).getInstallReason());
                    }
                }
            }
            C1069Yl c1069Yl2 = this.A00;
            AnonymousClass76 anonymousClass76 = AnonymousClass76.A07;
            if (A01[4].charAt(16) != 'D') {
                throw new RuntimeException();
            }
            A01[4] = "aumDgxyAyTkwYeibDzhpdrzSDvCJmfPb";
            return c1069Yl2.A07(anonymousClass76);
        }
        return this.A00.A07(AnonymousClass76.A05);
    }
}
