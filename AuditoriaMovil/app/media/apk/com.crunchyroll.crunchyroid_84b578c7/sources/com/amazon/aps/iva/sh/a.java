package com.amazon.aps.iva.sh;

import com.amazon.aps.iva.yb0.j;
import java.io.Serializable;
/* compiled from: ManageMembershipInput.kt */
/* loaded from: classes.dex */
public final class a implements Serializable {
    public final String b;

    public a(String str) {
        this.b = str;
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
        return b.c(new StringBuilder("ManageMembershipInput(activeSubscriptionSku="), this.b, ")");
    }
}
