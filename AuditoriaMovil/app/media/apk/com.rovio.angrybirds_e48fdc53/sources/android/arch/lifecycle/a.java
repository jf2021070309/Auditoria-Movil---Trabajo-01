package android.arch.lifecycle;

import android.arch.lifecycle.Lifecycle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
class a {
    static a a = new a();
    private final Map<Class, C0000a> b = new HashMap();
    private final Map<Class, Boolean> c = new HashMap();

    a() {
    }

    boolean a(Class cls) {
        if (this.c.containsKey(cls)) {
            return this.c.get(cls).booleanValue();
        }
        Method[] c = c(cls);
        for (Method method : c) {
            if (((OnLifecycleEvent) method.getAnnotation(OnLifecycleEvent.class)) != null) {
                a(cls, c);
                return true;
            }
        }
        this.c.put(cls, false);
        return false;
    }

    private Method[] c(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    C0000a b(Class cls) {
        C0000a c0000a = this.b.get(cls);
        if (c0000a == null) {
            return a(cls, null);
        }
        return c0000a;
    }

    private void a(Map<b, Lifecycle.Event> map, b bVar, Lifecycle.Event event, Class cls) {
        Lifecycle.Event event2 = map.get(bVar);
        if (event2 != null && event != event2) {
            throw new IllegalArgumentException("Method " + bVar.b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + event2 + ", new value " + event);
        } else if (event2 == null) {
            map.put(bVar, event);
        }
    }

    private C0000a a(Class cls, Method[] methodArr) {
        int i;
        boolean z;
        C0000a b2;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null && (b2 = b(superclass)) != null) {
            hashMap.putAll(b2.b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<b, Lifecycle.Event> entry : b(cls2).b.entrySet()) {
                a(hashMap, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = c(cls);
        }
        int length = methodArr.length;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < length) {
            Method method = methodArr[i2];
            OnLifecycleEvent onLifecycleEvent = (OnLifecycleEvent) method.getAnnotation(OnLifecycleEvent.class);
            if (onLifecycleEvent == null) {
                z = z2;
            } else {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (!parameterTypes[0].isAssignableFrom(LifecycleOwner.class)) {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                } else {
                    i = 1;
                }
                Lifecycle.Event value = onLifecycleEvent.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(Lifecycle.Event.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != Lifecycle.Event.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                a(hashMap, new b(i, method), value, cls);
                z = true;
            }
            i2++;
            z2 = z;
        }
        C0000a c0000a = new C0000a(hashMap);
        this.b.put(cls, c0000a);
        this.c.put(cls, Boolean.valueOf(z2));
        return c0000a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: android.arch.lifecycle.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0000a {
        final Map<Lifecycle.Event, List<b>> a = new HashMap();
        final Map<b, Lifecycle.Event> b;

        C0000a(Map<b, Lifecycle.Event> map) {
            this.b = map;
            for (Map.Entry<b, Lifecycle.Event> entry : map.entrySet()) {
                Lifecycle.Event value = entry.getValue();
                List<b> list = this.a.get(value);
                if (list == null) {
                    list = new ArrayList<>();
                    this.a.put(value, list);
                }
                list.add(entry.getKey());
            }
        }

        void a(LifecycleOwner lifecycleOwner, Lifecycle.Event event, Object obj) {
            a(this.a.get(event), lifecycleOwner, event, obj);
            a(this.a.get(Lifecycle.Event.ON_ANY), lifecycleOwner, event, obj);
        }

        private static void a(List<b> list, LifecycleOwner lifecycleOwner, Lifecycle.Event event, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).a(lifecycleOwner, event, obj);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class b {
        final int a;
        final Method b;

        b(int i, Method method) {
            this.a = i;
            this.b = method;
            this.b.setAccessible(true);
        }

        void a(LifecycleOwner lifecycleOwner, Lifecycle.Event event, Object obj) {
            try {
                switch (this.a) {
                    case 0:
                        this.b.invoke(obj, new Object[0]);
                        return;
                    case 1:
                        this.b.invoke(obj, lifecycleOwner);
                        return;
                    case 2:
                        this.b.invoke(obj, lifecycleOwner, event);
                        return;
                    default:
                        return;
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException("Failed to call observer method", e2.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b.getName().equals(bVar.b.getName());
        }

        public int hashCode() {
            return (this.a * 31) + this.b.getName().hashCode();
        }
    }
}
