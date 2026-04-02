package com.amazon.aps.iva.wd;

import com.google.android.gms.common.Scopes;
/* compiled from: CreatePasswordScreen.kt */
/* loaded from: classes.dex */
public final class t {
    public final String a;
    public final String b;
    public final boolean c;

    public t(String str, String str2, boolean z) {
        com.amazon.aps.iva.yb0.j.f(str, Scopes.EMAIL);
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public static t a(t tVar, String str, String str2, int i) {
        boolean z;
        if ((i & 1) != 0) {
            str = tVar.a;
        }
        if ((i & 2) != 0) {
            str2 = tVar.b;
        }
        if ((i & 4) != 0) {
            z = tVar.c;
        } else {
            z = false;
        }
        tVar.getClass();
        com.amazon.aps.iva.yb0.j.f(str, Scopes.EMAIL);
        com.amazon.aps.iva.yb0.j.f(str2, "password");
        return new t(str, str2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, tVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, tVar.b) && this.c == tVar.c) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int b = com.amazon.aps.iva.c80.a.b(this.b, this.a.hashCode() * 31, 31);
        boolean z = this.c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return b + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreatePasswordState(email=");
        sb.append(this.a);
        sb.append(", password=");
        sb.append(this.b);
        sb.append(", isOptInCheckboxEnabled=");
        return com.amazon.aps.iva.e4.e.c(sb, this.c, ")");
    }
}
