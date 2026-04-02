package c.b.i;

import android.graphics.Rect;
import android.view.View;
import c.i.k.d0;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public class g1 {
    public static Method a;

    static {
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
            a = declaredMethod;
            if (declaredMethod.isAccessible()) {
                return;
            }
            a.setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
    }

    public static boolean a(View view) {
        AtomicInteger atomicInteger = c.i.k.d0.a;
        return d0.d.d(view) == 1;
    }
}
