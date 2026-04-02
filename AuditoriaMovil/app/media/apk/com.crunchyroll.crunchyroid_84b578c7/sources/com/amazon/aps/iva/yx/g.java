package com.amazon.aps.iva.yx;

import com.ellation.crunchyroll.model.Panel;
/* compiled from: ContinueWatchingUiModel.kt */
/* loaded from: classes2.dex */
public final class g {
    public final Panel a;
    public final long b;
    public final boolean c;
    public final boolean d;

    static {
        int i = Panel.$stable;
    }

    public g(Panel panel, long j, boolean z, boolean z2) {
        this.a = panel;
        this.b = j;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, gVar.a) && this.b == gVar.b && this.c == gVar.c && this.d == gVar.d) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int a = com.amazon.aps.iva.b8.i.a(this.b, this.a.hashCode() * 31, 31);
        int i = 1;
        boolean z = this.c;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (a + i2) * 31;
        boolean z2 = this.d;
        if (!z2) {
            i = z2 ? 1 : 0;
        }
        return i3 + i;
    }

    public final String toString() {
        return "ContinueWatchingUiModel(panel=" + this.a + ", playheadSec=" + this.b + ", isFullyWatched=" + this.c + ", isNew=" + this.d + ")";
    }
}
