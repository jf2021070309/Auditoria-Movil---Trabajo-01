package com.amazon.aps.iva.t9;
/* compiled from: Preference.java */
/* loaded from: classes.dex */
public final class d {
    public final String a;
    public final Long b;

    public d(String str, long j) {
        this.a = str;
        this.b = Long.valueOf(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!this.a.equals(dVar.a)) {
            return false;
        }
        Long l = dVar.b;
        Long l2 = this.b;
        if (l2 != null) {
            return l2.equals(l);
        }
        if (l == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() * 31;
        Long l = this.b;
        if (l != null) {
            i = l.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }
}
