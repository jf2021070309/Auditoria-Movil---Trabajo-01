package com.amazon.aps.iva.rc0;

import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.ee0.v1;
import com.amazon.aps.iva.pc0.h;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
/* compiled from: TypeParameterDescriptorImpl.java */
/* loaded from: classes4.dex */
public final class t0 extends k {
    public final com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ee0.e0, Void> l;
    public final ArrayList m;
    public boolean n;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public t0(com.amazon.aps.iva.oc0.k r12, com.amazon.aps.iva.pc0.h r13, boolean r14, com.amazon.aps.iva.ee0.v1 r15, com.amazon.aps.iva.nd0.f r16, int r17, com.amazon.aps.iva.de0.l r18) {
        /*
            r11 = this;
            r9 = r11
            com.amazon.aps.iva.oc0.w0$a r8 = com.amazon.aps.iva.oc0.w0.a.a
            r10 = 0
            if (r12 == 0) goto L42
            if (r13 == 0) goto L3c
            if (r15 == 0) goto L36
            if (r16 == 0) goto L30
            if (r18 == 0) goto L2a
            r0 = r11
            r1 = r18
            r2 = r12
            r3 = r13
            r4 = r16
            r5 = r15
            r6 = r14
            r7 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 1
            r0.<init>(r1)
            r9.m = r0
            r0 = 0
            r9.n = r0
            r9.l = r10
            return
        L2a:
            r0 = 25
            d0(r0)
            throw r10
        L30:
            r0 = 22
            d0(r0)
            throw r10
        L36:
            r0 = 21
            d0(r0)
            throw r10
        L3c:
            r0 = 20
            d0(r0)
            throw r10
        L42:
            r0 = 19
            d0(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.rc0.t0.<init>(com.amazon.aps.iva.oc0.k, com.amazon.aps.iva.pc0.h, boolean, com.amazon.aps.iva.ee0.v1, com.amazon.aps.iva.nd0.f, int, com.amazon.aps.iva.de0.l):void");
    }

    public static t0 J0(com.amazon.aps.iva.oc0.k kVar, com.amazon.aps.iva.pc0.h hVar, boolean z, v1 v1Var, com.amazon.aps.iva.nd0.f fVar, int i, com.amazon.aps.iva.de0.l lVar) {
        if (kVar != null) {
            if (hVar != null) {
                if (v1Var != null) {
                    if (fVar != null) {
                        if (lVar != null) {
                            return new t0(kVar, hVar, z, v1Var, fVar, i, lVar);
                        }
                        d0(11);
                        throw null;
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
        d0(6);
        throw null;
    }

    public static t0 K0(com.amazon.aps.iva.oc0.k kVar, v1 v1Var, com.amazon.aps.iva.nd0.f fVar, int i, com.amazon.aps.iva.de0.l lVar) {
        h.a.C0609a c0609a = h.a.a;
        if (kVar != null) {
            if (v1Var != null) {
                if (lVar != null) {
                    t0 J0 = J0(kVar, c0609a, false, v1Var, fVar, i, lVar);
                    com.amazon.aps.iva.ee0.m0 n = com.amazon.aps.iva.ud0.b.e(kVar).n();
                    J0.I0();
                    if (!l1.D(n)) {
                        J0.m.add(n);
                    }
                    J0.I0();
                    J0.n = true;
                    return J0;
                }
                d0(4);
                throw null;
            }
            d0(2);
            throw null;
        }
        d0(0);
        throw null;
    }

    public static /* synthetic */ void d0(int i) {
        String str;
        int i2;
        if (i != 5 && i != 28) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 5 && i != 28) {
            i2 = 3;
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 7:
            case 13:
            case 20:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 14:
            case 21:
                objArr[0] = "variance";
                break;
            case 3:
            case 9:
            case 15:
            case 22:
                objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
                break;
            case 4:
            case 11:
            case 18:
            case 25:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 28:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 16:
            case ConnectionResult.API_DISABLED /* 23 */:
                objArr[0] = FirebaseAnalytics.Param.SOURCE;
                break;
            case 17:
                objArr[0] = "supertypeLoopsResolver";
                break;
            case 24:
                objArr[0] = "supertypeLoopsChecker";
                break;
            case 26:
                objArr[0] = "bound";
                break;
            case 27:
                objArr[0] = "type";
                break;
        }
        if (i != 5) {
            if (i != 28) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
            } else {
                objArr[1] = "resolveUpperBounds";
            }
        } else {
            objArr[1] = "createWithDefaultBound";
        }
        switch (i) {
            case 5:
            case 28:
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createForFurtherModification";
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case ConnectionResult.API_DISABLED /* 23 */:
            case 24:
            case 25:
                objArr[2] = "<init>";
                break;
            case 26:
                objArr[2] = "addUpperBound";
                break;
            case 27:
                objArr[2] = "reportSupertypeLoopError";
                break;
            default:
                objArr[2] = "createWithDefaultBound";
                break;
        }
        String format = String.format(str, objArr);
        if (i == 5 || i == 28) {
            throw new IllegalStateException(format);
        }
    }

    @Override // com.amazon.aps.iva.rc0.k
    public final void G0(com.amazon.aps.iva.ee0.e0 e0Var) {
        if (e0Var != null) {
            com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ee0.e0, Void> lVar = this.l;
            if (lVar == null) {
                return;
            }
            lVar.invoke(e0Var);
            return;
        }
        d0(27);
        throw null;
    }

    @Override // com.amazon.aps.iva.rc0.k
    public final List<com.amazon.aps.iva.ee0.e0> H0() {
        if (this.n) {
            ArrayList arrayList = this.m;
            if (arrayList != null) {
                return arrayList;
            }
            d0(28);
            throw null;
        }
        throw new IllegalStateException("Type parameter descriptor is not initialized: " + L0());
    }

    public final void I0() {
        if (!this.n) {
            return;
        }
        throw new IllegalStateException("Type parameter descriptor is already initialized: " + L0());
    }

    public final String L0() {
        return getName() + " declared in " + com.amazon.aps.iva.qd0.i.g(d());
    }
}
