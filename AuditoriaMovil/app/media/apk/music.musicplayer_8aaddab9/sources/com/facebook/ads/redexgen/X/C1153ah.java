package com.facebook.ads.redexgen.X;

import android.content.pm.ApplicationInfo;
/* renamed from: com.facebook.ads.redexgen.X.ah  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1153ah implements InterfaceC03956v {
    public final /* synthetic */ C1134aO A00;

    public C1153ah(C1134aO c1134aO) {
        this.A00 = c1134aO;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03956v
    public final C7A A5I() {
        ApplicationInfo applicationInfo;
        ApplicationInfo applicationInfo2;
        applicationInfo = this.A00.A01;
        if (applicationInfo != null) {
            C1134aO c1134aO = this.A00;
            applicationInfo2 = c1134aO.A01;
            return c1134aO.A04(applicationInfo2.theme);
        }
        return this.A00.A07(AnonymousClass76.A07);
    }
}
