package com.amazon.aps.iva.o2;

import com.amazon.aps.iva.q.c0;
/* compiled from: Density.kt */
/* loaded from: classes.dex */
public final class d implements c {
    public final float b;
    public final float c;

    public d(float f, float f2) {
        this.b = f;
        this.c = f2;
    }

    @Override // com.amazon.aps.iva.o2.c
    public final float O0() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (Float.compare(this.b, dVar.b) == 0 && Float.compare(this.c, dVar.c) == 0) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.o2.c
    public final float getDensity() {
        return this.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + (Float.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DensityImpl(density=");
        sb.append(this.b);
        sb.append(", fontScale=");
        return c0.b(sb, this.c, ')');
    }
}
