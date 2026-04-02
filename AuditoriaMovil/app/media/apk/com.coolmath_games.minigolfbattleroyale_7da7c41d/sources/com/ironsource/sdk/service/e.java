package com.ironsource.sdk.service;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.iab.omid.library.ironsrc.Omid;
import com.ironsource.environment.a;
import com.ironsource.environment.h;
import com.ironsource.sdk.utils.IronSourceQaProperties;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class e {
    private static e b;
    private JSONObject a = new JSONObject();

    private e() {
    }

    public static synchronized e a() {
        e eVar;
        synchronized (e.class) {
            if (b == null) {
                b = new e();
            }
            eVar = b;
        }
        return eVar;
    }

    private void a(Activity activity) {
        if (activity == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            a(SDKUtils.encodeString("immersiveMode"), Boolean.valueOf(h.a(activity)));
        }
        a("appOrientation", SDKUtils.translateRequestedOrientation(h.n(activity)));
    }

    private void a(Map<String, String> map) {
        if (map == null) {
            Log.d("TokenService", "collectDataFromExternalParams params=null");
            return;
        }
        for (String str : map.keySet()) {
            a(str, SDKUtils.encodeString(map.get(str)));
        }
    }

    private static void c() {
        HashMap hashMap = new HashMap();
        hashMap.put("omidVersion", Omid.getVersion());
        hashMap.put("omidPartnerVersion", "7");
        b.a(hashMap);
    }

    private void c(final Context context) {
        if (context == null) {
            return;
        }
        try {
            new Thread(new Runnable() { // from class: com.ironsource.sdk.service.e.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        e.this.a(b.a(context));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            a("chinaCDN", new JSONObject(str).opt("chinaCDN"));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private static void d() {
        if (IronSourceQaProperties.isInitialized()) {
            b.a(IronSourceQaProperties.getInstance().getParameters());
        }
    }

    private void d(Context context) {
        if (context == null) {
            return;
        }
        a(b.c(context));
        a(b.b(context));
    }

    public final String a(Context context) {
        try {
            return a.AnonymousClass1.c(b(context).toString());
        } catch (Exception unused) {
            return a.AnonymousClass1.c(new JSONObject().toString());
        }
    }

    public final void a(Context context, String str, String str2) {
        c(context);
        if (context instanceof Activity) {
            a((Activity) context);
        }
        d(context);
        a(str2);
        b(str);
    }

    public final void a(String str) {
        if (str != null) {
            a("applicationUserId", SDKUtils.encodeString(str));
        }
    }

    public final synchronized void a(String str, Object obj) {
        try {
            this.a.put(str, obj);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public final void a(JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            a(next, jSONObject.opt(next));
        }
    }

    public final JSONObject b(Context context) {
        b();
        d(context);
        try {
            return new JSONObject(this.a.toString());
        } catch (Exception e) {
            e.printStackTrace();
            return new JSONObject();
        }
    }

    public final void b() {
        c(SDKUtils.getControllerConfig());
        a(SDKUtils.getInitSDKParams());
        d();
        c();
    }

    public final void b(String str) {
        if (str != null) {
            a("applicationKey", SDKUtils.encodeString(str));
        }
    }
}
