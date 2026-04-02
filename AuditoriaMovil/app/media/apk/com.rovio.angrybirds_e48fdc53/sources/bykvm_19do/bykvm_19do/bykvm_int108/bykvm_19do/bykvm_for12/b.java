package bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_for12;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_case1.j;
import bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.i;
import com.facebook.AccessToken;
import com.facebook.places.model.PlaceFields;
import com.ss.android.download.api.constant.BaseConstants;
import com.umeng.analytics.pro.bg;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class b {
    private static final String[] c = {"version_code", "manifest_version_code", "aid", "update_version_code"};
    private Context a;
    private JSONObject b = new JSONObject();

    public b(Context context) {
        this.a = context;
    }

    public static b a(Context context) {
        b bVar = new b(context);
        JSONObject a = bVar.a();
        bVar.a(a);
        bVar.d(a);
        bVar.e(a);
        bVar.g(a);
        bVar.f(a);
        bVar.b(a);
        bVar.c(a);
        return bVar;
    }

    private void a(JSONObject jSONObject) {
        int i;
        try {
            PackageInfo packageInfo = this.a.getPackageManager().getPackageInfo(this.a.getPackageName(), 0);
            if (packageInfo.applicationInfo != null && (i = packageInfo.applicationInfo.labelRes) > 0) {
                jSONObject.put(bg.s, this.a.getString(i));
            }
            jSONObject.put("sdk_version", 2010056);
            jSONObject.put("sdk_version_name", "2.1.0-alpha.36");
            jSONObject.put(bg.x, "Android");
            jSONObject.put(bg.y, c());
            jSONObject.put("os_api", Build.VERSION.SDK_INT);
            jSONObject.put("device_model", Build.MODEL);
            jSONObject.put(bg.F, Build.BRAND);
            jSONObject.put(bg.H, Build.MANUFACTURER);
            jSONObject.put("cpu_abi", b());
        } catch (Exception e) {
        }
    }

    private String b() {
        try {
            StringBuilder sb = new StringBuilder();
            if (Build.VERSION.SDK_INT < 21 || Build.SUPPORTED_ABIS.length <= 0) {
                sb = new StringBuilder(Build.CPU_ABI);
            } else {
                for (int i = 0; i < Build.SUPPORTED_ABIS.length; i++) {
                    sb.append(Build.SUPPORTED_ABIS[i]);
                    if (i != Build.SUPPORTED_ABIS.length - 1) {
                        sb.append(", ");
                    }
                }
            }
            return TextUtils.isEmpty(sb.toString()) ? "unknown" : sb.toString();
        } catch (Exception e) {
            j.b(e);
            return "unknown";
        }
    }

    private void b(JSONObject jSONObject) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) this.a.getSystemService(PlaceFields.PHONE);
            if (telephonyManager != null) {
                String networkOperatorName = telephonyManager.getNetworkOperatorName();
                if (!TextUtils.isEmpty(networkOperatorName)) {
                    jSONObject.put(bg.P, networkOperatorName);
                }
                String networkOperator = telephonyManager.getNetworkOperator();
                if (TextUtils.isEmpty(networkOperator)) {
                    return;
                }
                jSONObject.put("mcc_mnc", networkOperator);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String c() {
        String str = Build.VERSION.RELEASE;
        if (str.contains(".")) {
            return str;
        }
        return str + ".0";
    }

    private void c(JSONObject jSONObject) {
        Map<String, Object> b;
        Object obj;
        bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_new1.a e = i.e();
        if (e == null || jSONObject == null || (b = e.b()) == null) {
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            for (String str : b.keySet()) {
                if (!TextUtils.isEmpty(str) && (obj = b.get(str)) != null) {
                    jSONObject2.put(str, obj);
                }
            }
            jSONObject.put("custom", jSONObject2);
        } catch (Exception e2) {
            j.b(e2);
        }
    }

    private void d(JSONObject jSONObject) {
        try {
            DisplayMetrics displayMetrics = this.a.getResources().getDisplayMetrics();
            int i = displayMetrics.densityDpi;
            String str = i != 120 ? i != 240 ? i != 320 ? "mdpi" : "xhdpi" : "hdpi" : "ldpi";
            jSONObject.put("density_dpi", i);
            jSONObject.put("display_density", str);
            jSONObject.put(bg.z, displayMetrics.heightPixels + "x" + displayMetrics.widthPixels);
        } catch (Exception e) {
        }
    }

    private void e(JSONObject jSONObject) {
        try {
            String language = this.a.getResources().getConfiguration().locale.getLanguage();
            if (!TextUtils.isEmpty(language)) {
                jSONObject.put(bg.N, language);
            }
            String country = Locale.getDefault().getCountry();
            if (!TextUtils.isEmpty(country)) {
                jSONObject.put("region", country);
            }
            int rawOffset = TimeZone.getDefault().getRawOffset() / BaseConstants.Time.HOUR;
            if (rawOffset < -12) {
                rawOffset = -12;
            }
            if (rawOffset > 12) {
                rawOffset = 12;
            }
            jSONObject.put(bg.M, rawOffset);
        } catch (Exception e) {
        }
    }

    private void f(JSONObject jSONObject) {
        try {
            jSONObject.put(bg.Q, bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_case1.i.a(this.a));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0040 A[Catch: all -> 0x0053, TryCatch #0 {all -> 0x0053, blocks: (B:3:0x0005, B:6:0x000d, B:16:0x0035, B:18:0x0040, B:19:0x0049, B:7:0x0011, B:10:0x001a, B:12:0x0024, B:13:0x0029, B:15:0x002f), top: B:23:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void g(org.json.JSONObject r4) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            boolean r1 = bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_case1.c.d()     // Catch: java.lang.Throwable -> L53
            if (r1 == 0) goto L11
            java.lang.String r1 = "MIUI-"
        Ld:
            r0.append(r1)     // Catch: java.lang.Throwable -> L53
            goto L35
        L11:
            boolean r1 = bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_case1.c.b()     // Catch: java.lang.Throwable -> L53
            if (r1 == 0) goto L1a
            java.lang.String r1 = "FLYME-"
            goto Ld
        L1a:
            java.lang.String r1 = bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_case1.c.a()     // Catch: java.lang.Throwable -> L53
            boolean r2 = bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_case1.c.b(r1)     // Catch: java.lang.Throwable -> L53
            if (r2 == 0) goto L29
            java.lang.String r2 = "EMUI-"
            r0.append(r2)     // Catch: java.lang.Throwable -> L53
        L29:
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L53
            if (r2 != 0) goto L35
            r0.append(r1)     // Catch: java.lang.Throwable -> L53
            java.lang.String r1 = "-"
            goto Ld
        L35:
            java.lang.String r1 = android.os.Build.VERSION.INCREMENTAL     // Catch: java.lang.Throwable -> L53
            r0.append(r1)     // Catch: java.lang.Throwable -> L53
            int r1 = r0.length()     // Catch: java.lang.Throwable -> L53
            if (r1 <= 0) goto L49
            java.lang.String r1 = "rom"
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L53
            r4.put(r1, r0)     // Catch: java.lang.Throwable -> L53
        L49:
            java.lang.String r0 = "rom_version"
            java.lang.String r1 = bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_case1.l.i()     // Catch: java.lang.Throwable -> L53
            r4.put(r0, r1)     // Catch: java.lang.Throwable -> L53
            goto L54
        L53:
            r4 = move-exception
        L54:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_for12.b.g(org.json.JSONObject):void");
    }

    public JSONObject a() {
        return this.b;
    }

    public JSONObject a(String str) {
        try {
            this.b.put("device_id", str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return this.b;
    }

    public JSONObject a(Map<String, Object> map) {
        String[] strArr;
        if (map == null) {
            return this.b;
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (!this.b.has(entry.getKey())) {
                this.b.put(entry.getKey(), entry.getValue());
            }
        }
        for (String str : c) {
            if (map.containsKey(str)) {
                try {
                    this.b.put(str, Integer.parseInt((String) map.get(str)));
                } catch (Exception e) {
                    this.b.put(str, map.get(str));
                }
            }
        }
        if (map.containsKey("version_code") && !map.containsKey("manifest_version_code")) {
            this.b.put("manifest_version_code", Integer.parseInt((String) map.get("version_code")));
        }
        if (map.containsKey("iid")) {
            this.b.put("udid", map.get("iid"));
            this.b.remove("iid");
        }
        return this.b;
    }

    public JSONObject b(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                this.b.put(AccessToken.USER_ID_KEY, str);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return this.b;
    }
}
