package com.amazon.aps.iva.hg;

import com.amazon.aps.iva.yb0.j;
/* compiled from: BulkDownloadStatusData.kt */
/* loaded from: classes.dex */
public final class f {
    public final g a;
    public final c b;
    public final d c;
    public final String d;

    public /* synthetic */ f() {
        throw null;
    }

    public f(g gVar, c cVar, d dVar, String str) {
        j.f(gVar, "input");
        j.f(cVar, "status");
        this.a = gVar;
        this.b = cVar;
        this.c = dVar;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (j.a(this.a, fVar.a) && j.a(this.b, fVar.b) && j.a(this.c, fVar.c) && j.a(this.d, fVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.b.hashCode();
        int hashCode3 = (this.c.hashCode() + ((hashCode2 + (this.a.hashCode() * 31)) * 31)) * 31;
        String str = this.d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode3 + hashCode;
    }

    public final String toString() {
        return "BulkDownloadStatusData(input=" + this.a + ", status=" + this.b + ", watchedInfo=" + this.c + ", audioLocale=" + this.d + ")";
    }
}
