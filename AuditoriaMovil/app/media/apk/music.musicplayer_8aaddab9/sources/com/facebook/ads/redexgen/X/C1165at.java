package com.facebook.ads.redexgen.X;

import android.app.ActivityManager;
import android.os.Build;
/* renamed from: com.facebook.ads.redexgen.X.at  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1165at implements InterfaceC03956v {
    public final /* synthetic */ C1155aj A00;

    public C1165at(C1155aj c1155aj) {
        this.A00 = c1155aj;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03956v
    public final C7A A5I() {
        ActivityManager activityManager;
        ActivityManager activityManager2;
        if (Build.VERSION.SDK_INT >= 23) {
            activityManager = this.A00.A02;
            if (activityManager != null) {
                C1155aj c1155aj = this.A00;
                activityManager2 = c1155aj.A02;
                return c1155aj.A04(activityManager2.getLockTaskModeState());
            }
            return this.A00.A07(AnonymousClass76.A07);
        }
        return this.A00.A07(AnonymousClass76.A05);
    }
}
