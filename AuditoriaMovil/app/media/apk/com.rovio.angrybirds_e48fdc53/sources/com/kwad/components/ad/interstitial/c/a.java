package com.kwad.components.ad.interstitial.c;

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
    public long iZ = -1;
    public int ja = 0;

    public static void L(Context context) {
        String Iu = y.Iu();
        a aVar = new a();
        if (TextUtils.isEmpty(Iu)) {
            aVar.ja = 1;
            aVar.iZ = System.currentTimeMillis();
            y.ab(context, aVar.toJson().toString());
            return;
        }
        try {
            aVar.parseJson(new JSONObject(Iu));
            if (b(aVar.iZ, System.currentTimeMillis())) {
                aVar.ja++;
            } else {
                aVar.ja = 1;
                aVar.iZ = System.currentTimeMillis();
            }
            y.ab(context, aVar.toJson().toString());
        } catch (Exception e) {
            c.printStackTrace(e);
        }
    }

    private static boolean b(long j, long j2) {
        if (j > 0 && j2 > 0) {
            try {
                return gc.format(new Date(j)).equals(gc.format(new Date(j2)));
            } catch (Exception e) {
                c.printStackTrace(e);
            }
        }
        return false;
    }

    public static int cL() {
        String Iu = y.Iu();
        if (TextUtils.isEmpty(Iu)) {
            return 0;
        }
        a aVar = new a();
        try {
            aVar.parseJson(new JSONObject(Iu));
            if (b(aVar.iZ, System.currentTimeMillis())) {
                return aVar.ja;
            }
            return 0;
        } catch (Exception e) {
            c.printStackTrace(e);
            return 0;
        }
    }
}
