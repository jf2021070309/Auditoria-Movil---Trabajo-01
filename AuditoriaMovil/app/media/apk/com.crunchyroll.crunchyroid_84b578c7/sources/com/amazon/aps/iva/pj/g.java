package com.amazon.aps.iva.pj;
/* compiled from: Events.kt */
/* loaded from: classes.dex */
public final class g implements a {
    public final long a;

    public g(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof g) && this.a == ((g) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "PlayheadSetEvent(playheadSec=" + this.a + ')';
    }
}
