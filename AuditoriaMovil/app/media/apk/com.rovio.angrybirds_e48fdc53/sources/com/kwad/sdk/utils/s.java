package com.kwad.sdk.utils;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes3.dex */
public final class s {
    private static final Map<Class<?>, Class<?>> aIL;

    /* loaded from: classes3.dex */
    public static class a<T> {
        public final Class<? extends T> aIM;
        public final T obj;
    }

    static {
        HashMap hashMap = new HashMap();
        aIL = hashMap;
        hashMap.put(Boolean.class, Boolean.TYPE);
        hashMap.put(Byte.class, Byte.TYPE);
        hashMap.put(Character.class, Character.TYPE);
        hashMap.put(Short.class, Short.TYPE);
        hashMap.put(Integer.class, Integer.TYPE);
        hashMap.put(Float.class, Float.TYPE);
        hashMap.put(Long.class, Long.TYPE);
        hashMap.put(Double.class, Double.TYPE);
        Class cls = Boolean.TYPE;
        hashMap.put(cls, cls);
        Class cls2 = Byte.TYPE;
        hashMap.put(cls2, cls2);
        Class cls3 = Character.TYPE;
        hashMap.put(cls3, cls3);
        Class cls4 = Short.TYPE;
        hashMap.put(cls4, cls4);
        Class cls5 = Integer.TYPE;
        hashMap.put(cls5, cls5);
        Class cls6 = Float.TYPE;
        hashMap.put(cls6, cls6);
        Class cls7 = Long.TYPE;
        hashMap.put(cls7, cls7);
        Class cls8 = Double.TYPE;
        hashMap.put(cls8, cls8);
    }

    public static Class<?> a(String str, ClassLoader classLoader) {
        try {
            return Class.forName(str, false, classLoader);
        } catch (ClassNotFoundException e) {
            return null;
        } catch (Throwable th) {
            com.kwad.sdk.core.e.c.printStackTraceOnly(th);
            return null;
        }
    }

    public static <T> T a(Class<?> cls, Object... objArr) {
        try {
            return (T) b(cls, objArr);
        } catch (Throwable th) {
            q(th);
            return null;
        }
    }

    public static <T> T a(String str, String str2, Object... objArr) {
        try {
            return (T) c(Class.forName(str), str2, objArr);
        } catch (Throwable th) {
            q(th);
            return null;
        }
    }

    public static Object a(Field field, Object obj) {
        if (!field.isAccessible()) {
            field.setAccessible(true);
        }
        try {
            return field.get(obj);
        } catch (Throwable th) {
            q(th);
            return null;
        }
    }

    private static Method a(Method[] methodArr, String str, Class<?>[] clsArr) {
        ao.fF(str);
        for (Method method : methodArr) {
            if (method.getName().equals(str) && a(method.getParameterTypes(), clsArr, false)) {
                return method;
            }
        }
        return null;
    }

    public static void a(Class<?> cls, String str, Object obj) {
        try {
            b(cls, str, obj);
        } catch (Throwable th) {
            q(th);
        }
    }

    public static void a(Object obj, String str, Object obj2) {
        try {
            b(obj, str, obj2);
        } catch (Throwable th) {
            q(th);
        }
    }

    public static void a(Field field, Object obj, Object obj2) {
        if (!field.isAccessible()) {
            field.setAccessible(true);
        }
        try {
            field.set(obj, obj2);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    private static boolean a(Class<?>[] clsArr, Class<?>[] clsArr2, boolean z) {
        if (clsArr == null) {
            return clsArr2 == null || clsArr2.length == 0;
        } else if (clsArr2 == null) {
            return clsArr.length == 0;
        } else if (clsArr.length != clsArr2.length) {
            return false;
        } else {
            for (int i = 0; i < clsArr.length; i++) {
                if ((!z || (clsArr[i] != null && clsArr2[i] != null)) && !clsArr[i].isAssignableFrom(clsArr2[i])) {
                    Map<Class<?>, Class<?>> map = aIL;
                    if (!map.containsKey(clsArr[i]) || !map.get(clsArr[i]).equals(map.get(clsArr2[i]))) {
                        return false;
                    }
                }
            }
            return true;
        }
    }

    public static <T> T ak(String str, String str2) {
        try {
            return (T) al(str, str2);
        } catch (Throwable th) {
            q(th);
            return null;
        }
    }

    private static <T> T al(String str, String str2) {
        return (T) d(Class.forName(str), str2);
    }

    public static <T> T b(Class<?> cls, String str, Object... objArr) {
        try {
            return (T) c(cls, str, objArr);
        } catch (Throwable th) {
            q(th);
            return null;
        }
    }

    private static <T> T b(Class<?> cls, Object... objArr) {
        return (T) cls.getConstructor(c(objArr)).newInstance(d(objArr));
    }

    private static Method b(Method[] methodArr, String str, Class<?>[] clsArr) {
        ao.fF(str);
        for (Method method : methodArr) {
            if (method.getName().equals(str) && b(method.getParameterTypes(), clsArr)) {
                return method;
            }
        }
        return null;
    }

    private static void b(Class<?> cls, String str, Object obj) {
        Field field = null;
        while (field == null) {
            try {
                field = cls.getDeclaredField(str);
                continue;
            } catch (NoSuchFieldException e) {
                cls = cls.getSuperclass();
                continue;
            }
            if (cls == null) {
                throw new NoSuchFieldException();
            }
        }
        field.setAccessible(true);
        field.set(null, obj);
    }

    public static void b(Object obj, String str, Object obj2) {
        Class<?> cls = obj.getClass();
        Field field = null;
        while (field == null) {
            try {
                field = cls.getDeclaredField(str);
                continue;
            } catch (NoSuchFieldException e) {
                cls = cls.getSuperclass();
                continue;
            }
            if (cls == null) {
                throw new NoSuchFieldException();
            }
        }
        field.setAccessible(true);
        field.set(obj, obj2);
    }

    private static boolean b(Class<?>[] clsArr, Class<?>[] clsArr2) {
        return a(clsArr, clsArr2, true);
    }

    public static <T> T c(Class<?> cls, String str) {
        try {
            return (T) d(cls, str);
        } catch (Throwable th) {
            q(th);
            return null;
        }
    }

    public static <T> T c(Class<?> cls, String str, Object... objArr) {
        return (T) c(cls, str, c(objArr)).invoke(null, d(objArr));
    }

    private static Method c(Class<?> cls, String str, Class<?>... clsArr) {
        while (true) {
            Method a2 = a(cls.getDeclaredMethods(), str, clsArr);
            if (a2 != null) {
                a2.setAccessible(true);
                return a2;
            } else if (cls.getSuperclass() == null) {
                throw new NoSuchMethodException();
            } else {
                cls = cls.getSuperclass();
            }
        }
    }

    private static Class<?>[] c(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            clsArr[i] = (obj == null || !(obj instanceof a)) ? obj == null ? null : obj.getClass() : ((a) obj).aIM;
        }
        return clsArr;
    }

    private static <T> T d(Class<?> cls, String str) {
        Field declaredField = cls.getDeclaredField(str);
        declaredField.setAccessible(true);
        return (T) declaredField.get(null);
    }

    private static Object[] d(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        Object[] objArr2 = new Object[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj == null || !(obj instanceof a)) {
                objArr2[i] = obj;
            } else {
                objArr2[i] = ((a) obj).obj;
            }
        }
        return objArr2;
    }

    private static Method e(Class<?> cls, String str, Class<?>... clsArr) {
        while (true) {
            Method b = b(cls.getDeclaredMethods(), str, clsArr);
            if (b != null) {
                b.setAccessible(true);
                return b;
            } else if (cls.getSuperclass() == null) {
                throw new NoSuchMethodException();
            } else {
                cls = cls.getSuperclass();
            }
        }
    }

    public static <T> T f(Object obj, String str) {
        try {
            return (T) g(obj, str);
        } catch (Throwable th) {
            q(th);
            return null;
        }
    }

    public static <T> T f(Object obj, String str, Object... objArr) {
        try {
            return (T) h(obj, str, objArr);
        } catch (Throwable th) {
            q(th);
            return null;
        }
    }

    public static boolean fu(String str) {
        try {
            return Class.forName(str) != null;
        } catch (ClassNotFoundException e) {
            return false;
        } catch (Throwable th) {
            com.kwad.sdk.core.e.c.printStackTraceOnly(th);
            return false;
        }
    }

    public static <T> T fv(String str) {
        try {
            return (T) j(Class.forName(str));
        } catch (Throwable th) {
            q(th);
            return null;
        }
    }

    public static <T> T g(Object obj, String str) {
        Class<?> cls = obj.getClass();
        Field field = null;
        while (field == null) {
            try {
                field = cls.getDeclaredField(str);
                field.setAccessible(true);
                continue;
            } catch (NoSuchFieldException e) {
                cls = cls.getSuperclass();
                continue;
            }
            if (cls == null) {
                throw new NoSuchFieldException();
            }
        }
        field.setAccessible(true);
        return (T) field.get(obj);
    }

    public static <T> T g(Object obj, String str, Object... objArr) {
        try {
            return (T) i(obj, str, objArr);
        } catch (Throwable th) {
            q(th);
            return null;
        }
    }

    public static <T> T g(String str, Object... objArr) {
        try {
            return (T) h(str, objArr);
        } catch (Throwable th) {
            q(th);
            return null;
        }
    }

    public static <T> T h(Object obj, String str, Object... objArr) {
        return (T) c(obj.getClass(), str, c(objArr)).invoke(obj, d(objArr));
    }

    private static <T> T h(String str, Object... objArr) {
        return (T) b(Class.forName(str), d(objArr));
    }

    public static <T> T i(Class<?> cls) {
        try {
            return (T) j(cls);
        } catch (Throwable th) {
            q(th);
            return null;
        }
    }

    private static <T> T i(Object obj, String str, Object... objArr) {
        return (T) e(obj.getClass(), str, c(objArr)).invoke(obj, d(objArr));
    }

    private static <T> T j(Class<?> cls) {
        Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        if (declaredConstructors == null || declaredConstructors.length == 0) {
            throw new IllegalArgumentException("Can't get even one available constructor for " + cls);
        }
        Constructor<?> constructor = declaredConstructors[0];
        constructor.setAccessible(true);
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        if (parameterTypes == null || parameterTypes.length == 0) {
            return (T) constructor.newInstance(new Object[0]);
        }
        Object[] objArr = new Object[parameterTypes.length];
        for (int i = 0; i < parameterTypes.length; i++) {
            objArr[i] = k(parameterTypes[i]);
        }
        return (T) constructor.newInstance(objArr);
    }

    private static Object k(Class<?> cls) {
        if (Integer.TYPE.equals(cls) || Integer.class.equals(cls) || Byte.TYPE.equals(cls) || Byte.class.equals(cls) || Short.TYPE.equals(cls) || Short.class.equals(cls) || Long.TYPE.equals(cls) || Long.class.equals(cls) || Double.TYPE.equals(cls) || Double.class.equals(cls) || Float.TYPE.equals(cls) || Float.class.equals(cls)) {
            return 0;
        }
        return (Boolean.TYPE.equals(cls) || Boolean.class.equals(cls)) ? Boolean.FALSE : (Character.TYPE.equals(cls) || Character.class.equals(cls)) ? (char) 0 : null;
    }

    private static void q(Throwable th) {
        if (!com.kwad.library.a.a.mp.booleanValue()) {
            com.kwad.sdk.core.e.c.printStackTrace(th);
        } else if (!(th instanceof RuntimeException)) {
            throw new RuntimeException(th);
        } else {
            throw ((RuntimeException) th);
        }
    }
}
