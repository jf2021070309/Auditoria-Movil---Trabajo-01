package com.amazon.aps.iva.ae0;
/* compiled from: IncompatibleVersionErrorData.kt */
/* loaded from: classes4.dex */
public final class u<T> {
    public final T a;
    public final T b;
    public final T c;
    public final T d;
    public final String e;
    public final com.amazon.aps.iva.nd0.b f;

    /* JADX WARN: Multi-variable type inference failed */
    public u(com.amazon.aps.iva.md0.e eVar, com.amazon.aps.iva.md0.e eVar2, com.amazon.aps.iva.md0.e eVar3, com.amazon.aps.iva.md0.e eVar4, String str, com.amazon.aps.iva.nd0.b bVar) {
        com.amazon.aps.iva.yb0.j.f(str, "filePath");
        com.amazon.aps.iva.yb0.j.f(bVar, "classId");
        this.a = eVar;
        this.b = eVar2;
        this.c = eVar3;
        this.d = eVar4;
        this.e = str;
        this.f = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, uVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, uVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, uVar.c) && com.amazon.aps.iva.yb0.j.a(this.d, uVar.d) && com.amazon.aps.iva.yb0.j.a(this.e, uVar.e) && com.amazon.aps.iva.yb0.j.a(this.f, uVar.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int i = 0;
        T t = this.a;
        if (t == null) {
            hashCode = 0;
        } else {
            hashCode = t.hashCode();
        }
        int i2 = hashCode * 31;
        T t2 = this.b;
        if (t2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = t2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        T t3 = this.c;
        if (t3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = t3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        T t4 = this.d;
        if (t4 != null) {
            i = t4.hashCode();
        }
        return this.f.hashCode() + com.amazon.aps.iva.c80.a.b(this.e, (i4 + i) * 31, 31);
    }

    public final String toString() {
        return "IncompatibleVersionErrorData(actualVersion=" + this.a + ", compilerVersion=" + this.b + ", languageVersion=" + this.c + ", expectedVersion=" + this.d + ", filePath=" + this.e + ", classId=" + this.f + ')';
    }
}
