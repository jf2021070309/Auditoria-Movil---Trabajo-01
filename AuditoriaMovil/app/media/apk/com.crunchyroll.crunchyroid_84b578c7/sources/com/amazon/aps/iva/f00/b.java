package com.amazon.aps.iva.f00;
/* compiled from: PlayableAssetUiModel.kt */
/* loaded from: classes2.dex */
public final class b implements a {
    public final com.amazon.aps.iva.hg.c b;
    public final String c;

    public b() {
        this((com.amazon.aps.iva.hg.c) null, 3);
    }

    public final Object clone() {
        return super.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.b, bVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, bVar.c)) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.f00.a
    public final String getAdapterId() {
        return this.c;
    }

    public final int hashCode() {
        int hashCode;
        com.amazon.aps.iva.hg.c cVar = this.b;
        if (cVar == null) {
            hashCode = 0;
        } else {
            hashCode = cVar.hashCode();
        }
        return this.c.hashCode() + (hashCode * 31);
    }

    public final String toString() {
        return "AssetsToolsHeader(bulkDownloadStatus=" + this.b + ", adapterId=" + this.c + ")";
    }

    public /* synthetic */ b(com.amazon.aps.iva.hg.c cVar, int i) {
        this((i & 1) != 0 ? null : cVar, (i & 2) != 0 ? "tool_header" : null);
    }

    public b(com.amazon.aps.iva.hg.c cVar, String str) {
        com.amazon.aps.iva.yb0.j.f(str, "adapterId");
        this.b = cVar;
        this.c = str;
    }
}
