package com.amazon.aps.iva.m10;
/* compiled from: GenreItemUiModel.kt */
/* loaded from: classes2.dex */
public final class d extends e {
    public final String c;
    public final String d;

    public d(String str) {
        super(str, "");
        this.c = str;
        this.d = "";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.c, dVar.c) && com.amazon.aps.iva.yb0.j.a(this.d, dVar.d)) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.m10.e, com.ellation.crunchyroll.ui.pagination.PaginationAdapterItem
    public final String getAdapterId() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.m10.e, com.ellation.crunchyroll.ui.pagination.PaginationAdapterItem
    public final String getContentId() {
        return this.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GenreEmptyItem(adapterId=");
        sb.append(this.c);
        sb.append(", contentId=");
        return defpackage.b.c(sb, this.d, ")");
    }
}
