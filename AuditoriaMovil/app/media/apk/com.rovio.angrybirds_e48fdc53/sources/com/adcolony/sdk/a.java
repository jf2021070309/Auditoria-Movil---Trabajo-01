package com.adcolony.sdk;

import android.app.Activity;
import java.lang.ref.WeakReference;
import org.json.JSONArray;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class a {
    static boolean a;
    static boolean b;
    private static WeakReference<Activity> c;
    private static af d;

    a() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(final Activity activity, AdColonyAppOptions adColonyAppOptions, boolean z) {
        a(activity);
        b = true;
        if (d == null) {
            d = new af();
            d.a(adColonyAppOptions, z);
        } else {
            d.a(adColonyAppOptions);
        }
        q.a.execute(new Runnable() { // from class: com.adcolony.sdk.a.1
            @Override // java.lang.Runnable
            public void run() {
                a.d.a(activity, (d) null);
            }
        });
        au.c.b("Configuring AdColony");
        d.b(false);
        d.i().d(true);
        d.i().e(true);
        d.i().f(false);
        d.d = true;
        d.i().a(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static af a() {
        if (!b()) {
            if (d()) {
                d = new af();
                JSONObject c2 = as.c(c().getFilesDir().getAbsolutePath() + "/adc3/AppInfo");
                JSONArray g = as.g(c2, "zoneIds");
                d.a(new AdColonyAppOptions().a(as.b(c2, "appId")).a(as.a(g)), false);
            } else {
                return new af();
            }
        }
        return d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b() {
        return d != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Activity activity) {
        if (activity == null) {
            c.clear();
        } else {
            c = new WeakReference<>(activity);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Activity c() {
        return c.get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d() {
        return (c == null || c.get() == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean e() {
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(String str, f fVar) {
        a().n().a(str, fVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static f a(String str, f fVar, boolean z) {
        a().n().a(str, fVar);
        return fVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(String str, f fVar) {
        a().n().b(str, fVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f() {
        a().n().b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = as.a();
        }
        as.a(jSONObject, "m_type", str);
        a().n().a(jSONObject);
    }
}
