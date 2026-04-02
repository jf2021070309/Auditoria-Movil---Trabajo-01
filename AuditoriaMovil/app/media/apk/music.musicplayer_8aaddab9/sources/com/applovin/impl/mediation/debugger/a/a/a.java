package com.applovin.impl.mediation.debugger.a.a;

import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class a implements Comparable<a> {
    private final String a;

    /* renamed from: b  reason: collision with root package name */
    private final String f3478b;

    /* renamed from: c  reason: collision with root package name */
    private final MaxAdFormat f3479c;

    /* renamed from: d  reason: collision with root package name */
    private final c f3480d;

    /* renamed from: e  reason: collision with root package name */
    private final List<c> f3481e;

    public a(JSONObject jSONObject, Map<String, com.applovin.impl.mediation.debugger.a.b.b> map, m mVar) {
        this.a = JsonUtils.getString(jSONObject, "name", "");
        this.f3478b = JsonUtils.getString(jSONObject, "display_name", "");
        this.f3479c = MaxAdFormat.formatFromString(JsonUtils.getString(jSONObject, "format", null));
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "waterfalls", new JSONArray());
        this.f3481e = new ArrayList(jSONArray.length());
        c cVar = null;
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i2, (JSONObject) null);
            if (jSONObject2 != null) {
                c cVar2 = new c(jSONObject2, map, mVar);
                this.f3481e.add(cVar2);
                if (cVar == null && cVar2.c()) {
                    cVar = cVar2;
                }
            }
        }
        this.f3480d = cVar;
    }

    private c g() {
        if (this.f3481e.isEmpty()) {
            return null;
        }
        return this.f3481e.get(0);
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(a aVar) {
        return this.f3478b.compareToIgnoreCase(aVar.f3478b);
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.f3478b;
    }

    public String c() {
        MaxAdFormat maxAdFormat = this.f3479c;
        return maxAdFormat != null ? maxAdFormat.getDisplayName() : "Unknown";
    }

    public MaxAdFormat d() {
        return this.f3479c;
    }

    public c e() {
        c cVar = this.f3480d;
        return cVar != null ? cVar : g();
    }

    public String f() {
        StringBuilder y = e.a.d.a.a.y("\n---------- ");
        e.a.d.a.a.L(y, this.f3478b, " ----------", "\nIdentifier - ");
        y.append(this.a);
        y.append("\nFormat     - ");
        y.append(c());
        return y.toString();
    }
}
