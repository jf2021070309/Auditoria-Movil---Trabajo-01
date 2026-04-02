package com.amazon.aps.iva.yd0;

import com.amazon.aps.iva.ee0.e0;
/* compiled from: AbstractReceiverValue.java */
/* loaded from: classes4.dex */
public abstract class a implements g {
    public final e0 a;
    public final g b;

    public a(e0 e0Var, g gVar) {
        if (e0Var != null) {
            this.a = e0Var;
            this.b = gVar == null ? this : gVar;
            return;
        }
        c(0);
        throw null;
    }

    public static /* synthetic */ void c(int i) {
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
            objArr[0] = "receiverType";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        }
        if (i != 1) {
            if (i != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
            } else {
                objArr[1] = "getOriginal";
            }
        } else {
            objArr[1] = "getType";
        }
        if (i != 1 && i != 2) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i == 1 || i == 2) {
            throw new IllegalStateException(format);
        }
    }

    @Override // com.amazon.aps.iva.yd0.g
    public final e0 getType() {
        e0 e0Var = this.a;
        if (e0Var != null) {
            return e0Var;
        }
        c(1);
        throw null;
    }
}
