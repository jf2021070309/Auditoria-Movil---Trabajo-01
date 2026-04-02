package com.amazon.aps.iva.tc0;

import com.amazon.aps.iva.gd0.b;
import com.amazon.aps.iva.gd0.t;
import com.amazon.aps.iva.oe0.m;
import com.amazon.aps.iva.yb0.j;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/* compiled from: ReflectKotlinClass.kt */
/* loaded from: classes4.dex */
public final class e implements t {
    public final Class<?> a;
    public final com.amazon.aps.iva.hd0.a b;

    /* compiled from: ReflectKotlinClass.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        /* JADX WARN: Code restructure failed: missing block: B:24:0x004e, code lost:
            if (r0.d == null) goto L31;
         */
        /* JADX WARN: Removed duplicated region for block: B:32:0x006e A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x006f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static com.amazon.aps.iva.tc0.e a(java.lang.Class r13) {
            /*
                java.lang.String r0 = "klass"
                com.amazon.aps.iva.yb0.j.f(r13, r0)
                com.amazon.aps.iva.hd0.b r0 = new com.amazon.aps.iva.hd0.b
                r0.<init>()
                com.amazon.aps.iva.tc0.c.b(r13, r0)
                com.amazon.aps.iva.tc0.e r1 = new com.amazon.aps.iva.tc0.e
                com.amazon.aps.iva.md0.e r2 = com.amazon.aps.iva.md0.e.g
                com.amazon.aps.iva.hd0.a$a r3 = r0.g
                r4 = 0
                if (r3 == 0) goto L6b
                int[] r3 = r0.a
                if (r3 != 0) goto L1b
                goto L6b
            L1b:
                com.amazon.aps.iva.md0.e r7 = new com.amazon.aps.iva.md0.e
                int[] r3 = r0.a
                int r5 = r0.c
                r5 = r5 & 8
                r6 = 1
                r8 = 0
                if (r5 == 0) goto L29
                r5 = r6
                goto L2a
            L29:
                r5 = r8
            L2a:
                r7.<init>(r5, r3)
                boolean r2 = r7.b(r2)
                if (r2 != 0) goto L3a
                java.lang.String[] r2 = r0.d
                r0.f = r2
                r0.d = r4
                goto L51
            L3a:
                com.amazon.aps.iva.hd0.a$a r2 = r0.g
                com.amazon.aps.iva.hd0.a$a r3 = com.amazon.aps.iva.hd0.a.EnumC0334a.CLASS
                if (r2 == r3) goto L4a
                com.amazon.aps.iva.hd0.a$a r3 = com.amazon.aps.iva.hd0.a.EnumC0334a.FILE_FACADE
                if (r2 == r3) goto L4a
                com.amazon.aps.iva.hd0.a$a r3 = com.amazon.aps.iva.hd0.a.EnumC0334a.MULTIFILE_CLASS_PART
                if (r2 != r3) goto L49
                goto L4a
            L49:
                r6 = r8
            L4a:
                if (r6 == 0) goto L51
                java.lang.String[] r2 = r0.d
                if (r2 != 0) goto L51
                goto L6b
            L51:
                java.lang.String[] r2 = r0.h
                if (r2 == 0) goto L58
                com.amazon.aps.iva.md0.a.b(r2)
            L58:
                com.amazon.aps.iva.hd0.a r2 = new com.amazon.aps.iva.hd0.a
                com.amazon.aps.iva.hd0.a$a r6 = r0.g
                java.lang.String[] r8 = r0.d
                java.lang.String[] r9 = r0.f
                java.lang.String[] r10 = r0.e
                java.lang.String r11 = r0.b
                int r12 = r0.c
                r5 = r2
                r5.<init>(r6, r7, r8, r9, r10, r11, r12)
                goto L6c
            L6b:
                r2 = r4
            L6c:
                if (r2 != 0) goto L6f
                return r4
            L6f:
                r1.<init>(r13, r2)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.tc0.e.a.a(java.lang.Class):com.amazon.aps.iva.tc0.e");
        }
    }

    public e() {
        throw null;
    }

    public e(Class cls, com.amazon.aps.iva.hd0.a aVar) {
        this.a = cls;
        this.b = aVar;
    }

    @Override // com.amazon.aps.iva.gd0.t
    public final void a(t.c cVar) {
        c.b(this.a, cVar);
    }

    @Override // com.amazon.aps.iva.gd0.t
    public final com.amazon.aps.iva.hd0.a b() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.gd0.t
    public final void c(com.amazon.aps.iva.gd0.b bVar) {
        String str;
        String str2;
        String str3;
        boolean z;
        Class<?> cls = this.a;
        j.f(cls, "klass");
        Method[] declaredMethods = cls.getDeclaredMethods();
        j.e(declaredMethods, "klass.declaredMethods");
        int length = declaredMethods.length;
        int i = 0;
        while (true) {
            str = "annotations";
            str2 = "parameterType";
            str3 = "sb.toString()";
            if (i >= length) {
                break;
            }
            Method method = declaredMethods[i];
            com.amazon.aps.iva.nd0.f h = com.amazon.aps.iva.nd0.f.h(method.getName());
            StringBuilder sb = new StringBuilder("(");
            Class<?>[] parameterTypes = method.getParameterTypes();
            j.e(parameterTypes, "method.parameterTypes");
            for (Class<?> cls2 : parameterTypes) {
                j.e(cls2, "parameterType");
                sb.append(com.amazon.aps.iva.uc0.d.b(cls2));
            }
            sb.append(")");
            Class<?> returnType = method.getReturnType();
            j.e(returnType, "method.returnType");
            sb.append(com.amazon.aps.iva.uc0.d.b(returnType));
            String sb2 = sb.toString();
            j.e(sb2, "sb.toString()");
            b.a b = bVar.b(h, sb2);
            Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
            j.e(declaredAnnotations, "method.declaredAnnotations");
            for (Annotation annotation : declaredAnnotations) {
                j.e(annotation, "annotation");
                c.c(b, annotation);
            }
            Annotation[][] parameterAnnotations = method.getParameterAnnotations();
            j.e(parameterAnnotations, "method.parameterAnnotations");
            Annotation[][] annotationArr = parameterAnnotations;
            int length2 = annotationArr.length;
            for (int i2 = 0; i2 < length2; i2++) {
                Annotation[] annotationArr2 = annotationArr[i2];
                j.e(annotationArr2, "annotations");
                int length3 = annotationArr2.length;
                int i3 = 0;
                while (i3 < length3) {
                    Annotation annotation2 = annotationArr2[i3];
                    Class o = com.amazon.aps.iva.ab.t.o(com.amazon.aps.iva.ab.t.n(annotation2));
                    Method[] methodArr = declaredMethods;
                    com.amazon.aps.iva.gd0.i c = b.c(i2, com.amazon.aps.iva.uc0.d.a(o), new b(annotation2));
                    if (c != null) {
                        c.d(c, annotation2, o);
                    }
                    i3++;
                    declaredMethods = methodArr;
                }
            }
            b.a();
            i++;
            declaredMethods = declaredMethods;
        }
        Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        j.e(declaredConstructors, "klass.declaredConstructors");
        int length4 = declaredConstructors.length;
        int i4 = 0;
        while (i4 < length4) {
            Constructor<?> constructor = declaredConstructors[i4];
            com.amazon.aps.iva.nd0.f fVar = com.amazon.aps.iva.nd0.h.e;
            j.e(constructor, "constructor");
            StringBuilder sb3 = new StringBuilder("(");
            Class<?>[] parameterTypes2 = constructor.getParameterTypes();
            j.e(parameterTypes2, "constructor.parameterTypes");
            int length5 = parameterTypes2.length;
            int i5 = 0;
            while (i5 < length5) {
                Constructor<?>[] constructorArr = declaredConstructors;
                Class<?> cls3 = parameterTypes2[i5];
                j.e(cls3, str2);
                sb3.append(com.amazon.aps.iva.uc0.d.b(cls3));
                i5++;
                declaredConstructors = constructorArr;
            }
            Constructor<?>[] constructorArr2 = declaredConstructors;
            sb3.append(")V");
            String sb4 = sb3.toString();
            j.e(sb4, str3);
            b.a b2 = bVar.b(fVar, sb4);
            Annotation[] declaredAnnotations2 = constructor.getDeclaredAnnotations();
            j.e(declaredAnnotations2, "constructor.declaredAnnotations");
            for (Annotation annotation3 : declaredAnnotations2) {
                j.e(annotation3, "annotation");
                c.c(b2, annotation3);
            }
            Annotation[][] parameterAnnotations2 = constructor.getParameterAnnotations();
            j.e(parameterAnnotations2, "parameterAnnotations");
            if (parameterAnnotations2.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                int length6 = constructor.getParameterTypes().length - parameterAnnotations2.length;
                int length7 = parameterAnnotations2.length;
                int i6 = 0;
                while (i6 < length7) {
                    Annotation[] annotationArr3 = parameterAnnotations2[i6];
                    j.e(annotationArr3, str);
                    int length8 = annotationArr3.length;
                    int i7 = length4;
                    int i8 = 0;
                    while (i8 < length8) {
                        Annotation[][] annotationArr4 = parameterAnnotations2;
                        Annotation annotation4 = annotationArr3[i8];
                        String str4 = str;
                        Class o2 = com.amazon.aps.iva.ab.t.o(com.amazon.aps.iva.ab.t.n(annotation4));
                        String str5 = str2;
                        int i9 = length6;
                        String str6 = str3;
                        com.amazon.aps.iva.gd0.i c2 = b2.c(i6 + length6, com.amazon.aps.iva.uc0.d.a(o2), new b(annotation4));
                        if (c2 != null) {
                            c.d(c2, annotation4, o2);
                        }
                        i8++;
                        parameterAnnotations2 = annotationArr4;
                        str2 = str5;
                        str = str4;
                        length6 = i9;
                        str3 = str6;
                    }
                    i6++;
                    length4 = i7;
                }
            }
            b2.a();
            i4++;
            declaredConstructors = constructorArr2;
            length4 = length4;
            str2 = str2;
            str = str;
            str3 = str3;
        }
        Field[] declaredFields = cls.getDeclaredFields();
        j.e(declaredFields, "klass.declaredFields");
        for (Field field : declaredFields) {
            com.amazon.aps.iva.nd0.f h2 = com.amazon.aps.iva.nd0.f.h(field.getName());
            Class<?> type = field.getType();
            j.e(type, "field.type");
            b.C0301b a2 = bVar.a(h2, com.amazon.aps.iva.uc0.d.b(type));
            Annotation[] declaredAnnotations3 = field.getDeclaredAnnotations();
            j.e(declaredAnnotations3, "field.declaredAnnotations");
            for (Annotation annotation5 : declaredAnnotations3) {
                j.e(annotation5, "annotation");
                c.c(a2, annotation5);
            }
            a2.a();
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (j.a(this.a, ((e) obj).a)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.aps.iva.gd0.t
    public final String getLocation() {
        return m.e0(this.a.getName(), '.', '/').concat(".class");
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // com.amazon.aps.iva.gd0.t
    public final com.amazon.aps.iva.nd0.b i() {
        return com.amazon.aps.iva.uc0.d.a(this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        com.amazon.aps.iva.b8.i.d(e.class, sb, ": ");
        sb.append(this.a);
        return sb.toString();
    }
}
