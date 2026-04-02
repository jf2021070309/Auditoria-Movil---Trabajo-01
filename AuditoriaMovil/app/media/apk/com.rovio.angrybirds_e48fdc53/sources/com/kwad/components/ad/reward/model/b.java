package com.kwad.components.ad.reward.model;

import android.content.Context;
import android.text.TextUtils;
import com.kwad.sdk.utils.y;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class b extends com.kwad.sdk.core.response.a.a {
    private static SimpleDateFormat gc = new SimpleDateFormat("yyyy-MM-dd");
    public long iZ = -1;
    public int ja = 0;

    public static void L(Context context) {
        String It = y.It();
        b bVar = new b();
        if (TextUtils.isEmpty(It)) {
            bVar.ja = 1;
            bVar.iZ = System.currentTimeMillis();
            y.aa(context, bVar.toJson().toString());
            return;
        }
        try {
            bVar.parseJson(new JSONObject(It));
            if (b(bVar.iZ, System.currentTimeMillis())) {
                bVar.ja++;
            } else {
                bVar.ja = 1;
                bVar.iZ = System.currentTimeMillis();
            }
            y.aa(context, bVar.toJson().toString());
        } catch (Exception e) {
            com.kwad.sdk.core.e.c.printStackTrace(e);
        }
    }

    private static boolean b(long j, long j2) {
        if (j > 0 && j2 > 0) {
            try {
                return gc.format(new Date(j)).equals(gc.format(new Date(j2)));
            } catch (Exception e) {
                com.kwad.sdk.core.e.c.printStackTrace(e);
            }
        }
        return false;
    }

    public static int cL() {
        String It = y.It();
        if (TextUtils.isEmpty(It)) {
            return 0;
        }
        b bVar = new b();
        try {
            bVar.parseJson(new JSONObject(It));
            if (b(bVar.iZ, System.currentTimeMillis())) {
                return bVar.ja;
            }
            return 0;
        } catch (Exception e) {
            com.kwad.sdk.core.e.c.printStackTrace(e);
            return 0;
        }
    }
}
