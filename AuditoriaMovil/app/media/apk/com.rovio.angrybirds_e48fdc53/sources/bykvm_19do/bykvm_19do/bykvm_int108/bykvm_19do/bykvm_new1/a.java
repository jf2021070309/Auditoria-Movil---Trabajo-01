package bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_new1;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.qq.e.ads.nativ.NativeUnifiedADAppInfoImpl;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class a {
    private Context a;
    private bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.e b;
    private Map<String, Object> c;

    public a(Context context, bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.e eVar) {
        this.a = context;
        this.b = eVar;
    }

    public static boolean a(Map<String, Object> map) {
        return map == null || map.isEmpty() || !((map.containsKey("app_version") || map.containsKey(NativeUnifiedADAppInfoImpl.Keys.VERSION_NAME)) && map.containsKey("version_code") && map.containsKey("update_version_code"));
    }

    public bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.e a() {
        return this.b;
    }

    public Map<String, Object> b() {
        if (this.c == null) {
            this.c = this.b.d();
        }
        return this.c;
    }

    public String c() {
        return this.b.b();
    }

    public Map<String, Object> d() {
        Map<String, Object> e = this.b.e();
        if (e == null) {
            e = new HashMap<>(4);
        }
        if (a(e)) {
            try {
                PackageInfo packageInfo = this.a.getPackageManager().getPackageInfo(this.a.getPackageName(), 128);
                e.put(NativeUnifiedADAppInfoImpl.Keys.VERSION_NAME, packageInfo.versionName);
                e.put("version_code", Integer.valueOf(packageInfo.versionCode));
                if (e.get("update_version_code") == null) {
                    Object obj = packageInfo.applicationInfo.metaData != null ? packageInfo.applicationInfo.metaData.get("UPDATE_VERSION_CODE") : null;
                    if (obj == null) {
                        obj = e.get("version_code");
                    }
                    e.put("update_version_code", obj);
                }
            } catch (Throwable th) {
                e.put(NativeUnifiedADAppInfoImpl.Keys.VERSION_NAME, bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_case1.a.d(this.a));
                e.put("version_code", Integer.valueOf(bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_case1.a.c(this.a)));
                if (e.get("update_version_code") == null) {
                    e.put("update_version_code", e.get("version_code"));
                }
            }
        }
        return e;
    }

    public String e() {
        return bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_case1.a.b(this.a);
    }
}
