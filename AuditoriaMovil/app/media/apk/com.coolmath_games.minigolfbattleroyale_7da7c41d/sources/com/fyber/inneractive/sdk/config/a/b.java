package com.fyber.inneractive.sdk.config.a;

import com.facebook.internal.NativeProtocol;
import com.facebook.internal.ServerProtocol;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class b {
    private static final String e = b.class.getSimpleName();
    public String a;
    int b;
    final List<k> c = new ArrayList();
    List<d> d = new ArrayList();

    private b() {
    }

    public static b a(JSONObject jSONObject) throws Exception {
        b bVar = new b();
        bVar.a = jSONObject.getString("id");
        bVar.b = jSONObject.optInt("perc", 10);
        JSONArray jSONArray = jSONObject.getJSONArray("variants");
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            k kVar = new k();
            kVar.a = jSONObject2.getString("id");
            kVar.b = jSONObject2.getInt("perc");
            JSONObject optJSONObject = jSONObject2.optJSONObject(NativeProtocol.WEB_DIALOG_PARAMS);
            if (optJSONObject != null) {
                kVar.a(optJSONObject);
            }
            bVar.c.add(kVar);
        }
        a(bVar, jSONObject.optJSONObject("include"), true);
        a(bVar, jSONObject.optJSONObject("exclude"), false);
        return bVar;
    }

    private static void a(b bVar, JSONObject jSONObject, boolean z) throws Exception {
        d jVar;
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                char c = 65535;
                switch (next.hashCode()) {
                    case -1335432629:
                        if (next.equals("demand")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -977436259:
                        if (next.equals("pub_id")) {
                            c = 3;
                            break;
                        }
                        break;
                    case -212583340:
                        if (next.equals("placement_type")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 3556:
                        if (next.equals("os")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 113722:
                        if (next.equals(ServerProtocol.DIALOG_PARAM_SDK_VERSION)) {
                            c = 0;
                            break;
                        }
                        break;
                }
                if (c == 0) {
                    jVar = new j(jSONObject.getString(next), z);
                } else if (c == 1) {
                    jVar = new c(jSONObject.getJSONArray(next), z);
                } else if (c == 2) {
                    jVar = new f(jSONObject.getString(next), z);
                } else if (c == 3) {
                    jVar = new i(jSONObject.getJSONArray(next), z);
                } else {
                    jVar = c != 4 ? null : new h(jSONObject.getJSONArray(next), z);
                }
                if (jVar != null) {
                    bVar.d.add(jVar);
                } else {
                    IAlog.b(String.format("%s: Unsupported filter type: %s", e, next), new Object[0]);
                }
            }
        }
    }

    public final d a(Class cls) {
        for (d dVar : this.d) {
            if (cls.equals(dVar.getClass())) {
                return dVar;
            }
        }
        return null;
    }

    public String toString() {
        return String.format("experiment: id=%s, variants=%s, filters=%s", this.a, this.c, this.d);
    }
}
