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
public class v {
    private final m a;

    public v(final m mVar) {
        this.a = mVar;
        if (mVar.e()) {
            return;
        }
        a("SDK Session Begin");
        mVar.aj().registerReceiver(new AppLovinBroadcastManager.Receiver() { // from class: com.applovin.impl.sdk.v.1
            @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
            public void onReceive(Context context, Intent intent, Map<String, Object> map) {
                v.this.a("SDK Session End");
                mVar.aj().unregisterReceiver(this);
            }
        }, new IntentFilter(AppKilledService.ACTION_APP_KILLED));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        com.applovin.impl.sdk.utils.k kVar = new com.applovin.impl.sdk.utils.k();
        kVar.a().a(str).a();
        f("AppLovinSdk", kVar.toString());
    }

    private void a(String str, String str2, boolean z) {
        int intValue;
        if (StringUtils.isValidString(str2) && (intValue = ((Integer) this.a.a(com.applovin.impl.sdk.c.b.ar)).intValue()) > 0) {
            int length = str2.length();
            int i2 = ((length + intValue) - 1) / intValue;
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = i3 * intValue;
                int min = Math.min(length, i4 + intValue);
                if (z) {
                    str2.substring(i4, min);
                } else {
                    b(str, str2.substring(i4, min));
                }
            }
        }
    }

    private boolean a() {
        return this.a.K().d();
    }

    public static void c(String str, String str2, Throwable th) {
        Log.e("AppLovinSdk", "[" + str + "] " + str2, th);
    }

    public static void f(String str, String str2) {
    }

    public static void g(String str, String str2) {
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
            j("DEBUG", "[" + str + "] " + str2);
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
            j("INFO", "[" + str + "] " + str2);
        }
    }

    public void d(String str, String str2) {
        a(str, str2, (Throwable) null);
    }

    public void e(String str, String str2) {
        b(str, str2, null);
    }
}
