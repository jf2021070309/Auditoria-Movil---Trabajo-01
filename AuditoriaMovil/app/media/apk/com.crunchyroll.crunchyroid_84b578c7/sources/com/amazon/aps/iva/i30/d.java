package com.amazon.aps.iva.i30;

import com.amazon.aps.iva.yb0.j;
import java.io.Serializable;
/* compiled from: DowngradeSuccessInput.kt */
/* loaded from: classes2.dex */
public final class d implements Serializable {
    public final String b;

    public d(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof d) && j.a(this.b, ((d) obj).b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.b;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return defpackage.b.c(new StringBuilder("DowngradeSuccessInput(productTitle="), this.b, ")");
    }
}
