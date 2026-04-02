package com.ironsource.sdk.a;

import android.util.Log;
import com.ironsource.sdk.a.f;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public final class d {
    private static d a;
    private com.ironsource.a.b b;

    private d() {
    }

    private static d a() {
        if (a == null) {
            a = new d();
        }
        return a;
    }

    public static void a(com.ironsource.a.a aVar, b bVar) {
        if (aVar != null) {
            try {
                a().b = new com.ironsource.a.b(aVar, bVar);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void a(f.a aVar) {
        a(aVar, new HashMap());
    }

    public static void a(f.a aVar, Map<String, Object> map) {
        com.ironsource.a.b bVar = a().b;
        if (bVar == null) {
            Log.d("sdk5Events", "logEvent failed eventsTracker doesn't exist");
            return;
        }
        if (map != null) {
            map.put("eventid", Integer.valueOf(aVar.b));
        }
        bVar.a(aVar.a, map);
    }
}
