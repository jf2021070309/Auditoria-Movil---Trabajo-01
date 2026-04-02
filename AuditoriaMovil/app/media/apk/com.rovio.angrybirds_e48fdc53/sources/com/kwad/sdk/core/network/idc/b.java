package com.kwad.sdk.core.network.idc;

import android.content.Context;
import com.kwad.sdk.core.e.c;
import com.kwad.sdk.crash.utils.h;
import com.kwad.sdk.utils.t;
import com.kwad.sdk.utils.y;
import java.io.IOException;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class b {
    public static void a(Context context, com.kwad.sdk.core.network.idc.a.a aVar) {
        y.a(context, "ksadsdk_idc", "idc_data", aVar == null ? "" : aVar.toJson().toString());
    }

    public static void a(Context context, Map<String, String> map) {
        y.a(context, "ksadsdk_idc", "idc_current", (map == null || map.isEmpty()) ? "" : new JSONObject(map).toString());
    }

    public static com.kwad.sdk.core.network.idc.a.a aZ(Context context) {
        try {
            return com.kwad.sdk.core.network.idc.a.a.de(h.F(context, "ksad_idc.json"));
        } catch (IOException e) {
            c.printStackTraceOnly(e);
            return new com.kwad.sdk.core.network.idc.a.a();
        }
    }

    public static com.kwad.sdk.core.network.idc.a.a ba(Context context) {
        return com.kwad.sdk.core.network.idc.a.a.de(y.b(context, "ksadsdk_idc", "idc_data", ""));
    }

    public static Map<String, String> bb(Context context) {
        return t.parseJSON2MapString(y.b(context, "ksadsdk_idc", "idc_current", ""));
    }
}
