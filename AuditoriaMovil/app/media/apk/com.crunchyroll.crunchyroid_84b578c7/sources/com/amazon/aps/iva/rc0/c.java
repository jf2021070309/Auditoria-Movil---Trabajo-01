package com.amazon.aps.iva.rc0;

import com.amazon.aps.iva.ee0.v1;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
/* compiled from: AbstractLazyTypeParameterDescriptor.java */
/* loaded from: classes4.dex */
public abstract class c extends k {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.amazon.aps.iva.de0.l lVar, com.amazon.aps.iva.oc0.k kVar, com.amazon.aps.iva.pc0.h hVar, com.amazon.aps.iva.nd0.f fVar, v1 v1Var, boolean z, int i, com.amazon.aps.iva.oc0.w0 w0Var) {
        super(lVar, kVar, hVar, fVar, v1Var, z, i, w0Var);
        if (lVar != null) {
            if (kVar != null) {
                if (fVar != null) {
                    if (v1Var != null) {
                        if (w0Var != null) {
                            return;
                        } else {
                            d0(6);
                            throw null;
                        }
                    }
                    d0(4);
                    throw null;
                }
                d0(3);
                throw null;
            }
            d0(1);
            throw null;
        }
        d0(0);
        throw null;
    }

    public static /* synthetic */ void d0(int i) {
        Object[] objArr = new Object[3];
        switch (i) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = FirebaseAnalytics.Param.SOURCE;
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor";
        objArr[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // com.amazon.aps.iva.rc0.p
    public final String toString() {
        String str;
        Object[] objArr = new Object[3];
        String str2 = "";
        if (!this.g) {
            str = "";
        } else {
            str = "reified ";
        }
        objArr[0] = str;
        if (i() != v1.INVARIANT) {
            str2 = i() + " ";
        }
        objArr[1] = str2;
        objArr[2] = getName();
        return String.format("%s%s%s", objArr);
    }
}
