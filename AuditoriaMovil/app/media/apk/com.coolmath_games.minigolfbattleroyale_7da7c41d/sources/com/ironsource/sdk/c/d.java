package com.ironsource.sdk.c;

import android.webkit.WebView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.NativeProtocol;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class d {
    public static final String a = d.class.getSimpleName();
    private static d c = null;
    public Map<String, e> b = Collections.synchronizedMap(new HashMap());

    public static synchronized d a() {
        d dVar;
        synchronized (d.class) {
            if (c == null) {
                c = new d();
            }
            dVar = c;
        }
        return dVar;
    }

    public static String a(JSONObject jSONObject) {
        return (jSONObject == null || !jSONObject.has("adViewId")) ? (jSONObject == null || !jSONObject.has(NativeProtocol.WEB_DIALOG_PARAMS)) ? "" : new JSONObject(jSONObject.getString(NativeProtocol.WEB_DIALOG_PARAMS)).getString("adViewId") : jSONObject.getString("adViewId");
    }

    public static boolean b(JSONObject jSONObject) {
        try {
            return jSONObject.getBoolean("shouldCreateContainer");
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    private static com.ironsource.sdk.a d(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.getString("adSize"));
            String obj = jSONObject2.get(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY).toString();
            String obj2 = jSONObject2.get(ViewHierarchyConstants.DIMENSION_WIDTH_KEY).toString();
            return new com.ironsource.sdk.a(Integer.parseInt(obj2), Integer.parseInt(obj), jSONObject2.get("label").toString());
        } catch (Exception unused) {
            return new com.ironsource.sdk.a();
        }
    }

    public final WebView a(String str) {
        e eVar;
        if (str.isEmpty() || !this.b.containsKey(str) || (eVar = this.b.get(str)) == null) {
            return null;
        }
        return eVar.a();
    }

    public com.ironsource.sdk.a c(JSONObject jSONObject) {
        com.ironsource.sdk.a aVar = new com.ironsource.sdk.a();
        try {
            return d(jSONObject);
        } catch (Exception e) {
            e.printStackTrace();
            return aVar;
        }
    }
}
