package com.amazon.aps.iva.f50;

import com.amazon.aps.iva.a0.r;
import com.amazon.aps.iva.b60.k;
import com.amazon.aps.iva.yb0.j;
/* compiled from: WatchlistItemToRemove.kt */
/* loaded from: classes2.dex */
public final class e {
    public final k a;
    public final int b;
    public final com.amazon.aps.iva.fs.b c;

    public e(k kVar, int i, com.amazon.aps.iva.fs.b bVar) {
        j.f(kVar, "watchlistDataItemUiModel");
        j.f(bVar, "view");
        this.a = kVar;
        this.b = i;
        this.c = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (j.a(this.a, eVar.a) && this.b == eVar.b && j.a(this.c, eVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + r.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "WatchlistItemToRemove(watchlistDataItemUiModel=" + this.a + ", position=" + this.b + ", view=" + this.c + ")";
    }
}
