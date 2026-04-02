package com.amazon.aps.iva.ic0;

import com.amazon.aps.iva.ee0.v1;
import com.amazon.aps.iva.ic0.p0;
import com.amazon.aps.iva.oc0.y0;
import java.util.ArrayList;
import java.util.List;
/* compiled from: KTypeParameterImpl.kt */
/* loaded from: classes4.dex */
public final class m0 implements com.amazon.aps.iva.fc0.q, q {
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] e = {com.amazon.aps.iva.yb0.e0.c(new com.amazon.aps.iva.yb0.v(com.amazon.aps.iva.yb0.e0.a(m0.class), "upperBounds", "getUpperBounds()Ljava/util/List;"))};
    public final y0 b;
    public final p0.a c;
    public final n0 d;

    /* compiled from: KTypeParameterImpl.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {
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

    /* compiled from: KTypeParameterImpl.kt */
    /* loaded from: classes4.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<List<? extends k0>> {
        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final List<? extends k0> invoke() {
            List<com.amazon.aps.iva.ee0.e0> upperBounds = m0.this.b.getUpperBounds();
            com.amazon.aps.iva.yb0.j.e(upperBounds, "descriptor.upperBounds");
            List<com.amazon.aps.iva.ee0.e0> list = upperBounds;
            ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list));
            for (com.amazon.aps.iva.ee0.e0 e0Var : list) {
                arrayList.add(new k0(e0Var, null));
            }
            return arrayList;
        }
    }

    public m0(n0 n0Var, y0 y0Var) {
        com.amazon.aps.iva.ce0.k kVar;
        com.amazon.aps.iva.gd0.o oVar;
        Object obj;
        Class<?> cls;
        n nVar;
        Object D0;
        com.amazon.aps.iva.yb0.j.f(y0Var, "descriptor");
        this.b = y0Var;
        this.c = p0.c(new b());
        if (n0Var == null) {
            com.amazon.aps.iva.oc0.k d = y0Var.d();
            com.amazon.aps.iva.yb0.j.e(d, "descriptor.containingDeclaration");
            if (d instanceof com.amazon.aps.iva.oc0.e) {
                D0 = a((com.amazon.aps.iva.oc0.e) d);
            } else if (d instanceof com.amazon.aps.iva.oc0.b) {
                com.amazon.aps.iva.oc0.k d2 = ((com.amazon.aps.iva.oc0.b) d).d();
                com.amazon.aps.iva.yb0.j.e(d2, "declaration.containingDeclaration");
                if (d2 instanceof com.amazon.aps.iva.oc0.e) {
                    nVar = a((com.amazon.aps.iva.oc0.e) d2);
                } else {
                    if (d instanceof com.amazon.aps.iva.ce0.k) {
                        kVar = (com.amazon.aps.iva.ce0.k) d;
                    } else {
                        kVar = null;
                    }
                    if (kVar != null) {
                        com.amazon.aps.iva.ce0.j I = kVar.I();
                        if (I instanceof com.amazon.aps.iva.gd0.o) {
                            oVar = (com.amazon.aps.iva.gd0.o) I;
                        } else {
                            oVar = null;
                        }
                        if (oVar != null) {
                            obj = oVar.d;
                        } else {
                            obj = null;
                        }
                        com.amazon.aps.iva.tc0.e eVar = obj instanceof com.amazon.aps.iva.tc0.e ? (com.amazon.aps.iva.tc0.e) obj : null;
                        if (eVar != null && (cls = eVar.a) != null) {
                            com.amazon.aps.iva.fc0.d a2 = com.amazon.aps.iva.yb0.e0.a(cls);
                            com.amazon.aps.iva.yb0.j.d(a2, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
                            nVar = (n) a2;
                        } else {
                            throw new com.amazon.aps.iva.wb0.a("Container of deserialized member is not resolved: " + kVar);
                        }
                    } else {
                        throw new com.amazon.aps.iva.wb0.a("Non-class callable descriptor must be deserialized: " + d);
                    }
                }
                D0 = d.D0(new d(nVar), com.amazon.aps.iva.kb0.q.a);
            } else {
                throw new com.amazon.aps.iva.wb0.a("Unknown type parameter container: " + d);
            }
            com.amazon.aps.iva.yb0.j.e(D0, "when (val declaration = … $declaration\")\n        }");
            n0Var = (n0) D0;
        }
        this.d = n0Var;
    }

    public static n a(com.amazon.aps.iva.oc0.e eVar) {
        com.amazon.aps.iva.fc0.d dVar;
        Class<?> j = v0.j(eVar);
        if (j != null) {
            dVar = com.amazon.aps.iva.yb0.e0.a(j);
        } else {
            dVar = null;
        }
        n nVar = (n) dVar;
        if (nVar != null) {
            return nVar;
        }
        throw new com.amazon.aps.iva.wb0.a("Type parameter container is not resolved: " + eVar.d());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m0) {
            m0 m0Var = (m0) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.d, m0Var.d) && com.amazon.aps.iva.yb0.j.a(getName(), m0Var.getName())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.aps.iva.fc0.q
    public final String getName() {
        String b2 = this.b.getName().b();
        com.amazon.aps.iva.yb0.j.e(b2, "descriptor.name.asString()");
        return b2;
    }

    @Override // com.amazon.aps.iva.fc0.q
    public final List<com.amazon.aps.iva.fc0.p> getUpperBounds() {
        com.amazon.aps.iva.fc0.l<Object> lVar = e[0];
        Object invoke = this.c.invoke();
        com.amazon.aps.iva.yb0.j.e(invoke, "<get-upperBounds>(...)");
        return (List) invoke;
    }

    public final int hashCode() {
        return getName().hashCode() + (this.d.hashCode() * 31);
    }

    @Override // com.amazon.aps.iva.fc0.q
    public final com.amazon.aps.iva.fc0.s i() {
        int i = a.a[this.b.i().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return com.amazon.aps.iva.fc0.s.OUT;
                }
                throw new com.amazon.aps.iva.kb0.h();
            }
            return com.amazon.aps.iva.fc0.s.IN;
        }
        return com.amazon.aps.iva.fc0.s.INVARIANT;
    }

    @Override // com.amazon.aps.iva.ic0.q
    public final com.amazon.aps.iva.oc0.h m() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = com.amazon.aps.iva.yb0.i0.a[i().ordinal()];
        if (i != 2) {
            if (i == 3) {
                sb.append("out ");
            }
        } else {
            sb.append("in ");
        }
        sb.append(getName());
        String sb2 = sb.toString();
        com.amazon.aps.iva.yb0.j.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
