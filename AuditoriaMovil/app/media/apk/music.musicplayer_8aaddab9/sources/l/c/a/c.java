package l.c.a;

import ch.qos.logback.core.CoreConstants;
import e.j.d.w;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.regex.Pattern;
/* loaded from: classes2.dex */
public final class c implements Comparable<c>, Serializable {
    public static final c a = new c(0, 0);

    /* renamed from: b  reason: collision with root package name */
    public final long f9672b;

    /* renamed from: c  reason: collision with root package name */
    public final int f9673c;

    static {
        BigInteger.valueOf(1000000000L);
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)D)?(T(?:([-+]?[0-9]+)H)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)(?:[.,]([0-9]{0,9}))?S)?)?", 2);
    }

    public c(long j2, int i2) {
        this.f9672b = j2;
        this.f9673c = i2;
    }

    public static c a(long j2, int i2) {
        return (((long) i2) | j2) == 0 ? a : new c(j2, i2);
    }

    public static c b(long j2) {
        long j3 = j2 / 1000000000;
        int i2 = (int) (j2 % 1000000000);
        if (i2 < 0) {
            i2 += 1000000000;
            j3--;
        }
        return a(j3, i2);
    }

    public static c f(long j2) {
        return a(j2, 0);
    }

    public static c h(long j2, long j3) {
        return a(w.n0(j2, w.G(j3, 1000000000L)), w.H(j3, 1000000000));
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new m((byte) 1, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(c cVar) {
        c cVar2 = cVar;
        int u = w.u(this.f9672b, cVar2.f9672b);
        return u != 0 ? u : this.f9673c - cVar2.f9673c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return this.f9672b == cVar.f9672b && this.f9673c == cVar.f9673c;
        }
        return false;
    }

    public int hashCode() {
        long j2 = this.f9672b;
        return (this.f9673c * 51) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        if (this == a) {
            return "PT0S";
        }
        long j2 = this.f9672b;
        long j3 = j2 / 3600;
        int i2 = (int) ((j2 % 3600) / 60);
        int i3 = (int) (j2 % 60);
        StringBuilder v = e.a.d.a.a.v(24, "PT");
        if (j3 != 0) {
            v.append(j3);
            v.append('H');
        }
        if (i2 != 0) {
            v.append(i2);
            v.append('M');
        }
        if (i3 == 0 && this.f9673c == 0 && v.length() > 2) {
            return v.toString();
        }
        if (i3 >= 0 || this.f9673c <= 0) {
            v.append(i3);
        } else if (i3 == -1) {
            v.append("-0");
        } else {
            v.append(i3 + 1);
        }
        if (this.f9673c > 0) {
            int length = v.length();
            if (i3 < 0) {
                v.append(2000000000 - this.f9673c);
            } else {
                v.append(this.f9673c + 1000000000);
            }
            while (v.charAt(v.length() - 1) == '0') {
                v.setLength(v.length() - 1);
            }
            v.setCharAt(length, CoreConstants.DOT);
        }
        v.append('S');
        return v.toString();
    }
}
