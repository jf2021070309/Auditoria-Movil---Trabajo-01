package com.kwad.sdk.utils;

import android.content.Context;
import android.os.Build;
import android.os.PowerManager;
import android.os.SystemClock;
/* loaded from: classes3.dex */
public final class an {
    private static volatile an aJe = new an();
    private volatile boolean aJf;
    private volatile long aJg = 0;
    private volatile PowerManager aJh;

    public static an IM() {
        return aJe;
    }

    public final boolean ct(Context context) {
        if (this.aJg <= 0 || SystemClock.elapsedRealtime() - this.aJg >= 600) {
            if (this.aJh == null && context != null) {
                synchronized (this) {
                    if (this.aJh == null) {
                        this.aJh = (PowerManager) context.getApplicationContext().getSystemService("power");
                    }
                }
            }
            this.aJf = this.aJh != null ? Build.VERSION.SDK_INT >= 20 ? this.aJh.isInteractive() : this.aJh.isScreenOn() : false;
            this.aJg = SystemClock.elapsedRealtime();
            return this.aJf;
        }
        return this.aJf;
    }
}
