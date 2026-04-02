package bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_try19;

import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.j;
/* loaded from: classes.dex */
public class a {
    private static volatile b a;

    public static b a() {
        if (a == null) {
            synchronized (b.class) {
                try {
                    if (a == null) {
                        a = new c(j.m().d(), new f(j.m().d()));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return a;
    }
}
