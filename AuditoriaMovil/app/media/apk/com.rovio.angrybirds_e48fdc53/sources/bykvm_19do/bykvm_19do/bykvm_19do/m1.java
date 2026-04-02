package bykvm_19do.bykvm_19do.bykvm_19do;

import android.content.Context;
import bykvm_19do.bykvm_19do.bykvm_19do.a1;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
final class m1 implements a1 {
    private static Object a;
    private static Class<?> b;
    private static Method c;

    static {
        try {
            Class<?> cls = Class.forName("com.android.id.impl.IdProviderImpl");
            b = cls;
            a = cls.newInstance();
            c = b.getMethod("getOAID", Context.class);
        } catch (Exception e) {
        }
    }

    private static String a(Context context, Method method) {
        Object obj = a;
        if (obj != null && method != null) {
            try {
                Object invoke = method.invoke(obj, context);
                if (invoke != null) {
                    return (String) invoke;
                }
            } catch (Exception e) {
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a() {
        return (b == null || a == null || c == null) ? false : true;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_19do.a1
    public boolean a(Context context) {
        return a();
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_19do.a1
    public a1.a b(Context context) {
        try {
            a1.a aVar = new a1.a();
            aVar.a = a(context, c);
            return aVar;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
