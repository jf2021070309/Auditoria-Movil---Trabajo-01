package bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_19do;

import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.j;
/* loaded from: classes.dex */
public class g {
    public static String a = "com.bytedance.openadsdk";
    public static String b = "content://" + a + ".GMMultiProvider";

    static {
        a();
    }

    public static void a() {
        if (j.m().d() != null) {
            a = j.m().d().getPackageName();
            b = "content://" + a + ".GMMultiProvider";
        }
    }
}
