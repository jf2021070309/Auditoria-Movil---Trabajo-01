package com.kwad.sdk.api.loader;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class Reflect {
    private final Class<?> aji;
    private final Object ajj;

    /* loaded from: classes.dex */
    public static class ReflectException extends RuntimeException {
        private static final long serialVersionUID = -6213149635297151442L;

        public ReflectException() {
        }

        public ReflectException(String str) {
            super(str);
        }

        public ReflectException(String str, Throwable th) {
            super(str, th);
        }

        public ReflectException(Throwable th) {
            super(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {
        private static final Method ajk;
        private static final Method ajl;
        private static final Method ajm;
        private static final Method ajn;
        private static final Method ajo;
        private static final Method ajp;
        private static final Method ajq;
        private static final Method ajr;
        private static final Method ajs;
        private static final Method ajt;
        private static final Method aju;
        private static final Method ajv;
        private static final Method ajw;
        private static final Method ajx;

        static {
            try {
                ajk = Class.class.getDeclaredMethod("forName", String.class);
                ajl = Class.class.getDeclaredMethod("forName", String.class, Boolean.TYPE, ClassLoader.class);
                ajm = Class.class.getDeclaredMethod("getDeclaredField", String.class);
                ajn = Class.class.getDeclaredMethod("getDeclaredFields", new Class[0]);
                ajo = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
                ajp = Class.class.getDeclaredMethod("getDeclaredMethods", new Class[0]);
                ajq = Class.class.getDeclaredMethod("getDeclaredConstructor", Class[].class);
                ajr = Class.class.getDeclaredMethod("getDeclaredConstructors", new Class[0]);
                ajs = Class.class.getDeclaredMethod("getField", String.class);
                ajt = Class.class.getDeclaredMethod("getFields", new Class[0]);
                aju = Class.class.getDeclaredMethod("getMethod", String.class, Class[].class);
                ajv = Class.class.getDeclaredMethod("getMethods", new Class[0]);
                ajw = Class.class.getDeclaredMethod("getConstructor", Class[].class);
                ajx = Class.class.getDeclaredMethod("getConstructors", new Class[0]);
            } catch (NoSuchMethodException e) {
                throw new ReflectException(e);
            }
        }

        static Constructor a(Class cls, Class<?>... clsArr) {
            try {
                return (Constructor) ajq.invoke(cls, clsArr);
            } catch (Exception e) {
                NoSuchMethodException noSuchMethodException = new NoSuchMethodException();
                noSuchMethodException.initCause(e);
                throw noSuchMethodException;
            }
        }

        static Field a(Class cls, String str) {
            try {
                return (Field) ajm.invoke(cls, str);
            } catch (Exception e) {
                NoSuchFieldException noSuchFieldException = new NoSuchFieldException();
                noSuchFieldException.initCause(e);
                throw noSuchFieldException;
            }
        }

        static Field b(Class cls, String str) {
            try {
                return (Field) ajs.invoke(cls, str);
            } catch (Exception e) {
                NoSuchFieldException noSuchFieldException = new NoSuchFieldException();
                noSuchFieldException.initCause(e);
                throw noSuchFieldException;
            }
        }

        static Method c(Class cls, String str, Class<?>... clsArr) {
            try {
                return (Method) ajo.invoke(cls, str, clsArr);
            } catch (Exception e) {
                NoSuchMethodException noSuchMethodException = new NoSuchMethodException();
                noSuchMethodException.initCause(e);
                throw noSuchMethodException;
            }
        }

        static Method[] c(Class cls) {
            try {
                return (Method[]) ajp.invoke(cls, new Object[0]);
            } catch (Exception e) {
                throw new ReflectException(e);
            }
        }

        static Method d(Class cls, String str, Class<?>... clsArr) {
            try {
                return (Method) aju.invoke(cls, str, clsArr);
            } catch (Exception e) {
                NoSuchMethodException noSuchMethodException = new NoSuchMethodException();
                noSuchMethodException.initCause(e);
                throw noSuchMethodException;
            }
        }

        static Method[] d(Class cls) {
            try {
                return (Method[]) ajv.invoke(cls, new Object[0]);
            } catch (Exception e) {
                throw new ReflectException(e);
            }
        }

        static Constructor[] e(Class cls) {
            try {
                return (Constructor[]) ajr.invoke(cls, new Object[0]);
            } catch (Exception e) {
                throw new ReflectException(e);
            }
        }

        static Class forName(String str) {
            try {
                return (Class) ajk.invoke(null, str);
            } catch (Exception e) {
                ClassNotFoundException classNotFoundException = new ClassNotFoundException();
                classNotFoundException.initCause(e);
                throw classNotFoundException;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b {
        private b() {
        }
    }

    private Reflect(Class<?> cls) {
        this(cls, cls);
    }

    private Reflect(Class<?> cls, Object obj) {
        this.aji = cls;
        this.ajj = obj;
    }

    public static Reflect a(Class<?> cls) {
        return new Reflect(cls);
    }

    private static Reflect a(Class<?> cls, Object obj) {
        return new Reflect(cls, obj);
    }

    private static Reflect a(Constructor<?> constructor, Object... objArr) {
        try {
            return a(constructor.getDeclaringClass(), ((Constructor) a(constructor)).newInstance(objArr));
        } catch (Exception e) {
            throw new ReflectException(e);
        }
    }

    private static Reflect a(Method method, Object obj, Object... objArr) {
        try {
            a(method);
            if (method.getReturnType() == Void.TYPE) {
                method.invoke(obj, objArr);
                return h(obj);
            }
            return h(method.invoke(obj, objArr));
        } catch (Exception e) {
            throw new ReflectException(e);
        }
    }

    private Reflect a(Object... objArr) {
        return a(b(objArr), objArr);
    }

    private static <T extends AccessibleObject> T a(T t) {
        if (t == null) {
            return null;
        }
        if (t instanceof Member) {
            Member member = (Member) t;
            if (Modifier.isPublic(member.getModifiers()) && Modifier.isPublic(member.getDeclaringClass().getModifiers())) {
                return t;
            }
        }
        if (!t.isAccessible()) {
            t.setAccessible(true);
        }
        return t;
    }

    private Method a(String str, Class<?>[] clsArr) {
        Class<?> type = type();
        try {
            return a.d(type, str, clsArr);
        } catch (NoSuchMethodException e) {
            do {
                try {
                    return a.c(type, str, clsArr);
                } catch (NoSuchMethodException e2) {
                    type = type.getSuperclass();
                    if (type == null) {
                        throw new NoSuchMethodException();
                    }
                }
            } while (type == null);
            throw new NoSuchMethodException();
        }
    }

    private boolean a(Method method, String str, Class<?>[] clsArr) {
        return method.getName().equals(str) && a(method.getParameterTypes(), clsArr);
    }

    private static boolean a(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (clsArr.length == clsArr2.length) {
            for (int i = 0; i < clsArr2.length; i++) {
                if (clsArr2[i] != b.class && !b(clsArr[i]).isAssignableFrom(b(clsArr2[i]))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    private static Class<?> b(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        return cls.isPrimitive() ? Boolean.TYPE == cls ? Boolean.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : Byte.TYPE == cls ? Byte.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Character.TYPE == cls ? Character.class : Void.TYPE == cls ? Void.class : cls : cls;
    }

    private Method b(String str, Class<?>[] clsArr) {
        Method[] d;
        Method[] c;
        Class<?> type = type();
        for (Method method : a.d(type)) {
            if (a(method, str, clsArr)) {
                return method;
            }
        }
        do {
            for (Method method2 : a.c(type)) {
                if (a(method2, str, clsArr)) {
                    return method2;
                }
            }
            type = type.getSuperclass();
        } while (type != null);
        throw new NoSuchMethodException("No similar method " + str + " with params " + Arrays.toString(clsArr) + " could be found on type " + type() + ".");
    }

    private static Class<?>[] b(Object... objArr) {
        if (objArr == null) {
            return new Class[0];
        }
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            clsArr[i] = obj == null ? b.class : obj.getClass();
        }
        return clsArr;
    }

    public static Reflect bY(String str) {
        return a(forName(str));
    }

    private Reflect bZ(String str) {
        try {
            Field ca = ca(str);
            return a(ca.getType(), ca.get(this.ajj));
        } catch (Exception e) {
            throw new ReflectException(e);
        }
    }

    private Field ca(String str) {
        Class<?> type = type();
        try {
            return (Field) a(a.b(type, str));
        } catch (NoSuchFieldException e) {
            do {
                try {
                    return (Field) a(a.a(type, str));
                } catch (NoSuchFieldException e2) {
                    type = type.getSuperclass();
                    if (type != null) {
                        throw new ReflectException(e);
                    }
                }
            } while (type != null);
            throw new ReflectException(e);
        }
    }

    private Reflect f(String str, Object... objArr) {
        return a(str, b(objArr), objArr);
    }

    private static Class<?> forName(String str) {
        try {
            return a.forName(str);
        } catch (Exception e) {
            throw new ReflectException(e);
        }
    }

    public static Reflect h(Object obj) {
        return new Reflect(obj == null ? Object.class : obj.getClass(), obj);
    }

    private static Object i(Object obj) {
        return obj instanceof Reflect ? ((Reflect) obj).get() : obj;
    }

    private Class<?> type() {
        return this.aji;
    }

    public final Reflect a(String str, Class<?>[] clsArr, Object... objArr) {
        try {
            return a(a(str, clsArr), this.ajj, objArr);
        } catch (NoSuchMethodException e) {
            try {
                return a(b(str, clsArr), this.ajj, objArr);
            } catch (NoSuchMethodException e2) {
                throw new ReflectException(e2);
            }
        }
    }

    public final Reflect a(Class<?>[] clsArr, Object... objArr) {
        Constructor[] e;
        try {
            return a(a.a(type(), clsArr), objArr);
        } catch (NoSuchMethodException e2) {
            for (Constructor constructor : a.e(type())) {
                if (a(constructor.getParameterTypes(), clsArr)) {
                    return a(constructor, objArr);
                }
            }
            throw new ReflectException(e2);
        }
    }

    public final Reflect b(String str, Object obj) {
        try {
            Field ca = ca(str);
            if ((ca.getModifiers() & 16) == 16) {
                try {
                    Field a2 = a.a(Field.class, "modifiers");
                    a2.setAccessible(true);
                    a2.setInt(ca, ca.getModifiers() & (-17));
                } catch (NoSuchFieldException e) {
                }
            }
            ca.set(this.ajj, i(obj));
            return this;
        } catch (Exception e2) {
            throw new ReflectException(e2);
        }
    }

    public final Reflect cb(String str) {
        return f(str, new Object[0]);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Reflect) {
            return this.ajj.equals(((Reflect) obj).get());
        }
        return false;
    }

    public final <T> T get() {
        return (T) this.ajj;
    }

    public final <T> T get(String str) {
        return (T) bZ(str).get();
    }

    public final int hashCode() {
        return this.ajj.hashCode();
    }

    public final String toString() {
        return String.valueOf(this.ajj);
    }

    public final Reflect yu() {
        return a(new Object[0]);
    }
}
