package com.amazon.aps.iva.hv;

import java.io.IOException;
/* compiled from: SearchAddToCrunchylistException.kt */
/* loaded from: classes2.dex */
public final class r extends Throwable {
    public final Throwable b;
    public final String c;
    public final String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(String str, String str2, IOException iOException) {
        super(iOException);
        com.amazon.aps.iva.yb0.j.f(str, "panelTitle");
        com.amazon.aps.iva.yb0.j.f(str2, "listTitle");
        this.b = iOException;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.b, rVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, rVar.c) && com.amazon.aps.iva.yb0.j.a(this.d, rVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + com.amazon.aps.iva.c80.a.b(this.c, this.b.hashCode() * 31, 31);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchAddToCrunchylistException(throwable=");
        sb.append(this.b);
        sb.append(", panelTitle=");
        sb.append(this.c);
        sb.append(", listTitle=");
        return defpackage.b.c(sb, this.d, ")");
    }
}
