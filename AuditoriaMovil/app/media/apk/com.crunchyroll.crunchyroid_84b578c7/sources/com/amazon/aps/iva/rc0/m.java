package com.amazon.aps.iva.rc0;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
/* compiled from: ClassDescriptorBase.java */
/* loaded from: classes4.dex */
public abstract class m extends b {
    public final com.amazon.aps.iva.oc0.k f;
    public final com.amazon.aps.iva.oc0.t0 g;
    public final boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.amazon.aps.iva.de0.l lVar, com.amazon.aps.iva.oc0.k kVar, com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.oc0.t0 t0Var) {
        super(lVar, fVar);
        if (lVar != null) {
            if (kVar != null) {
                if (fVar != null) {
                    if (t0Var != null) {
                        this.f = kVar;
                        this.g = t0Var;
                        this.h = false;
                        return;
                    }
                    A0(3);
                    throw null;
                }
                A0(2);
                throw null;
            }
            A0(1);
            throw null;
        }
        A0(0);
        throw null;
    }

    public static /* synthetic */ void A0(int i) {
        String str;
        int i2;
        if (i != 4 && i != 5) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 4 && i != 5) {
            i2 = 3;
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4 && i != 5) {
                        objArr[0] = "storageManager";
                    } else {
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
                    }
                } else {
                    objArr[0] = FirebaseAnalytics.Param.SOURCE;
                }
            } else {
                objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
            }
        } else {
            objArr[0] = "containingDeclaration";
        }
        if (i != 4) {
            if (i != 5) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
            } else {
                objArr[1] = "getSource";
            }
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (i != 4 && i != 5) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i == 4 || i == 5) {
            throw new IllegalStateException(format);
        }
    }

    @Override // com.amazon.aps.iva.oc0.k
    public final com.amazon.aps.iva.oc0.k d() {
        com.amazon.aps.iva.oc0.k kVar = this.f;
        if (kVar != null) {
            return kVar;
        }
        A0(4);
        throw null;
    }

    @Override // com.amazon.aps.iva.oc0.n
    public final com.amazon.aps.iva.oc0.t0 g() {
        com.amazon.aps.iva.oc0.t0 t0Var = this.g;
        if (t0Var != null) {
            return t0Var;
        }
        A0(5);
        throw null;
    }

    public boolean isExternal() {
        return this.h;
    }
}
