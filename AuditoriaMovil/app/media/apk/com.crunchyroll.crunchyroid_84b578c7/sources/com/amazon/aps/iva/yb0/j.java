package com.amazon.aps.iva.yb0;

import com.amazon.aps.iva.e4.m1;
import java.util.Arrays;
/* compiled from: Intrinsics.java */
/* loaded from: classes4.dex */
public final class j {

    /* compiled from: Intrinsics.java */
    /* loaded from: classes4.dex */
    public static class a {
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        }
        return obj.equals(obj2);
    }

    public static void b(Object obj, String str) {
        if (obj != null) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException(str.concat(" must not be null"));
        j(j.class.getName(), illegalStateException);
        throw illegalStateException;
    }

    public static void c(Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        j(j.class.getName(), nullPointerException);
        throw nullPointerException;
    }

    public static void d(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str);
        j(j.class.getName(), nullPointerException);
        throw nullPointerException;
    }

    public static void e(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str.concat(" must not be null"));
        j(j.class.getName(), nullPointerException);
        throw nullPointerException;
    }

    public static void f(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(i(str));
        j(j.class.getName(), nullPointerException);
        throw nullPointerException;
    }

    public static void g(Object obj, String str) {
        if (obj != null) {
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(i(str));
        j(j.class.getName(), illegalArgumentException);
        throw illegalArgumentException;
    }

    public static int h(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        if (i == i2) {
            return 0;
        }
        return 1;
    }

    public static String i(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = j.class.getName();
        int i = 0;
        while (!stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        while (stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        StackTraceElement stackTraceElement = stackTrace[i];
        StringBuilder b = com.amazon.aps.iva.n4.a.b("Parameter specified as non-null is null: method ", stackTraceElement.getClassName(), ".", stackTraceElement.getMethodName(), ", parameter ");
        b.append(str);
        return b.toString();
    }

    public static void j(String str, RuntimeException runtimeException) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    public static String k(Object obj, String str) {
        return str + obj;
    }

    public static void l() {
        com.amazon.aps.iva.kb0.c cVar = new com.amazon.aps.iva.kb0.c();
        j(j.class.getName(), cVar);
        throw cVar;
    }

    public static void m(String str) {
        m1 m1Var = new m1(defpackage.e.e("lateinit property ", str, " has not been initialized"));
        j(j.class.getName(), m1Var);
        throw m1Var;
    }
}
