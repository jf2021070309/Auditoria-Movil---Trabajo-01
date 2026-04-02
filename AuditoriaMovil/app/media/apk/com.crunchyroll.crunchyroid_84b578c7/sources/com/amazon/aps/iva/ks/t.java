package com.amazon.aps.iva.ks;

import com.amazon.aps.iva.js.j0;
/* compiled from: SubFlowTypeProperty.kt */
/* loaded from: classes2.dex */
public final class t extends com.amazon.aps.iva.is.a {
    private final j0 subFlowType;

    public t(j0 j0Var) {
        com.amazon.aps.iva.yb0.j.f(j0Var, "subFlowType");
        this.subFlowType = j0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof t) && this.subFlowType == ((t) obj).subFlowType) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.subFlowType.hashCode();
    }

    public final String toString() {
        j0 j0Var = this.subFlowType;
        return "SubFlowTypeProperty(subFlowType=" + j0Var + ")";
    }
}
