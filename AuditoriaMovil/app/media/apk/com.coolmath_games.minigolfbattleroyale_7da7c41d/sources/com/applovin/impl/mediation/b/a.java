package com.applovin.impl.mediation.b;

import android.app.Activity;
import android.text.TextUtils;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.r;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class a extends com.applovin.impl.sdk.e.a {
    private final Activity a;

    public a(Activity activity, k kVar) {
        super("TaskAutoInitAdapters", kVar, true);
        this.a = activity;
    }

    private List<com.applovin.impl.mediation.a.e> a(JSONArray jSONArray, JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(new com.applovin.impl.mediation.a.e(JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null), jSONObject, this.b));
        }
        return arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        String str2 = (String) this.b.a(com.applovin.impl.sdk.c.d.x);
        if (StringUtils.isValidString(str2)) {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                List<com.applovin.impl.mediation.a.e> a = a(JsonUtils.getJSONArray(jSONObject, this.b.H().a() ? "test_mode_auto_init_adapters" : "auto_init_adapters", new JSONArray()), jSONObject);
                if (a.size() > 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Auto-initing ");
                    sb.append(a.size());
                    sb.append(" adapters");
                    sb.append(this.b.H().a() ? " in test mode" : "");
                    sb.append("...");
                    a(sb.toString());
                    if (TextUtils.isEmpty(this.b.s())) {
                        this.b.c("max");
                    } else if (!this.b.f()) {
                        r.i("AppLovinSdk", "Auto-initing adapters for non-MAX mediation provider: " + this.b.s());
                    }
                    if (this.a == null) {
                        r.i("AppLovinSdk", "\n**********\nFailed to initialize 3rd-party SDKs. Please make sure to initialize the AppLovin SDK with an Activity context.\n**********\n");
                        this.b.R().b(com.applovin.impl.sdk.d.f.p, 1L);
                        return;
                    }
                    for (final com.applovin.impl.mediation.a.e eVar : a) {
                        this.b.Q().b().execute(new Runnable() { // from class: com.applovin.impl.mediation.b.a.1
                            @Override // java.lang.Runnable
                            public void run() {
                                a aVar = a.this;
                                aVar.a("Auto-initing adapter: " + eVar);
                                a.this.b.B().a(eVar, a.this.a);
                            }
                        });
                    }
                }
            } catch (JSONException e) {
                e = e;
                str = "Failed to parse auto-init adapters JSON";
                a(str, e);
            } catch (Throwable th) {
                e = th;
                str = "Failed to auto-init adapters";
                a(str, e);
            }
        }
    }
}
