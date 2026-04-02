package com.amazon.aps.iva.ec0;
/* compiled from: PrimitiveRanges.kt */
/* loaded from: classes4.dex */
public final class j extends h implements g<Integer> {
    public static final j e = new j(1, 0);

    public j(int i, int i2) {
        super(i, i2, 1);
    }

    @Override // com.amazon.aps.iva.ec0.g
    public final Integer d() {
        return Integer.valueOf(this.b);
    }

    @Override // com.amazon.aps.iva.ec0.g
    public final Integer e() {
        return Integer.valueOf(this.c);
    }

    @Override // com.amazon.aps.iva.ec0.h
    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            if (!isEmpty() || !((j) obj).isEmpty()) {
                j jVar = (j) obj;
                if (this.b == jVar.b) {
                    if (this.c == jVar.c) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.ec0.h
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.b * 31) + this.c;
    }

    @Override // com.amazon.aps.iva.ec0.h, com.amazon.aps.iva.ec0.g
    public final boolean isEmpty() {
        if (this.b > this.c) {
            return true;
        }
        return false;
    }

    public final boolean j(int i) {
        if (this.b <= i && i <= this.c) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.ec0.h
    public final String toString() {
        return this.b + ".." + this.c;
    }
}
