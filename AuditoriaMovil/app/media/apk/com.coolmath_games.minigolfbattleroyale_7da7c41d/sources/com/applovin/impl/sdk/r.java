package com.applovin.impl.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.utils.AppKilledService;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Map;
/* loaded from: classes.dex */
public class r {
    private final k a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(final k kVar) {
        this.a = kVar;
        if (kVar.e()) {
            return;
        }
        a("SDK Session Begin");
        kVar.ai().registerReceiver(new AppLovinBroadcastManager.Receiver() { // from class: com.applovin.impl.sdk.r.1
            @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
            public void onReceive(Context context, Intent intent, Map<String, Object> map) {
                r.this.a("SDK Session End");
                kVar.ai().unregisterReceiver(this);
            }
        }, new IntentFilter(AppKilledService.ACTION_APP_KILLED));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        com.applovin.impl.sdk.utils.j jVar = new com.applovin.impl.sdk.utils.j();
        jVar.a().a(str).a();
        f("AppLovinSdk", jVar.toString());
    }

    private void a(String str, String str2, boolean z) {
        int intValue;
        if (StringUtils.isValidString(str2) && (intValue = ((Integer) this.a.a(com.applovin.impl.sdk.c.b.ak)).intValue()) > 0) {
            int length = str2.length();
            int i = ((length + intValue) - 1) / intValue;
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = i2 * intValue;
                String substring = str2.substring(i3, Math.min(length, i3 + intValue));
                if (z) {
                    Log.d(str, substring);
                } else {
                    b(str, substring);
                }
            }
        }
    }

    private boolean a() {
        return this.a.I().d();
    }

    public static void c(String str, String str2, Throwable th) {
        Log.e("AppLovinSdk", "[" + str + "] " + str2, th);
    }

    public static void f(String str, String str2) {
        Log.d("AppLovinSdk", "[" + str + "] " + str2);
    }

    public static void g(String str, String str2) {
        Log.i("AppLovinSdk", "[" + str + "] " + str2);
    }

    public static void h(String str, String str2) {
        Log.w("AppLovinSdk", "[" + str + "] " + str2);
    }

    public static void i(String str, String str2) {
        c(str, str2, null);
    }

    private void j(String str, String str2) {
    }

    public void a(String str, String str2) {
        if (a()) {
            a(str, str2, false);
        }
    }

    public void a(String str, String str2, Throwable th) {
        if (a()) {
            String str3 = "[" + str + "] " + str2;
            Log.w("AppLovinSdk", str3, th);
            j("WARN", str3);
        }
    }

    public void b(String str, String str2) {
        if (a()) {
            String str3 = "[" + str + "] " + str2;
            Log.d("AppLovinSdk", str3);
            j("DEBUG", str3);
        }
    }

    public void b(String str, String str2, Throwable th) {
        if (a()) {
            String str3 = "[" + str + "] " + str2;
            Log.e("AppLovinSdk", str3, th);
            j("ERROR", str3 + " : " + th);
        }
    }

    public void c(String str, String str2) {
        if (a()) {
            String str3 = "[" + str + "] " + str2;
            Log.i("AppLovinSdk", str3);
            j("INFO", str3);
        }
    }

    public void d(String str, String str2) {
        a(str, str2, (Throwable) null);
    }

    public void e(String str, String str2) {
        b(str, str2, null);
    }
}
