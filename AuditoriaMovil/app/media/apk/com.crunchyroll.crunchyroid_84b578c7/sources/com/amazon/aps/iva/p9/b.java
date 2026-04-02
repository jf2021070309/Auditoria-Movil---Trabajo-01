package com.amazon.aps.iva.p9;
/* compiled from: NetworkState.java */
/* loaded from: classes.dex */
public final class b {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public b(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.a == bVar.a && this.b == bVar.b && this.c == bVar.c && this.d == bVar.d) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int, boolean] */
    public final int hashCode() {
        boolean z = this.b;
        ?? r1 = this.a;
        int i = r1;
        if (z) {
            i = r1 + 16;
        }
        int i2 = i;
        if (this.c) {
            i2 = i + 256;
        }
        if (this.d) {
            return i2 + 4096;
        }
        return i2;
    }

    public final String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", Boolean.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.d));
    }
}
