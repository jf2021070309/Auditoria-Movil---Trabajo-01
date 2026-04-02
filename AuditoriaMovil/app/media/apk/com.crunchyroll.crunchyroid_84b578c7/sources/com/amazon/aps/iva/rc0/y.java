package com.amazon.aps.iva.rc0;
/* compiled from: LazyClassReceiverParameterDescriptor.java */
/* loaded from: classes4.dex */
public final class y extends d {
    public final com.amazon.aps.iva.oc0.e d;
    public final com.amazon.aps.iva.yd0.e e;

    public y(b bVar) {
        if (bVar != null) {
            this.d = bVar;
            this.e = new com.amazon.aps.iva.yd0.e(bVar);
            return;
        }
        d0(0);
        throw null;
    }

    public static /* synthetic */ void d0(int i) {
        String str;
        int i2;
        if (i != 1 && i != 2) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 1 && i != 2) {
            i2 = 3;
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        if (i != 1 && i != 2) {
            if (i != 3) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "newOwner";
            }
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        }
        if (i != 1) {
            if (i != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
            } else {
                objArr[1] = "getContainingDeclaration";
            }
        } else {
            objArr[1] = "getValue";
        }
        if (i != 1 && i != 2) {
            if (i != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "copy";
            }
        }
        String format = String.format(str, objArr);
        if (i == 1 || i == 2) {
            throw new IllegalStateException(format);
        }
    }

    @Override // com.amazon.aps.iva.oc0.k
    public final com.amazon.aps.iva.oc0.k d() {
        com.amazon.aps.iva.oc0.e eVar = this.d;
        if (eVar != null) {
            return eVar;
        }
        d0(2);
        throw null;
    }

    @Override // com.amazon.aps.iva.oc0.q0
    public final com.amazon.aps.iva.yd0.g getValue() {
        com.amazon.aps.iva.yd0.e eVar = this.e;
        if (eVar != null) {
            return eVar;
        }
        d0(1);
        throw null;
    }

    @Override // com.amazon.aps.iva.rc0.p
    public final String toString() {
        return "class " + this.d.getName() + "::this";
    }
}
