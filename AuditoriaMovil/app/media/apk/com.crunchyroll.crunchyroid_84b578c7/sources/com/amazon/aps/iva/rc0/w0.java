package com.amazon.aps.iva.rc0;

import com.amazon.aps.iva.oc0.c1;
import com.amazon.aps.iva.oc0.d1;
import com.amazon.aps.iva.oc0.y0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collections;
import java.util.List;
/* compiled from: VariableDescriptorImpl.java */
/* loaded from: classes4.dex */
public abstract class w0 extends q implements d1 {
    public com.amazon.aps.iva.ee0.e0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(com.amazon.aps.iva.oc0.k kVar, com.amazon.aps.iva.pc0.h hVar, com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.ee0.e0 e0Var, com.amazon.aps.iva.oc0.t0 t0Var) {
        super(kVar, hVar, fVar, t0Var);
        if (kVar != null) {
            if (hVar != null) {
                if (fVar != null) {
                    if (t0Var != null) {
                        this.f = e0Var;
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
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
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
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getOriginal";
                break;
            case 6:
                objArr[1] = "getValueParameters";
                break;
            case 7:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 10:
                objArr[1] = "getReturnType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    public com.amazon.aps.iva.oc0.q0 J() {
        return null;
    }

    public com.amazon.aps.iva.oc0.q0 M() {
        return null;
    }

    @Override // com.amazon.aps.iva.oc0.a
    public boolean c0() {
        return false;
    }

    @Override // com.amazon.aps.iva.oc0.a
    public final List<c1> f() {
        List<c1> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        d0(6);
        throw null;
    }

    public com.amazon.aps.iva.ee0.e0 getReturnType() {
        com.amazon.aps.iva.ee0.e0 type = getType();
        if (type != null) {
            return type;
        }
        d0(10);
        throw null;
    }

    @Override // com.amazon.aps.iva.oc0.b1
    public final com.amazon.aps.iva.ee0.e0 getType() {
        com.amazon.aps.iva.ee0.e0 e0Var = this.f;
        if (e0Var != null) {
            return e0Var;
        }
        d0(4);
        throw null;
    }

    public List<y0> getTypeParameters() {
        List<y0> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        d0(8);
        throw null;
    }
}
