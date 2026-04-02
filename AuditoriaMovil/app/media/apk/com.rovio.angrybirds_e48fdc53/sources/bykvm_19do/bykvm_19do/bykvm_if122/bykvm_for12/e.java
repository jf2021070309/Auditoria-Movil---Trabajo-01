package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12;

import android.content.Context;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.z;
/* loaded from: classes.dex */
public class e {
    private static int a = -1;
    private static long b;

    public static int a(Context context) {
        if (a == -1 || System.currentTimeMillis() - b > 60000) {
            a = z.b(context);
            b = System.currentTimeMillis();
        }
        return a;
    }

    public static int b(Context context) {
        return z.a(a(context));
    }

    public static String c(Context context) {
        return z.b(a(context));
    }
}
