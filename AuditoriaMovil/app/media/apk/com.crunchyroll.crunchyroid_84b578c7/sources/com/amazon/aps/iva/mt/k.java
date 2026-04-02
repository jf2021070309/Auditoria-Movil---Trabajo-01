package com.amazon.aps.iva.mt;
/* compiled from: ContinueWatchingCarousel.kt */
/* loaded from: classes2.dex */
public final class k {
    public final int a;
    public final boolean b;

    public k(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.a == kVar.a && this.b == kVar.b) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        boolean z = this.b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        return "ScrollPosition(index=" + this.a + ", forceScroll=" + this.b + ")";
    }
}
