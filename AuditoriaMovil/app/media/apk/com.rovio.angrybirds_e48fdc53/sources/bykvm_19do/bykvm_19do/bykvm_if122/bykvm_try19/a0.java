package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19;

import android.text.TextUtils;
/* loaded from: classes.dex */
public class a0 {
    private static volatile String a = "";

    static {
        try {
            if (TextUtils.isEmpty(a)) {
                a = f0.a("tt_device_info", bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d()).a("oaid", "");
            }
        } catch (Throwable th) {
        }
    }

    public static String a() {
        try {
            if (TextUtils.isEmpty(a)) {
                a = q.d();
                a(a);
            }
        } catch (Throwable th) {
        }
        return a == null ? "" : a;
    }

    private static void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f0.a("tt_device_info", bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d()).b("oaid", str);
    }
}
