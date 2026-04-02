package bykvm_19do.bykvm_19do.bykvm_19do;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.umeng.analytics.pro.bg;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class f2 extends e2 {
    private final Context e;
    private final j2 f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f2(Context context, j2 j2Var) {
        super(true, false);
        this.e = context;
        this.f = j2Var;
    }

    private static String a(Context context) {
        String str = null;
        if (context == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 26 && context.getApplicationInfo().targetSdkVersion >= 26) {
            try {
                str = Build.getSerial();
            } catch (Throwable th) {
            }
        }
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "unknown")) {
            str = Build.SERIAL;
        }
        return (TextUtils.isEmpty(str) || TextUtils.equals(str, "unknown")) ? "" : str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bykvm_19do.bykvm_19do.bykvm_19do.e2
    public boolean a(JSONObject jSONObject) {
        jSONObject.put(bg.x, "Android");
        jSONObject.put(bg.y, Build.VERSION.RELEASE);
        jSONObject.put("os_api", Build.VERSION.SDK_INT);
        jSONObject.put("device_model", Build.MODEL);
        jSONObject.put(bg.F, Build.BRAND);
        jSONObject.put(bg.H, Build.MANUFACTURER);
        jSONObject.put("cpu_abi", Build.CPU_ABI);
        jSONObject.put("build_serial", this.f.o() ? a(this.e) : this.f.n());
        return true;
    }
}
