package bykvm_19do.bykvm_19do.bykvm_19do;

import android.content.Context;
/* loaded from: classes.dex */
final class l1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Context context) {
        Class<?> cls = Class.forName("com.bun.miitmdid.core.JLibrary");
        if (cls.getDeclaredField("context").get(cls) == null) {
            cls.getDeclaredMethod("InitEntry", Context.class).invoke(cls, context);
        }
    }
}
