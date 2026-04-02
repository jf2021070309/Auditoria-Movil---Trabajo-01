package com.amazon.aps.iva.uc0;

import com.amazon.aps.iva.uc0.a;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
/* compiled from: ReflectJavaRecordComponent.kt */
/* loaded from: classes4.dex */
public final class d0 extends z implements com.amazon.aps.iva.ed0.v {
    public final Object a;

    public d0(Object obj) {
        com.amazon.aps.iva.yb0.j.f(obj, "recordComponent");
        this.a = obj;
    }

    @Override // com.amazon.aps.iva.uc0.z
    public final Member O() {
        Object obj = this.a;
        com.amazon.aps.iva.yb0.j.f(obj, "recordComponent");
        a.C0762a c0762a = a.a;
        Method method = null;
        if (c0762a == null) {
            Class<?> cls = obj.getClass();
            try {
                c0762a = new a.C0762a(cls.getMethod("getType", new Class[0]), cls.getMethod("getAccessor", new Class[0]));
            } catch (NoSuchMethodException unused) {
                c0762a = new a.C0762a(null, null);
            }
            a.a = c0762a;
        }
        Method method2 = c0762a.b;
        if (method2 != null) {
            Object invoke = method2.invoke(obj, new Object[0]);
            com.amazon.aps.iva.yb0.j.d(invoke, "null cannot be cast to non-null type java.lang.reflect.Method");
            method = (Method) invoke;
        }
        if (method != null) {
            return method;
        }
        throw new NoSuchMethodError("Can't find `getAccessor` method");
    }

    @Override // com.amazon.aps.iva.ed0.v
    public final boolean a() {
        return false;
    }

    @Override // com.amazon.aps.iva.ed0.v
    public final com.amazon.aps.iva.ed0.w getType() {
        Object obj = this.a;
        com.amazon.aps.iva.yb0.j.f(obj, "recordComponent");
        a.C0762a c0762a = a.a;
        Class cls = null;
        if (c0762a == null) {
            Class<?> cls2 = obj.getClass();
            try {
                c0762a = new a.C0762a(cls2.getMethod("getType", new Class[0]), cls2.getMethod("getAccessor", new Class[0]));
            } catch (NoSuchMethodException unused) {
                c0762a = new a.C0762a(null, null);
            }
            a.a = c0762a;
        }
        Method method = c0762a.a;
        if (method != null) {
            Object invoke = method.invoke(obj, new Object[0]);
            com.amazon.aps.iva.yb0.j.d(invoke, "null cannot be cast to non-null type java.lang.Class<*>");
            cls = (Class) invoke;
        }
        if (cls != null) {
            return new t(cls);
        }
        throw new NoSuchMethodError("Can't find `getType` method");
    }
}
