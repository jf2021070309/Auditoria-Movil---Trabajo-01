package com.amazon.aps.iva.r10;
/* compiled from: HistoryItemUiModel.kt */
/* loaded from: classes2.dex */
public final class m extends a0 {
    public final String a;

    public m() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof m) && com.amazon.aps.iva.yb0.j.a(this.a, ((m) obj).a)) {
            return true;
        }
        return false;
    }

    @Override // com.ellation.crunchyroll.ui.pagination.PaginationAdapterItem
    public final String getAdapterId() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return defpackage.b.c(new StringBuilder("HistoryEmptyItemUiModel(adapterId="), this.a, ")");
    }

    public m(int i) {
        this.a = com.amazon.aps.iva.j0.j0.d("randomUUID().toString()");
    }
}
