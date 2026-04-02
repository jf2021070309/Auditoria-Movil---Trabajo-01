package com.amazon.aps.iva.t9;
/* compiled from: SystemIdInfo.java */
/* loaded from: classes.dex */
public final class g {
    public final String a;
    public final int b;

    public g(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.b != gVar.b) {
            return false;
        }
        return this.a.equals(gVar.a);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }
}
