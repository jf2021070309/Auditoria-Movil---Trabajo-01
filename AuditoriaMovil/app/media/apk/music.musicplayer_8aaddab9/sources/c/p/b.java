package c.p;

import c.p.j;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
@Deprecated
/* loaded from: classes.dex */
public final class b {
    public static b a = new b();

    /* renamed from: b  reason: collision with root package name */
    public final Map<Class<?>, a> f2429b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final Map<Class<?>, Boolean> f2430c = new HashMap();

    @Deprecated
    /* loaded from: classes.dex */
    public static class a {
        public final Map<j.a, List<C0046b>> a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        public final Map<C0046b, j.a> f2431b;

        public a(Map<C0046b, j.a> map) {
            this.f2431b = map;
            for (Map.Entry<C0046b, j.a> entry : map.entrySet()) {
                j.a value = entry.getValue();
                List<C0046b> list = this.a.get(value);
                if (list == null) {
                    list = new ArrayList<>();
                    this.a.put(value, list);
                }
                list.add(entry.getKey());
            }
        }

        public static void a(List<C0046b> list, p pVar, j.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    C0046b c0046b = list.get(size);
                    Objects.requireNonNull(c0046b);
                    try {
                        int i2 = c0046b.a;
                        if (i2 == 0) {
                            c0046b.f2432b.invoke(obj, new Object[0]);
                        } else if (i2 == 1) {
                            c0046b.f2432b.invoke(obj, pVar);
                        } else if (i2 == 2) {
                            c0046b.f2432b.invoke(obj, pVar, aVar);
                        }
                    } catch (IllegalAccessException e2) {
                        throw new RuntimeException(e2);
                    } catch (InvocationTargetException e3) {
                        throw new RuntimeException("Failed to call observer method", e3.getCause());
                    }
                }
            }
        }
    }

    @Deprecated
    /* renamed from: c.p.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0046b {
        public final int a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f2432b;

        public C0046b(int i2, Method method) {
            this.a = i2;
            this.f2432b = method;
            method.setAccessible(true);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0046b) {
                C0046b c0046b = (C0046b) obj;
                return this.a == c0046b.a && this.f2432b.getName().equals(c0046b.f2432b.getName());
            }
            return false;
        }

        public int hashCode() {
            return this.f2432b.getName().hashCode() + (this.a * 31);
        }
    }

    public final a a(Class<?> cls, Method[] methodArr) {
        int i2;
        a b2;
        Class<?> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null && (b2 = b(superclass)) != null) {
            hashMap.putAll(b2.f2431b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<C0046b, j.a> entry : b(cls2).f2431b.entrySet()) {
                c(hashMap, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e2) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            y yVar = (y) method.getAnnotation(y.class);
            if (yVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i2 = 0;
                } else if (!parameterTypes[0].isAssignableFrom(p.class)) {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                } else {
                    i2 = 1;
                }
                j.a value = yVar.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(j.a.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != j.a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i2 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                c(hashMap, new C0046b(i2, method), value, cls);
                z = true;
            }
        }
        a aVar = new a(hashMap);
        this.f2429b.put(cls, aVar);
        this.f2430c.put(cls, Boolean.valueOf(z));
        return aVar;
    }

    public a b(Class<?> cls) {
        a aVar = this.f2429b.get(cls);
        return aVar != null ? aVar : a(cls, null);
    }

    public final void c(Map<C0046b, j.a> map, C0046b c0046b, j.a aVar, Class<?> cls) {
        j.a aVar2 = map.get(c0046b);
        if (aVar2 == null || aVar == aVar2) {
            if (aVar2 == null) {
                map.put(c0046b, aVar);
                return;
            }
            return;
        }
        Method method = c0046b.f2432b;
        StringBuilder y = e.a.d.a.a.y("Method ");
        y.append(method.getName());
        y.append(" in ");
        y.append(cls.getName());
        y.append(" already declared with different @OnLifecycleEvent value: previous value ");
        y.append(aVar2);
        y.append(", new value ");
        y.append(aVar);
        throw new IllegalArgumentException(y.toString());
    }
}
