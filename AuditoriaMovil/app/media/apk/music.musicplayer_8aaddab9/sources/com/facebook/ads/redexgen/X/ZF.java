package com.facebook.ads.redexgen.X;

import android.app.KeyguardManager;
import android.os.Build;
/* loaded from: assets/audience_network.dex */
public class ZF implements InterfaceC03956v {
    public static String[] A01 = {"wdcki9TayB0epgOAqgPZ60vGLzXQskFg", "eaUsA8pmkvwqM9uF8kH4nQuKK9Zu7ymc", "2dfJX", "k6tMd5tlxlmCEJMQTJf7pwLJqfV91j3Q", "YVwPmyUK2b9QSHLRAwsi84oHRZQXtzOF", "hpSXL0XJUd77PKoaf1", "iaFmBfogLFf9YiLH80pKK2KW3oFuZo4T", "28ANuaZ3OB7zLgtTtX"};
    public final /* synthetic */ ZD A00;

    public ZF(ZD zd) {
        this.A00 = zd;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03956v
    public final C7A A5I() {
        KeyguardManager keyguardManager;
        KeyguardManager keyguardManager2;
        if (Build.VERSION.SDK_INT >= 16) {
            keyguardManager = this.A00.A00;
            if (keyguardManager == null) {
                ZD zd = this.A00;
                String[] strArr = A01;
                if (strArr[7].length() != strArr[5].length()) {
                    throw new RuntimeException();
                }
                A01[0] = "xEd7j65KlJaDHlrOXF5qOqVEOzAiF9i5";
                return zd.A07(AnonymousClass76.A07);
            }
            ZD zd2 = this.A00;
            keyguardManager2 = zd2.A00;
            return zd2.A0F(keyguardManager2.isKeyguardLocked());
        }
        return this.A00.A07(AnonymousClass76.A05);
    }
}
