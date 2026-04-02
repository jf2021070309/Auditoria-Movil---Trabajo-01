package com.amazon.aps.iva.c2;

import com.amazon.aps.iva.o0.t1;
/* compiled from: TtsAnnotation.kt */
/* loaded from: classes.dex */
public final class e0 extends c0 {
    public final String a;

    public e0(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "verbatim");
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        if (com.amazon.aps.iva.yb0.j.a(this.a, ((e0) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return t1.b(new StringBuilder("VerbatimTtsAnnotation(verbatim="), this.a, ')');
    }
}
