package com.amazon.aps.iva.cg;

import com.amazon.aps.iva.cg.u;
/* compiled from: DeepLinkInput.kt */
/* loaded from: classes.dex */
public final class a extends e0 {
    public final com.amazon.aps.iva.dg.a c;
    public final String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.amazon.aps.iva.dg.a aVar, String str) {
        super(u.a.ARTIST_SCREEN, aVar);
        com.amazon.aps.iva.yb0.j.f(str, "id");
        this.c = aVar;
        this.d = str;
    }

    @Override // com.amazon.aps.iva.cg.e0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.c, aVar.c) && com.amazon.aps.iva.yb0.j.a(this.d, aVar.d)) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.cg.e0, com.amazon.aps.iva.cg.u
    public final com.amazon.aps.iva.dg.a getUri() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.cg.e0
    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }

    public final String toString() {
        return "ArtistDeepLinkRawInput(uri=" + this.c + ", id=" + this.d + ")";
    }
}
