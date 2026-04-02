package com.amazon.aps.iva.ab;

import androidx.annotation.RecentlyNonNull;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.android.billingclient:billing-ktx@@6.0.1 */
/* loaded from: classes.dex */
public final class h {
    public final com.android.billingclient.api.c a;
    public final List b;

    public h(@RecentlyNonNull com.android.billingclient.api.c cVar, ArrayList arrayList) {
        com.amazon.aps.iva.yb0.j.f(cVar, "billingResult");
        this.a = cVar;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, hVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, hVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        List list = this.b;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "ProductDetailsResult(billingResult=" + this.a + ", productDetailsList=" + this.b + ")";
    }
}
