package com.amazon.aps.iva.rc0;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
/* compiled from: ReceiverParameterDescriptorImpl.java */
/* loaded from: classes4.dex */
public final class o0 extends d {
    public final com.amazon.aps.iva.oc0.k d;
    public final com.amazon.aps.iva.yd0.g e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o0(com.amazon.aps.iva.oc0.k kVar, com.amazon.aps.iva.yd0.a aVar, com.amazon.aps.iva.pc0.h hVar) {
        this(kVar, aVar, hVar, com.amazon.aps.iva.nd0.h.d);
        if (kVar == null) {
            d0(0);
            throw null;
        } else if (hVar != null) {
        } else {
            d0(2);
            throw null;
        }
    }

    public static /* synthetic */ void d0(int i) {
        String str;
        int i2;
        if (i != 7 && i != 8) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 7 && i != 8) {
            i2 = 3;
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 4:
                objArr[0] = "value";
                break;
            case 2:
            case 5:
                objArr[0] = "annotations";
                break;
            case 3:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 6:
                objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
                break;
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
                break;
            case 9:
                objArr[0] = "newOwner";
                break;
            case 10:
                objArr[0] = "outType";
                break;
        }
        if (i != 7) {
            if (i != 8) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
            } else {
                objArr[1] = "getContainingDeclaration";
            }
        } else {
            objArr[1] = "getValue";
        }
        switch (i) {
            case 7:
            case 8:
                break;
            case 9:
                objArr[2] = "copy";
                break;
            case 10:
                objArr[2] = "setOutType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i == 7 || i == 8) {
            throw new IllegalStateException(format);
        }
    }

    @Override // com.amazon.aps.iva.oc0.k
    public final com.amazon.aps.iva.oc0.k d() {
        com.amazon.aps.iva.oc0.k kVar = this.d;
        if (kVar != null) {
            return kVar;
        }
        d0(8);
        throw null;
    }

    @Override // com.amazon.aps.iva.oc0.q0
    public final com.amazon.aps.iva.yd0.g getValue() {
        com.amazon.aps.iva.yd0.g gVar = this.e;
        if (gVar != null) {
            return gVar;
        }
        d0(7);
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(com.amazon.aps.iva.oc0.k kVar, com.amazon.aps.iva.yd0.a aVar, com.amazon.aps.iva.pc0.h hVar, com.amazon.aps.iva.nd0.f fVar) {
        super(hVar, fVar);
        if (kVar == null) {
            d0(3);
            throw null;
        } else if (hVar == null) {
            d0(5);
            throw null;
        } else if (fVar != null) {
            this.d = kVar;
            this.e = aVar;
        } else {
            d0(6);
            throw null;
        }
    }
}
