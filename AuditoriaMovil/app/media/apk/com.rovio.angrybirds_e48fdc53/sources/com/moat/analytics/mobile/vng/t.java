package com.moat.analytics.mobile.vng;

import android.graphics.Rect;
import android.view.View;
import com.moat.analytics.mobile.vng.NativeDisplayTracker;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
class t extends b implements NativeDisplayTracker {
    private final Map<String, String> f;
    private final Set<NativeDisplayTracker.MoatUserInteractionType> g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(View view, Map<String, String> map) {
        super(view, true, false);
        this.g = new HashSet();
        p.a(3, "NativeDisplayTracker", this, "Initializing.");
        this.f = map;
        g gVar = ((k) k.getInstance()).d;
        if (gVar != null) {
            super.a(gVar.b);
            super.a(gVar.a);
        }
        g();
        p.a("[SUCCESS] ", a() + " created for " + e() + ", with adIds:" + map.toString());
    }

    private static String a(Map<String, String> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i = 0; i < 8; i++) {
            String str = "moatClientLevel" + i;
            if (map.containsKey(str)) {
                linkedHashMap.put(str, map.get(str));
            }
        }
        for (int i2 = 0; i2 < 8; i2++) {
            String str2 = "moatClientSlicer" + i2;
            if (map.containsKey(str2)) {
                linkedHashMap.put(str2, map.get(str2));
            }
        }
        for (String str3 : map.keySet()) {
            if (!linkedHashMap.containsKey(str3)) {
                linkedHashMap.put(str3, map.get(str3));
            }
        }
        return new JSONObject(linkedHashMap).toString();
    }

    private void g() {
        if (this.a != null) {
            this.a.a(h());
        }
    }

    private String h() {
        try {
            String a = a(this.f);
            p.a(3, "NativeDisplayTracker", this, "Parsed ad ids = " + a);
            return "{\"adIds\":" + a + ", \"adKey\":\"" + this.b + "\", \"adSize\":" + i() + "}";
        } catch (Exception e) {
            m.a(e);
            return "";
        }
    }

    private String i() {
        try {
            Rect a = z.a(super.d());
            int width = a.width();
            int height = a.height();
            HashMap hashMap = new HashMap();
            hashMap.put("width", Integer.toString(width));
            hashMap.put("height", Integer.toString(height));
            return new JSONObject(hashMap).toString();
        } catch (Exception e) {
            m.a(e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.moat.analytics.mobile.vng.b
    public String a() {
        return "NativeDisplayTracker";
    }

    @Override // com.moat.analytics.mobile.vng.NativeDisplayTracker
    public void reportUserInteractionEvent(NativeDisplayTracker.MoatUserInteractionType moatUserInteractionType) {
        try {
            p.a(3, "NativeDisplayTracker", this, "reportUserInteractionEvent:" + moatUserInteractionType.name());
            if (this.g.contains(moatUserInteractionType)) {
                return;
            }
            this.g.add(moatUserInteractionType);
            JSONObject jSONObject = new JSONObject();
            jSONObject.accumulate("adKey", this.b);
            jSONObject.accumulate("event", moatUserInteractionType.name().toLowerCase());
            if (this.a != null) {
                this.a.b(jSONObject.toString());
            }
        } catch (JSONException e) {
            p.b(2, "NativeDisplayTracker", this, "Got JSON exception");
            m.a(e);
        } catch (Exception e2) {
            m.a(e2);
        }
    }
}
