package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do;

import android.content.Context;
/* loaded from: classes.dex */
public class c {
    private static volatile Context a;

    public static Context a() {
        return a;
    }

    public static void a(Context context) {
        if (a == null && context != null) {
            a = context.getApplicationContext();
        }
    }
}
