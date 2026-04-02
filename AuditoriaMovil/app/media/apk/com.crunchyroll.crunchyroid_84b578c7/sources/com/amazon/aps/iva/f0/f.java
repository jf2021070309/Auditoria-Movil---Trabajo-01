package com.amazon.aps.iva.f0;

import com.amazon.aps.iva.d0.b2;
/* compiled from: LazyLayoutBeyondBoundsInfo.kt */
/* loaded from: classes.dex */
public final class f {
    public final com.amazon.aps.iva.p0.f<a> a = new com.amazon.aps.iva.p0.f<>(new a[16]);

    /* compiled from: LazyLayoutBeyondBoundsInfo.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public final int a;
        public final int b;

        public a(int i, int i2) {
            boolean z;
            this.a = i;
            this.b = i2;
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (i2 >= i) {
                    return;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.a == aVar.a && this.b == aVar.b) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Interval(start=");
            sb.append(this.a);
            sb.append(", end=");
            return b2.b(sb, this.b, ')');
        }
    }
}
