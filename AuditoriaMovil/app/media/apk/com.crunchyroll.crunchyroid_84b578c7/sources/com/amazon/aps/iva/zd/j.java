package com.amazon.aps.iva.zd;

import com.google.android.gms.common.Scopes;
/* compiled from: EnterPasswordScreen.kt */
/* loaded from: classes.dex */
public final class j {
    public final String a;
    public final String b;

    public j(String str, String str2) {
        com.amazon.aps.iva.yb0.j.f(str, Scopes.EMAIL);
        this.a = str;
        this.b = str2;
    }

    public static j a(j jVar, String str, String str2, int i) {
        if ((i & 1) != 0) {
            str = jVar.a;
        }
        if ((i & 2) != 0) {
            str2 = jVar.b;
        }
        jVar.getClass();
        com.amazon.aps.iva.yb0.j.f(str, Scopes.EMAIL);
        com.amazon.aps.iva.yb0.j.f(str2, "password");
        return new j(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, jVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, jVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EnterPasswordState(email=");
        sb.append(this.a);
        sb.append(", password=");
        return defpackage.b.c(sb, this.b, ")");
    }
}
