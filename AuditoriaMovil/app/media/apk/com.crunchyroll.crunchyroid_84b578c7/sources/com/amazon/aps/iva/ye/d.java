package com.amazon.aps.iva.ye;
/* compiled from: CastStateProvider.kt */
/* loaded from: classes.dex */
public final class d {
    public final e a;

    public d(e eVar) {
        com.amazon.aps.iva.yb0.j.f(eVar, "type");
        this.a = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof d) && this.a == ((d) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CastStateChangeEvent(type=" + this.a + ")";
    }
}
