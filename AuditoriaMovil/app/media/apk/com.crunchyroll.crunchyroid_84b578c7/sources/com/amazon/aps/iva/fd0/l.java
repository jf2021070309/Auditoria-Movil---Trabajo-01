package com.amazon.aps.iva.fd0;
/* compiled from: NullabilityQualifierWithMigrationStatus.kt */
/* loaded from: classes4.dex */
public final class l {
    public final k a;
    public final boolean b;

    public l(k kVar, boolean z) {
        com.amazon.aps.iva.yb0.j.f(kVar, "qualifier");
        this.a = kVar;
        this.b = z;
    }

    public static l a(l lVar, k kVar, boolean z, int i) {
        if ((i & 1) != 0) {
            kVar = lVar.a;
        }
        if ((i & 2) != 0) {
            z = lVar.b;
        }
        lVar.getClass();
        com.amazon.aps.iva.yb0.j.f(kVar, "qualifier");
        return new l(kVar, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.a == lVar.a && this.b == lVar.b) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        boolean z = this.b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NullabilityQualifierWithMigrationStatus(qualifier=");
        sb.append(this.a);
        sb.append(", isForWarningOnly=");
        return defpackage.a.b(sb, this.b, ')');
    }
}
