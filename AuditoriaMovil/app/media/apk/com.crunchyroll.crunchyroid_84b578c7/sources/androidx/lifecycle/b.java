package androidx.lifecycle;

import androidx.lifecycle.g;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ClassesInfoCache.java */
@Deprecated
/* loaded from: classes.dex */
public final class b {
    public static final b c = new b();
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();

    /* compiled from: ClassesInfoCache.java */
    @Deprecated
    /* loaded from: classes.dex */
    public static class a {
        public final HashMap a = new HashMap();
        public final Map<C0033b, g.a> b;

        public a(HashMap hashMap) {
            this.b = hashMap;
            for (Map.Entry entry : hashMap.entrySet()) {
                g.a aVar = (g.a) entry.getValue();
                List list = (List) this.a.get(aVar);
                if (list == null) {
                    list = new ArrayList();
                    this.a.put(aVar, list);
                }
                list.add((C0033b) entry.getKey());
            }
        }

        public static void a(List<C0033b> list, com.amazon.aps.iva.i5.o oVar, g.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    C0033b c0033b = list.get(size);
                    c0033b.getClass();
                    try {
                        int i = c0033b.a;
                        Method method = c0033b.b;
                        if (i != 0) {
                            if (i != 1) {
                                if (i == 2) {
                                    method.invoke(obj, oVar, aVar);
                                }
                            } else {
                                method.invoke(obj, oVar);
                            }
                        } else {
                            method.invoke(obj, new Object[0]);
                        }
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    } catch (InvocationTargetException e2) {
                        throw new RuntimeException("Failed to call observer method", e2.getCause());
                    }
                }
            }
        }
    }

    /* compiled from: ClassesInfoCache.java */
    @Deprecated
    /* renamed from: androidx.lifecycle.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0033b {
        public final int a;
        public final Method b;

        public C0033b(Method method, int i) {
            this.a = i;
            this.b = method;
            method.setAccessible(true);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0033b)) {
                return false;
            }
            C0033b c0033b = (C0033b) obj;
            if (this.a == c0033b.a && this.b.getName().equals(c0033b.b.getName())) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.b.getName().hashCode() + (this.a * 31);
        }
    }

    public static void c(HashMap hashMap, C0033b c0033b, g.a aVar, Class cls) {
        g.a aVar2 = (g.a) hashMap.get(c0033b);
        if (aVar2 != null && aVar != aVar2) {
            Method method = c0033b.b;
            throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
        } else if (aVar2 == null) {
            hashMap.put(c0033b, aVar);
        }
    }

    public final a a(Class<?> cls, Method[] methodArr) {
        int i;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null) {
            hashMap.putAll(b(superclass).b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<C0033b, g.a> entry : b(cls2).b.entrySet()) {
                c(hashMap, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            l lVar = (l) method.getAnnotation(l.class);
            if (lVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length > 0) {
                    if (com.amazon.aps.iva.i5.o.class.isAssignableFrom(parameterTypes[0])) {
                        i = 1;
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                } else {
                    i = 0;
                }
                g.a value = lVar.value();
                if (parameterTypes.length > 1) {
                    if (g.a.class.isAssignableFrom(parameterTypes[1])) {
                        if (value == g.a.ON_ANY) {
                            i = 2;
                        } else {
                            throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                        }
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                }
                if (parameterTypes.length <= 2) {
                    c(hashMap, new C0033b(method, i), value, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        a aVar = new a(hashMap);
        this.a.put(cls, aVar);
        this.b.put(cls, Boolean.valueOf(z));
        return aVar;
    }

    public final a b(Class<?> cls) {
        a aVar = (a) this.a.get(cls);
        if (aVar != null) {
            return aVar;
        }
        return a(cls, null);
    }
}
