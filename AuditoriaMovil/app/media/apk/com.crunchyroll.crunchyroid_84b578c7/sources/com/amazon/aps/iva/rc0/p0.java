package com.amazon.aps.iva.rc0;

import com.amazon.aps.iva.oc0.b;
import com.amazon.aps.iva.oc0.v;
import com.amazon.aps.iva.pc0.h;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* compiled from: SimpleFunctionDescriptorImpl.java */
/* loaded from: classes4.dex */
public class p0 extends x implements com.amazon.aps.iva.oc0.s0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(com.amazon.aps.iva.oc0.k kVar, com.amazon.aps.iva.oc0.s0 s0Var, com.amazon.aps.iva.pc0.h hVar, com.amazon.aps.iva.nd0.f fVar, b.a aVar, com.amazon.aps.iva.oc0.t0 t0Var) {
        super(aVar, kVar, s0Var, t0Var, hVar, fVar);
        if (kVar != null) {
            if (hVar != null) {
                if (fVar != null) {
                    if (aVar != null) {
                        if (t0Var != null) {
                            return;
                        } else {
                            d0(4);
                            throw null;
                        }
                    }
                    d0(3);
                    throw null;
                }
                d0(2);
                throw null;
            }
            d0(1);
            throw null;
        }
        d0(0);
        throw null;
    }

    public static p0 Q0(com.amazon.aps.iva.oc0.k kVar, com.amazon.aps.iva.nd0.f fVar, b.a aVar, com.amazon.aps.iva.oc0.t0 t0Var) {
        h.a.C0609a c0609a = h.a.a;
        if (kVar != null) {
            if (fVar != null) {
                if (aVar != null) {
                    if (t0Var != null) {
                        return new p0(kVar, null, c0609a, fVar, aVar, t0Var);
                    }
                    d0(9);
                    throw null;
                }
                d0(8);
                throw null;
            }
            d0(7);
            throw null;
        }
        d0(5);
        throw null;
    }

    public static /* synthetic */ void d0(int i) {
        String str;
        int i2;
        if (i != 13 && i != 18 && i != 23 && i != 24 && i != 29 && i != 30) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 13 && i != 18 && i != 23 && i != 24 && i != 29 && i != 30) {
            i2 = 3;
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 6:
            case 27:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
                break;
            case 3:
            case 8:
            case 26:
                objArr[0] = "kind";
                break;
            case 4:
            case 9:
            case 28:
                objArr[0] = FirebaseAnalytics.Param.SOURCE;
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 15:
            case 20:
                objArr[0] = "typeParameters";
                break;
            case 11:
            case 16:
            case 21:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
            case 17:
            case 22:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case ConnectionResult.API_DISABLED /* 23 */:
            case 24:
            case 29:
            case 30:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                break;
            case 14:
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case 25:
                objArr[0] = "newOwner";
                break;
        }
        if (i != 13 && i != 18 && i != 23) {
            if (i != 24) {
                if (i != 29) {
                    if (i != 30) {
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                    } else {
                        objArr[1] = "newCopyBuilder";
                    }
                } else {
                    objArr[1] = "copy";
                }
            } else {
                objArr[1] = "getOriginal";
            }
        } else {
            objArr[1] = "initialize";
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = "create";
                break;
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case ConnectionResult.API_DISABLED /* 23 */:
            case 24:
            case 29:
            case 30:
                break;
            case 25:
            case 26:
            case 27:
            case 28:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i == 13 || i == 18 || i == 23 || i == 24 || i == 29 || i == 30) {
            throw new IllegalStateException(format);
        }
    }

    @Override // com.amazon.aps.iva.rc0.x, com.amazon.aps.iva.oc0.v
    public v.a<? extends com.amazon.aps.iva.oc0.s0> C0() {
        return super.C0();
    }

    @Override // com.amazon.aps.iva.rc0.x
    public x G0(b.a aVar, com.amazon.aps.iva.oc0.k kVar, com.amazon.aps.iva.oc0.v vVar, com.amazon.aps.iva.oc0.t0 t0Var, com.amazon.aps.iva.pc0.h hVar, com.amazon.aps.iva.nd0.f fVar) {
        if (kVar != null) {
            if (aVar != null) {
                if (hVar != null) {
                    com.amazon.aps.iva.oc0.s0 s0Var = (com.amazon.aps.iva.oc0.s0) vVar;
                    if (fVar == null) {
                        fVar = getName();
                    }
                    return new p0(kVar, s0Var, hVar, fVar, aVar, t0Var);
                }
                d0(27);
                throw null;
            }
            d0(26);
            throw null;
        }
        d0(25);
        throw null;
    }

    @Override // com.amazon.aps.iva.rc0.x, com.amazon.aps.iva.oc0.b
    /* renamed from: P0 */
    public com.amazon.aps.iva.oc0.s0 e0(com.amazon.aps.iva.oc0.k kVar, com.amazon.aps.iva.oc0.b0 b0Var, com.amazon.aps.iva.oc0.p pVar, b.a aVar) {
        return (com.amazon.aps.iva.oc0.s0) super.e0(kVar, b0Var, pVar, aVar);
    }

    @Override // com.amazon.aps.iva.rc0.x, com.amazon.aps.iva.rc0.q, com.amazon.aps.iva.rc0.p, com.amazon.aps.iva.oc0.k
    /* renamed from: R0 */
    public final com.amazon.aps.iva.oc0.s0 a() {
        com.amazon.aps.iva.oc0.s0 s0Var = (com.amazon.aps.iva.oc0.s0) super.a();
        if (s0Var != null) {
            return s0Var;
        }
        d0(24);
        throw null;
    }

    @Override // com.amazon.aps.iva.rc0.x
    /* renamed from: S0 */
    public final p0 J0(o0 o0Var, com.amazon.aps.iva.oc0.q0 q0Var, List list, List list2, List list3, com.amazon.aps.iva.ee0.e0 e0Var, com.amazon.aps.iva.oc0.b0 b0Var, com.amazon.aps.iva.oc0.r rVar) {
        if (list != null) {
            if (list2 != null) {
                if (list3 != null) {
                    if (rVar != null) {
                        p0 T0 = T0(o0Var, q0Var, list, list2, list3, e0Var, b0Var, rVar, null);
                        if (T0 != null) {
                            return T0;
                        }
                        d0(18);
                        throw null;
                    }
                    d0(17);
                    throw null;
                }
                d0(16);
                throw null;
            }
            d0(15);
            throw null;
        }
        d0(14);
        throw null;
    }

    public p0 T0(o0 o0Var, com.amazon.aps.iva.oc0.q0 q0Var, List list, List list2, List list3, com.amazon.aps.iva.ee0.e0 e0Var, com.amazon.aps.iva.oc0.b0 b0Var, com.amazon.aps.iva.oc0.r rVar, Map map) {
        if (list != null) {
            if (list2 != null) {
                if (list3 != null) {
                    if (rVar != null) {
                        super.J0(o0Var, q0Var, list, list2, list3, e0Var, b0Var, rVar);
                        if (map != null && !map.isEmpty()) {
                            this.E = new LinkedHashMap(map);
                        }
                        return this;
                    }
                    d0(22);
                    throw null;
                }
                d0(21);
                throw null;
            }
            d0(20);
            throw null;
        }
        d0(19);
        throw null;
    }
}
