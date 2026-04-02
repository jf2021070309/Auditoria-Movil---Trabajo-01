package com.amazon.aps.iva.tz;

import com.ellation.crunchyroll.model.browse.BrowseSectionItem;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
/* compiled from: BrowseAllInteractor.kt */
/* loaded from: classes2.dex */
public final class a1 {
    public final List<BrowseSectionItem> a;
    public final int b;

    public a1(List<BrowseSectionItem> list, int i) {
        com.amazon.aps.iva.yb0.j.f(list, FirebaseAnalytics.Param.ITEMS);
        this.a = list;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, a1Var.a) && this.b == a1Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BrowseSectionItemModel(items=" + this.a + ", total=" + this.b + ")";
    }
}
