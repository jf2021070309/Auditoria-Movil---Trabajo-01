package com.adcolony.sdk;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.bytedance.msdk.adapter.pangle.PangleAdapterUtils;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.facebook.AccessToken;
import com.facebook.places.model.PlaceFields;
import com.umeng.analytics.pro.bg;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class ah {
    boolean b;
    boolean c;
    boolean d;
    String a = "";
    int e = 2;
    private String g = "android";
    private String h = "android_native";
    String f = "";
    private JSONArray i = as.b();

    String a() {
        return !com.adcolony.sdk.a.d() ? "" : Settings.Secure.getString(com.adcolony.sdk.a.c().getContentResolver(), "android_id");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String b() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String c() {
        return System.getProperty("os.arch").toLowerCase();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        this.b = false;
        com.adcolony.sdk.a.a("Device.get_info", new f() { // from class: com.adcolony.sdk.ah.1
            @Override // com.adcolony.sdk.f
            public void a(final d dVar) {
                q.a(new Runnable() { // from class: com.adcolony.sdk.ah.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (ah.this.n() < 14) {
                            new a(dVar, ah.this, false).execute(new Void[0]);
                        } else {
                            new a(dVar, ah.this, false).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
                        }
                    }
                });
            }
        });
        com.adcolony.sdk.a.a("Device.application_exists", new f() { // from class: com.adcolony.sdk.ah.2
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                JSONObject a2 = as.a();
                as.a(a2, "result", q.a(as.b(dVar.b(), "name")));
                as.a(a2, "success", true);
                dVar.a(a2).a();
            }
        });
    }

    String e() {
        return o() ? "tablet" : PlaceFields.PHONE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean f() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String g() {
        if (!com.adcolony.sdk.a.d()) {
            return "";
        }
        String networkOperatorName = ((TelephonyManager) com.adcolony.sdk.a.c().getSystemService(PlaceFields.PHONE)).getNetworkOperatorName();
        if (networkOperatorName.length() == 0) {
            return "unknown";
        }
        return networkOperatorName;
    }

    int h() {
        if (!com.adcolony.sdk.a.d()) {
            return 0;
        }
        return ((ActivityManager) com.adcolony.sdk.a.c().getApplicationContext().getSystemService(TTDownloadField.TT_ACTIVITY)).getMemoryClass();
    }

    long i() {
        Runtime runtime = Runtime.getRuntime();
        return (runtime.totalMemory() - runtime.freeMemory()) / 1048576;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float j() {
        if (com.adcolony.sdk.a.d()) {
            return com.adcolony.sdk.a.c().getResources().getDisplayMetrics().density;
        }
        return 0.0f;
    }

    String k() {
        return !com.adcolony.sdk.a.d() ? "" : y.a(com.adcolony.sdk.a.c());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int l() {
        if (!com.adcolony.sdk.a.d()) {
            return 0;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        com.adcolony.sdk.a.c().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int m() {
        if (!com.adcolony.sdk.a.d()) {
            return 0;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        com.adcolony.sdk.a.c().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int n() {
        return Build.VERSION.SDK_INT;
    }

    double a(Context context) {
        Intent registerReceiver;
        if (context == null || (registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"))) == null) {
            return PangleAdapterUtils.CPM_DEFLAUT_VALUE;
        }
        int intExtra = registerReceiver.getIntExtra("level", -1);
        int intExtra2 = registerReceiver.getIntExtra("scale", -1);
        return (intExtra < 0 || intExtra2 < 0) ? PangleAdapterUtils.CPM_DEFLAUT_VALUE : intExtra / intExtra2;
    }

    boolean o() {
        if (com.adcolony.sdk.a.d()) {
            DisplayMetrics displayMetrics = com.adcolony.sdk.a.c().getResources().getDisplayMetrics();
            float f = displayMetrics.widthPixels / displayMetrics.xdpi;
            float f2 = displayMetrics.heightPixels / displayMetrics.ydpi;
            return Math.sqrt((double) ((f2 * f2) + (f * f))) >= 6.0d;
        }
        return false;
    }

    String p() {
        return Locale.getDefault().getLanguage();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String q() {
        return Locale.getDefault().getCountry();
    }

    String r() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String s() {
        return Build.MANUFACTURER;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String t() {
        return Build.MODEL;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String u() {
        return Build.VERSION.RELEASE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public JSONArray v() {
        return this.i;
    }

    int w() {
        if (com.adcolony.sdk.a.d()) {
            switch (com.adcolony.sdk.a.c().getResources().getConfiguration().orientation) {
                case 1:
                    return 0;
                case 2:
                    return 1;
                default:
                    return 2;
            }
        }
        return 2;
    }

    int x() {
        if (!com.adcolony.sdk.a.d()) {
            return 0;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        com.adcolony.sdk.a.c().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.densityDpi;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String y() {
        return "3.2.0";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean z() {
        if (com.adcolony.sdk.a.d()) {
            int w = w();
            switch (w) {
                case 0:
                    if (this.e == 1) {
                        au.d.b("Sending device info update");
                        this.e = w;
                        if (n() < 14) {
                            new a(null, this, true).execute(new Void[0]);
                        } else {
                            new a(null, this, true).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
                        }
                        return true;
                    }
                    return false;
                case 1:
                    if (this.e == 0) {
                        au.d.b("Sending device info update");
                        this.e = w;
                        if (n() < 14) {
                            new a(null, this, true).execute(new Void[0]);
                        } else {
                            new a(null, this, true).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
                        }
                        return true;
                    }
                    return false;
                default:
                    return false;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a extends AsyncTask<Void, Void, JSONObject> {
        d a;
        ah b;
        boolean c;

        a(d dVar, ah ahVar, boolean z) {
            this.a = dVar;
            this.b = ahVar;
            this.c = z;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        public JSONObject doInBackground(Void... voidArr) {
            if (Build.VERSION.SDK_INT < 14) {
                return null;
            }
            return ah.this.a(this.b);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        public void onPostExecute(JSONObject jSONObject) {
            if (this.c) {
                new d("Device.update_info", 1, jSONObject).a();
            } else {
                this.a.a(jSONObject).a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public JSONObject a(ah ahVar) {
        JSONObject a2 = as.a();
        af a3 = com.adcolony.sdk.a.a();
        as.a(a2, "carrier_name", ahVar.g());
        as.a(a2, "data_path", com.adcolony.sdk.a.a().l().e());
        as.b(a2, "device_api", ahVar.n());
        as.a(a2, "device_id", ahVar.k());
        as.b(a2, "display_width", ahVar.l());
        as.b(a2, "display_height", ahVar.m());
        as.b(a2, "screen_width", ahVar.l());
        as.b(a2, "screen_height", ahVar.m());
        as.b(a2, "display_dpi", ahVar.x());
        as.a(a2, bg.ai, ahVar.e());
        as.a(a2, "locale_language_code", ahVar.p());
        as.a(a2, "ln", ahVar.p());
        as.a(a2, "locale_country_code", ahVar.q());
        as.a(a2, "locale", ahVar.q());
        as.a(a2, "mac_address", ahVar.r());
        as.a(a2, "manufacturer", ahVar.s());
        as.a(a2, bg.F, ahVar.s());
        as.a(a2, "media_path", com.adcolony.sdk.a.a().l().d());
        as.a(a2, "temp_storage_path", com.adcolony.sdk.a.a().l().f());
        as.b(a2, "memory_class", ahVar.h());
        as.b(a2, "network_speed", 20);
        as.a(a2, "memory_used_mb", ahVar.i());
        as.a(a2, "model", ahVar.t());
        as.a(a2, "device_model", ahVar.t());
        as.a(a2, bg.u, "android_native");
        as.a(a2, "sdk_version", ahVar.y());
        as.a(a2, bg.T, a3.b.c());
        as.a(a2, bg.y, ahVar.u());
        as.a(a2, "os_name", "android");
        as.a(a2, "platform", "android");
        as.a(a2, "arch", ahVar.c());
        as.a(a2, AccessToken.USER_ID_KEY, as.b(a3.b().d, AccessToken.USER_ID_KEY));
        as.a(a2, "app_id", a3.b().a);
        as.a(a2, "immersion", this.d);
        as.a(a2, "app_bundle_name", q.d());
        as.a(a2, "app_bundle_version", q.b());
        as.a(a2, "battery_level", ahVar.a(com.adcolony.sdk.a.c()));
        this.e = ahVar.w();
        as.b(a2, "current_orientation", this.e);
        JSONArray b = as.b();
        if (q.a("com.android.vending")) {
            b.put("google");
        }
        if (q.a("com.amazon.venezia")) {
            b.put("amazon");
        }
        as.a(a2, "available_stores", b);
        this.i = q.b((Context) com.adcolony.sdk.a.c());
        as.a(a2, "permissions", this.i);
        int i = 40;
        while (!ahVar.b && i > 0) {
            try {
                Thread.sleep(50L);
                i--;
            } catch (Exception e) {
            }
        }
        as.a(a2, "advertiser_id", ahVar.b());
        as.a(a2, "limit_tracking", ahVar.f());
        if (ahVar.b() == null || ahVar.b().equals("")) {
            as.a(a2, "android_id_sha1", q.c(ahVar.a()));
        }
        return a2;
    }
}
