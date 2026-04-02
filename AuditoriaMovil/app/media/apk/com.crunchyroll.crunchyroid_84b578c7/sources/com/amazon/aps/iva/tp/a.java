package com.amazon.aps.iva.tp;
/* compiled from: EventMeta.kt */
/* loaded from: classes2.dex */
public final class a {
    public final int a;

    public a(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof a) && this.a == ((a) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return defpackage.e.f(new StringBuilder("EventMeta(eventSize="), this.a, ")");
    }
}
