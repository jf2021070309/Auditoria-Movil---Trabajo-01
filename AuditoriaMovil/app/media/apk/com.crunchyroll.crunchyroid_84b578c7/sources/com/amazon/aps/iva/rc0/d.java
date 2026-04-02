package com.amazon.aps.iva.rc0;

import com.amazon.aps.iva.ee0.q1;
import com.amazon.aps.iva.ee0.v1;
import com.amazon.aps.iva.oc0.c1;
import com.amazon.aps.iva.oc0.q;
import com.amazon.aps.iva.oc0.y0;
import com.amazon.aps.iva.pc0.h;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
/* compiled from: AbstractReceiverParameterDescriptor.java */
/* loaded from: classes4.dex */
public abstract class d extends p implements com.amazon.aps.iva.oc0.q0 {
    public d() {
        super(h.a.a, com.amazon.aps.iva.nd0.h.d);
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
            case 11:
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
            case 11:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 2:
                objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
                break;
            case 3:
                objArr[0] = "substitutor";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 5:
                objArr[1] = "getTypeParameters";
                break;
            case 6:
                objArr[1] = "getType";
                break;
            case 7:
                objArr[1] = "getValueParameters";
                break;
            case 8:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 9:
                objArr[1] = "getVisibility";
                break;
            case 10:
                objArr[1] = "getOriginal";
                break;
            case 11:
                objArr[1] = "getSource";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
        }
        switch (i) {
            case 3:
                objArr[2] = "substitute";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
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
            case 11:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // com.amazon.aps.iva.oc0.k
    public final <R, D> R D0(com.amazon.aps.iva.oc0.m<R, D> mVar, D d) {
        return mVar.c(this, d);
    }

    @Override // com.amazon.aps.iva.oc0.a
    public final com.amazon.aps.iva.oc0.q0 J() {
        return null;
    }

    @Override // com.amazon.aps.iva.oc0.a
    public final com.amazon.aps.iva.oc0.q0 M() {
        return null;
    }

    @Override // com.amazon.aps.iva.rc0.p, com.amazon.aps.iva.oc0.k
    public final com.amazon.aps.iva.oc0.a a() {
        return this;
    }

    @Override // com.amazon.aps.iva.oc0.a
    public final boolean c0() {
        return false;
    }

    @Override // com.amazon.aps.iva.oc0.a
    public final List<c1> f() {
        List<c1> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        d0(7);
        throw null;
    }

    @Override // com.amazon.aps.iva.oc0.n
    public final com.amazon.aps.iva.oc0.t0 g() {
        return com.amazon.aps.iva.oc0.t0.a;
    }

    @Override // com.amazon.aps.iva.oc0.a
    public final com.amazon.aps.iva.ee0.e0 getReturnType() {
        return getType();
    }

    @Override // com.amazon.aps.iva.oc0.b1
    public final com.amazon.aps.iva.ee0.e0 getType() {
        com.amazon.aps.iva.ee0.e0 type = getValue().getType();
        if (type != null) {
            return type;
        }
        d0(6);
        throw null;
    }

    @Override // com.amazon.aps.iva.oc0.a
    public final List<y0> getTypeParameters() {
        List<y0> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        d0(5);
        throw null;
    }

    @Override // com.amazon.aps.iva.oc0.o, com.amazon.aps.iva.oc0.a0
    public final com.amazon.aps.iva.oc0.r getVisibility() {
        q.i iVar = com.amazon.aps.iva.oc0.q.f;
        if (iVar != null) {
            return iVar;
        }
        d0(9);
        throw null;
    }

    @Override // com.amazon.aps.iva.oc0.a
    public final Collection<? extends com.amazon.aps.iva.oc0.a> k() {
        Set emptySet = Collections.emptySet();
        if (emptySet != null) {
            return emptySet;
        }
        d0(8);
        throw null;
    }

    @Override // com.amazon.aps.iva.rc0.p, com.amazon.aps.iva.oc0.k
    public final com.amazon.aps.iva.oc0.k a() {
        return this;
    }

    @Override // com.amazon.aps.iva.oc0.v0
    public final com.amazon.aps.iva.oc0.a b(q1 q1Var) {
        com.amazon.aps.iva.ee0.e0 k;
        if (q1Var != null) {
            if (q1Var.h()) {
                return this;
            }
            if (d() instanceof com.amazon.aps.iva.oc0.e) {
                k = q1Var.k(getType(), v1.OUT_VARIANCE);
            } else {
                k = q1Var.k(getType(), v1.INVARIANT);
            }
            if (k == null) {
                return null;
            }
            return k == getType() ? this : new o0(d(), new com.amazon.aps.iva.yd0.j(k), getAnnotations());
        }
        d0(3);
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.amazon.aps.iva.pc0.h hVar, com.amazon.aps.iva.nd0.f fVar) {
        super(hVar, fVar);
        if (hVar == null) {
            d0(1);
            throw null;
        } else if (fVar != null) {
        } else {
            d0(2);
            throw null;
        }
    }
}
