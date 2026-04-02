package com.amazon.aps.iva.ei;
/* compiled from: MusicMediaCardItem.kt */
/* loaded from: classes.dex */
public final class j extends i {
    public final String a;

    public j(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "adapterId");
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof j) && com.amazon.aps.iva.yb0.j.a(this.a, ((j) obj).a)) {
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
        return defpackage.b.c(new StringBuilder("MusicMediaCardLoadingItem(adapterId="), this.a, ")");
    }
}
