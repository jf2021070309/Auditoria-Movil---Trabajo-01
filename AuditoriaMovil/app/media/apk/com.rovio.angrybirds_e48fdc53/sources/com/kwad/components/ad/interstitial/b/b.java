package com.kwad.components.ad.interstitial.b;

import android.content.Context;
import android.text.TextUtils;
import com.kwad.sdk.core.e.c;
import com.kwad.sdk.utils.y;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class b extends com.kwad.sdk.core.response.a.a {
    private static SimpleDateFormat gc = new SimpleDateFormat("yyyy-MM-dd");
    public long gd = -1;
    public int iX = 0;
    public int iY = 0;

    public static void J(Context context) {
        String Ip = y.Ip();
        b bVar = new b();
        if (TextUtils.isEmpty(Ip)) {
            bVar.iX = 1;
            bVar.gd = System.currentTimeMillis();
            y.V(context, bVar.toJson().toString());
            return;
        }
        try {
            bVar.parseJson(new JSONObject(Ip));
            if (b(bVar.gd, System.currentTimeMillis())) {
                bVar.iX++;
            } else {
                bVar.iX = 1;
                bVar.iY = 0;
                bVar.gd = System.currentTimeMillis();
            }
            y.V(context, bVar.toJson().toString());
        } catch (Exception e) {
            c.printStackTraceOnly(e);
        }
    }

    public static void K(Context context) {
        String Ip = y.Ip();
        b bVar = new b();
        if (TextUtils.isEmpty(Ip)) {
            bVar.iY = 1;
            bVar.gd = System.currentTimeMillis();
            y.V(context, bVar.toJson().toString());
            return;
        }
        try {
            bVar.parseJson(new JSONObject(Ip));
            if (b(bVar.gd, System.currentTimeMillis())) {
                bVar.iY++;
            } else {
                bVar.iY = 1;
                bVar.iX = 0;
                bVar.gd = System.currentTimeMillis();
            }
            y.V(context, bVar.toJson().toString());
        } catch (Exception e) {
            c.printStackTraceOnly(e);
        }
    }

    private static boolean b(long j, long j2) {
        if (j > 0 && j2 > 0) {
            try {
                return gc.format(new Date(j)).equals(gc.format(new Date(j2)));
            } catch (Exception e) {
                c.printStackTraceOnly(e);
            }
        }
        return false;
    }

    public static int cJ() {
        String Ip = y.Ip();
        if (TextUtils.isEmpty(Ip)) {
            return 0;
        }
        b bVar = new b();
        try {
            bVar.parseJson(new JSONObject(Ip));
            return bVar.iX;
        } catch (Exception e) {
            c.printStackTraceOnly(e);
            return 0;
        }
    }

    public static int cK() {
        String Ip = y.Ip();
        if (TextUtils.isEmpty(Ip)) {
            return 0;
        }
        b bVar = new b();
        try {
            bVar.parseJson(new JSONObject(Ip));
            return bVar.iY;
        } catch (Exception e) {
            c.printStackTraceOnly(e);
            return 0;
        }
    }
}
