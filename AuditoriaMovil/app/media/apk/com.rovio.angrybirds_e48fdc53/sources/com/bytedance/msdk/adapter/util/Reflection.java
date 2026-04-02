package com.bytedance.msdk.adapter.util;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class Reflection {

    /* loaded from: classes.dex */
    public static class MethodBuilder {
        private final Object a;
        private final String b;
        private Class<?> c;
        private List<Class<?>> d = new ArrayList();
        private List<Object> e = new ArrayList();
        private boolean f;
        private boolean g;

        public MethodBuilder(Object obj, String str) {
            this.a = obj;
            this.b = str;
            this.c = obj != null ? obj.getClass() : null;
        }

        public <T> MethodBuilder addParam(Class<T> cls, T t) {
            this.d.add(cls);
            this.e.add(t);
            return this;
        }

        public MethodBuilder addParam(String str, Object obj) throws ClassNotFoundException {
            this.d.add(Class.forName(str));
            this.e.add(obj);
            return this;
        }

        public Object execute() throws Exception {
            Method declaredMethodWithTraversal = Reflection.getDeclaredMethodWithTraversal(this.c, this.b, (Class[]) this.d.toArray(new Class[this.d.size()]));
            if (this.f) {
                declaredMethodWithTraversal.setAccessible(true);
            }
            return declaredMethodWithTraversal.invoke(this.g ? null : this.a, this.e.toArray());
        }

        public MethodBuilder setAccessible() {
            this.f = true;
            return this;
        }

        public MethodBuilder setStatic(Class<?> cls) {
            this.g = true;
            this.c = cls;
            return this;
        }

        public MethodBuilder setStatic(String str) throws ClassNotFoundException {
            this.g = true;
            this.c = Class.forName(str);
            return this;
        }
    }

    public static boolean classFound(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

    public static Method getDeclaredMethodWithTraversal(Class<?> cls, String str, Class<?>... clsArr) throws NoSuchMethodException {
        while (cls != null) {
            try {
                return cls.getDeclaredMethod(str, clsArr);
            } catch (NoSuchMethodException e) {
                cls = cls.getSuperclass();
            }
        }
        throw new NoSuchMethodException();
    }

    public static Field getPrivateField(Class cls, String str) throws NoSuchFieldException {
        Field declaredField = cls.getDeclaredField(str);
        declaredField.setAccessible(true);
        return declaredField;
    }

    public static <T> T instantiateClassWithConstructor(String str, Class<? extends T> cls, Class[] clsArr, Object[] objArr) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Constructor declaredConstructor = Class.forName(str).asSubclass(cls).getDeclaredConstructor(clsArr);
        declaredConstructor.setAccessible(true);
        return (T) declaredConstructor.newInstance(objArr);
    }

    public static <T> T instantiateClassWithEmptyConstructor(String str, Class<? extends T> cls) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NullPointerException {
        Constructor declaredConstructor = Class.forName(str).asSubclass(cls).getDeclaredConstructor(null);
        declaredConstructor.setAccessible(true);
        return (T) declaredConstructor.newInstance(new Object[0]);
    }
}
