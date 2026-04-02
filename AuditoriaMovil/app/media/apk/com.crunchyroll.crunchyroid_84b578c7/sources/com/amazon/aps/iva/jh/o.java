package com.amazon.aps.iva.jh;

import java.util.List;
/* compiled from: LanguageOption.kt */
/* loaded from: classes.dex */
public final class o extends e {
    public final String b;
    public final List<String> c;

    public o(String str, List<String> list) {
        com.amazon.aps.iva.yb0.j.f(str, "language");
        com.amazon.aps.iva.yb0.j.f(list, "fallbacks");
        this.b = str;
        this.c = list;
    }

    @Override // com.amazon.aps.iva.jh.e
    public final List<String> a() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.jh.e
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.b, oVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, oVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "SubtitleFallbackOption(language=" + this.b + ", fallbacks=" + this.c + ")";
    }
}
