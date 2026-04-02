package l.c.a.w;

import java.io.Serializable;
/* loaded from: classes2.dex */
public final class n implements Serializable {
    public final long a;

    /* renamed from: b  reason: collision with root package name */
    public final long f9815b;

    /* renamed from: c  reason: collision with root package name */
    public final long f9816c;

    /* renamed from: d  reason: collision with root package name */
    public final long f9817d;

    public n(long j2, long j3, long j4, long j5) {
        this.a = j2;
        this.f9815b = j3;
        this.f9816c = j4;
        this.f9817d = j5;
    }

    public static n f(long j2, long j3) {
        if (j2 <= j3) {
            return new n(j2, j2, j3, j3);
        }
        throw new IllegalArgumentException("Minimum value must be less than maximum value");
    }

    public static n h(long j2, long j3, long j4) {
        return i(j2, j2, j3, j4);
    }

    public static n i(long j2, long j3, long j4, long j5) {
        if (j2 <= j3) {
            if (j4 <= j5) {
                if (j3 <= j5) {
                    return new n(j2, j3, j4, j5);
                }
                throw new IllegalArgumentException("Minimum value must be less than maximum value");
            }
            throw new IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
        }
        throw new IllegalArgumentException("Smallest minimum value must be less than largest minimum value");
    }

    public int a(long j2, i iVar) {
        long j3 = this.a;
        boolean z = false;
        if (j3 >= -2147483648L && this.f9817d <= 2147483647L) {
            if (j2 >= j3 && j2 <= this.f9817d) {
                z = true;
            }
        }
        if (z) {
            return (int) j2;
        }
        throw new l.c.a.a("Invalid int value for " + iVar + ": " + j2);
    }

    public long b(long j2, i iVar) {
        if (j2 >= this.a && j2 <= this.f9817d) {
            return j2;
        }
        if (iVar == null) {
            throw new l.c.a.a("Invalid value (valid values " + this + "): " + j2);
        }
        throw new l.c.a.a("Invalid value for " + iVar + " (valid values " + this + "): " + j2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            return this.a == nVar.a && this.f9815b == nVar.f9815b && this.f9816c == nVar.f9816c && this.f9817d == nVar.f9817d;
        }
        return false;
    }

    public int hashCode() {
        long j2 = this.a;
        long j3 = this.f9815b;
        long j4 = this.f9816c;
        long j5 = this.f9817d;
        long j6 = ((((((j2 + j3) << ((int) (j3 + 16))) >> ((int) (j4 + 48))) << ((int) (j4 + 32))) >> ((int) (32 + j5))) << ((int) (j5 + 48))) >> 16;
        return (int) (j6 ^ (j6 >>> 32));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        if (this.a != this.f9815b) {
            sb.append('/');
            sb.append(this.f9815b);
        }
        sb.append(" - ");
        sb.append(this.f9816c);
        if (this.f9816c != this.f9817d) {
            sb.append('/');
            sb.append(this.f9817d);
        }
        return sb.toString();
    }
}
