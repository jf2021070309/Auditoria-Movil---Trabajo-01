package com.amazon.aps.iva.ic0;

import com.amazon.aps.iva.fc0.k;
import com.amazon.aps.iva.ic0.p0;
import com.amazon.aps.iva.oc0.y0;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
/* compiled from: KCallableImpl.kt */
/* loaded from: classes4.dex */
public abstract class h<R> implements com.amazon.aps.iva.fc0.c<R>, n0 {
    public final p0.a<List<Annotation>> b = p0.c(new b(this));
    public final p0.a<ArrayList<com.amazon.aps.iva.fc0.k>> c = p0.c(new c(this));
    public final p0.a<k0> d = p0.c(new d(this));
    public final p0.a<List<m0>> e = p0.c(new e(this));
    public final p0.a<Object[]> f = p0.c(new a(this));

    /* compiled from: KCallableImpl.kt */
    /* loaded from: classes4.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Object[]> {
        public final /* synthetic */ h<R> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(h<? extends R> hVar) {
            super(0);
            this.h = hVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Object[] invoke() {
            Object[] objArr;
            h<R> hVar = this.h;
            int size = (hVar.isSuspend() ? 1 : 0) + hVar.getParameters().size();
            int size2 = ((hVar.getParameters().size() + 32) - 1) / 32;
            Object[] objArr2 = new Object[size + size2 + 1];
            for (com.amazon.aps.iva.fc0.k kVar : hVar.getParameters()) {
                if (kVar.l()) {
                    k0 type = kVar.getType();
                    com.amazon.aps.iva.nd0.c cVar = v0.a;
                    com.amazon.aps.iva.yb0.j.f(type, "<this>");
                    com.amazon.aps.iva.ee0.e0 e0Var = type.b;
                    if (e0Var != null && com.amazon.aps.iva.qd0.k.c(e0Var)) {
                        objArr = 1;
                    } else {
                        objArr = null;
                    }
                    if (objArr == null) {
                        int index = kVar.getIndex();
                        k0 type2 = kVar.getType();
                        com.amazon.aps.iva.yb0.j.f(type2, "<this>");
                        Type c = type2.c();
                        if (c == null && (c = type2.c()) == null) {
                            c = com.amazon.aps.iva.fc0.w.b(type2, false);
                        }
                        objArr2[index] = v0.e(c);
                    }
                }
                if (kVar.a()) {
                    objArr2[kVar.getIndex()] = h.h(kVar.getType());
                }
            }
            for (int i = 0; i < size2; i++) {
                objArr2[size + i] = 0;
            }
            return objArr2;
        }
    }

    /* compiled from: KCallableImpl.kt */
    /* loaded from: classes4.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<List<? extends Annotation>> {
        public final /* synthetic */ h<R> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(h<? extends R> hVar) {
            super(0);
            this.h = hVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final List<? extends Annotation> invoke() {
            return v0.d(this.h.o());
        }
    }

    /* compiled from: KCallableImpl.kt */
    /* loaded from: classes4.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<ArrayList<com.amazon.aps.iva.fc0.k>> {
        public final /* synthetic */ h<R> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(h<? extends R> hVar) {
            super(0);
            this.h = hVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final ArrayList<com.amazon.aps.iva.fc0.k> invoke() {
            int i;
            h<R> hVar = this.h;
            com.amazon.aps.iva.oc0.b o = hVar.o();
            ArrayList<com.amazon.aps.iva.fc0.k> arrayList = new ArrayList<>();
            int i2 = 0;
            if (!hVar.q()) {
                com.amazon.aps.iva.oc0.q0 g = v0.g(o);
                if (g != null) {
                    arrayList.add(new c0(hVar, 0, k.a.INSTANCE, new i(g)));
                    i = 1;
                } else {
                    i = 0;
                }
                com.amazon.aps.iva.oc0.q0 M = o.M();
                if (M != null) {
                    arrayList.add(new c0(hVar, i, k.a.EXTENSION_RECEIVER, new j(M)));
                    i++;
                }
            } else {
                i = 0;
            }
            int size = o.f().size();
            while (i2 < size) {
                arrayList.add(new c0(hVar, i, k.a.VALUE, new k(o, i2)));
                i2++;
                i++;
            }
            if (hVar.p() && (o instanceof com.amazon.aps.iva.zc0.a) && arrayList.size() > 1) {
                com.amazon.aps.iva.lb0.s.a0(arrayList, new l());
            }
            arrayList.trimToSize();
            return arrayList;
        }
    }

    /* compiled from: KCallableImpl.kt */
    /* loaded from: classes4.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<k0> {
        public final /* synthetic */ h<R> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(h<? extends R> hVar) {
            super(0);
            this.h = hVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final k0 invoke() {
            h<R> hVar = this.h;
            com.amazon.aps.iva.ee0.e0 returnType = hVar.o().getReturnType();
            com.amazon.aps.iva.yb0.j.c(returnType);
            return new k0(returnType, new m(hVar));
        }
    }

    /* compiled from: KCallableImpl.kt */
    /* loaded from: classes4.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<List<? extends m0>> {
        public final /* synthetic */ h<R> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(h<? extends R> hVar) {
            super(0);
            this.h = hVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final List<? extends m0> invoke() {
            h<R> hVar = this.h;
            List<y0> typeParameters = hVar.o().getTypeParameters();
            com.amazon.aps.iva.yb0.j.e(typeParameters, "descriptor.typeParameters");
            List<y0> list = typeParameters;
            ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list));
            for (y0 y0Var : list) {
                com.amazon.aps.iva.yb0.j.e(y0Var, "descriptor");
                arrayList.add(new m0(hVar, y0Var));
            }
            return arrayList;
        }
    }

    public static Object h(com.amazon.aps.iva.fc0.p pVar) {
        Class o = com.amazon.aps.iva.ab.t.o(com.amazon.aps.iva.ab.x.N(pVar));
        if (o.isArray()) {
            Object newInstance = Array.newInstance(o.getComponentType(), 0);
            com.amazon.aps.iva.yb0.j.e(newInstance, "type.jvmErasure.java.run…\"\n            )\n        }");
            return newInstance;
        }
        throw new com.amazon.aps.iva.wb0.a("Cannot instantiate the default empty array of type " + o.getSimpleName() + ", because it is not an array type");
    }

    @Override // com.amazon.aps.iva.fc0.c
    public final R call(Object... objArr) {
        com.amazon.aps.iva.yb0.j.f(objArr, "args");
        try {
            return (R) i().call(objArr);
        } catch (IllegalAccessException e2) {
            throw new com.amazon.aps.iva.gc0.a(e2);
        }
    }

    @Override // com.amazon.aps.iva.fc0.c
    public final R callBy(Map<com.amazon.aps.iva.fc0.k, ? extends Object> map) {
        Object h;
        com.amazon.aps.iva.yb0.j.f(map, "args");
        boolean z = false;
        if (p()) {
            List<com.amazon.aps.iva.fc0.k> parameters = getParameters();
            ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(parameters));
            for (com.amazon.aps.iva.fc0.k kVar : parameters) {
                if (map.containsKey(kVar)) {
                    h = map.get(kVar);
                    if (h == null) {
                        throw new IllegalArgumentException("Annotation argument value cannot be null (" + kVar + ')');
                    }
                } else if (kVar.l()) {
                    h = null;
                } else if (kVar.a()) {
                    h = h(kVar.getType());
                } else {
                    throw new IllegalArgumentException("No argument provided for a required parameter: " + kVar);
                }
                arrayList.add(h);
            }
            com.amazon.aps.iva.jc0.f<?> n = n();
            if (n != null) {
                try {
                    return (R) n.call(arrayList.toArray(new Object[0]));
                } catch (IllegalAccessException e2) {
                    throw new com.amazon.aps.iva.gc0.a(e2);
                }
            }
            throw new com.amazon.aps.iva.wb0.a("This callable does not support a default call: " + o());
        }
        List<com.amazon.aps.iva.fc0.k> parameters2 = getParameters();
        if (parameters2.isEmpty()) {
            try {
                return (R) i().call(isSuspend() ? new com.amazon.aps.iva.ob0.d[]{null} : new com.amazon.aps.iva.ob0.d[0]);
            } catch (IllegalAccessException e3) {
                throw new com.amazon.aps.iva.gc0.a(e3);
            }
        }
        int size = (isSuspend() ? 1 : 0) + parameters2.size();
        Object[] objArr = (Object[]) this.f.invoke().clone();
        if (isSuspend()) {
            objArr[parameters2.size()] = null;
        }
        int i = 0;
        for (com.amazon.aps.iva.fc0.k kVar2 : parameters2) {
            if (map.containsKey(kVar2)) {
                objArr[kVar2.getIndex()] = map.get(kVar2);
            } else if (kVar2.l()) {
                int i2 = (i / 32) + size;
                Object obj = objArr[i2];
                com.amazon.aps.iva.yb0.j.d(obj, "null cannot be cast to non-null type kotlin.Int");
                objArr[i2] = Integer.valueOf(((Integer) obj).intValue() | (1 << (i % 32)));
                z = true;
            } else if (!kVar2.a()) {
                throw new IllegalArgumentException("No argument provided for a required parameter: " + kVar2);
            }
            if (kVar2.getKind() == k.a.VALUE) {
                i++;
            }
        }
        if (!z) {
            try {
                com.amazon.aps.iva.jc0.f<?> i3 = i();
                Object[] copyOf = Arrays.copyOf(objArr, size);
                com.amazon.aps.iva.yb0.j.e(copyOf, "copyOf(this, newSize)");
                return (R) i3.call(copyOf);
            } catch (IllegalAccessException e4) {
                throw new com.amazon.aps.iva.gc0.a(e4);
            }
        }
        com.amazon.aps.iva.jc0.f<?> n2 = n();
        if (n2 != null) {
            try {
                return (R) n2.call(objArr);
            } catch (IllegalAccessException e5) {
                throw new com.amazon.aps.iva.gc0.a(e5);
            }
        }
        throw new com.amazon.aps.iva.wb0.a("This callable does not support a default call: " + o());
    }

    @Override // com.amazon.aps.iva.fc0.b
    public final List<Annotation> getAnnotations() {
        List<Annotation> invoke = this.b.invoke();
        com.amazon.aps.iva.yb0.j.e(invoke, "_annotations()");
        return invoke;
    }

    @Override // com.amazon.aps.iva.fc0.c
    public final List<com.amazon.aps.iva.fc0.k> getParameters() {
        ArrayList<com.amazon.aps.iva.fc0.k> invoke = this.c.invoke();
        com.amazon.aps.iva.yb0.j.e(invoke, "_parameters()");
        return invoke;
    }

    @Override // com.amazon.aps.iva.fc0.c
    public final com.amazon.aps.iva.fc0.p getReturnType() {
        k0 invoke = this.d.invoke();
        com.amazon.aps.iva.yb0.j.e(invoke, "_returnType()");
        return invoke;
    }

    @Override // com.amazon.aps.iva.fc0.c
    public final List<com.amazon.aps.iva.fc0.q> getTypeParameters() {
        List<m0> invoke = this.e.invoke();
        com.amazon.aps.iva.yb0.j.e(invoke, "_typeParameters()");
        return invoke;
    }

    @Override // com.amazon.aps.iva.fc0.c
    public final com.amazon.aps.iva.fc0.t getVisibility() {
        boolean a2;
        com.amazon.aps.iva.oc0.r visibility = o().getVisibility();
        com.amazon.aps.iva.yb0.j.e(visibility, "descriptor.visibility");
        com.amazon.aps.iva.nd0.c cVar = v0.a;
        if (com.amazon.aps.iva.yb0.j.a(visibility, com.amazon.aps.iva.oc0.q.e)) {
            return com.amazon.aps.iva.fc0.t.PUBLIC;
        }
        if (com.amazon.aps.iva.yb0.j.a(visibility, com.amazon.aps.iva.oc0.q.c)) {
            return com.amazon.aps.iva.fc0.t.PROTECTED;
        }
        if (com.amazon.aps.iva.yb0.j.a(visibility, com.amazon.aps.iva.oc0.q.d)) {
            return com.amazon.aps.iva.fc0.t.INTERNAL;
        }
        if (com.amazon.aps.iva.yb0.j.a(visibility, com.amazon.aps.iva.oc0.q.a)) {
            a2 = true;
        } else {
            a2 = com.amazon.aps.iva.yb0.j.a(visibility, com.amazon.aps.iva.oc0.q.b);
        }
        if (a2) {
            return com.amazon.aps.iva.fc0.t.PRIVATE;
        }
        return null;
    }

    public abstract com.amazon.aps.iva.jc0.f<?> i();

    @Override // com.amazon.aps.iva.fc0.c
    public final boolean isAbstract() {
        if (o().o() == com.amazon.aps.iva.oc0.b0.ABSTRACT) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.fc0.c
    public final boolean isFinal() {
        if (o().o() == com.amazon.aps.iva.oc0.b0.FINAL) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.fc0.c
    public final boolean isOpen() {
        if (o().o() == com.amazon.aps.iva.oc0.b0.OPEN) {
            return true;
        }
        return false;
    }

    public abstract s m();

    public abstract com.amazon.aps.iva.jc0.f<?> n();

    public abstract com.amazon.aps.iva.oc0.b o();

    public final boolean p() {
        if (com.amazon.aps.iva.yb0.j.a(getName(), "<init>") && m().h().isAnnotation()) {
            return true;
        }
        return false;
    }

    public abstract boolean q();
}
