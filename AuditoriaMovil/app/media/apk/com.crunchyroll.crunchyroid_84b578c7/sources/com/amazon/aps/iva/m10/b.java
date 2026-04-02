package com.amazon.aps.iva.m10;
/* compiled from: GenreItemUiModel.kt */
/* loaded from: classes2.dex */
public final class b extends e {
    public final String c;
    public final String d;
    public final com.amazon.aps.iva.l10.a e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, String str2, com.amazon.aps.iva.l10.a aVar) {
        super(str, str2);
        com.amazon.aps.iva.yb0.j.f(str, "adapterId");
        com.amazon.aps.iva.yb0.j.f(str2, "contentId");
        this.c = str;
        this.d = str2;
        this.e = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.c, bVar.c) && com.amazon.aps.iva.yb0.j.a(this.d, bVar.d) && com.amazon.aps.iva.yb0.j.a(this.e, bVar.e)) {
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
        return this.e.hashCode() + com.amazon.aps.iva.c80.a.b(this.d, this.c.hashCode() * 31, 31);
    }

    public final String toString() {
        return "GenreDataItemUiModel(adapterId=" + this.c + ", contentId=" + this.d + ", genre=" + this.e + ")";
    }
}
