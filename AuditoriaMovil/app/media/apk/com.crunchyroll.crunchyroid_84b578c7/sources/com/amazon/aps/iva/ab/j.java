package com.amazon.aps.iva.ab;

import androidx.annotation.RecentlyNonNull;
import com.android.billingclient.api.PurchaseHistoryRecord;
import java.util.List;
/* compiled from: com.android.billingclient:billing-ktx@@6.0.1 */
/* loaded from: classes.dex */
public final class j {
    public final com.android.billingclient.api.c a;
    public final List b;

    public j(@RecentlyNonNull com.android.billingclient.api.c cVar, List<? extends PurchaseHistoryRecord> list) {
        com.amazon.aps.iva.yb0.j.f(cVar, "billingResult");
        this.a = cVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, jVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, jVar.b)) {
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
        return "PurchaseHistoryResult(billingResult=" + this.a + ", purchaseHistoryRecordList=" + this.b + ")";
    }
}
