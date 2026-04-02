package com.amazon.aps.iva.xc0;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.ee0.q1;
import com.amazon.aps.iva.ne0.f;
import com.amazon.aps.iva.oc0.c1;
import com.amazon.aps.iva.oc0.q0;
import com.amazon.aps.iva.oc0.s0;
import com.amazon.aps.iva.oc0.y0;
import com.amazon.aps.iva.qd0.j;
import com.amazon.aps.iva.qd0.n;
import java.util.List;
/* compiled from: ErasedOverridabilityCondition.kt */
/* loaded from: classes4.dex */
public final class n implements com.amazon.aps.iva.qd0.j {

    /* compiled from: ErasedOverridabilityCondition.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[n.c.a.values().length];
            try {
                iArr[n.c.a.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            a = iArr;
        }
    }

    /* compiled from: ErasedOverridabilityCondition.kt */
    /* loaded from: classes4.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<c1, com.amazon.aps.iva.ee0.e0> {
        public static final b h = new b();

        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.ee0.e0 invoke(c1 c1Var) {
            return c1Var.getType();
        }
    }

    @Override // com.amazon.aps.iva.qd0.j
    public j.b a(com.amazon.aps.iva.oc0.a aVar, com.amazon.aps.iva.oc0.a aVar2, com.amazon.aps.iva.oc0.e eVar) {
        n.c.a aVar3;
        boolean z;
        List<y0> typeParameters;
        boolean z2;
        com.amazon.aps.iva.yb0.j.f(aVar, "superDescriptor");
        com.amazon.aps.iva.yb0.j.f(aVar2, "subDescriptor");
        if (aVar2 instanceof com.amazon.aps.iva.zc0.e) {
            com.amazon.aps.iva.zc0.e eVar2 = (com.amazon.aps.iva.zc0.e) aVar2;
            if (!(!eVar2.getTypeParameters().isEmpty())) {
                n.c i = com.amazon.aps.iva.qd0.n.i(aVar, aVar2);
                com.amazon.aps.iva.ee0.e0 e0Var = null;
                if (i != null) {
                    aVar3 = i.c();
                } else {
                    aVar3 = null;
                }
                if (aVar3 != null) {
                    return j.b.UNKNOWN;
                }
                List<c1> f = eVar2.f();
                com.amazon.aps.iva.yb0.j.e(f, "subDescriptor.valueParameters");
                com.amazon.aps.iva.ne0.u b0 = com.amazon.aps.iva.ne0.s.b0(com.amazon.aps.iva.lb0.x.k0(f), b.h);
                com.amazon.aps.iva.ee0.e0 e0Var2 = eVar2.h;
                com.amazon.aps.iva.yb0.j.c(e0Var2);
                com.amazon.aps.iva.ne0.f e0 = com.amazon.aps.iva.ne0.s.e0(b0, e0Var2);
                q0 q0Var = eVar2.j;
                if (q0Var != null) {
                    e0Var = q0Var.getType();
                }
                f.a aVar4 = new f.a(com.amazon.aps.iva.ne0.k.Q(com.amazon.aps.iva.ne0.k.S(e0, com.amazon.aps.iva.lb0.x.k0(f1.L(e0Var)))));
                while (true) {
                    if (aVar4.b()) {
                        com.amazon.aps.iva.ee0.e0 e0Var3 = (com.amazon.aps.iva.ee0.e0) aVar4.next();
                        if ((!e0Var3.G0().isEmpty()) && !(e0Var3.L0() instanceof com.amazon.aps.iva.cd0.h)) {
                            z2 = true;
                            continue;
                        } else {
                            z2 = false;
                            continue;
                        }
                        if (z2) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    return j.b.UNKNOWN;
                }
                com.amazon.aps.iva.oc0.a b2 = aVar.b(q1.e(new com.amazon.aps.iva.cd0.g()));
                if (b2 == null) {
                    return j.b.UNKNOWN;
                }
                if (b2 instanceof s0) {
                    s0 s0Var = (s0) b2;
                    com.amazon.aps.iva.yb0.j.e(s0Var.getTypeParameters(), "erasedSuper.typeParameters");
                    if (!typeParameters.isEmpty()) {
                        b2 = s0Var.C0().k().build();
                        com.amazon.aps.iva.yb0.j.c(b2);
                    }
                }
                n.c.a c = com.amazon.aps.iva.qd0.n.f.n(b2, aVar2, false).c();
                com.amazon.aps.iva.yb0.j.e(c, "DEFAULT.isOverridableByW…Descriptor, false).result");
                if (a.a[c.ordinal()] == 1) {
                    return j.b.OVERRIDABLE;
                }
                return j.b.UNKNOWN;
            }
        }
        return j.b.UNKNOWN;
    }

    @Override // com.amazon.aps.iva.qd0.j
    public j.a b() {
        return j.a.SUCCESS_ONLY;
    }
}
