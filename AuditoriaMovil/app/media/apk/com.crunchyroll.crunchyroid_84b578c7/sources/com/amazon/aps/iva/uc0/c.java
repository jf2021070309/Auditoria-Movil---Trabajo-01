package com.amazon.aps.iva.uc0;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
/* compiled from: ReflectJavaMember.kt */
/* loaded from: classes4.dex */
public final class c {
    public static final c a = new c();
    public static a b;

    /* compiled from: ReflectJavaMember.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        public final Method a;
        public final Method b;

        public a(Method method, Method method2) {
            this.a = method;
            this.b = method2;
        }
    }

    public static a a(Member member) {
        Class<?> cls = member.getClass();
        try {
            return new a(cls.getMethod("getParameters", new Class[0]), d.d(cls).loadClass("java.lang.reflect.Parameter").getMethod("getName", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return new a(null, null);
        }
    }
}
