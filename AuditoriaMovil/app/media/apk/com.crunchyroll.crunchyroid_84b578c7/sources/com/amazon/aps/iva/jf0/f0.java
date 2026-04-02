package com.amazon.aps.iva.jf0;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import okhttp3.HttpUrl;
/* compiled from: Utils.java */
/* loaded from: classes4.dex */
public final class f0 {
    public static final Type[] a = new Type[0];

    /* compiled from: Utils.java */
    /* loaded from: classes4.dex */
    public static final class a implements GenericArrayType {
        public final Type b;

        public a(Type type) {
            this.b = type;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof GenericArrayType) && f0.b(this, (GenericArrayType) obj)) {
                return true;
            }
            return false;
        }

        @Override // java.lang.reflect.GenericArrayType
        public final Type getGenericComponentType() {
            return this.b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return f0.n(this.b) + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
    }

    /* compiled from: Utils.java */
    /* loaded from: classes4.dex */
    public static final class b implements ParameterizedType {
        public final Type b;
        public final Type c;
        public final Type[] d;

        public b(Type type, Type type2, Type... typeArr) {
            boolean z;
            if (type2 instanceof Class) {
                if (type == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z != (((Class) type2).getEnclosingClass() == null)) {
                    throw new IllegalArgumentException();
                }
            }
            for (Type type3 : typeArr) {
                Objects.requireNonNull(type3, "typeArgument == null");
                f0.a(type3);
            }
            this.b = type;
            this.c = type2;
            this.d = (Type[]) typeArr.clone();
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof ParameterizedType) && f0.b(this, (ParameterizedType) obj)) {
                return true;
            }
            return false;
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type[] getActualTypeArguments() {
            return (Type[]) this.d.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getOwnerType() {
            return this.b;
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getRawType() {
            return this.c;
        }

        public final int hashCode() {
            int i;
            int hashCode = Arrays.hashCode(this.d) ^ this.c.hashCode();
            Type type = this.b;
            if (type != null) {
                i = type.hashCode();
            } else {
                i = 0;
            }
            return hashCode ^ i;
        }

        public final String toString() {
            Type[] typeArr = this.d;
            int length = typeArr.length;
            Type type = this.c;
            if (length == 0) {
                return f0.n(type);
            }
            StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
            sb.append(f0.n(type));
            sb.append("<");
            sb.append(f0.n(typeArr[0]));
            for (int i = 1; i < typeArr.length; i++) {
                sb.append(", ");
                sb.append(f0.n(typeArr[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* compiled from: Utils.java */
    /* loaded from: classes4.dex */
    public static final class c implements WildcardType {
        public final Type b;
        public final Type c;

        public c(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length <= 1) {
                if (typeArr.length == 1) {
                    if (typeArr2.length == 1) {
                        Type type = typeArr2[0];
                        type.getClass();
                        f0.a(type);
                        if (typeArr[0] == Object.class) {
                            this.c = typeArr2[0];
                            this.b = Object.class;
                            return;
                        }
                        throw new IllegalArgumentException();
                    }
                    Type type2 = typeArr[0];
                    type2.getClass();
                    f0.a(type2);
                    this.c = null;
                    this.b = typeArr[0];
                    return;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException();
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof WildcardType) && f0.b(this, (WildcardType) obj)) {
                return true;
            }
            return false;
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getLowerBounds() {
            Type type = this.c;
            return type != null ? new Type[]{type} : f0.a;
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getUpperBounds() {
            return new Type[]{this.b};
        }

        public final int hashCode() {
            int i;
            Type type = this.c;
            if (type != null) {
                i = type.hashCode() + 31;
            } else {
                i = 1;
            }
            return i ^ (this.b.hashCode() + 31);
        }

        public final String toString() {
            Type type = this.c;
            if (type != null) {
                return "? super " + f0.n(type);
            }
            Type type2 = this.b;
            if (type2 == Object.class) {
                return "?";
            }
            return "? extends " + f0.n(type2);
        }
    }

    public static void a(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    public static boolean b(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            if ((ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments())) {
                return true;
            }
            return false;
        } else if (type instanceof GenericArrayType) {
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return b(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
        } else if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            if (Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds())) {
                return true;
            }
            return false;
        } else if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        } else {
            TypeVariable typeVariable = (TypeVariable) type;
            TypeVariable typeVariable2 = (TypeVariable) type2;
            if (typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName())) {
                return true;
            }
            return false;
        }
    }

    public static Type c(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                Class<?> cls3 = interfaces[i];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return c(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return c(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static Type d(int i, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i >= 0 && i < actualTypeArguments.length) {
            Type type = actualTypeArguments[i];
            if (type instanceof WildcardType) {
                return ((WildcardType) type).getUpperBounds()[0];
            }
            return type;
        }
        StringBuilder d = com.amazon.aps.iva.e4.e.d("Index ", i, " not in range [0,");
        d.append(actualTypeArguments.length);
        d.append(") for ");
        d.append(parameterizedType);
        throw new IllegalArgumentException(d.toString());
    }

    public static Class<?> e(Type type) {
        Objects.requireNonNull(type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            throw new IllegalArgumentException();
        } else if (type instanceof GenericArrayType) {
            return Array.newInstance(e(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        } else {
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (type instanceof WildcardType) {
                return e(((WildcardType) type).getUpperBounds()[0]);
            }
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + type.getClass().getName());
        }
    }

    public static Type f(Type type, Class cls) {
        if (Map.class.isAssignableFrom(cls)) {
            return l(type, cls, c(type, cls, Map.class));
        }
        throw new IllegalArgumentException();
    }

    public static boolean g(Type type) {
        String name;
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
                if (g(type2)) {
                    return true;
                }
            }
            return false;
        } else if (type instanceof GenericArrayType) {
            return g(((GenericArrayType) type).getGenericComponentType());
        } else {
            if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
                return true;
            }
            if (type == null) {
                name = "null";
            } else {
                name = type.getClass().getName();
            }
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + name);
        }
    }

    public static boolean h(Annotation[] annotationArr, Class<? extends Annotation> cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    public static IllegalArgumentException i(Method method, Exception exc, String str, Object... objArr) {
        StringBuilder b2 = com.amazon.aps.iva.b6.x.b(String.format(str, objArr), "\n    for method ");
        b2.append(method.getDeclaringClass().getSimpleName());
        b2.append(".");
        b2.append(method.getName());
        return new IllegalArgumentException(b2.toString(), exc);
    }

    public static IllegalArgumentException j(Method method, int i, String str, Object... objArr) {
        StringBuilder b2 = com.amazon.aps.iva.b6.x.b(str, " (parameter #");
        b2.append(i + 1);
        b2.append(")");
        return i(method, null, b2.toString(), objArr);
    }

    public static IllegalArgumentException k(Method method, Exception exc, int i, String str, Object... objArr) {
        StringBuilder b2 = com.amazon.aps.iva.b6.x.b(str, " (parameter #");
        b2.append(i + 1);
        b2.append(")");
        return i(method, exc, b2.toString(), objArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r10 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043 A[LOOP:0: B:2:0x0000->B:24:0x0043, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0042 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.reflect.Type l(java.lang.reflect.Type r8, java.lang.Class<?> r9, java.lang.reflect.Type r10) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.jf0.f0.l(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type):java.lang.reflect.Type");
    }

    public static void m(Throwable th) {
        if (!(th instanceof VirtualMachineError)) {
            if (!(th instanceof ThreadDeath)) {
                if (!(th instanceof LinkageError)) {
                    return;
                }
                throw ((LinkageError) th);
            }
            throw ((ThreadDeath) th);
        }
        throw ((VirtualMachineError) th);
    }

    public static String n(Type type) {
        if (type instanceof Class) {
            return ((Class) type).getName();
        }
        return type.toString();
    }
}
