package com.kuaishou.weapon.p0;

import android.os.Build;
import com.kuaishou.weapon.p0.jni.Engine;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class cs {
    private static int a;
    private static boolean b;

    public cs() {
        b();
    }

    private int a(Method method) {
        try {
            int i = a;
            if (i <= 1 || method == null) {
                return 0;
            }
            return Engine.mmo(method, i, method.getModifiers());
        } catch (Exception e) {
            return 0;
        }
    }

    private void b() {
        if (!Engine.loadSuccess || b) {
            return;
        }
        boolean b2 = cq.b();
        int i = Build.VERSION.SDK_INT;
        if (b2 && i < 29 && i > 22) {
            a = Engine.off();
        }
        b = true;
    }

    private boolean c() {
        return b && a > 1;
    }

    public int a() {
        if (c()) {
            long a2 = cp.b.a();
            long a3 = cp.a.a();
            if (a == a2) {
                return (int) a3;
            }
            return -1;
        }
        return -1;
    }

    public int a(int i, Class cls, String str, Object... objArr) {
        Method a2;
        try {
            if (!c() || (a2 = dg.a(cls, str, objArr)) == null) {
                return 0;
            }
            return Engine.mqc(a2, i);
        } catch (Exception e) {
            return 0;
        }
    }

    public int a(Class cls, String str, Object... objArr) {
        try {
            if (c()) {
                return a(dg.a(cls, str, objArr));
            }
            return 0;
        } catch (Exception e) {
            return 0;
        }
    }
}
