package com.amazon.aps.iva.uc0;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.oc0.f1;
import com.amazon.aps.iva.oc0.g1;
import com.amazon.aps.iva.uc0.b;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: ReflectJavaClass.kt */
/* loaded from: classes4.dex */
public final class r extends v implements com.amazon.aps.iva.ed0.d, com.amazon.aps.iva.ed0.r, com.amazon.aps.iva.ed0.g {
    public final Class<?> a;

    public r(Class<?> cls) {
        com.amazon.aps.iva.yb0.j.f(cls, "klass");
        this.a = cls;
    }

    @Override // com.amazon.aps.iva.ed0.g
    public final Collection A() {
        Method[] declaredMethods = this.a.getDeclaredMethods();
        com.amazon.aps.iva.yb0.j.e(declaredMethods, "klass.declaredMethods");
        return com.amazon.aps.iva.ne0.s.f0(com.amazon.aps.iva.ne0.s.b0(com.amazon.aps.iva.ne0.s.V(com.amazon.aps.iva.lb0.o.M(declaredMethods), new p(this)), q.b));
    }

    @Override // com.amazon.aps.iva.ed0.g
    public final Collection<com.amazon.aps.iva.ed0.j> B() {
        Class<?> cls = this.a;
        com.amazon.aps.iva.yb0.j.f(cls, "clazz");
        b.a aVar = b.a;
        Class[] clsArr = null;
        if (aVar == null) {
            try {
                aVar = new b.a(Class.class.getMethod("isSealed", new Class[0]), Class.class.getMethod("getPermittedSubclasses", new Class[0]), Class.class.getMethod("isRecord", new Class[0]), Class.class.getMethod("getRecordComponents", new Class[0]));
            } catch (NoSuchMethodException unused) {
                aVar = new b.a(null, null, null, null);
            }
            b.a = aVar;
        }
        Method method = aVar.b;
        if (method != null) {
            Object invoke = method.invoke(cls, new Object[0]);
            com.amazon.aps.iva.yb0.j.d(invoke, "null cannot be cast to non-null type kotlin.Array<java.lang.Class<*>>");
            clsArr = (Class[]) invoke;
        }
        if (clsArr != null) {
            ArrayList arrayList = new ArrayList(clsArr.length);
            for (Class cls2 : clsArr) {
                arrayList.add(new t(cls2));
            }
            return arrayList;
        }
        return com.amazon.aps.iva.lb0.z.b;
    }

    @Override // com.amazon.aps.iva.ed0.g
    public final boolean J() {
        return this.a.isInterface();
    }

    @Override // com.amazon.aps.iva.ed0.g
    public final com.amazon.aps.iva.nd0.c c() {
        com.amazon.aps.iva.nd0.c b = d.a(this.a).b();
        com.amazon.aps.iva.yb0.j.e(b, "klass.classId.asSingleFqName()");
        return b;
    }

    @Override // com.amazon.aps.iva.ed0.g
    public final Collection e() {
        Constructor<?>[] declaredConstructors = this.a.getDeclaredConstructors();
        com.amazon.aps.iva.yb0.j.e(declaredConstructors, "klass.declaredConstructors");
        return com.amazon.aps.iva.ne0.s.f0(com.amazon.aps.iva.ne0.s.b0(com.amazon.aps.iva.ne0.s.W(com.amazon.aps.iva.lb0.o.M(declaredConstructors), j.b), k.b));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            if (com.amazon.aps.iva.yb0.j.a(this.a, ((r) obj).a)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.aps.iva.ed0.g
    public final Collection<com.amazon.aps.iva.ed0.j> g() {
        Class<?> cls = this.a;
        Object obj = Object.class;
        if (com.amazon.aps.iva.yb0.j.a(cls, obj)) {
            return com.amazon.aps.iva.lb0.z.b;
        }
        com.amazon.aps.iva.ak.b bVar = new com.amazon.aps.iva.ak.b(2);
        Object genericSuperclass = cls.getGenericSuperclass();
        if (genericSuperclass != null) {
            obj = genericSuperclass;
        }
        bVar.a(obj);
        Type[] genericInterfaces = cls.getGenericInterfaces();
        com.amazon.aps.iva.yb0.j.e(genericInterfaces, "klass.genericInterfaces");
        bVar.b(genericInterfaces);
        List<Type> K = f1.K(bVar.d(new Type[bVar.c()]));
        ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(K));
        for (Type type : K) {
            arrayList.add(new t(type));
        }
        return arrayList;
    }

    @Override // com.amazon.aps.iva.ed0.d
    public final Collection getAnnotations() {
        Collection collection;
        Annotation[] declaredAnnotations;
        Class<?> cls = this.a;
        if (cls != null && (declaredAnnotations = cls.getDeclaredAnnotations()) != null) {
            collection = f1.x(declaredAnnotations);
        } else {
            collection = com.amazon.aps.iva.lb0.z.b;
        }
        return collection;
    }

    @Override // com.amazon.aps.iva.ed0.g
    public final Collection getFields() {
        Field[] declaredFields = this.a.getDeclaredFields();
        com.amazon.aps.iva.yb0.j.e(declaredFields, "klass.declaredFields");
        return com.amazon.aps.iva.ne0.s.f0(com.amazon.aps.iva.ne0.s.b0(com.amazon.aps.iva.ne0.s.W(com.amazon.aps.iva.lb0.o.M(declaredFields), l.b), m.b));
    }

    @Override // com.amazon.aps.iva.ed0.s
    public final com.amazon.aps.iva.nd0.f getName() {
        return com.amazon.aps.iva.nd0.f.h(this.a.getSimpleName());
    }

    @Override // com.amazon.aps.iva.ed0.y
    public final ArrayList getTypeParameters() {
        TypeVariable<Class<?>>[] typeParameters = this.a.getTypeParameters();
        com.amazon.aps.iva.yb0.j.e(typeParameters, "klass.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Class<?>> typeVariable : typeParameters) {
            arrayList.add(new f0(typeVariable));
        }
        return arrayList;
    }

    @Override // com.amazon.aps.iva.ed0.r
    public final g1 getVisibility() {
        int modifiers = this.a.getModifiers();
        if (Modifier.isPublic(modifiers)) {
            return f1.h.c;
        }
        if (Modifier.isPrivate(modifiers)) {
            return f1.e.c;
        }
        if (Modifier.isProtected(modifiers)) {
            if (Modifier.isStatic(modifiers)) {
                return com.amazon.aps.iva.sc0.c.c;
            }
            return com.amazon.aps.iva.sc0.b.c;
        }
        return com.amazon.aps.iva.sc0.a.c;
    }

    @Override // com.amazon.aps.iva.ed0.d
    public final com.amazon.aps.iva.ed0.a h(com.amazon.aps.iva.nd0.c cVar) {
        Annotation[] declaredAnnotations;
        com.amazon.aps.iva.yb0.j.f(cVar, "fqName");
        Class<?> cls = this.a;
        if (cls != null && (declaredAnnotations = cls.getDeclaredAnnotations()) != null) {
            return com.amazon.aps.iva.ee0.f1.v(declaredAnnotations, cVar);
        }
        return null;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // com.amazon.aps.iva.ed0.r
    public final boolean isAbstract() {
        return Modifier.isAbstract(this.a.getModifiers());
    }

    @Override // com.amazon.aps.iva.ed0.r
    public final boolean isFinal() {
        return Modifier.isFinal(this.a.getModifiers());
    }

    @Override // com.amazon.aps.iva.ed0.r
    public final boolean k() {
        return Modifier.isStatic(this.a.getModifiers());
    }

    @Override // com.amazon.aps.iva.ed0.g
    public final ArrayList l() {
        Class<?> cls = this.a;
        com.amazon.aps.iva.yb0.j.f(cls, "clazz");
        b.a aVar = b.a;
        Object[] objArr = null;
        if (aVar == null) {
            try {
                aVar = new b.a(Class.class.getMethod("isSealed", new Class[0]), Class.class.getMethod("getPermittedSubclasses", new Class[0]), Class.class.getMethod("isRecord", new Class[0]), Class.class.getMethod("getRecordComponents", new Class[0]));
            } catch (NoSuchMethodException unused) {
                aVar = new b.a(null, null, null, null);
            }
            b.a = aVar;
        }
        Method method = aVar.d;
        if (method != null) {
            objArr = (Object[]) method.invoke(cls, new Object[0]);
        }
        if (objArr == null) {
            objArr = new Object[0];
        }
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(new d0(obj));
        }
        return arrayList;
    }

    @Override // com.amazon.aps.iva.ed0.g
    public final boolean n() {
        return this.a.isAnnotation();
    }

    @Override // com.amazon.aps.iva.ed0.g
    public final r o() {
        Class<?> declaringClass = this.a.getDeclaringClass();
        if (declaringClass != null) {
            return new r(declaringClass);
        }
        return null;
    }

    @Override // com.amazon.aps.iva.ed0.g
    public final boolean p() {
        Class<?> cls = this.a;
        com.amazon.aps.iva.yb0.j.f(cls, "clazz");
        b.a aVar = b.a;
        Boolean bool = null;
        if (aVar == null) {
            try {
                aVar = new b.a(Class.class.getMethod("isSealed", new Class[0]), Class.class.getMethod("getPermittedSubclasses", new Class[0]), Class.class.getMethod("isRecord", new Class[0]), Class.class.getMethod("getRecordComponents", new Class[0]));
            } catch (NoSuchMethodException unused) {
                aVar = new b.a(null, null, null, null);
            }
            b.a = aVar;
        }
        Method method = aVar.c;
        if (method != null) {
            Object invoke = method.invoke(cls, new Object[0]);
            com.amazon.aps.iva.yb0.j.d(invoke, "null cannot be cast to non-null type kotlin.Boolean");
            bool = (Boolean) invoke;
        }
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        com.amazon.aps.iva.b8.i.d(r.class, sb, ": ");
        sb.append(this.a);
        return sb.toString();
    }

    @Override // com.amazon.aps.iva.ed0.g
    public final boolean u() {
        return this.a.isEnum();
    }

    @Override // com.amazon.aps.iva.ed0.g
    public final boolean w() {
        Class<?> cls = this.a;
        com.amazon.aps.iva.yb0.j.f(cls, "clazz");
        b.a aVar = b.a;
        Boolean bool = null;
        if (aVar == null) {
            try {
                aVar = new b.a(Class.class.getMethod("isSealed", new Class[0]), Class.class.getMethod("getPermittedSubclasses", new Class[0]), Class.class.getMethod("isRecord", new Class[0]), Class.class.getMethod("getRecordComponents", new Class[0]));
            } catch (NoSuchMethodException unused) {
                aVar = new b.a(null, null, null, null);
            }
            b.a = aVar;
        }
        Method method = aVar.a;
        if (method != null) {
            Object invoke = method.invoke(cls, new Object[0]);
            com.amazon.aps.iva.yb0.j.d(invoke, "null cannot be cast to non-null type kotlin.Boolean");
            bool = (Boolean) invoke;
        }
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @Override // com.amazon.aps.iva.ed0.g
    public final Collection y() {
        Class<?>[] declaredClasses = this.a.getDeclaredClasses();
        com.amazon.aps.iva.yb0.j.e(declaredClasses, "klass.declaredClasses");
        return com.amazon.aps.iva.ne0.s.f0(com.amazon.aps.iva.ne0.s.c0(com.amazon.aps.iva.ne0.s.W(com.amazon.aps.iva.lb0.o.M(declaredClasses), n.h), o.h));
    }

    @Override // com.amazon.aps.iva.ed0.d
    public final void D() {
    }

    @Override // com.amazon.aps.iva.ed0.g
    public final void K() {
    }

    @Override // com.amazon.aps.iva.ed0.g
    public final void r() {
    }
}
