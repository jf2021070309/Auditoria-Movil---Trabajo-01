package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
/* loaded from: classes.dex */
final class c {
    private IntentFilter AFInAppEventParameterName = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    /* renamed from: com.appsflyer.internal.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static final class C0035c {
        static final c AFKeystoreWrapper = new c();
    }

    c() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final e values(Context context) {
        String str = null;
        float f = 0.0f;
        try {
            Intent registerReceiver = context.registerReceiver(null, this.AFInAppEventParameterName);
            if (registerReceiver != null) {
                if (2 == registerReceiver.getIntExtra("status", -1)) {
                    int intExtra = registerReceiver.getIntExtra("plugged", -1);
                    str = intExtra != 1 ? intExtra != 2 ? intExtra != 4 ? "other" : "wireless" : "usb" : "ac";
                } else {
                    str = "no";
                }
                int intExtra2 = registerReceiver.getIntExtra("level", -1);
                int intExtra3 = registerReceiver.getIntExtra("scale", -1);
                if (-1 != intExtra2 && -1 != intExtra3) {
                    f = (intExtra2 * 100.0f) / intExtra3;
                }
            }
        } catch (Throwable unused) {
        }
        return new e(f, str);
    }

    /* loaded from: classes.dex */
    static final class e {
        final String AFKeystoreWrapper;
        final float values;

        e(float f, String str) {
            this.values = f;
            this.AFKeystoreWrapper = str;
        }
    }
}
