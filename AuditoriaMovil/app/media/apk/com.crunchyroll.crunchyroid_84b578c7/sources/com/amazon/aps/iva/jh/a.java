package com.amazon.aps.iva.jh;

import com.amazon.aps.iva.ee0.f1;
import java.util.List;
/* compiled from: LanguageOption.kt */
/* loaded from: classes.dex */
public final class a extends e {
    public final String b;
    public final List<String> c;

    public a(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "language");
        this.b = str;
        this.c = f1.J(str);
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
        if ((obj instanceof a) && com.amazon.aps.iva.yb0.j.a(this.b, ((a) obj).b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return defpackage.b.c(new StringBuilder("AudioFallbackOption(language="), this.b, ")");
    }
}
