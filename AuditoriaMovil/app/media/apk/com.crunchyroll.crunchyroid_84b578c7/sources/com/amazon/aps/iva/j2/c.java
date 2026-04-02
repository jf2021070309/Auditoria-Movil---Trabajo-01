package com.amazon.aps.iva.j2;

import com.amazon.aps.iva.yb0.j;
/* compiled from: Locale.kt */
/* loaded from: classes.dex */
public final class c {
    public final e a;

    public c(a aVar) {
        this.a = aVar;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return j.a(this.a.a(), ((c) obj).a.a());
    }

    public final int hashCode() {
        return this.a.a().hashCode();
    }

    public final String toString() {
        return this.a.a();
    }
}
