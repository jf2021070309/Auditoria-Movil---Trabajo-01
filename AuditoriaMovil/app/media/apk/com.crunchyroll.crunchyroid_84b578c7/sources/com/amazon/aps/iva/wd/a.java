package com.amazon.aps.iva.wd;

import com.google.android.gms.common.Scopes;
/* compiled from: CreatePasswordInput.kt */
/* loaded from: classes.dex */
public final class a implements com.amazon.aps.iva.ui.a {
    public final String b;
    public final boolean c;

    public a(String str, boolean z) {
        com.amazon.aps.iva.yb0.j.f(str, Scopes.EMAIL);
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.b, aVar.b) && this.c == aVar.c) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        boolean z = this.c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        return "CreatePasswordInput(email=" + this.b + ", isOptInCheckboxEnabled=" + this.c + ")";
    }
}
