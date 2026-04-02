package com.amazon.aps.iva.hg;

import com.amazon.aps.iva.yb0.j;
/* compiled from: BulkDownload.kt */
/* loaded from: classes.dex */
public final class b implements a {
    public final String b;
    public final String c;

    public b(String str) {
        j.f(str, "containerId");
        this.b = str;
        this.c = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (j.a(this.b, bVar.b) && j.a(this.c, bVar.c)) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.hg.a
    public final String getSeasonId() {
        return this.c;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.b.hashCode() * 31;
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    @Override // com.amazon.aps.iva.hg.a
    public final String k0() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BulkDownloadMetadata(containerId=");
        sb.append(this.b);
        sb.append(", seasonId=");
        return defpackage.b.c(sb, this.c, ")");
    }
}
