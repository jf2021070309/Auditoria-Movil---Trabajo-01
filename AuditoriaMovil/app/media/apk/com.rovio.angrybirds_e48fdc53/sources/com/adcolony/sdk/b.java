package com.adcolony.sdk;

import android.util.Log;
import com.facebook.share.internal.ShareConstants;
import com.umeng.analytics.pro.bg;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class b {
    static boolean a = false;
    static int b = 3;
    static JSONObject c = as.a();
    static int d = 1;
    static j e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(int i, String str, boolean z) {
        a(0, i, str, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(int i, int i2, String str, boolean z) {
        a(i, str, i2);
        for (int i3 = 0; i3 <= str.length() / 4000; i3++) {
            int i4 = i3 * 4000;
            int i5 = (i3 + 1) * 4000;
            if (i5 > str.length()) {
                i5 = str.length();
            }
            if (i2 == 3 && a(as.f(c, Integer.toString(i)), 3, z)) {
                Log.d("AdColony [TRACE]", str.substring(i4, i5));
            } else if (i2 == 2 && a(as.f(c, Integer.toString(i)), 2, z)) {
                Log.i("AdColony [INFO]", str.substring(i4, i5));
            } else if (i2 == 1 && a(as.f(c, Integer.toString(i)), 1, z)) {
                Log.w("AdColony [WARNING]", str.substring(i4, i5));
            } else if (i2 == 0 && a(as.f(c, Integer.toString(i)), 0, z)) {
                Log.e("AdColony [ERROR]", str.substring(i4, i5));
            } else if (i2 == -1 && b >= -1) {
                Log.e("AdColony [FATAL]", str.substring(i4, i5));
            }
        }
    }

    static boolean a(JSONObject jSONObject, int i, boolean z) {
        int c2 = as.c(jSONObject, "print_level");
        boolean d2 = as.d(jSONObject, "log_private");
        if (jSONObject.length() == 0) {
            c2 = b;
            d2 = a;
        }
        return (!z || d2) && c2 != 4 && c2 >= i;
    }

    static boolean a(JSONObject jSONObject, int i) {
        int c2 = as.c(jSONObject, "send_level");
        if (jSONObject.length() == 0) {
            c2 = d;
        }
        return c2 >= i && c2 != 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(HashMap<String, Object> hashMap) {
        try {
            e = new j(new at(new URL("https://wd.adcolony.col/logs")), Executors.newSingleThreadScheduledExecutor(), hashMap);
            e.a(5L, TimeUnit.SECONDS);
        } catch (MalformedURLException e2) {
            e2.printStackTrace();
        }
    }

    static void a(int i, String str, int i2) {
        if (e != null) {
            if (i2 == 3 && a(as.f(c, Integer.toString(i)), 3)) {
                e.c(str);
            } else if (i2 == 2 && a(as.f(c, Integer.toString(i)), 2)) {
                e.d(str);
            } else if (i2 == 1 && a(as.f(c, Integer.toString(i)), 1)) {
                e.e(str);
            } else if (i2 == 0 && a(as.f(c, Integer.toString(i)), 0)) {
                e.f(str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(am amVar) {
        if (e != null && d != 4) {
            e.a(amVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a() {
        a.a("Log.set_log_level", new f() { // from class: com.adcolony.sdk.b.1
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                b.b = as.c(dVar.b(), "level");
            }
        });
        a.a("Log.public.trace", new f() { // from class: com.adcolony.sdk.b.2
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                b.a(as.c(dVar.b(), bg.e), 3, as.b(dVar.b(), ShareConstants.WEB_DIALOG_PARAM_MESSAGE), false);
            }
        });
        a.a("Log.private.trace", new f() { // from class: com.adcolony.sdk.b.3
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                b.a(as.c(dVar.b(), bg.e), 3, as.b(dVar.b(), ShareConstants.WEB_DIALOG_PARAM_MESSAGE), true);
            }
        });
        a.a("Log.public.info", new f() { // from class: com.adcolony.sdk.b.4
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                b.a(as.c(dVar.b(), bg.e), 2, as.b(dVar.b(), ShareConstants.WEB_DIALOG_PARAM_MESSAGE), false);
            }
        });
        a.a("Log.private.info", new f() { // from class: com.adcolony.sdk.b.5
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                b.a(as.c(dVar.b(), bg.e), 2, as.b(dVar.b(), ShareConstants.WEB_DIALOG_PARAM_MESSAGE), true);
            }
        });
        a.a("Log.public.warning", new f() { // from class: com.adcolony.sdk.b.6
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                b.a(as.c(dVar.b(), bg.e), 1, as.b(dVar.b(), ShareConstants.WEB_DIALOG_PARAM_MESSAGE), false);
            }
        });
        a.a("Log.private.warning", new f() { // from class: com.adcolony.sdk.b.7
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                b.a(as.c(dVar.b(), bg.e), 1, as.b(dVar.b(), ShareConstants.WEB_DIALOG_PARAM_MESSAGE), true);
            }
        });
        a.a("Log.public.error", new f() { // from class: com.adcolony.sdk.b.8
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                b.a(as.c(dVar.b(), bg.e), 0, as.b(dVar.b(), ShareConstants.WEB_DIALOG_PARAM_MESSAGE), false);
            }
        });
        a.a("Log.private.error", new f() { // from class: com.adcolony.sdk.b.9
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                b.a(as.c(dVar.b(), bg.e), 0, as.b(dVar.b(), ShareConstants.WEB_DIALOG_PARAM_MESSAGE), true);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(JSONArray jSONArray) {
        c = b(jSONArray);
    }

    JSONObject b(JSONArray jSONArray) {
        JSONObject a2 = as.a();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject d2 = as.d(jSONArray, i);
            as.a(a2, Integer.toString(as.c(d2, "id")), d2);
        }
        return a2;
    }
}
