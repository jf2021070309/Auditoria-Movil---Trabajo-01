package com.amazon.aps.iva.r10;

import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.model.PlayheadTimeProvider;
/* compiled from: HistoryItemUiModel.kt */
/* loaded from: classes2.dex */
public final class l extends a0 implements PlayheadTimeProvider {
    public final Panel a;
    public final boolean b;
    public final j0 c;
    public final String d;
    public final long e;

    static {
        int i = Panel.$stable;
    }

    public l(Panel panel, boolean z, j0 j0Var, String str, long j) {
        com.amazon.aps.iva.yb0.j.f(j0Var, "selectionMode");
        com.amazon.aps.iva.yb0.j.f(str, "adapterId");
        this.a = panel;
        this.b = z;
        this.c = j0Var;
        this.d = str;
        this.e = j;
    }

    public static l a(l lVar, j0 j0Var) {
        Panel panel = lVar.a;
        boolean z = lVar.b;
        String str = lVar.d;
        long j = lVar.e;
        lVar.getClass();
        com.amazon.aps.iva.yb0.j.f(panel, "panel");
        com.amazon.aps.iva.yb0.j.f(j0Var, "selectionMode");
        com.amazon.aps.iva.yb0.j.f(str, "adapterId");
        return new l(panel, z, j0Var, str, j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, lVar.a) && this.b == lVar.b && this.c == lVar.c && com.amazon.aps.iva.yb0.j.a(this.d, lVar.d) && this.e == lVar.e) {
            return true;
        }
        return false;
    }

    @Override // com.ellation.crunchyroll.ui.pagination.PaginationAdapterItem
    public final String getAdapterId() {
        return this.d;
    }

    @Override // com.amazon.aps.iva.r10.a0, com.ellation.crunchyroll.ui.pagination.PaginationAdapterItem
    public final String getContentId() {
        return this.a.getId();
    }

    @Override // com.ellation.crunchyroll.model.PlayheadTimeProvider
    public final long getPlayheadSec() {
        return this.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        boolean z = this.b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode2 = this.c.hashCode();
        return Long.hashCode(this.e) + com.amazon.aps.iva.c80.a.b(this.d, (hashCode2 + ((hashCode + i) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HistoryDataItemUiModel(panel=");
        sb.append(this.a);
        sb.append(", fullyWatched=");
        sb.append(this.b);
        sb.append(", selectionMode=");
        sb.append(this.c);
        sb.append(", adapterId=");
        sb.append(this.d);
        sb.append(", playheadSec=");
        return com.amazon.aps.iva.c.b.b(sb, this.e, ")");
    }
}
