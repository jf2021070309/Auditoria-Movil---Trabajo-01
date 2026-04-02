package com.amazon.aps.iva.hf0;

import com.amazon.aps.iva.j9.c0;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
/* compiled from: BoundaryInterfaceReflectionUtil.java */
/* loaded from: classes4.dex */
public final class a {

    /* compiled from: BoundaryInterfaceReflectionUtil.java */
    /* renamed from: com.amazon.aps.iva.hf0.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0338a implements InvocationHandler {
        public final Object b;

        public C0338a(c0 c0Var) {
            this.b = c0Var;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            Object obj2 = this.b;
            try {
                return Class.forName(method.getDeclaringClass().getName(), true, obj2.getClass().getClassLoader()).getDeclaredMethod(method.getName(), method.getParameterTypes()).invoke(obj2, objArr);
            } catch (InvocationTargetException e) {
                throw e.getTargetException();
            } catch (ReflectiveOperationException e2) {
                throw new RuntimeException("Reflection failed for method " + method, e2);
            }
        }
    }

    public static <T> T a(Class<T> cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(a.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }
}
