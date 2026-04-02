package com.kwad.components.ad.interstitial.b;

import android.content.Context;
import android.text.TextUtils;
import com.kwad.sdk.core.e.c;
import com.kwad.sdk.utils.y;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class a extends com.kwad.sdk.core.response.a.a {
    private static SimpleDateFormat gc = new SimpleDateFormat("yyyy-MM-dd");
    public long gd = -1;
    public int iW = 0;

    public static void J(Context context) {
        String Iq = y.Iq();
        a aVar = new a();
        if (TextUtils.isEmpty(Iq)) {
            aVar.iW = 1;
            aVar.gd = System.currentTimeMillis();
            y.W(context, aVar.toJson().toString());
            return;
        }
        try {
            aVar.parseJson(new JSONObject(Iq));
            if (b(aVar.gd, System.currentTimeMillis())) {
                aVar.iW++;
            } else {
                aVar.iW = 1;
                aVar.gd = System.currentTimeMillis();
            }
            y.W(context, aVar.toJson().toString());
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
        String Iq = y.Iq();
        if (TextUtils.isEmpty(Iq)) {
            return 0;
        }
        a aVar = new a();
        try {
            aVar.parseJson(new JSONObject(Iq));
            if (b(aVar.gd, System.currentTimeMillis())) {
                return aVar.iW;
            }
            return 0;
        } catch (Exception e) {
            c.printStackTraceOnly(e);
            return 0;
        }
    }
}
