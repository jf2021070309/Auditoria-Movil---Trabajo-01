package com.amazon.aps.iva.qd0;

import com.amazon.aps.iva.ee0.a1;
import com.amazon.aps.iva.ee0.c1;
import com.amazon.aps.iva.ee0.e0;
import com.amazon.aps.iva.ee0.f0;
import com.amazon.aps.iva.ee0.l1;
import com.amazon.aps.iva.ee0.v1;
import com.amazon.aps.iva.oc0.b;
import com.amazon.aps.iva.oc0.b0;
import com.amazon.aps.iva.oc0.n0;
import com.amazon.aps.iva.oc0.q;
import com.amazon.aps.iva.oc0.t0;
import com.amazon.aps.iva.pc0.h;
import com.amazon.aps.iva.rc0.l0;
import com.amazon.aps.iva.rc0.m0;
import com.amazon.aps.iva.rc0.o0;
import com.amazon.aps.iva.rc0.p0;
import com.amazon.aps.iva.rc0.v0;
import com.google.android.gms.common.ConnectionResult;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.zxing.aztec.encoder.Encoder;
import java.util.Collections;
import java.util.List;
/* compiled from: DescriptorFactory.java */
/* loaded from: classes4.dex */
public final class h {

    /* compiled from: DescriptorFactory.java */
    /* loaded from: classes4.dex */
    public static class a extends com.amazon.aps.iva.rc0.l {
        public a(com.amazon.aps.iva.ce0.d dVar) {
            super(dVar, null, h.a.a, true, b.a.DECLARATION, t0.a);
            com.amazon.aps.iva.oc0.r rVar;
            List emptyList = Collections.emptyList();
            int i = i.a;
            com.amazon.aps.iva.oc0.f fVar = com.amazon.aps.iva.oc0.f.ENUM_CLASS;
            com.amazon.aps.iva.oc0.f fVar2 = dVar.l;
            if (fVar2 != fVar && !fVar2.isSingleton()) {
                if (i.q(dVar)) {
                    rVar = com.amazon.aps.iva.oc0.q.a;
                    if (rVar == null) {
                        i.a(51);
                        throw null;
                    }
                } else if (i.k(dVar)) {
                    rVar = com.amazon.aps.iva.oc0.q.l;
                    if (rVar == null) {
                        i.a(52);
                        throw null;
                    }
                } else {
                    rVar = com.amazon.aps.iva.oc0.q.e;
                    if (rVar == null) {
                        i.a(53);
                        throw null;
                    }
                }
            } else {
                rVar = com.amazon.aps.iva.oc0.q.a;
                if (rVar == null) {
                    i.a(49);
                    throw null;
                }
            }
            R0(emptyList, rVar);
        }
    }

    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        if (i != 12 && i != 23 && i != 25) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 12 && i != 23 && i != 25) {
            i2 = 3;
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 4:
            case 8:
            case 14:
            case 16:
            case 18:
            case 31:
            case Encoder.DEFAULT_EC_PERCENT /* 33 */:
            case 35:
                objArr[0] = "annotations";
                break;
            case 2:
            case 5:
            case 9:
                objArr[0] = "parameterAnnotations";
                break;
            case 3:
            case 7:
            case 13:
            case 15:
            case 17:
            default:
                objArr[0] = "propertyDescriptor";
                break;
            case 6:
            case 11:
            case 19:
                objArr[0] = "sourceElement";
                break;
            case 10:
                objArr[0] = "visibility";
                break;
            case 12:
            case ConnectionResult.API_DISABLED /* 23 */:
            case 25:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                break;
            case 20:
                objArr[0] = "containingClass";
                break;
            case 21:
                objArr[0] = FirebaseAnalytics.Param.SOURCE;
                break;
            case 22:
            case 24:
            case 26:
                objArr[0] = "enumClass";
                break;
            case 27:
            case 28:
            case 29:
                objArr[0] = "descriptor";
                break;
            case 30:
            case 32:
            case 34:
                objArr[0] = "owner";
                break;
        }
        if (i != 12) {
            if (i != 23) {
                if (i != 25) {
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                } else {
                    objArr[1] = "createEnumValueOfMethod";
                }
            } else {
                objArr[1] = "createEnumValuesMethod";
            }
        } else {
            objArr[1] = "createSetter";
        }
        switch (i) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "createSetter";
                break;
            case 12:
            case ConnectionResult.API_DISABLED /* 23 */:
            case 25:
                break;
            case 13:
            case 14:
                objArr[2] = "createDefaultGetter";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "createGetter";
                break;
            case 20:
            case 21:
                objArr[2] = "createPrimaryConstructorForObject";
                break;
            case 22:
                objArr[2] = "createEnumValuesMethod";
                break;
            case 24:
                objArr[2] = "createEnumValueOfMethod";
                break;
            case 26:
                objArr[2] = "createEnumEntriesProperty";
                break;
            case 27:
                objArr[2] = "isEnumValuesMethod";
                break;
            case 28:
                objArr[2] = "isEnumValueOfMethod";
                break;
            case 29:
                objArr[2] = "isEnumSpecialMethod";
                break;
            case 30:
            case 31:
                objArr[2] = "createExtensionReceiverParameterForCallable";
                break;
            case 32:
            case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                objArr[2] = "createContextReceiverParameterForCallable";
                break;
            case 34:
            case 35:
                objArr[2] = "createContextReceiverParameterForClass";
                break;
            default:
                objArr[2] = "createDefaultSetter";
                break;
        }
        String format = String.format(str, objArr);
        if (i == 12 || i == 23 || i == 25) {
            throw new IllegalStateException(format);
        }
    }

    public static o0 b(com.amazon.aps.iva.oc0.a aVar, e0 e0Var, com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.pc0.h hVar, int i) {
        if (aVar != null) {
            if (hVar != null) {
                if (e0Var == null) {
                    return null;
                }
                com.amazon.aps.iva.yd0.c cVar = new com.amazon.aps.iva.yd0.c(aVar, e0Var, fVar, null);
                com.amazon.aps.iva.oe0.f fVar2 = com.amazon.aps.iva.nd0.g.a;
                return new o0(aVar, cVar, hVar, com.amazon.aps.iva.nd0.f.h("_context_receiver_" + i));
            }
            a(33);
            throw null;
        }
        a(32);
        throw null;
    }

    public static m0 c(n0 n0Var, com.amazon.aps.iva.pc0.h hVar) {
        return i(n0Var, hVar, true, n0Var.g());
    }

    public static com.amazon.aps.iva.rc0.n0 d(n0 n0Var, com.amazon.aps.iva.pc0.h hVar) {
        h.a.C0609a c0609a = h.a.a;
        t0 g = n0Var.g();
        if (g != null) {
            return j(n0Var, hVar, c0609a, true, n0Var.getVisibility(), g);
        }
        a(6);
        throw null;
    }

    public static l0 e(com.amazon.aps.iva.oc0.e eVar) {
        if (eVar != null) {
            com.amazon.aps.iva.oc0.e a2 = com.amazon.aps.iva.oc0.u.a(i.d(eVar), com.amazon.aps.iva.nd0.i.u);
            if (a2 == null) {
                return null;
            }
            h.a.C0609a c0609a = h.a.a;
            b0 b0Var = b0.FINAL;
            q.h hVar = com.amazon.aps.iva.oc0.q.e;
            com.amazon.aps.iva.nd0.f fVar = com.amazon.aps.iva.lc0.o.b;
            b.a aVar = b.a.SYNTHESIZED;
            l0 H0 = l0.H0(eVar, b0Var, hVar, false, fVar, aVar, eVar.g());
            m0 m0Var = new m0(H0, c0609a, b0Var, hVar, false, false, false, aVar, null, eVar.g());
            H0.K0(m0Var, null, null, null);
            a1.c.getClass();
            a1 a1Var = a1.d;
            c1 h = a2.h();
            List singletonList = Collections.singletonList(new l1(eVar.m()));
            int i = f0.a;
            com.amazon.aps.iva.yb0.j.f(a1Var, "attributes");
            com.amazon.aps.iva.yb0.j.f(h, "constructor");
            com.amazon.aps.iva.yb0.j.f(singletonList, "arguments");
            H0.M0(f0.f(a1Var, h, singletonList, false, null), Collections.emptyList(), null, null, Collections.emptyList());
            m0Var.I0(H0.getReturnType());
            return H0;
        }
        a(26);
        throw null;
    }

    public static p0 f(com.amazon.aps.iva.oc0.e eVar) {
        if (eVar != null) {
            h.a.C0609a c0609a = h.a.a;
            p0 Q0 = p0.Q0(eVar, com.amazon.aps.iva.lc0.o.c, b.a.SYNTHESIZED, eVar.g());
            return Q0.J0(null, null, Collections.emptyList(), Collections.emptyList(), Collections.singletonList(new v0(Q0, null, 0, c0609a, com.amazon.aps.iva.nd0.f.h("value"), com.amazon.aps.iva.ud0.b.e(eVar).v(), false, false, false, null, eVar.g())), eVar.m(), b0.FINAL, com.amazon.aps.iva.oc0.q.e);
        }
        a(24);
        throw null;
    }

    public static p0 g(com.amazon.aps.iva.oc0.e eVar) {
        if (eVar != null) {
            return p0.Q0(eVar, com.amazon.aps.iva.lc0.o.a, b.a.SYNTHESIZED, eVar.g()).J0(null, null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), com.amazon.aps.iva.ud0.b.e(eVar).h(eVar.m(), v1.INVARIANT), b0.FINAL, com.amazon.aps.iva.oc0.q.e);
        }
        a(22);
        throw null;
    }

    public static o0 h(com.amazon.aps.iva.oc0.a aVar, e0 e0Var, com.amazon.aps.iva.pc0.h hVar) {
        if (aVar != null) {
            if (e0Var == null) {
                return null;
            }
            return new o0(aVar, new com.amazon.aps.iva.yd0.d(aVar, e0Var, null), hVar);
        }
        a(30);
        throw null;
    }

    public static m0 i(n0 n0Var, com.amazon.aps.iva.pc0.h hVar, boolean z, t0 t0Var) {
        if (hVar != null) {
            if (t0Var != null) {
                return new m0(n0Var, hVar, n0Var.o(), n0Var.getVisibility(), z, false, false, b.a.DECLARATION, null, t0Var);
            }
            a(19);
            throw null;
        }
        a(18);
        throw null;
    }

    public static com.amazon.aps.iva.rc0.n0 j(n0 n0Var, com.amazon.aps.iva.pc0.h hVar, com.amazon.aps.iva.pc0.h hVar2, boolean z, com.amazon.aps.iva.oc0.r rVar, t0 t0Var) {
        if (hVar != null) {
            if (hVar2 != null) {
                if (rVar != null) {
                    if (t0Var != null) {
                        com.amazon.aps.iva.rc0.n0 n0Var2 = new com.amazon.aps.iva.rc0.n0(n0Var, hVar, n0Var.o(), rVar, z, false, false, b.a.DECLARATION, null, t0Var);
                        n0Var2.n = com.amazon.aps.iva.rc0.n0.H0(n0Var2, n0Var.getType(), hVar2);
                        return n0Var2;
                    }
                    a(11);
                    throw null;
                }
                a(10);
                throw null;
            }
            a(9);
            throw null;
        }
        a(8);
        throw null;
    }

    public static boolean k(com.amazon.aps.iva.oc0.v vVar) {
        if (vVar.getKind() == b.a.SYNTHESIZED) {
            com.amazon.aps.iva.oc0.k d = vVar.d();
            int i = i.a;
            if (i.n(d, com.amazon.aps.iva.oc0.f.ENUM_CLASS)) {
                return true;
            }
        }
        return false;
    }
}
