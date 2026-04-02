package com.amazon.aps.iva.qm;
/* compiled from: SetUsernameValidationErrorProvider.kt */
/* loaded from: classes2.dex */
public final class e0 {
    public final String a;
    public final String b;

    public e0(String str, String str2) {
        com.amazon.aps.iva.yb0.j.f(str, "errorMessage");
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, e0Var.a) && com.amazon.aps.iva.yb0.j.a(this.b, e0Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UsernameValidationError(errorMessage=");
        sb.append(this.a);
        sb.append(", suggestedUsername=");
        return defpackage.b.c(sb, this.b, ")");
    }
}
