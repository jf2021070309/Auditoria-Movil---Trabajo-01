package com.kwad.sdk.a.a.a;

import android.content.Context;
import android.text.TextUtils;
import com.kwad.sdk.core.e.c;
import com.kwad.sdk.utils.y;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class b {
    public static long rN = -1;
    public static int WY = 0;

    public static void J(Context context) {
        a aVar = new a();
        if (e(System.currentTimeMillis())) {
            WY++;
        } else {
            WY = 1;
        }
        rN = System.currentTimeMillis();
        aVar.WY = WY;
        aVar.gd = rN;
        y.ah(context, aVar.toJson().toString());
    }

    public static int cJ() {
        if (!e(System.currentTimeMillis())) {
            WY = 0;
        }
        return WY;
    }

    private static boolean e(long j) {
        return hg() > 0 && j > 0 && hg() / 2460601000L == j / 2460601000L;
    }

    private static long hg() {
        long j = rN;
        if (j == -1) {
            String Iy = y.Iy();
            if (TextUtils.isEmpty(Iy)) {
                return 0L;
            }
            a aVar = new a();
            try {
                aVar.parseJson(new JSONObject(Iy));
                rN = aVar.gd;
                WY = aVar.WY;
            } catch (Exception e) {
                c.printStackTraceOnly(e);
            }
            return rN;
        }
        return j;
    }
}
