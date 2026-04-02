package com.facebook.ads.redexgen.X;

import android.app.ActivityManager;
/* renamed from: com.facebook.ads.redexgen.X.al  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1157al implements InterfaceC03956v {
    public final /* synthetic */ C1155aj A00;

    public C1157al(C1155aj c1155aj) {
        this.A00 = c1155aj;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03956v
    public final C7A A5I() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo;
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo2;
        runningAppProcessInfo = this.A00.A01;
        if (runningAppProcessInfo != null) {
            C1155aj c1155aj = this.A00;
            runningAppProcessInfo2 = c1155aj.A01;
            return c1155aj.A08(runningAppProcessInfo2.processName);
        }
        return this.A00.A07(AnonymousClass76.A07);
    }
}
