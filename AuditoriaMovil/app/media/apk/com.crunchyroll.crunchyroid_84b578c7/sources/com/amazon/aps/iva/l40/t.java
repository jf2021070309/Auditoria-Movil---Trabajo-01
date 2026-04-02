package com.amazon.aps.iva.l40;

import java.util.ArrayList;
import java.util.List;
/* compiled from: ShowPageSeasonOverflowMenuProvider.kt */
/* loaded from: classes2.dex */
public final class t {
    public final List<String> a;
    public final boolean b;

    public t(ArrayList arrayList, boolean z) {
        this.a = arrayList;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, tVar.a) && this.b == tVar.b) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        boolean z = this.b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        return "ShowPageOverflowMenuInput(seasonAssetIds=" + this.a + ", isAllFullyWatched=" + this.b + ")";
    }
}
