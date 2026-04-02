package com.bytedance.notpluginpro;

import android.content.Context;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class tmapcloaknotplugin {
    static int DexNum = 1;
    static final String libName = "libnotpluginpro.so";
    static String ApkPath = null;
    static String LibPath = null;
    static String LibBasicPath = null;
    static String DataPath = null;
    static String Apkname_full = null;
    static String Apkname = null;
    static long vmpctx = 0;
    static String CPUABI = null;
    static Context ctx = null;

    static {
        try {
            System.loadLibrary("notpluginpro");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static native byte bob_bytedance_call_notplugin(int i, int i2, Object... objArr);

    public static native char cob_bytedance_call_notplugin(int i, int i2, Object... objArr);

    public static native double dob_bytedance_call_notplugin(int i, int i2, Object... objArr);

    public static native float fob_bytedance_call_notplugin(int i, int i2, Object... objArr);

    public static native void init(int i);

    public static native int iob_bytedance_call_notplugin(int i, int i2, Object... objArr);

    public static native long job_bytedance_call_notplugin(int i, int i2, Object... objArr);

    public static native Object obj_bytedance_call_notplugin(int i, int i2, Object... objArr);

    public static void setaccessible(Constructor constructor) {
        constructor.setAccessible(true);
    }

    public static void setaccessible(Field field) {
        field.setAccessible(true);
    }

    public static void setaccessible(Method method) {
        method.setAccessible(true);
    }

    public static Object setaccessibleobj(Class cls) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Constructor declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
        declaredConstructor.setAccessible(true);
        return declaredConstructor.newInstance(new Object[0]);
    }

    public static native short sob_bytedance_call_notplugin(int i, int i2, Object... objArr);

    public static native void voi_bytedance_call_notplugin(int i, int i2, Object... objArr);

    public static native boolean zob_bytedance_call_notplugin(int i, int i2, Object... objArr);
}
