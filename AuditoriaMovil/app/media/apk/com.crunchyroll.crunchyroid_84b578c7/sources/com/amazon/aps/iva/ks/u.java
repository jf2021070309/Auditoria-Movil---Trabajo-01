package com.amazon.aps.iva.ks;

import com.amazon.aps.iva.js.l0;
/* compiled from: UpsellTypeProperty.kt */
/* loaded from: classes2.dex */
public final class u extends com.amazon.aps.iva.is.a {
    private final l0 upsellType;

    public u(l0 l0Var) {
        com.amazon.aps.iva.yb0.j.f(l0Var, "upsellType");
        this.upsellType = l0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof u) && this.upsellType == ((u) obj).upsellType) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.upsellType.hashCode();
    }

    public final String toString() {
        l0 l0Var = this.upsellType;
        return "UpsellTypeProperty(upsellType=" + l0Var + ")";
    }
}
