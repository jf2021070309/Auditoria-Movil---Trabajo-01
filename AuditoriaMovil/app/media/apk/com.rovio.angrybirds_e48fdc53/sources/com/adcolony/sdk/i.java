package com.adcolony.sdk;

import android.os.Bundle;
import java.util.HashMap;
/* loaded from: classes2.dex */
class i {
    private static int a;
    private static HashMap<String, Integer> b = new HashMap<>();
    private static HashMap<String, Integer> c = new HashMap<>();

    i() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(int i, Bundle bundle) {
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        switch (i) {
            case 0:
                if (currentTimeMillis - a < 5) {
                    return true;
                }
                a = currentTimeMillis;
                return false;
            case 1:
                if (bundle == null) {
                    return false;
                }
                String string = bundle.getString("zone_id");
                if (b.get(string) == null) {
                    b.put(string, Integer.valueOf(currentTimeMillis));
                }
                if (c.get(string) == null) {
                    c.put(string, 0);
                }
                if (currentTimeMillis - b.get(string).intValue() > 1) {
                    c.put(string, 1);
                    b.put(string, Integer.valueOf(currentTimeMillis));
                    return false;
                }
                int intValue = c.get(string).intValue() + 1;
                c.put(string, Integer.valueOf(intValue));
                return intValue > 3;
            default:
                return false;
        }
    }
}
