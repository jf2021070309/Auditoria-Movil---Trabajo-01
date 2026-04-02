package com.amazon.aps.iva.yd0;

import com.amazon.aps.iva.ee0.e0;
/* compiled from: ExtensionReceiver.java */
/* loaded from: classes4.dex */
public final class d extends a {
    public final com.amazon.aps.iva.oc0.a c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.amazon.aps.iva.oc0.a aVar, e0 e0Var, g gVar) {
        super(e0Var, gVar);
        if (aVar != null) {
            if (e0Var != null) {
                this.c = aVar;
                return;
            }
            c(1);
            throw null;
        }
        c(0);
        throw null;
    }

    public static /* synthetic */ void c(int i) {
        String str;
        int i2;
        if (i != 2) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 2) {
            i2 = 3;
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    objArr[0] = "callableDescriptor";
                } else {
                    objArr[0] = "newType";
                }
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
            }
        } else {
            objArr[0] = "receiverType";
        }
        if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else {
            objArr[1] = "getDeclarationDescriptor";
        }
        if (i != 2) {
            if (i != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "replaceType";
            }
        }
        String format = String.format(str, objArr);
        if (i != 2) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public final String toString() {
        return getType() + ": Ext {" + this.c + "}";
    }
}
