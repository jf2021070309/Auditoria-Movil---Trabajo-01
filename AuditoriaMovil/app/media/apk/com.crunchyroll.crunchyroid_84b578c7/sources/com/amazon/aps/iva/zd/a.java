package com.amazon.aps.iva.zd;

import com.google.android.gms.common.Scopes;
/* compiled from: EnterPasswordInput.kt */
/* loaded from: classes.dex */
public final class a implements com.amazon.aps.iva.ui.a {
    public final String b;

    public a(String str) {
        com.amazon.aps.iva.yb0.j.f(str, Scopes.EMAIL);
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof a) && com.amazon.aps.iva.yb0.j.a(this.b, ((a) obj).b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return defpackage.b.c(new StringBuilder("EnterPasswordInput(email="), this.b, ")");
    }
}
