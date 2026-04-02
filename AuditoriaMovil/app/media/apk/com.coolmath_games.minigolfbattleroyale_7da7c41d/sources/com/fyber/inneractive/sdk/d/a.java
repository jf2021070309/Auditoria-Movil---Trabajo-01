package com.fyber.inneractive.sdk.d;

import android.app.Application;
import android.content.SharedPreferences;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveError;
import com.fyber.inneractive.sdk.h.n;
import com.fyber.inneractive.sdk.j.e;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
/* loaded from: classes.dex */
public final class a<T extends com.fyber.inneractive.sdk.j.e> extends com.fyber.inneractive.sdk.f.a {
    public static final String a = "24";
    public static final String b = "1";
    private final T d;
    private final InneractiveAdRequest e;
    private final JSONArray f;

    public a(T t, InneractiveAdRequest inneractiveAdRequest, String str, JSONArray jSONArray) {
        super(str);
        this.d = t;
        this.e = inneractiveAdRequest;
        this.f = jSONArray;
    }

    public final void a(final InneractiveError inneractiveError) {
        com.fyber.inneractive.sdk.util.m.a(new Runnable() { // from class: com.fyber.inneractive.sdk.d.a.1
            @Override // java.lang.Runnable
            public final void run() {
                if (a.this.e == null || a.this.d == null || a.this.d.j == null || a.this.d.u == null) {
                    return;
                }
                String str = a.this.d.j;
                Map<String, String> map = a.this.d.u;
                String a2 = IAConfigManager.c().a.a("max_failed_creatives_interval_hours", a.a);
                String a3 = IAConfigManager.c().a.a("max_failed_creatives_per_interval", a.b);
                int a4 = com.fyber.inneractive.sdk.util.q.a(a2, 24);
                int a5 = com.fyber.inneractive.sdk.util.q.a(a3, 1);
                Application p = com.fyber.inneractive.sdk.util.l.p();
                if (p != null) {
                    SharedPreferences sharedPreferences = p.getSharedPreferences("IAConfigPrefs", 0);
                    JSONArray jSONArray = new JSONArray();
                    try {
                        jSONArray = new JSONArray(sharedPreferences.getString("lt", "[]"));
                    } catch (JSONException unused) {
                    }
                    CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                    if (a.this.a() && !com.fyber.inneractive.sdk.f.a.a(a4, a5, jSONArray, copyOnWriteArrayList)) {
                        copyOnWriteArrayList.add(Long.valueOf(System.currentTimeMillis()));
                        a.a(a.this.e, a.this.d, str, com.fyber.inneractive.sdk.util.q.a(map), inneractiveError, a.this.f);
                    }
                    sharedPreferences.edit().putString("lt", new JSONArray((Collection) copyOnWriteArrayList).toString()).apply();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.f.a
    public final boolean a() {
        return IAConfigManager.c().a.a(this.c, false);
    }

    static /* synthetic */ void a(InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.j.e eVar, String str, String str2, InneractiveError inneractiveError, JSONArray jSONArray) {
        n.a aVar = new n.a(com.fyber.inneractive.sdk.h.m.IA_AD_FAILURE_DATA, inneractiveAdRequest, eVar, jSONArray);
        aVar.a(new n.b().a("raw_response", str).a("headers", str2).a("error_code", inneractiveError.description()));
        aVar.b(null);
    }
}
