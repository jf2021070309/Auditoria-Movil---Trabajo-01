package com.facebook.ads.redexgen.X;

import android.app.ActivityManager;
import android.os.Build;
import ch.qos.logback.core.util.FileSize;
/* renamed from: com.facebook.ads.redexgen.X.as  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1164as implements InterfaceC03956v {
    public final /* synthetic */ C1155aj A00;

    public C1164as(C1155aj c1155aj) {
        this.A00 = c1155aj;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03956v
    public final C7A A5I() {
        ActivityManager activityManager;
        ActivityManager activityManager2;
        if (Build.VERSION.SDK_INT >= 16) {
            activityManager = this.A00.A02;
            if (activityManager != null) {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager2 = this.A00.A02;
                activityManager2.getMemoryInfo(memoryInfo);
                return this.A00.A06(memoryInfo.totalMem / FileSize.MB_COEFFICIENT);
            }
            return this.A00.A07(AnonymousClass76.A07);
        }
        return this.A00.A07(AnonymousClass76.A05);
    }
}
