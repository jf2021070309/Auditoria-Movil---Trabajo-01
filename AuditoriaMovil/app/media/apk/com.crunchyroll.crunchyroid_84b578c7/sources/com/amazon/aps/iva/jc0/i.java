package com.amazon.aps.iva.jc0;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.jc0.f;
import com.amazon.aps.iva.lb0.m;
import com.amazon.aps.iva.lb0.z;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
/* compiled from: InternalUnderlyingValOfInlineClass.kt */
/* loaded from: classes4.dex */
public abstract class i implements f<Method> {
    public final Method a;
    public final List<Type> b;
    public final Class c;

    /* compiled from: InternalUnderlyingValOfInlineClass.kt */
    /* loaded from: classes4.dex */
    public static final class a extends i implements e {
        public final Object d;

        public a(Method method, Object obj) {
            super(method, z.b);
            this.d = obj;
        }

        @Override // com.amazon.aps.iva.jc0.f
        public final Object call(Object[] objArr) {
            com.amazon.aps.iva.yb0.j.f(objArr, "args");
            f.a.a(this, objArr);
            return this.a.invoke(this.d, Arrays.copyOf(objArr, objArr.length));
        }
    }

    /* compiled from: InternalUnderlyingValOfInlineClass.kt */
    /* loaded from: classes4.dex */
    public static final class b extends i {
        public b(Method method) {
            super(method, f1.J(method.getDeclaringClass()));
        }

        @Override // com.amazon.aps.iva.jc0.f
        public final Object call(Object[] objArr) {
            Object[] I;
            com.amazon.aps.iva.yb0.j.f(objArr, "args");
            f.a.a(this, objArr);
            Object obj = objArr[0];
            if (objArr.length <= 1) {
                I = new Object[0];
            } else {
                I = m.I(1, objArr.length, objArr);
            }
            return this.a.invoke(obj, Arrays.copyOf(I, I.length));
        }
    }

    public i(Method method, List list) {
        this.a = method;
        this.b = list;
        Class<?> returnType = method.getReturnType();
        com.amazon.aps.iva.yb0.j.e(returnType, "unboxMethod.returnType");
        this.c = returnType;
    }

    @Override // com.amazon.aps.iva.jc0.f
    public final List<Type> a() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.jc0.f
    public final /* bridge */ /* synthetic */ Method b() {
        return null;
    }

    @Override // com.amazon.aps.iva.jc0.f
    public final Type getReturnType() {
        return this.c;
    }
}
