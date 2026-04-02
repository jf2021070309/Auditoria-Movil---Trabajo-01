package com.amazon.aps.iva.ic;

import com.amazon.aps.iva.yb0.j;
/* compiled from: Flows.kt */
/* loaded from: classes.dex */
public final class e extends com.amazon.aps.iva.ab.a {
    public final h a;

    public e(h hVar) {
        this.a = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof e) && j.a(this.a, ((e) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ImmediateGlideSize(size=" + this.a + ')';
    }
}
