package com.ironsource.sdk.service;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.iab.omid.library.ironsrc.Omid;
import com.ironsource.environment.h;
import com.ironsource.mediationsdk.C0119m;
import com.ironsource.sdk.utils.IronSourceQaProperties;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class c {
    private C0119m a = new C0119m();

    public final void a() {
        HashMap hashMap = new HashMap();
        hashMap.put("omv", Omid.getVersion());
        hashMap.put("ompv", "7");
        C0119m.a(hashMap);
    }

    public final void a(Context context) {
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (Build.VERSION.SDK_INT >= 19) {
                C0119m.a("imm", Boolean.valueOf(h.a(activity)));
            }
        }
    }

    public final void b() {
        String controllerConfig = SDKUtils.getControllerConfig();
        if (TextUtils.isEmpty(controllerConfig)) {
            return;
        }
        try {
            C0119m.a("cncdn", new JSONObject(controllerConfig).opt("chinaCDN"));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public final void b(Context context) {
        C0119m.a("gpi", Boolean.valueOf(d.a(context)));
    }

    public final void c() {
        JSONObject jSONObject = new JSONObject(IronSourceQaProperties.getInstance().getParameters());
        if (jSONObject.length() > 0) {
            C0119m.a("debug", jSONObject);
        }
    }
}
