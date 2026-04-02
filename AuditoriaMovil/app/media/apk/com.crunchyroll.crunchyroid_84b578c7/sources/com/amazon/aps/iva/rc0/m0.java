package com.amazon.aps.iva.rc0;

import com.amazon.aps.iva.oc0.b;
import com.amazon.aps.iva.oc0.c1;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
/* compiled from: PropertyGetterDescriptorImpl.java */
/* loaded from: classes4.dex */
public final class m0 extends k0 implements com.amazon.aps.iva.oc0.o0 {
    public com.amazon.aps.iva.ee0.e0 n;
    public final com.amazon.aps.iva.oc0.o0 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m0(com.amazon.aps.iva.oc0.n0 n0Var, com.amazon.aps.iva.pc0.h hVar, com.amazon.aps.iva.oc0.b0 b0Var, com.amazon.aps.iva.oc0.r rVar, boolean z, boolean z2, boolean z3, b.a aVar, com.amazon.aps.iva.oc0.o0 o0Var, com.amazon.aps.iva.oc0.t0 t0Var) {
        super(b0Var, rVar, n0Var, hVar, com.amazon.aps.iva.nd0.f.j("<get-" + n0Var.getName() + ">"), z, z2, z3, aVar, t0Var);
        m0 m0Var;
        m0 m0Var2;
        if (hVar != null) {
            if (b0Var != null) {
                if (rVar != null) {
                    if (aVar != null) {
                        if (t0Var != null) {
                            if (o0Var != 0) {
                                m0Var2 = this;
                                m0Var = o0Var;
                            } else {
                                m0Var = this;
                                m0Var2 = m0Var;
                            }
                            m0Var2.o = m0Var;
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

    public static /* synthetic */ void d0(int i) {
        String str;
        int i2;
        if (i != 6 && i != 7 && i != 8) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 6 && i != 7 && i != 8) {
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
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        if (i != 6) {
            if (i != 7) {
                if (i != 8) {
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                } else {
                    objArr[1] = "getOriginal";
                }
            } else {
                objArr[1] = "getValueParameters";
            }
        } else {
            objArr[1] = "getOverriddenDescriptors";
        }
        if (i != 6 && i != 7 && i != 8) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i == 6 || i == 7 || i == 8) {
            throw new IllegalStateException(format);
        }
    }

    @Override // com.amazon.aps.iva.oc0.k
    public final <R, D> R D0(com.amazon.aps.iva.oc0.m<R, D> mVar, D d) {
        return mVar.a(this, d);
    }

    @Override // com.amazon.aps.iva.rc0.k0, com.amazon.aps.iva.rc0.q, com.amazon.aps.iva.rc0.p, com.amazon.aps.iva.oc0.k
    /* renamed from: H0 */
    public final com.amazon.aps.iva.oc0.o0 a() {
        com.amazon.aps.iva.oc0.o0 o0Var = this.o;
        if (o0Var != null) {
            return o0Var;
        }
        d0(8);
        throw null;
    }

    public final void I0(com.amazon.aps.iva.ee0.e0 e0Var) {
        if (e0Var == null) {
            e0Var = S().getType();
        }
        this.n = e0Var;
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

    @Override // com.amazon.aps.iva.oc0.a
    public final com.amazon.aps.iva.ee0.e0 getReturnType() {
        return this.n;
    }

    @Override // com.amazon.aps.iva.oc0.b, com.amazon.aps.iva.oc0.a
    public final Collection<? extends com.amazon.aps.iva.oc0.o0> k() {
        return G0(true);
    }
}
