package com.kwad.sdk.crash.online.monitor.a;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class a extends com.kwad.sdk.core.response.a.a {
    public List<String> aBb = new ArrayList();
    public List<String> aBc = new ArrayList();
    public List<String> aBd = new ArrayList();
    public List<String> aBe = new ArrayList();
    public List<b> aBf = new ArrayList();
    public Map<String, b> aBg = new HashMap();
    public int aBh;
    public int aBi;
    public int aBj;
    public double aqX;

    public final boolean Fb() {
        return (this.aBj & 4) != 0;
    }

    public final boolean Fc() {
        return (this.aBj & 1) != 0;
    }

    public final boolean Fd() {
        return (this.aBj & 2) != 0;
    }

    public final boolean Fe() {
        return this.aBj == 0;
    }

    @Override // com.kwad.sdk.core.response.a.a
    public void afterParseJson(JSONObject jSONObject) {
        super.afterParseJson(jSONObject);
        List<b> list = this.aBf;
        if (list != null) {
            for (b bVar : list) {
                this.aBg.put(bVar.appId, bVar);
            }
            this.aBf.clear();
        }
    }

    public final b eK(String str) {
        if (this.aBg != null) {
            b bVar = TextUtils.isEmpty(str) ? null : this.aBg.get(str);
            return bVar == null ? this.aBg.get("000000000") : bVar;
        }
        return null;
    }
}
