package com.amazon.aps.iva.ic0;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.ee0.j1;
import com.amazon.aps.iva.ee0.s1;
import com.amazon.aps.iva.ee0.v1;
import com.amazon.aps.iva.ic0.p0;
import com.amazon.aps.iva.oc0.x0;
import com.amazon.aps.iva.oc0.y0;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
/* compiled from: KTypeImpl.kt */
/* loaded from: classes4.dex */
public final class k0 implements com.amazon.aps.iva.yb0.k {
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] f = {com.amazon.aps.iva.yb0.e0.c(new com.amazon.aps.iva.yb0.v(com.amazon.aps.iva.yb0.e0.a(k0.class), "classifier", "getClassifier()Lkotlin/reflect/KClassifier;")), com.amazon.aps.iva.yb0.e0.c(new com.amazon.aps.iva.yb0.v(com.amazon.aps.iva.yb0.e0.a(k0.class), "arguments", "getArguments()Ljava/util/List;"))};
    public final com.amazon.aps.iva.ee0.e0 b;
    public final p0.a<Type> c;
    public final p0.a d;
    public final p0.a e;

    /* compiled from: KTypeImpl.kt */
    /* loaded from: classes4.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<List<? extends com.amazon.aps.iva.fc0.r>> {
        public final /* synthetic */ com.amazon.aps.iva.xb0.a<Type> i;

        /* compiled from: KTypeImpl.kt */
        /* renamed from: com.amazon.aps.iva.ic0.k0$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public /* synthetic */ class C0361a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[v1.values().length];
                try {
                    iArr[v1.INVARIANT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[v1.IN_VARIANCE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[v1.OUT_VARIANCE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(com.amazon.aps.iva.xb0.a<? extends Type> aVar) {
            super(0);
            this.i = aVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final List<? extends com.amazon.aps.iva.fc0.r> invoke() {
            com.amazon.aps.iva.fc0.r rVar;
            k0 k0Var = k0.this;
            List<j1> G0 = k0Var.b.G0();
            if (G0.isEmpty()) {
                return com.amazon.aps.iva.lb0.z.b;
            }
            com.amazon.aps.iva.kb0.e a = com.amazon.aps.iva.kb0.f.a(com.amazon.aps.iva.kb0.g.PUBLICATION, new l0(k0Var));
            List<j1> list = G0;
            ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list));
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                j0 j0Var = null;
                if (i >= 0) {
                    j1 j1Var = (j1) obj;
                    if (j1Var.b()) {
                        rVar = com.amazon.aps.iva.fc0.r.c;
                    } else {
                        com.amazon.aps.iva.ee0.e0 type = j1Var.getType();
                        com.amazon.aps.iva.yb0.j.e(type, "typeProjection.type");
                        if (this.i != null) {
                            j0Var = new j0(k0Var, i, a);
                        }
                        k0 k0Var2 = new k0(type, j0Var);
                        int i3 = C0361a.a[j1Var.c().ordinal()];
                        if (i3 != 1) {
                            if (i3 != 2) {
                                if (i3 == 3) {
                                    rVar = new com.amazon.aps.iva.fc0.r(com.amazon.aps.iva.fc0.s.OUT, k0Var2);
                                } else {
                                    throw new com.amazon.aps.iva.kb0.h();
                                }
                            } else {
                                rVar = new com.amazon.aps.iva.fc0.r(com.amazon.aps.iva.fc0.s.IN, k0Var2);
                            }
                        } else {
                            rVar = new com.amazon.aps.iva.fc0.r(com.amazon.aps.iva.fc0.s.INVARIANT, k0Var2);
                        }
                    }
                    arrayList.add(rVar);
                    i = i2;
                } else {
                    f1.S();
                    throw null;
                }
            }
            return arrayList;
        }
    }

    /* compiled from: KTypeImpl.kt */
    /* loaded from: classes4.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.fc0.e> {
        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.fc0.e invoke() {
            k0 k0Var = k0.this;
            return k0Var.h(k0Var.b);
        }
    }

    public k0(com.amazon.aps.iva.ee0.e0 e0Var, com.amazon.aps.iva.xb0.a<? extends Type> aVar) {
        p0.a<Type> aVar2;
        com.amazon.aps.iva.yb0.j.f(e0Var, "type");
        this.b = e0Var;
        p0.a<Type> aVar3 = null;
        if (aVar instanceof p0.a) {
            aVar2 = (p0.a) aVar;
        } else {
            aVar2 = null;
        }
        if (aVar2 == null) {
            if (aVar != null) {
                aVar3 = p0.c(aVar);
            }
        } else {
            aVar3 = aVar2;
        }
        this.c = aVar3;
        this.d = p0.c(new b());
        this.e = p0.c(new a(aVar));
    }

    @Override // com.amazon.aps.iva.fc0.p
    public final com.amazon.aps.iva.fc0.e b() {
        com.amazon.aps.iva.fc0.l<Object> lVar = f[0];
        return (com.amazon.aps.iva.fc0.e) this.d.invoke();
    }

    @Override // com.amazon.aps.iva.yb0.k
    public final Type c() {
        p0.a<Type> aVar = this.c;
        if (aVar != null) {
            return aVar.invoke();
        }
        return null;
    }

    @Override // com.amazon.aps.iva.fc0.p
    public final List<com.amazon.aps.iva.fc0.r> d() {
        com.amazon.aps.iva.fc0.l<Object> lVar = f[1];
        Object invoke = this.e.invoke();
        com.amazon.aps.iva.yb0.j.e(invoke, "<get-arguments>(...)");
        return (List) invoke;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k0) {
            k0 k0Var = (k0) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.b, k0Var.b) && com.amazon.aps.iva.yb0.j.a(b(), k0Var.b()) && com.amazon.aps.iva.yb0.j.a(d(), k0Var.d())) {
                return true;
            }
        }
        return false;
    }

    public final com.amazon.aps.iva.fc0.e h(com.amazon.aps.iva.ee0.e0 e0Var) {
        com.amazon.aps.iva.ee0.e0 type;
        com.amazon.aps.iva.oc0.h k = e0Var.I0().k();
        if (k instanceof com.amazon.aps.iva.oc0.e) {
            Class<?> j = v0.j((com.amazon.aps.iva.oc0.e) k);
            if (j == null) {
                return null;
            }
            if (j.isArray()) {
                j1 j1Var = (j1) com.amazon.aps.iva.lb0.x.R0(e0Var.G0());
                if (j1Var != null && (type = j1Var.getType()) != null) {
                    com.amazon.aps.iva.fc0.e h = h(type);
                    if (h != null) {
                        return new n(Array.newInstance(com.amazon.aps.iva.ab.t.o(com.amazon.aps.iva.ab.x.M(h)), 0).getClass());
                    }
                    throw new com.amazon.aps.iva.wb0.a("Cannot determine classifier for array element type: " + this);
                }
                return new n(j);
            } else if (!s1.g(e0Var)) {
                Class<? extends Object> cls = com.amazon.aps.iva.uc0.d.b.get(j);
                if (cls != null) {
                    j = cls;
                }
                return new n(j);
            } else {
                return new n(j);
            }
        } else if (k instanceof y0) {
            return new m0(null, (y0) k);
        } else {
            if (!(k instanceof x0)) {
                return null;
            }
            throw new com.amazon.aps.iva.kb0.i("An operation is not implemented: Type alias classifiers are not yet supported");
        }
    }

    public final int hashCode() {
        int i;
        int hashCode = this.b.hashCode() * 31;
        com.amazon.aps.iva.fc0.e b2 = b();
        if (b2 != null) {
            i = b2.hashCode();
        } else {
            i = 0;
        }
        return d().hashCode() + ((hashCode + i) * 31);
    }

    public final String toString() {
        com.amazon.aps.iva.pd0.d dVar = r0.a;
        return r0.d(this.b);
    }
}
