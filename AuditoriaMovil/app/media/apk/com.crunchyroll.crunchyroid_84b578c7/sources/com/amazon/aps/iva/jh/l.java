package com.amazon.aps.iva.jh;
/* compiled from: LanguageOption.kt */
/* loaded from: classes.dex */
public final class l extends f {
    public final String c;
    public final String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String str, String str2) {
        super(str2);
        com.amazon.aps.iva.yb0.j.f(str, "language");
        this.c = str;
        this.d = str2;
    }

    @Override // com.amazon.aps.iva.jh.f
    public final String a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.c, lVar.c) && com.amazon.aps.iva.yb0.j.a(this.d, lVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.c.hashCode() * 31;
        String str = this.d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PreferredAudioOption(language=");
        sb.append(this.c);
        sb.append(", title=");
        return defpackage.b.c(sb, this.d, ")");
    }
}
