package bykvm_19do.bykvm_19do.bykvm_19do;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.umeng.analytics.pro.bg;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class m extends e2 {
    private final Context e;
    private final j2 f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(Context context, j2 j2Var) {
        super(false, false);
        this.e = context;
        this.f = j2Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bykvm_19do.bykvm_19do.bykvm_19do.e2
    public boolean a(JSONObject jSONObject) {
        int i;
        int i2;
        String packageName = this.e.getPackageName();
        PackageInfo packageInfo = null;
        if (TextUtils.isEmpty(this.f.q())) {
            jSONObject.put("package", packageName);
        } else {
            if (l0.a) {
                l0.a("has zijie pkg", null);
            }
            jSONObject.put("package", this.f.q());
            jSONObject.put("real_package_name", packageName);
        }
        try {
            packageInfo = this.e.getPackageManager().getPackageInfo(packageName, 0);
        } catch (Throwable th) {
        }
        if (packageInfo != null) {
            try {
                i = packageInfo.versionCode;
            } catch (Throwable th2) {
                l0.a(th2);
                return false;
            }
        } else {
            i = 0;
        }
        jSONObject.put("app_version", !TextUtils.isEmpty(this.f.g()) ? this.f.g() : packageInfo != null ? packageInfo.versionName : "");
        if (TextUtils.isEmpty(this.f.l())) {
            jSONObject.put("app_version_minor", "");
        } else {
            jSONObject.put("app_version_minor", this.f.l());
        }
        if (this.f.d() != 0) {
            jSONObject.put("version_code", this.f.d());
        } else {
            jSONObject.put("version_code", i);
        }
        if (this.f.e() != 0) {
            jSONObject.put("update_version_code", this.f.e());
        } else {
            jSONObject.put("update_version_code", i);
        }
        if (this.f.f() != 0) {
            i = this.f.f();
        }
        jSONObject.put("manifest_version_code", i);
        if (!TextUtils.isEmpty(this.f.c())) {
            jSONObject.put("app_name", this.f.c());
        }
        if (!TextUtils.isEmpty(this.f.h())) {
            jSONObject.put("tweaked_channel", this.f.h());
        }
        if (packageInfo != null && packageInfo.applicationInfo != null && (i2 = packageInfo.applicationInfo.labelRes) > 0) {
            jSONObject.put(bg.s, this.e.getString(i2));
        }
        return true;
    }
}
