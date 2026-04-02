package h.o.c;

import java.util.Arrays;
/* loaded from: classes2.dex */
public class j {
    public static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static void b(Object obj, String str) {
        if (obj != null) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException(e.a.d.a.a.k(str, " must not be null"));
        h(illegalStateException, j.class.getName());
        throw illegalStateException;
    }

    public static void c(Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        h(nullPointerException, j.class.getName());
        throw nullPointerException;
    }

    public static void d(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(e.a.d.a.a.k(str, " must not be null"));
        h(nullPointerException, j.class.getName());
        throw nullPointerException;
    }

    public static void e(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(g(str));
        h(nullPointerException, j.class.getName());
        throw nullPointerException;
    }

    public static void f(Object obj, String str) {
        if (obj != null) {
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(g(str));
        h(illegalArgumentException, j.class.getName());
        throw illegalArgumentException;
    }

    public static String g(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        return "Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + str;
    }

    public static <T extends Throwable> T h(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            if (str.equals(stackTrace[i3].getClassName())) {
                i2 = i3;
            }
        }
        t.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i2 + 1, length));
        return t;
    }

    public static String i(String str, Object obj) {
        return str + obj;
    }

    public static void j() {
        h.b bVar = new h.b();
        h(bVar, j.class.getName());
        throw bVar;
    }

    public static void k(String str) {
        h.j jVar = new h.j(e.a.d.a.a.l("lateinit property ", str, " has not been initialized"));
        h(jVar, j.class.getName());
        throw jVar;
    }
}
