package com.amazon.aps.iva.fc0;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: TypesJVM.kt */
/* loaded from: classes4.dex */
public final class u implements ParameterizedType, Type {
    public final Class<?> b;
    public final Type c;
    public final Type[] d;

    /* compiled from: TypesJVM.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.l<Type, String> {
        public static final a b = new a();

        public a() {
            super(1, w.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final String invoke(Type type) {
            Type type2 = type;
            com.amazon.aps.iva.yb0.j.f(type2, "p0");
            return w.a(type2);
        }
    }

    public u(Class cls, Type type, ArrayList arrayList) {
        this.b = cls;
        this.c = type;
        this.d = (Type[]) arrayList.toArray(new Type[0]);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.b, parameterizedType.getRawType()) && com.amazon.aps.iva.yb0.j.a(this.c, parameterizedType.getOwnerType())) {
                if (Arrays.equals(this.d, parameterizedType.getActualTypeArguments())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return this.d;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.c;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.b;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        boolean z;
        StringBuilder sb = new StringBuilder();
        Class<?> cls = this.b;
        Type type = this.c;
        if (type != null) {
            sb.append(w.a(type));
            sb.append("$");
            sb.append(cls.getSimpleName());
        } else {
            sb.append(w.a(cls));
        }
        Type[] typeArr = this.d;
        if (typeArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            com.amazon.aps.iva.lb0.o.U(typeArr, sb, ", ", "<", ">", -1, "...", a.b);
        }
        String sb2 = sb.toString();
        com.amazon.aps.iva.yb0.j.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.b.hashCode();
        Type type = this.c;
        if (type != null) {
            i = type.hashCode();
        } else {
            i = 0;
        }
        return (hashCode ^ i) ^ Arrays.hashCode(this.d);
    }

    public final String toString() {
        return getTypeName();
    }
}
