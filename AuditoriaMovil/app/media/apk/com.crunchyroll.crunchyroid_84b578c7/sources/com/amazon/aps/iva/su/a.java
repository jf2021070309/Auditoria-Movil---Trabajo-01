package com.amazon.aps.iva.su;

import com.amazon.aps.iva.yb0.j;
import java.io.Serializable;
/* compiled from: Username.kt */
/* loaded from: classes2.dex */
public final class a implements Serializable {
    public final String b;
    public final String c;

    public a(String str) {
        j.f(str, "username");
        this.b = str;
        this.c = e.e("@", str, " ");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof a) && j.a(this.b, ((a) obj).b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return b.c(new StringBuilder("Username(username="), this.b, ")");
    }
}
