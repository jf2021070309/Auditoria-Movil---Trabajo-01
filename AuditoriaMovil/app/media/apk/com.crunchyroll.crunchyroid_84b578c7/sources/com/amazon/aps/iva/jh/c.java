package com.amazon.aps.iva.jh;
/* compiled from: LanguageOption.kt */
/* loaded from: classes.dex */
public final class c extends f {
    public final String c;
    public final String d;
    public final String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str, String str2, String str3) {
        super(str);
        com.amazon.aps.iva.yb0.j.f(str, "title");
        com.amazon.aps.iva.yb0.j.f(str2, "language");
        com.amazon.aps.iva.yb0.j.f(str3, "id");
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    @Override // com.amazon.aps.iva.jh.f
    public final String a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.c, cVar.c) && com.amazon.aps.iva.yb0.j.a(this.d, cVar.d) && com.amazon.aps.iva.yb0.j.a(this.e, cVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + com.amazon.aps.iva.c80.a.b(this.d, this.c.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChromecastOption(title=");
        sb.append(this.c);
        sb.append(", language=");
        sb.append(this.d);
        sb.append(", id=");
        return defpackage.b.c(sb, this.e, ")");
    }
}
