package com.amazon.aps.iva.en;

import com.amazon.aps.iva.yb0.j;
import java.io.Serializable;
/* compiled from: UserRestrictionInput.kt */
/* loaded from: classes2.dex */
public final class g implements Serializable {
    public final a b;
    public final String c;

    public g(a aVar, String str) {
        this.b = aVar;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (j.a(this.b, gVar.b) && j.a(this.c, gVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "UserRestrictionInput(restrictionReason=" + this.b + ", emailOrUsername=" + this.c + ")";
    }
}
