package com.amazon.aps.iva.ec0;

import com.amazon.aps.iva.aq.k;
/* compiled from: Progressions.kt */
/* loaded from: classes4.dex */
public class h implements Iterable<Integer>, com.amazon.aps.iva.zb0.a {
    public final int b;
    public final int c;
    public final int d;

    public h(int i, int i2, int i3) {
        if (i3 != 0) {
            if (i3 != Integer.MIN_VALUE) {
                this.b = i;
                this.c = k.p(i, i2, i3);
                this.d = i3;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    public boolean equals(Object obj) {
        if (obj instanceof h) {
            if (!isEmpty() || !((h) obj).isEmpty()) {
                h hVar = (h) obj;
                if (this.b != hVar.b || this.c != hVar.c || this.d != hVar.d) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    /* renamed from: g */
    public final i iterator() {
        return new i(this.b, this.c, this.d);
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.b * 31) + this.c) * 31) + this.d;
    }

    public boolean isEmpty() {
        int i = this.d;
        int i2 = this.c;
        int i3 = this.b;
        if (i > 0) {
            if (i3 > i2) {
                return true;
            }
        } else if (i3 < i2) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb;
        int i = this.c;
        int i2 = this.b;
        int i3 = this.d;
        if (i3 > 0) {
            sb = new StringBuilder();
            sb.append(i2);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i3);
        } else {
            sb = new StringBuilder();
            sb.append(i2);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i3);
        }
        return sb.toString();
    }
}
