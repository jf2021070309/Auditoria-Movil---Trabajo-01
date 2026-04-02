package com.amazon.aps.iva.yb0;
/* compiled from: PackageReference.kt */
/* loaded from: classes4.dex */
public final class r implements c {
    public final Class<?> b;

    public r(Class<?> cls, String str) {
        j.f(cls, "jClass");
        this.b = cls;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            if (j.a(this.b, ((r) obj).b)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.aps.iva.yb0.c
    public final Class<?> h() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return this.b.toString() + " (Kotlin reflection is not available)";
    }
}
