package com.fyber.inneractive.sdk.f;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
/* loaded from: classes.dex */
public class a {
    protected final String c;

    public a(String str) {
        this.c = str;
    }

    public boolean a() {
        return IAConfigManager.c().a.a(this.c, false);
    }

    public static boolean a(int i, int i2, JSONArray jSONArray, List<Long> list) {
        if (i > 0 && i2 > 0) {
            long currentTimeMillis = System.currentTimeMillis() - TimeUnit.HOURS.toMillis(i);
            int i3 = 0;
            int i4 = 0;
            while (true) {
                if (i3 >= jSONArray.length()) {
                    break;
                }
                long optLong = jSONArray.optLong(i3, 0L);
                if (optLong > currentTimeMillis) {
                    i4++;
                    list.add(Long.valueOf(optLong));
                }
                i3++;
            }
            if (i4 >= i2) {
                return true;
            }
        }
        return false;
    }
}
