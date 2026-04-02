package com.amazon.aps.iva.yu;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
/* compiled from: CrunchylistsUiModel.kt */
/* loaded from: classes2.dex */
public final class x {
    public final List<com.amazon.aps.iva.nv.b> a;
    public final int b;

    /* JADX WARN: Multi-variable type inference failed */
    public x(List<? extends com.amazon.aps.iva.nv.b> list, int i) {
        com.amazon.aps.iva.yb0.j.f(list, FirebaseAnalytics.Param.ITEMS);
        this.a = list;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, xVar.a) && this.b == xVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CrunchylistsUiModel(items=" + this.a + ", maxPrivate=" + this.b + ")";
    }
}
