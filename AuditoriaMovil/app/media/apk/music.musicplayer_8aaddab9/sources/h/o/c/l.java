package h.o.c;
/* loaded from: classes2.dex */
public final class l implements c {
    public final Class<?> a;

    public l(Class<?> cls, String str) {
        j.e(cls, "jClass");
        j.e(str, "moduleName");
        this.a = cls;
    }

    @Override // h.o.c.c
    public Class<?> a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof l) && j.a(this.a, ((l) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return j.i(this.a.toString(), " (Kotlin reflection is not available)");
    }
}
