package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.bykvm_for12.bykvm_19do;

import android.content.Context;
/* loaded from: classes.dex */
public class e {
    public static String a = "com.bytedance.openadsdcom.bytedance.msdk.util.multiprocess.sp";
    public static String b = "content://" + a + ".GMMultiProvider";

    static {
        a();
    }

    public static void a() {
        Context b2 = b.b();
        if (b2 == null) {
            b2 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.c.a();
        }
        if (b2 != null) {
            a = b2.getPackageName();
            b = "content://" + a + ".GMMultiProvider";
        }
    }
}
