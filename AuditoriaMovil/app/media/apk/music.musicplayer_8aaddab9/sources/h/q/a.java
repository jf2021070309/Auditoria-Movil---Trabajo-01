package h.q;

import ch.qos.logback.classic.pattern.CallerDataConverter;
import e.j.d.w;
import java.util.Iterator;
/* loaded from: classes2.dex */
public class a implements Iterable<Integer> {
    public final int a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8950b;

    /* renamed from: c  reason: collision with root package name */
    public final int f8951c;

    public a(int i2, int i3, int i4) {
        if (i4 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i4 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.a = i2;
        if (i4 > 0) {
            if (i2 < i3) {
                i3 -= w.c0(w.c0(i3, i4) - w.c0(i2, i4), i4);
            }
        } else if (i4 >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        } else {
            if (i2 > i3) {
                int i5 = -i4;
                i3 += w.c0(w.c0(i2, i5) - w.c0(i3, i5), i5);
            }
        }
        this.f8950b = i3;
        this.f8951c = i4;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            if (!isEmpty() || !((a) obj).isEmpty()) {
                a aVar = (a) obj;
                if (this.a != aVar.a || this.f8950b != aVar.f8950b || this.f8951c != aVar.f8951c) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.a * 31) + this.f8950b) * 31) + this.f8951c;
    }

    public boolean isEmpty() {
        if (this.f8951c > 0) {
            if (this.a > this.f8950b) {
                return true;
            }
        } else if (this.a < this.f8950b) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    public Iterator<Integer> iterator() {
        return new b(this.a, this.f8950b, this.f8951c);
    }

    public String toString() {
        StringBuilder sb;
        int i2;
        if (this.f8951c > 0) {
            sb = new StringBuilder();
            sb.append(this.a);
            sb.append(CallerDataConverter.DEFAULT_RANGE_DELIMITER);
            sb.append(this.f8950b);
            sb.append(" step ");
            i2 = this.f8951c;
        } else {
            sb = new StringBuilder();
            sb.append(this.a);
            sb.append(" downTo ");
            sb.append(this.f8950b);
            sb.append(" step ");
            i2 = -this.f8951c;
        }
        sb.append(i2);
        return sb.toString();
    }
}
