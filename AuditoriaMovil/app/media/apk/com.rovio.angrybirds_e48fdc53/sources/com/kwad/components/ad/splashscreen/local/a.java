package com.kwad.components.ad.splashscreen.local;

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
    public long gd = 0;
    public int ge = 0;

    public static void T(Context context) {
        String Is = y.Is();
        a aVar = new a();
        if (TextUtils.isEmpty(Is)) {
            aVar.ge = 1;
            aVar.gd = System.currentTimeMillis();
            y.Z(context, aVar.toJson().toString());
            return;
        }
        try {
            aVar.parseJson(new JSONObject(Is));
            if (b(aVar.gd, System.currentTimeMillis())) {
                aVar.ge++;
            } else {
                aVar.ge = 1;
            }
            aVar.gd = System.currentTimeMillis();
            y.Z(context, aVar.toJson().toString());
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
}
