package com.amazon.aps.iva.cv;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
/* compiled from: CrunchylistUiModel.kt */
/* loaded from: classes2.dex */
public final class w {
    public final List<com.amazon.aps.iva.dv.a> a;
    public final int b;
    public final int c;
    public final boolean d;

    public w(boolean z, int i, int i2, List list) {
        com.amazon.aps.iva.yb0.j.f(list, FirebaseAnalytics.Param.ITEMS);
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    public static w a(w wVar, List list, int i, boolean z, int i2) {
        int i3;
        if ((i2 & 1) != 0) {
            list = wVar.a;
        }
        if ((i2 & 2) != 0) {
            i = wVar.b;
        }
        if ((i2 & 4) != 0) {
            i3 = wVar.c;
        } else {
            i3 = 0;
        }
        if ((i2 & 8) != 0) {
            z = wVar.d;
        }
        wVar.getClass();
        com.amazon.aps.iva.yb0.j.f(list, FirebaseAnalytics.Param.ITEMS);
        return new w(z, i, i3, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, wVar.a) && this.b == wVar.b && this.c == wVar.c && this.d == wVar.d) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int a = com.amazon.aps.iva.a0.r.a(this.c, com.amazon.aps.iva.a0.r.a(this.b, this.a.hashCode() * 31, 31), 31);
        boolean z = this.d;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return a + i;
    }

    public final String toString() {
        return "CrunchylistUiModel(items=" + this.a + ", total=" + this.b + ", max=" + this.c + ", isAddShowButtonEnabled=" + this.d + ")";
    }
}
