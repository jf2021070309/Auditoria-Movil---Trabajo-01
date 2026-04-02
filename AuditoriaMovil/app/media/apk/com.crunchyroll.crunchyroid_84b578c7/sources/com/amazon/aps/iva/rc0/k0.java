package com.amazon.aps.iva.rc0;

import com.amazon.aps.iva.ee0.q1;
import com.amazon.aps.iva.oc0.a;
import com.amazon.aps.iva.oc0.b;
import com.amazon.aps.iva.oc0.y0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* compiled from: PropertyAccessorDescriptorImpl.java */
/* loaded from: classes4.dex */
public abstract class k0 extends q implements com.amazon.aps.iva.oc0.m0 {
    public boolean f;
    public final boolean g;
    public final com.amazon.aps.iva.oc0.b0 h;
    public final com.amazon.aps.iva.oc0.n0 i;
    public final boolean j;
    public final b.a k;
    public com.amazon.aps.iva.oc0.r l;
    public com.amazon.aps.iva.oc0.v m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(com.amazon.aps.iva.oc0.b0 b0Var, com.amazon.aps.iva.oc0.r rVar, com.amazon.aps.iva.oc0.n0 n0Var, com.amazon.aps.iva.pc0.h hVar, com.amazon.aps.iva.nd0.f fVar, boolean z, boolean z2, boolean z3, b.a aVar, com.amazon.aps.iva.oc0.t0 t0Var) {
        super(n0Var.d(), hVar, fVar, t0Var);
        if (b0Var != null) {
            if (rVar != null) {
                if (hVar != null) {
                    if (t0Var != null) {
                        this.m = null;
                        this.h = b0Var;
                        this.l = rVar;
                        this.i = n0Var;
                        this.f = z;
                        this.g = z2;
                        this.j = z3;
                        this.k = aVar;
                        return;
                    }
                    d0(5);
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
        String str;
        int i2;
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 7:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i2 = 2;
                break;
            case 7:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "visibility";
                break;
            case 2:
                objArr[0] = "correspondingProperty";
                break;
            case 3:
                objArr[0] = "annotations";
                break;
            case 4:
                objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
                break;
            case 5:
                objArr[0] = FirebaseAnalytics.Param.SOURCE;
                break;
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 7:
                objArr[0] = "substitutor";
                break;
            case 16:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "modality";
                break;
        }
        switch (i) {
            case 6:
                objArr[1] = "getKind";
                break;
            case 7:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 8:
                objArr[1] = "substitute";
                break;
            case 9:
                objArr[1] = "getTypeParameters";
                break;
            case 10:
                objArr[1] = "getModality";
                break;
            case 11:
                objArr[1] = "getVisibility";
                break;
            case 12:
                objArr[1] = "getCorrespondingVariable";
                break;
            case 13:
                objArr[1] = "getCorrespondingProperty";
                break;
            case 14:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 15:
                objArr[1] = "getOverriddenDescriptors";
                break;
        }
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                break;
            case 7:
                objArr[2] = "substitute";
                break;
            case 16:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                throw new IllegalStateException(format);
            case 7:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // com.amazon.aps.iva.oc0.v
    public final boolean B0() {
        return false;
    }

    @Override // com.amazon.aps.iva.oc0.v
    public final boolean C() {
        return false;
    }

    @Override // com.amazon.aps.iva.rc0.q, com.amazon.aps.iva.rc0.p, com.amazon.aps.iva.oc0.k
    /* renamed from: E0 */
    public abstract com.amazon.aps.iva.oc0.m0 a();

    @Override // com.amazon.aps.iva.oc0.m0
    public final boolean F() {
        return this.f;
    }

    public final ArrayList G0(boolean z) {
        com.amazon.aps.iva.oc0.b setter;
        ArrayList arrayList = new ArrayList(0);
        Iterator<? extends com.amazon.aps.iva.oc0.b> it = S().k().iterator();
        while (it.hasNext()) {
            com.amazon.aps.iva.oc0.n0 n0Var = (com.amazon.aps.iva.oc0.n0) it.next();
            if (z) {
                setter = n0Var.getGetter();
            } else {
                setter = n0Var.getSetter();
            }
            if (setter != null) {
                arrayList.add(setter);
            }
        }
        return arrayList;
    }

    @Override // com.amazon.aps.iva.oc0.a
    public final com.amazon.aps.iva.oc0.q0 J() {
        return S().J();
    }

    @Override // com.amazon.aps.iva.oc0.a
    public final com.amazon.aps.iva.oc0.q0 M() {
        return S().M();
    }

    @Override // com.amazon.aps.iva.oc0.m0
    public final com.amazon.aps.iva.oc0.n0 S() {
        com.amazon.aps.iva.oc0.n0 n0Var = this.i;
        if (n0Var != null) {
            return n0Var;
        }
        d0(13);
        throw null;
    }

    @Override // com.amazon.aps.iva.oc0.a0
    public final boolean U() {
        return false;
    }

    @Override // com.amazon.aps.iva.oc0.v, com.amazon.aps.iva.oc0.v0
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public final com.amazon.aps.iva.oc0.v b2(q1 q1Var) {
        if (q1Var != null) {
            return this;
        }
        d0(7);
        throw null;
    }

    @Override // com.amazon.aps.iva.oc0.a
    public final boolean c0() {
        return false;
    }

    @Override // com.amazon.aps.iva.oc0.b
    public final com.amazon.aps.iva.oc0.b e0(com.amazon.aps.iva.oc0.k kVar, com.amazon.aps.iva.oc0.b0 b0Var, com.amazon.aps.iva.oc0.p pVar, b.a aVar) {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    @Override // com.amazon.aps.iva.oc0.a0
    public final boolean g0() {
        return false;
    }

    @Override // com.amazon.aps.iva.oc0.b
    public final b.a getKind() {
        b.a aVar = this.k;
        if (aVar != null) {
            return aVar;
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
        d0(9);
        throw null;
    }

    @Override // com.amazon.aps.iva.oc0.o, com.amazon.aps.iva.oc0.a0
    public final com.amazon.aps.iva.oc0.r getVisibility() {
        com.amazon.aps.iva.oc0.r rVar = this.l;
        if (rVar != null) {
            return rVar;
        }
        d0(11);
        throw null;
    }

    @Override // com.amazon.aps.iva.oc0.a0
    public final boolean isExternal() {
        return this.g;
    }

    @Override // com.amazon.aps.iva.oc0.v
    public final boolean isInfix() {
        return false;
    }

    @Override // com.amazon.aps.iva.oc0.v
    public final boolean isInline() {
        return this.j;
    }

    @Override // com.amazon.aps.iva.oc0.v
    public final boolean isOperator() {
        return false;
    }

    @Override // com.amazon.aps.iva.oc0.v
    public final boolean isSuspend() {
        return false;
    }

    @Override // com.amazon.aps.iva.oc0.v
    public final com.amazon.aps.iva.oc0.v m0() {
        return this.m;
    }

    @Override // com.amazon.aps.iva.oc0.a0
    public final com.amazon.aps.iva.oc0.b0 o() {
        com.amazon.aps.iva.oc0.b0 b0Var = this.h;
        if (b0Var != null) {
            return b0Var;
        }
        d0(10);
        throw null;
    }

    @Override // com.amazon.aps.iva.oc0.a
    public final <V> V q0(a.InterfaceC0568a<V> interfaceC0568a) {
        return null;
    }

    @Override // com.amazon.aps.iva.oc0.a
    public final List<com.amazon.aps.iva.oc0.q0> t0() {
        List<com.amazon.aps.iva.oc0.q0> t0 = S().t0();
        if (t0 != null) {
            return t0;
        }
        d0(14);
        throw null;
    }

    @Override // com.amazon.aps.iva.oc0.v
    public final boolean y0() {
        return false;
    }

    @Override // com.amazon.aps.iva.oc0.b
    public final void z0(Collection<? extends com.amazon.aps.iva.oc0.b> collection) {
        if (collection != null) {
            return;
        }
        d0(16);
        throw null;
    }

    @Override // com.amazon.aps.iva.oc0.v0
    public final /* bridge */ /* synthetic */ com.amazon.aps.iva.oc0.a b(q1 q1Var) {
        b2(q1Var);
        return this;
    }
}
