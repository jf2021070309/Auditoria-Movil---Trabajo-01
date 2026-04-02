package com.amazon.aps.iva.rc0;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
/* compiled from: DeclarationDescriptorNonRootImpl.java */
/* loaded from: classes4.dex */
public abstract class q extends p implements com.amazon.aps.iva.oc0.l {
    public final com.amazon.aps.iva.oc0.k d;
    public final com.amazon.aps.iva.oc0.t0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.amazon.aps.iva.oc0.k kVar, com.amazon.aps.iva.pc0.h hVar, com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.oc0.t0 t0Var) {
        super(hVar, fVar);
        if (kVar != null) {
            if (hVar != null) {
                if (fVar != null) {
                    if (t0Var != null) {
                        this.d = kVar;
                        this.e = t0Var;
                        return;
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

    public static /* synthetic */ void d0(int i) {
        String str;
        int i2;
        if (i != 4 && i != 5 && i != 6) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 4 && i != 5 && i != 6) {
            i2 = 3;
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
                break;
            case 3:
                objArr[0] = FirebaseAnalytics.Param.SOURCE;
                break;
            case 4:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i != 4) {
            if (i != 5) {
                if (i != 6) {
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                } else {
                    objArr[1] = "getSource";
                }
            } else {
                objArr[1] = "getContainingDeclaration";
            }
        } else {
            objArr[1] = "getOriginal";
        }
        if (i != 4 && i != 5 && i != 6) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i == 4 || i == 5 || i == 6) {
            throw new IllegalStateException(format);
        }
    }

    public com.amazon.aps.iva.oc0.k d() {
        com.amazon.aps.iva.oc0.k kVar = this.d;
        if (kVar != null) {
            return kVar;
        }
        d0(5);
        throw null;
    }

    public com.amazon.aps.iva.oc0.t0 g() {
        com.amazon.aps.iva.oc0.t0 t0Var = this.e;
        if (t0Var != null) {
            return t0Var;
        }
        d0(6);
        throw null;
    }

    @Override // com.amazon.aps.iva.rc0.p, com.amazon.aps.iva.oc0.k
    /* renamed from: A0 */
    public com.amazon.aps.iva.oc0.n a() {
        return this;
    }
}
