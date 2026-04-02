package com.amazon.aps.iva.qj;

import com.amazon.aps.iva.o0.t1;
/* compiled from: PlayerSubtitleOption.kt */
/* loaded from: classes.dex */
public final class g implements h {
    public final String a;
    public final String b;

    public g(String str, String str2) {
        com.amazon.aps.iva.yb0.j.f(str, "languageTag");
        com.amazon.aps.iva.yb0.j.f(str2, "uri");
        this.a = str;
        this.b = str2;
    }

    @Override // com.amazon.aps.iva.qj.h
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, gVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, gVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayerExternalSubtitleOption(languageTag=");
        sb.append(this.a);
        sb.append(", uri=");
        return t1.b(sb, this.b, ')');
    }
}
