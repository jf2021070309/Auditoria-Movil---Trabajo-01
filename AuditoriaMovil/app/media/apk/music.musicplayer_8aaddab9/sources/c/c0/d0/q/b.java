package c.c0.d0.q;
/* loaded from: classes.dex */
public class b {
    public boolean a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f1449b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f1450c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1451d;

    public b(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.f1449b = z2;
        this.f1450c = z3;
        this.f1451d = z4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.a == bVar.a && this.f1449b == bVar.f1449b && this.f1450c == bVar.f1450c && this.f1451d == bVar.f1451d;
        }
        return false;
    }

    public int hashCode() {
        int i2 = this.a ? 1 : 0;
        if (this.f1449b) {
            i2 += 16;
        }
        if (this.f1450c) {
            i2 += 256;
        }
        return this.f1451d ? i2 + 4096 : i2;
    }

    public String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", Boolean.valueOf(this.a), Boolean.valueOf(this.f1449b), Boolean.valueOf(this.f1450c), Boolean.valueOf(this.f1451d));
    }
}
