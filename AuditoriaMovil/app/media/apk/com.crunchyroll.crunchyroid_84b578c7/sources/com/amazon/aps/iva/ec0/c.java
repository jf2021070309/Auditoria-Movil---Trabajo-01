package com.amazon.aps.iva.ec0;
/* compiled from: PrimitiveRanges.kt */
/* loaded from: classes4.dex */
public final class c extends a implements g<Character> {
    static {
        new c((char) 1, (char) 0);
    }

    @Override // com.amazon.aps.iva.ec0.g
    public final Character d() {
        return Character.valueOf(this.b);
    }

    @Override // com.amazon.aps.iva.ec0.g
    public final Character e() {
        return Character.valueOf(this.c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (this.b == cVar.b) {
                    if (this.c == cVar.c) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.b * 31) + this.c;
    }

    @Override // com.amazon.aps.iva.ec0.g
    public final boolean isEmpty() {
        if (com.amazon.aps.iva.yb0.j.h(this.b, this.c) > 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return this.b + ".." + this.c;
    }
}
