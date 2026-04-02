package com.kuaishou.weapon.p0;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
/* loaded from: classes.dex */
public class bu {
    public static String a(Context context) {
        int i = 0;
        try {
            Intent d = d(context);
            if (d != null) {
                i = (int) ((d.getIntExtra("level", -1) / d.getIntExtra("scale", -1)) * 100.0f);
            }
            return i + "%";
        } catch (Throwable th) {
            return null;
        }
    }

    public static String b(Context context) {
        try {
            int intExtra = d(context).getIntExtra("plugged", -1);
            return intExtra != 1 ? intExtra != 2 ? intExtra != 4 ? "" : "Wireless charger" : "USB charger" : "AC charger";
        } catch (Throwable th) {
            return null;
        }
    }

    public static int c(Context context) {
        try {
            int intExtra = d(context).getIntExtra("health", -1);
            if (intExtra != 2) {
                if (intExtra != 3) {
                    if (intExtra != 4) {
                        if (intExtra != 5) {
                            return intExtra != 7 ? 6 : 1;
                        }
                        return 5;
                    }
                    return 2;
                }
                return 4;
            }
            return 3;
        } catch (Throwable th) {
            return -1;
        }
    }

    private static Intent d(Context context) {
        return context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
    }
}
