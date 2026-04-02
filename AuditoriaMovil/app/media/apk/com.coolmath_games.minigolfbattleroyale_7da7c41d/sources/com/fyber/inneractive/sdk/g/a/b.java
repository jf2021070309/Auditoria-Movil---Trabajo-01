package com.fyber.inneractive.sdk.g.a;

import com.facebook.appevents.integrity.IntegrityManager;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class b implements com.fyber.inneractive.sdk.j.i {
    public g a;
    public h b;
    public int c;
    public int d;
    public String e;
    public String f;
    Map<r, List<String>> g = new HashMap();

    public b(g gVar, int i, int i2) {
        this.a = gVar;
        this.c = i;
        this.d = i2;
    }

    @Override // com.fyber.inneractive.sdk.j.i
    public final void a(r rVar, String str) {
        List<String> list = this.g.get(rVar);
        if (list == null) {
            list = new ArrayList<>();
            this.g.put(rVar, list);
        }
        list.add(str);
    }

    @Override // com.fyber.inneractive.sdk.j.i
    public final List<String> a(r rVar) {
        Map<r, List<String>> map;
        if (rVar == null || (map = this.g) == null) {
            return null;
        }
        return map.get(rVar);
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("w", this.c);
            jSONObject.put("h", this.d);
            jSONObject.put("type", this.a.toString());
            jSONObject.put("creativeType", this.b != null ? this.b.e : IntegrityManager.INTEGRITY_TYPE_NONE);
            jSONObject.put("content", this.e);
        } catch (JSONException e) {
            IAlog.b("Vast Parser: Failed creating Companion json object: %s", e.getMessage());
        }
        return jSONObject;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Companion:  w:");
        sb.append(this.c);
        sb.append(" h:");
        sb.append(this.d);
        sb.append(" type:");
        sb.append(this.a.toString());
        sb.append(" creativeType: ");
        h hVar = this.b;
        sb.append(hVar != null ? hVar.e : IntegrityManager.INTEGRITY_TYPE_NONE);
        sb.append(" ctr:");
        sb.append(this.f);
        sb.append(" events:");
        sb.append(this.g);
        return sb.toString();
    }
}
