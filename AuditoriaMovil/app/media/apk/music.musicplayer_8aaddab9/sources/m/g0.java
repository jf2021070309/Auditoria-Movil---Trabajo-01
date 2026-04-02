package m;

import ch.qos.logback.classic.spi.CallerData;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Objects;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class g0 {
    public static final Type[] a = new Type[0];

    /* loaded from: classes2.dex */
    public static final class a implements GenericArrayType {
        public final Type a;

        public a(Type type) {
            this.a = type;
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && g0.c(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.a;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return g0.p(this.a) + "[]";
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements ParameterizedType {
        @Nullable
        public final Type a;

        /* renamed from: b  reason: collision with root package name */
        public final Type f9852b;

        /* renamed from: c  reason: collision with root package name */
        public final Type[] f9853c;

        public b(@Nullable Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                if ((type == null) != (((Class) type2).getEnclosingClass() == null)) {
                    throw new IllegalArgumentException();
                }
            }
            for (Type type3 : typeArr) {
                Objects.requireNonNull(type3, "typeArgument == null");
                g0.b(type3);
            }
            this.a = type;
            this.f9852b = type2;
            this.f9853c = (Type[]) typeArr.clone();
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && g0.c(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.f9853c.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        @Nullable
        public Type getOwnerType() {
            return this.a;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f9852b;
        }

        public int hashCode() {
            int hashCode = Arrays.hashCode(this.f9853c) ^ this.f9852b.hashCode();
            Type type = this.a;
            return hashCode ^ (type != null ? type.hashCode() : 0);
        }

        public String toString() {
            Type[] typeArr = this.f9853c;
            if (typeArr.length == 0) {
                return g0.p(this.f9852b);
            }
            StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
            sb.append(g0.p(this.f9852b));
            sb.append("<");
            sb.append(g0.p(this.f9853c[0]));
            for (int i2 = 1; i2 < this.f9853c.length; i2++) {
                sb.append(", ");
                sb.append(g0.p(this.f9853c[i2]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements WildcardType {
        public final Type a;
        @Nullable

        /* renamed from: b  reason: collision with root package name */
        public final Type f9854b;

        public c(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr.length != 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr2.length != 1) {
                Objects.requireNonNull(typeArr[0]);
                g0.b(typeArr[0]);
                this.f9854b = null;
                this.a = typeArr[0];
                return;
            }
            Objects.requireNonNull(typeArr2[0]);
            g0.b(typeArr2[0]);
            if (typeArr[0] != Object.class) {
                throw new IllegalArgumentException();
            }
            this.f9854b = typeArr2[0];
            this.a = Object.class;
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && g0.c(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.f9854b;
            return type != null ? new Type[]{type} : g0.a;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.a};
        }

        public int hashCode() {
            Type type = this.f9854b;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.a.hashCode() + 31);
        }

        public String toString() {
            if (this.f9854b != null) {
                StringBuilder y = e.a.d.a.a.y("? super ");
                y.append(g0.p(this.f9854b));
                return y.toString();
            } else if (this.a == Object.class) {
                return CallerData.NA;
            } else {
                StringBuilder y2 = e.a.d.a.a.y("? extends ");
                y2.append(g0.p(this.a));
                return y2.toString();
            }
        }
    }

    public static j.f0 a(j.f0 f0Var) throws IOException {
        k.d dVar = new k.d();
        f0Var.h().U(dVar);
        return new j.e0(f0Var.f(), f0Var.a(), dVar);
    }

    public static void b(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    public static boolean c(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (type2 instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                ParameterizedType parameterizedType2 = (ParameterizedType) type2;
                Type ownerType = parameterizedType.getOwnerType();
                Type ownerType2 = parameterizedType2.getOwnerType();
                return (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
            }
            return false;
        } else if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return c(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        } else if (type instanceof WildcardType) {
            if (type2 instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type;
                WildcardType wildcardType2 = (WildcardType) type2;
                return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
            }
            return false;
        } else if ((type instanceof TypeVariable) && (type2 instanceof TypeVariable)) {
            TypeVariable typeVariable = (TypeVariable) type;
            TypeVariable typeVariable2 = (TypeVariable) type2;
            return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
        } else {
            return false;
        }
    }

    public static Type d(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i2 = 0; i2 < length; i2++) {
                if (interfaces[i2] == cls2) {
                    return cls.getGenericInterfaces()[i2];
                }
                if (cls2.isAssignableFrom(interfaces[i2])) {
                    return d(cls.getGenericInterfaces()[i2], interfaces[i2], cls2);
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
                    return d(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static Type e(int i2, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i2 >= 0 && i2 < actualTypeArguments.length) {
            Type type = actualTypeArguments[i2];
            return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
        }
        StringBuilder z = e.a.d.a.a.z("Index ", i2, " not in range [0,");
        z.append(actualTypeArguments.length);
        z.append(") for ");
        z.append(parameterizedType);
        throw new IllegalArgumentException(z.toString());
    }

    public static Class<?> f(Type type) {
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
            return Array.newInstance(f(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        } else {
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (type instanceof WildcardType) {
                return f(((WildcardType) type).getUpperBounds()[0]);
            }
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + type.getClass().getName());
        }
    }

    public static Type g(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return n(type, cls, d(type, cls, cls2));
        }
        throw new IllegalArgumentException();
    }

    public static boolean h(@Nullable Type type) {
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
                if (h(type2)) {
                    return true;
                }
            }
            return false;
        } else if (type instanceof GenericArrayType) {
            return h(((GenericArrayType) type).getGenericComponentType());
        } else {
            if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
                return true;
            }
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
        }
    }

    public static boolean i(Annotation[] annotationArr, Class<? extends Annotation> cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    public static RuntimeException j(Method method, String str, Object... objArr) {
        return k(method, null, str, objArr);
    }

    public static RuntimeException k(Method method, @Nullable Throwable th, String str, Object... objArr) {
        StringBuilder A = e.a.d.a.a.A(String.format(str, objArr), "\n    for method ");
        A.append(method.getDeclaringClass().getSimpleName());
        A.append(".");
        A.append(method.getName());
        return new IllegalArgumentException(A.toString(), th);
    }

    public static RuntimeException l(Method method, int i2, String str, Object... objArr) {
        StringBuilder A = e.a.d.a.a.A(str, " (parameter #");
        A.append(i2 + 1);
        A.append(")");
        return j(method, A.toString(), objArr);
    }

    public static RuntimeException m(Method method, Throwable th, int i2, String str, Object... objArr) {
        StringBuilder A = e.a.d.a.a.A(str, " (parameter #");
        A.append(i2 + 1);
        A.append(")");
        return k(method, th, A.toString(), objArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r10 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043 A[LOOP:0: B:2:0x0000->B:24:0x0043, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0042 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.reflect.Type n(java.lang.reflect.Type r8, java.lang.Class<?> r9, java.lang.reflect.Type r10) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m.g0.n(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type):java.lang.reflect.Type");
    }

    public static void o(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    public static String p(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
