package h;

import ch.qos.logback.core.CoreConstants;
/* loaded from: classes2.dex */
public final class c implements Comparable<c> {
    public static final c a = new c(1, 6, 10);

    /* renamed from: b  reason: collision with root package name */
    public final int f8921b;

    /* renamed from: c  reason: collision with root package name */
    public final int f8922c;

    /* renamed from: d  reason: collision with root package name */
    public final int f8923d;

    /* renamed from: e  reason: collision with root package name */
    public final int f8924e;

    public c(int i2, int i3, int i4) {
        this.f8921b = i2;
        this.f8922c = i3;
        this.f8923d = i4;
        boolean z = false;
        if (i2 >= 0 && i2 < 256) {
            if (i3 >= 0 && i3 < 256) {
                if (i4 >= 0 && i4 < 256) {
                    z = true;
                }
            }
        }
        if (z) {
            this.f8924e = (i2 << 16) + (i3 << 8) + i4;
            return;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i2 + CoreConstants.DOT + i3 + CoreConstants.DOT + i4).toString());
    }

    @Override // java.lang.Comparable
    public int compareTo(c cVar) {
        c cVar2 = cVar;
        h.o.c.j.e(cVar2, "other");
        return this.f8924e - cVar2.f8924e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        c cVar = obj instanceof c ? (c) obj : null;
        return cVar != null && this.f8924e == cVar.f8924e;
    }

    public int hashCode() {
        return this.f8924e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f8921b);
        sb.append(CoreConstants.DOT);
        sb.append(this.f8922c);
        sb.append(CoreConstants.DOT);
        sb.append(this.f8923d);
        return sb.toString();
    }
}
