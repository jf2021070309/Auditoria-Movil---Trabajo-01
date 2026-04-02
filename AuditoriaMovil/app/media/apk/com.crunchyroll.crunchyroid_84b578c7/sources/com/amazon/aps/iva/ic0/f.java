package com.amazon.aps.iva.ic0;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.md0.d;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.List;
/* compiled from: RuntimeTypeMapper.kt */
/* loaded from: classes4.dex */
public abstract class f {

    /* compiled from: RuntimeTypeMapper.kt */
    /* loaded from: classes4.dex */
    public static final class a extends f {
        public final List<Method> a;

        /* compiled from: RuntimeTypeMapper.kt */
        /* renamed from: com.amazon.aps.iva.ic0.f$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0359a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Method, CharSequence> {
            public static final C0359a h = new C0359a();

            public C0359a() {
                super(1);
            }

            @Override // com.amazon.aps.iva.xb0.l
            public final CharSequence invoke(Method method) {
                Class<?> returnType = method.getReturnType();
                com.amazon.aps.iva.yb0.j.e(returnType, "it.returnType");
                return com.amazon.aps.iva.uc0.d.b(returnType);
            }
        }

        /* compiled from: Comparisons.kt */
        /* loaded from: classes4.dex */
        public static final class b<T> implements Comparator {
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return f1.t(((Method) t).getName(), ((Method) t2).getName());
            }
        }

        public a(Class<?> cls) {
            com.amazon.aps.iva.yb0.j.f(cls, "jClass");
            Method[] declaredMethods = cls.getDeclaredMethods();
            com.amazon.aps.iva.yb0.j.e(declaredMethods, "jClass.declaredMethods");
            this.a = com.amazon.aps.iva.lb0.o.a0(new b(), declaredMethods);
        }

        @Override // com.amazon.aps.iva.ic0.f
        public final String a() {
            return com.amazon.aps.iva.lb0.x.B0(this.a, "", "<init>(", ")V", C0359a.h, 24);
        }
    }

    /* compiled from: RuntimeTypeMapper.kt */
    /* loaded from: classes4.dex */
    public static final class b extends f {
        public final Constructor<?> a;

        /* compiled from: RuntimeTypeMapper.kt */
        /* loaded from: classes4.dex */
        public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Class<?>, CharSequence> {
            public static final a h = new a();

            public a() {
                super(1);
            }

            @Override // com.amazon.aps.iva.xb0.l
            public final CharSequence invoke(Class<?> cls) {
                Class<?> cls2 = cls;
                com.amazon.aps.iva.yb0.j.e(cls2, "it");
                return com.amazon.aps.iva.uc0.d.b(cls2);
            }
        }

        public b(Constructor<?> constructor) {
            com.amazon.aps.iva.yb0.j.f(constructor, "constructor");
            this.a = constructor;
        }

        @Override // com.amazon.aps.iva.ic0.f
        public final String a() {
            Class<?>[] parameterTypes = this.a.getParameterTypes();
            com.amazon.aps.iva.yb0.j.e(parameterTypes, "constructor.parameterTypes");
            return com.amazon.aps.iva.lb0.o.V(parameterTypes, "", "<init>(", ")V", a.h, 24);
        }
    }

    /* compiled from: RuntimeTypeMapper.kt */
    /* loaded from: classes4.dex */
    public static final class c extends f {
        public final Method a;

        public c(Method method) {
            this.a = method;
        }

        @Override // com.amazon.aps.iva.ic0.f
        public final String a() {
            return com.amazon.aps.iva.ab.x.j(this.a);
        }
    }

    /* compiled from: RuntimeTypeMapper.kt */
    /* loaded from: classes4.dex */
    public static final class d extends f {
        public final d.b a;
        public final String b;

        public d(d.b bVar) {
            this.a = bVar;
            this.b = bVar.a();
        }

        @Override // com.amazon.aps.iva.ic0.f
        public final String a() {
            return this.b;
        }
    }

    /* compiled from: RuntimeTypeMapper.kt */
    /* loaded from: classes4.dex */
    public static final class e extends f {
        public final d.b a;
        public final String b;

        public e(d.b bVar) {
            this.a = bVar;
            this.b = bVar.a();
        }

        @Override // com.amazon.aps.iva.ic0.f
        public final String a() {
            return this.b;
        }
    }

    public abstract String a();
}
