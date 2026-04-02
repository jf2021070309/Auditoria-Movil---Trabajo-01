package com.me.game.pm_tools;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Set;
/* loaded from: classes5.dex */
public final class y {
    public static String a = "Logger";

    /* loaded from: classes5.dex */
    public enum a {
        INFO,
        WARRING,
        VERBOSE,
        DEBUG,
        ERROR
    }

    public static final void a(String str, Object... objArr) {
        g(str, a.DEBUG, objArr);
    }

    public static final void b(Object... objArr) {
        a(a, a.DEBUG, objArr);
    }

    public static final void c(String str, Object... objArr) {
        g(str, a.ERROR, objArr);
    }

    public static final void d(Object... objArr) {
        c(a, a.ERROR, objArr);
    }

    public static final void e(String str, Object... objArr) {
        g(str, a.INFO, objArr);
    }

    public static final void f(Object... objArr) {
        g(a, a.INFO, objArr);
    }

    private static final void g(String str, a aVar, Object[] objArr) {
    }

    public static final void h() {
        i(null);
    }

    public static final void i(String str) {
        StackTraceElement[] stackTrace;
        for (StackTraceElement stackTraceElement : new Throwable().getStackTrace()) {
            Log.i(TextUtils.isEmpty(str) ? a : str, stackTraceElement.getMethodName() + "_" + stackTraceElement.getClassName());
        }
    }

    public static final String j(Bundle bundle) {
        if (bundle == null) {
            return "bundle == null";
        }
        Set<String> keySet = bundle.keySet();
        StringBuilder sb = new StringBuilder();
        for (String str : keySet) {
            sb.append(str);
            sb.append(" >>>>> ");
            sb.append(bundle.get(str));
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void k(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        e(str, "**********Thread name：" + Thread.currentThread().getName() + "**********");
        for (StackTraceElement stackTraceElement : stackTrace) {
            e(str, "[Dump Stack]$index   ", stackTraceElement.getClassName() + "----" + stackTraceElement.getFileName() + "----" + stackTraceElement.getLineNumber() + "----" + stackTraceElement.getMethodName());
        }
        e(str, "[Dump Stack]", "********************* over **********************");
    }

    public static void l(Class cls) {
        for (Constructor<?> constructor : cls.getDeclaredConstructors()) {
            e(a, cls.getSimpleName(), "Constructor", constructor);
        }
    }

    public static void m(Class cls) {
        if (cls == null) {
            e(a, "cls == null", cls);
            return;
        }
        Field[] declaredFields = cls.getDeclaredFields();
        e(a, cls.getSimpleName(), "showDeclaredMethods", Integer.valueOf(declaredFields.length));
        for (Field field : declaredFields) {
            field.setAccessible(true);
            e(a, cls.getSimpleName(), "showDeclaredFields", field);
        }
    }

    public static void n(Class cls) {
        if (cls == null) {
            e(a, "cls == null", cls);
            return;
        }
        Method[] declaredMethods = cls.getDeclaredMethods();
        e(a, cls.getSimpleName(), "showDeclaredMethods", Integer.valueOf(declaredMethods.length));
        for (Method method : declaredMethods) {
            method.setAccessible(true);
            e(a, cls.getSimpleName(), "showDeclaredMethods", method);
        }
    }

    public static final void o(String str, Object... objArr) {
        g(str, a.VERBOSE, objArr);
    }

    public static final void p(Object... objArr) {
        g(a, a.VERBOSE, objArr);
    }

    public static final void q(String str, Object... objArr) {
        g(str, a.WARRING, objArr);
    }
}
