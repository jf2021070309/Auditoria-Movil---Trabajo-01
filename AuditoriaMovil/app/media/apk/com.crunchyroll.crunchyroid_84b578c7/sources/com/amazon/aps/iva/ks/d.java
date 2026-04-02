package com.amazon.aps.iva.ks;

import com.amazon.aps.iva.js.k0;
import com.amazon.aps.iva.js.m0;
import java.util.List;
/* compiled from: ContentFiltersProperty.kt */
/* loaded from: classes2.dex */
public final class d extends com.amazon.aps.iva.is.a {
    private final com.amazon.aps.iva.js.d contentCategoryFilter;
    private final k0 subbedDubbedFilter;
    private final List<m0> userMediaFilter;

    /* JADX WARN: Multi-variable type inference failed */
    public d(com.amazon.aps.iva.js.d dVar, k0 k0Var, List<? extends m0> list) {
        com.amazon.aps.iva.yb0.j.f(dVar, "contentCategoryFilter");
        com.amazon.aps.iva.yb0.j.f(k0Var, "subbedDubbedFilter");
        this.contentCategoryFilter = dVar;
        this.subbedDubbedFilter = k0Var;
        this.userMediaFilter = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.contentCategoryFilter == dVar.contentCategoryFilter && this.subbedDubbedFilter == dVar.subbedDubbedFilter && com.amazon.aps.iva.yb0.j.a(this.userMediaFilter, dVar.userMediaFilter)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.subbedDubbedFilter.hashCode();
        return this.userMediaFilter.hashCode() + ((hashCode + (this.contentCategoryFilter.hashCode() * 31)) * 31);
    }

    public final String toString() {
        com.amazon.aps.iva.js.d dVar = this.contentCategoryFilter;
        k0 k0Var = this.subbedDubbedFilter;
        List<m0> list = this.userMediaFilter;
        StringBuilder sb = new StringBuilder("ContentFiltersProperty(contentCategoryFilter=");
        sb.append(dVar);
        sb.append(", subbedDubbedFilter=");
        sb.append(k0Var);
        sb.append(", userMediaFilter=");
        return com.amazon.aps.iva.oa.a.b(sb, list, ")");
    }
}
