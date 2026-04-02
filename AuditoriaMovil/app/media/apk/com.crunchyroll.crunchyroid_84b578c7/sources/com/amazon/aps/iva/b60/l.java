package com.amazon.aps.iva.b60;

import com.amazon.aps.iva.j0.j0;
/* compiled from: WatchlistItemUiModel.kt */
/* loaded from: classes2.dex */
public final class l extends s {
    public final String a;

    public l() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof l) && com.amazon.aps.iva.yb0.j.a(this.a, ((l) obj).a)) {
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
        return defpackage.b.c(new StringBuilder("WatchlistEmptyItem(adapterId="), this.a, ")");
    }

    public l(int i) {
        this.a = j0.d("randomUUID().toString()");
    }
}
