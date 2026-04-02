package com.amazon.aps.iva.mn;

import java.util.List;
/* compiled from: SortAndFiltersInteractor.kt */
/* loaded from: classes2.dex */
public final class o {
    public final m a;
    public final n b;

    public o(m mVar, n nVar) {
        com.amazon.aps.iva.yb0.j.f(mVar, "option");
        this.a = mVar;
        this.b = nVar;
        if (nVar == null && (!mVar.getOrderOptions().isEmpty())) {
            List<n> orderOptions = mVar.getOrderOptions();
            throw new IllegalArgumentException("Null order has been provided when the option " + mVar + " expects one of the " + orderOptions + " values");
        } else if (nVar != null && !mVar.getOrderOptions().contains(nVar)) {
            throw new IllegalArgumentException("Unexpected " + nVar + " order value has been provided for " + mVar + " option");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, oVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, oVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        n nVar = this.b;
        if (nVar == null) {
            hashCode = 0;
        } else {
            hashCode = nVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "Sorting(option=" + this.a + ", order=" + this.b + ")";
    }
}
