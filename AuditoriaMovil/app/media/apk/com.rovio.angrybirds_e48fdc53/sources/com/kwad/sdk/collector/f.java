package com.kwad.sdk.collector;

import android.content.Context;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.utils.aj;
import com.kwad.sdk.utils.al;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
/* loaded from: classes.dex */
public final class f {
    private static g aK(Context context) {
        boolean cs = al.cs(context);
        com.kwad.sdk.core.e.c.d("InfoCollector", "queryAccessibilityServicePermission result: " + cs);
        return new g(com.kuaishou.weapon.p0.g.k, cs ? g.PERMISSION_GRANTED : g.PERMISSION_DENIED);
    }

    private static List<g> aL(Context context) {
        String[] cr;
        ArrayList arrayList = new ArrayList();
        if (context != null && (cr = aj.cr(context)) != null) {
            for (String str : cr) {
                int ao = al.ao(context, str);
                arrayList.add(new g(str, ao == 0 ? g.PERMISSION_GRANTED : ao == -1 ? g.PERMISSION_DENIED : g.ajQ));
            }
        }
        return arrayList;
    }

    public static JSONArray yE() {
        Context context = ServiceProvider.getContext();
        List<g> aL = aL(context);
        aL.add(aK(context));
        return g.p(aL);
    }
}
