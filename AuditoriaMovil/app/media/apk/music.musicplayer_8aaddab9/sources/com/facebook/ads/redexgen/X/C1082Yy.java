package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.pm.PackageManager;
/* renamed from: com.facebook.ads.redexgen.X.Yy  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1082Yy implements InterfaceC03956v {
    public final /* synthetic */ C1069Yl A00;

    public C1082Yy(C1069Yl c1069Yl) {
        this.A00 = c1069Yl;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03956v
    public final C7A A5I() {
        PackageManager packageManager;
        PackageManager packageManager2;
        Context context;
        packageManager = this.A00.A02;
        if (packageManager != null) {
            C1069Yl c1069Yl = this.A00;
            packageManager2 = c1069Yl.A02;
            context = this.A00.A00;
            return c1069Yl.A08(packageManager2.getInstallerPackageName(context.getPackageName()));
        }
        return this.A00.A07(AnonymousClass76.A07);
    }
}
