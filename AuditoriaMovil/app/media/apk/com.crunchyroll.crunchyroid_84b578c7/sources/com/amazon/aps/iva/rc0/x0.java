package com.amazon.aps.iva.rc0;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
/* compiled from: VariableDescriptorWithInitializerImpl.java */
/* loaded from: classes4.dex */
public abstract class x0 extends w0 {
    public final boolean g;
    public com.amazon.aps.iva.de0.j<com.amazon.aps.iva.sd0.g<?>> h;
    public com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.de0.j<com.amazon.aps.iva.sd0.g<?>>> i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(com.amazon.aps.iva.oc0.k kVar, com.amazon.aps.iva.pc0.h hVar, com.amazon.aps.iva.nd0.f fVar, boolean z, com.amazon.aps.iva.oc0.t0 t0Var) {
        super(kVar, hVar, fVar, null, t0Var);
        if (kVar != null) {
            if (hVar != null) {
                if (fVar != null) {
                    if (t0Var != null) {
                        this.g = z;
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
        Object[] objArr = new Object[3];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4 && i != 5) {
                        objArr[0] = "containingDeclaration";
                    } else {
                        objArr[0] = "compileTimeInitializerFactory";
                    }
                } else {
                    objArr[0] = FirebaseAnalytics.Param.SOURCE;
                }
            } else {
                objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
            }
        } else {
            objArr[0] = "annotations";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl";
        if (i != 4) {
            if (i != 5) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "setCompileTimeInitializer";
            }
        } else {
            objArr[2] = "setCompileTimeInitializerFactory";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public final void E0(com.amazon.aps.iva.de0.j<com.amazon.aps.iva.sd0.g<?>> jVar, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.de0.j<com.amazon.aps.iva.sd0.g<?>>> aVar) {
        if (aVar != null) {
            this.i = aVar;
            if (jVar == null) {
                jVar = aVar.invoke();
            }
            this.h = jVar;
            return;
        }
        d0(5);
        throw null;
    }

    @Override // com.amazon.aps.iva.oc0.d1
    public final boolean L() {
        return this.g;
    }

    @Override // com.amazon.aps.iva.oc0.d1
    public final com.amazon.aps.iva.sd0.g<?> j0() {
        com.amazon.aps.iva.de0.j<com.amazon.aps.iva.sd0.g<?>> jVar = this.h;
        if (jVar != null) {
            return jVar.invoke();
        }
        return null;
    }
}
