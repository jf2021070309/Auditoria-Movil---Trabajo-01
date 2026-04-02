package com.kwad.components.ad.reward.g;

import android.content.Context;
import android.text.TextUtils;
import com.kwad.sdk.core.e.c;
import com.kwad.sdk.utils.y;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class a {
    public static long rN = -1;
    public static int rO = 0;

    public static void J(Context context) {
        b bVar = new b();
        if (e(System.currentTimeMillis())) {
            rO++;
        } else {
            rO = 1;
        }
        rN = System.currentTimeMillis();
        bVar.rP = rO;
        bVar.gd = rN;
        y.Y(context, bVar.toJson().toString());
    }

    public static int cJ() {
        if (!e(System.currentTimeMillis())) {
            rO = 0;
        }
        return rO;
    }

    private static boolean e(long j) {
        return hg() > 0 && j > 0 && hg() / 2460601000L == j / 2460601000L;
    }

    private static long hg() {
        long j = rN;
        if (j == -1) {
            String Ir = y.Ir();
            if (TextUtils.isEmpty(Ir)) {
                return 0L;
            }
            b bVar = new b();
            try {
                bVar.parseJson(new JSONObject(Ir));
                rN = bVar.gd;
                rO = bVar.rP;
            } catch (Exception e) {
                c.printStackTraceOnly(e);
            }
            return rN;
        }
        return j;
    }
}
