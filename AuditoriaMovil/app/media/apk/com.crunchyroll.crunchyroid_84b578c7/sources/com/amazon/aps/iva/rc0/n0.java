package com.amazon.aps.iva.rc0;

import com.amazon.aps.iva.oc0.b;
import com.amazon.aps.iva.oc0.c1;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
/* compiled from: PropertySetterDescriptorImpl.java */
/* loaded from: classes4.dex */
public final class n0 extends k0 implements com.amazon.aps.iva.oc0.p0 {
    public c1 n;
    public final com.amazon.aps.iva.oc0.p0 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n0(com.amazon.aps.iva.oc0.n0 n0Var, com.amazon.aps.iva.pc0.h hVar, com.amazon.aps.iva.oc0.b0 b0Var, com.amazon.aps.iva.oc0.r rVar, boolean z, boolean z2, boolean z3, b.a aVar, com.amazon.aps.iva.oc0.p0 p0Var, com.amazon.aps.iva.oc0.t0 t0Var) {
        super(b0Var, rVar, n0Var, hVar, com.amazon.aps.iva.nd0.f.j("<set-" + n0Var.getName() + ">"), z, z2, z3, aVar, t0Var);
        n0 n0Var2;
        n0 n0Var3;
        if (hVar != null) {
            if (b0Var != null) {
                if (rVar != null) {
                    if (aVar != null) {
                        if (t0Var != null) {
                            if (p0Var != 0) {
                                n0Var3 = this;
                                n0Var2 = p0Var;
                            } else {
                                n0Var2 = this;
                                n0Var3 = n0Var2;
                            }
                            n0Var3.o = n0Var2;
                            return;
                        }
                        d0(5);
                        throw null;
                    }
                    d0(4);
                    throw null;
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

    public static v0 H0(n0 n0Var, com.amazon.aps.iva.ee0.e0 e0Var, com.amazon.aps.iva.pc0.h hVar) {
        if (e0Var != null) {
            if (hVar != null) {
                return new v0(n0Var, null, 0, hVar, com.amazon.aps.iva.nd0.h.g, e0Var, false, false, false, null, com.amazon.aps.iva.oc0.t0.a);
            }
            d0(9);
            throw null;
        }
        d0(8);
        throw null;
    }

    public static /* synthetic */ void d0(int i) {
        String str;
        int i2;
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 9:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = FirebaseAnalytics.Param.SOURCE;
                break;
            case 6:
                objArr[0] = MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD;
                break;
            case 7:
                objArr[0] = "setterDescriptor";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        switch (i) {
            case 10:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 11:
                objArr[1] = "getValueParameters";
                break;
            case 12:
                objArr[1] = "getReturnType";
                break;
            case 13:
                objArr[1] = "getOriginal";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
        }
        switch (i) {
            case 6:
                objArr[2] = "initialize";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSetterParameter";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // com.amazon.aps.iva.oc0.k
    public final <R, D> R D0(com.amazon.aps.iva.oc0.m<R, D> mVar, D d) {
        return mVar.f(this, d);
    }

    @Override // com.amazon.aps.iva.rc0.k0, com.amazon.aps.iva.rc0.q, com.amazon.aps.iva.rc0.p, com.amazon.aps.iva.oc0.k
    /* renamed from: I0 */
    public final com.amazon.aps.iva.oc0.p0 a() {
        com.amazon.aps.iva.oc0.p0 p0Var = this.o;
        if (p0Var != null) {
            return p0Var;
        }
        d0(13);
        throw null;
    }

    @Override // com.amazon.aps.iva.oc0.a
    public final List<c1> f() {
        c1 c1Var = this.n;
        if (c1Var != null) {
            List<c1> singletonList = Collections.singletonList(c1Var);
            if (singletonList != null) {
                return singletonList;
            }
            d0(11);
            throw null;
        }
        throw new IllegalStateException();
    }

    @Override // com.amazon.aps.iva.oc0.a
    public final com.amazon.aps.iva.ee0.e0 getReturnType() {
        com.amazon.aps.iva.ee0.m0 x = com.amazon.aps.iva.ud0.b.e(this).x();
        if (x != null) {
            return x;
        }
        d0(12);
        throw null;
    }

    @Override // com.amazon.aps.iva.oc0.b, com.amazon.aps.iva.oc0.a
    public final Collection<? extends com.amazon.aps.iva.oc0.p0> k() {
        return G0(false);
    }
}
