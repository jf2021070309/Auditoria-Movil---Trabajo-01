package com.qq.e.comm.managers.plugin;

import java.lang.reflect.Method;
/* loaded from: classes3.dex */
public class a {
    private static Method a;
    private static boolean b;

    public static void a(Throwable th, String str) {
        try {
            Exception exc = new Exception("插件错误：" + str, th);
            if (!b) {
                if (a == null) {
                    Method declaredMethod = Class.forName("com.tencent.bugly.crashreport.CrashReport").getDeclaredMethod("postCatchedException", Throwable.class);
                    a = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                a.invoke(null, exc);
            }
        } catch (Throwable th2) {
            b = true;
        }
    }
}
