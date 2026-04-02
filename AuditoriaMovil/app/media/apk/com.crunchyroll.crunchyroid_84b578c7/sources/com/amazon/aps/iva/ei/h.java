package com.amazon.aps.iva.ei;
/* compiled from: MusicMediaCardItem.kt */
/* loaded from: classes.dex */
public final class h extends i {
    public final com.amazon.aps.iva.fi.a a;
    public final String b;

    public h(com.amazon.aps.iva.fi.a aVar, String str) {
        com.amazon.aps.iva.yb0.j.f(aVar, "data");
        com.amazon.aps.iva.yb0.j.f(str, "adapterId");
        this.a = aVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, hVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, hVar.b)) {
            return true;
        }
        return false;
    }

    @Override // com.ellation.crunchyroll.ui.pagination.PaginationAdapterItem
    public final String getAdapterId() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MusicMediaCardDataItem(data=" + this.a + ", adapterId=" + this.b + ")";
    }
}
