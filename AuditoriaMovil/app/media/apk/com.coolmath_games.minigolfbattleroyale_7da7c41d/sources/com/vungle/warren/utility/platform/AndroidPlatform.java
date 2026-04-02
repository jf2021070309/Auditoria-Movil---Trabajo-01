package com.vungle.warren.utility.platform;

import android.os.Build;
/* loaded from: classes2.dex */
public class AndroidPlatform implements Platform {
    @Override // com.vungle.warren.utility.platform.Platform
    public boolean isAtLeastMinimumSDK() {
        return Build.VERSION.SDK_INT >= 21;
    }
}
