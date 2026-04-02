package com.kuaishou.weapon.p0;

import android.text.TextUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
/* loaded from: classes.dex */
public class ao {
    private boolean a(String str) {
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        if (systemClassLoader != null) {
            try {
                systemClassLoader.loadClass(str).newInstance();
            } catch (ClassNotFoundException e) {
                return false;
            } catch (IllegalAccessException e2) {
                return true;
            } catch (InstantiationException e3) {
            }
        }
        return true;
    }

    public boolean a() {
        try {
            Field declaredField = ClassLoader.getSystemClassLoader().loadClass(an.b).getDeclaredField("disableHooks");
            declaredField.setAccessible(true);
            declaredField.set(null, Boolean.TRUE);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean b() {
        try {
            throw new Exception("");
        } catch (Exception e) {
            for (StackTraceElement stackTraceElement : e.getStackTrace()) {
                if (stackTraceElement.getClassName().contains(an.b)) {
                    return true;
                }
            }
            return false;
        }
    }

    public boolean c() {
        return a(an.c);
    }

    public boolean d() {
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        if (systemClassLoader != null) {
            try {
                systemClassLoader.loadClass(an.a).newInstance();
            } catch (ClassNotFoundException e) {
                return false;
            } catch (IllegalAccessException e2) {
                return true;
            } catch (InstantiationException e3) {
                return true;
            }
        }
        if (systemClassLoader != null) {
            try {
                systemClassLoader.loadClass(an.b).newInstance();
            } catch (ClassNotFoundException e4) {
                return false;
            } catch (IllegalAccessException e5) {
                return true;
            } catch (InstantiationException e6) {
            }
        }
        return true;
    }

    public String e() {
        try {
            return System.getProperty("vxp");
        } catch (Exception e) {
            return null;
        }
    }

    public boolean f() {
        try {
            String str = System.getenv("CLASSPATH");
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return str.contains("XposedBridge");
        } catch (Exception e) {
            return false;
        }
    }

    public boolean g() {
        try {
            return Modifier.isNative(Throwable.class.getDeclaredMethod("getStackTrace", new Class[0]).getModifiers());
        } catch (NoSuchMethodException e) {
            return false;
        }
    }
}
