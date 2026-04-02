package com.amazon.aps.iva.ec0;
/* compiled from: Ranges.kt */
/* loaded from: classes4.dex */
public final class e implements f<Float> {
    public final float b;
    public final float c;

    public e(float f, float f2) {
        this.b = f;
        this.c = f2;
    }

    @Override // com.amazon.aps.iva.ec0.f
    public final boolean b(Float f, Float f2) {
        if (f.floatValue() <= f2.floatValue()) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.ec0.g
    public final Comparable d() {
        return Float.valueOf(this.b);
    }

    @Override // com.amazon.aps.iva.ec0.g
    public final Comparable e() {
        return Float.valueOf(this.c);
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (!(obj instanceof e)) {
            return false;
        }
        if (!isEmpty() || !((e) obj).isEmpty()) {
            e eVar = (e) obj;
            if (this.b == eVar.b) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return false;
            }
            if (this.c == eVar.c) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Float.hashCode(this.b) * 31) + Float.hashCode(this.c);
    }

    @Override // com.amazon.aps.iva.ec0.g
    public final boolean isEmpty() {
        if (this.b > this.c) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return this.b + ".." + this.c;
    }
}
