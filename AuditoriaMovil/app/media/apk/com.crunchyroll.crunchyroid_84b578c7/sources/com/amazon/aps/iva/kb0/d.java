package com.amazon.aps.iva.kb0;

import com.google.android.gms.cast.Cast;
/* compiled from: KotlinVersion.kt */
/* loaded from: classes4.dex */
public final class d implements Comparable<d> {
    public static final d f = new d(9, 10);
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public d() {
        throw null;
    }

    public d(int i, int i2) {
        boolean z = true;
        this.b = 1;
        this.c = i;
        this.d = i2;
        if ((new com.amazon.aps.iva.ec0.j(0, 255).j(1) && new com.amazon.aps.iva.ec0.j(0, 255).j(i) && new com.amazon.aps.iva.ec0.j(0, 255).j(i2)) ? z : false) {
            this.e = Cast.MAX_MESSAGE_LENGTH + (i << 8) + i2;
            return;
        }
        throw new IllegalArgumentException(("Version components are out of range: 1." + i + '.' + i2).toString());
    }

    @Override // java.lang.Comparable
    public final int compareTo(d dVar) {
        d dVar2 = dVar;
        com.amazon.aps.iva.yb0.j.f(dVar2, "other");
        return this.e - dVar2.e;
    }

    public final boolean equals(Object obj) {
        d dVar;
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            dVar = (d) obj;
        } else {
            dVar = null;
        }
        if (dVar != null && this.e == dVar.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        sb.append('.');
        sb.append(this.c);
        sb.append('.');
        sb.append(this.d);
        return sb.toString();
    }
}
