package com.amazon.aps.iva.rc0;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
/* compiled from: DeclarationDescriptorImpl.java */
/* loaded from: classes4.dex */
public abstract class p extends com.amazon.aps.iva.pc0.b implements com.amazon.aps.iva.oc0.k {
    public final com.amazon.aps.iva.nd0.f c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.amazon.aps.iva.pc0.h hVar, com.amazon.aps.iva.nd0.f fVar) {
        super(hVar);
        if (hVar != null) {
            if (fVar != null) {
                this.c = fVar;
                return;
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
        if (i != 2 && i != 3 && i != 5 && i != 6) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 2 && i != 3 && i != 5 && i != 6) {
            i2 = 3;
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            case 4:
                objArr[0] = "descriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        if (i != 2) {
            if (i != 3) {
                if (i != 5 && i != 6) {
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                } else {
                    objArr[1] = "toString";
                }
            } else {
                objArr[1] = "getOriginal";
            }
        } else {
            objArr[1] = "getName";
        }
        if (i != 2 && i != 3) {
            if (i != 4) {
                if (i != 5 && i != 6) {
                    objArr[2] = "<init>";
                }
            } else {
                objArr[2] = "toString";
            }
        }
        String format = String.format(str, objArr);
        if (i == 2 || i == 3 || i == 5 || i == 6) {
            throw new IllegalStateException(format);
        }
    }

    public static String s0(com.amazon.aps.iva.oc0.k kVar) {
        if (kVar != null) {
            try {
                String str = com.amazon.aps.iva.pd0.c.c.F(kVar) + "[" + kVar.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(kVar)) + "]";
                if (str != null) {
                    return str;
                }
                d0(5);
                throw null;
            } catch (Throwable unused) {
                String str2 = kVar.getClass().getSimpleName() + " " + kVar.getName();
                if (str2 != null) {
                    return str2;
                }
                d0(6);
                throw null;
            }
        }
        d0(4);
        throw null;
    }

    @Override // com.amazon.aps.iva.oc0.k
    public final com.amazon.aps.iva.nd0.f getName() {
        com.amazon.aps.iva.nd0.f fVar = this.c;
        if (fVar != null) {
            return fVar;
        }
        d0(2);
        throw null;
    }

    public String toString() {
        return s0(this);
    }

    public com.amazon.aps.iva.oc0.k a() {
        return this;
    }
}
