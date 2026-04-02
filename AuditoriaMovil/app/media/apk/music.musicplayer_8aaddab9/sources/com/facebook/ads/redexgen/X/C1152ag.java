package com.facebook.ads.redexgen.X;

import android.content.pm.ApplicationInfo;
import android.os.Build;
/* renamed from: com.facebook.ads.redexgen.X.ag  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1152ag implements InterfaceC03956v {
    public final /* synthetic */ C1134aO A00;

    public C1152ag(C1134aO c1134aO) {
        this.A00 = c1134aO;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03956v
    public final C7A A5I() {
        ApplicationInfo applicationInfo;
        ApplicationInfo applicationInfo2;
        if (Build.VERSION.SDK_INT >= 26) {
            applicationInfo = this.A00.A01;
            if (applicationInfo != null) {
                C1134aO c1134aO = this.A00;
                applicationInfo2 = c1134aO.A01;
                return c1134aO.A04(applicationInfo2.category);
            }
            return this.A00.A07(AnonymousClass76.A07);
        }
        return this.A00.A07(AnonymousClass76.A05);
    }
}
