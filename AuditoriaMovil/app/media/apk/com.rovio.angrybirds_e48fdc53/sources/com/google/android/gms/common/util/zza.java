package com.google.android.gms.common.util;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import android.os.SystemClock;
/* loaded from: classes2.dex */
public final class zza {
    private static long zzgt;
    private static final IntentFilter filter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    private static float zzgu = Float.NaN;

    public static int zzg(Context context) {
        boolean isScreenOn;
        if (context == null || context.getApplicationContext() == null) {
            return -1;
        }
        Intent registerReceiver = context.getApplicationContext().registerReceiver(null, filter);
        boolean z = ((registerReceiver == null ? 0 : registerReceiver.getIntExtra("plugged", 0)) & 7) != 0;
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            return -1;
        }
        if (PlatformVersion.isAtLeastKitKatWatch()) {
            isScreenOn = powerManager.isInteractive();
        } else {
            isScreenOn = powerManager.isScreenOn();
        }
        return ((isScreenOn ? 1 : 0) << 1) | (z ? 1 : 0);
    }

    public static synchronized float zzh(Context context) {
        float f;
        synchronized (zza.class) {
            if (SystemClock.elapsedRealtime() - zzgt < 60000 && !Float.isNaN(zzgu)) {
                f = zzgu;
            } else {
                Intent registerReceiver = context.getApplicationContext().registerReceiver(null, filter);
                if (registerReceiver != null) {
                    zzgu = registerReceiver.getIntExtra("level", -1) / registerReceiver.getIntExtra("scale", -1);
                }
                zzgt = SystemClock.elapsedRealtime();
                f = zzgu;
            }
        }
        return f;
    }
}
