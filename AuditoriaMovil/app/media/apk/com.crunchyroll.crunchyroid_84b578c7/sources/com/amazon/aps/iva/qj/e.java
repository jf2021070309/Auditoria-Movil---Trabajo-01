package com.amazon.aps.iva.qj;

import com.amazon.aps.iva.o0.t1;
/* compiled from: PlayerSubtitleOption.kt */
/* loaded from: classes.dex */
public final class e implements h {
    public final String a;

    public e(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "languageTag");
        this.a = str;
    }

    @Override // com.amazon.aps.iva.qj.h
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        if (com.amazon.aps.iva.yb0.j.a(this.a, ((e) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return t1.b(new StringBuilder("PlayerClosedCaptionOption(languageTag="), this.a, ')');
    }
}
