package bo.app;
/* loaded from: classes.dex */
public final class t4 implements g2 {
    private final s1 a;
    private final int b;
    private final String c;
    private final String d;

    public t4(s1 s1Var, int i, String str, String str2) {
        com.amazon.aps.iva.yb0.j.f(s1Var, "originalRequest");
        this.a = s1Var;
        this.b = i;
        this.c = str;
        this.d = str2;
    }

    @Override // bo.app.g2
    public String a() {
        return this.d;
    }

    public s1 b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }

    public String d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t4)) {
            return false;
        }
        t4 t4Var = (t4) obj;
        if (com.amazon.aps.iva.yb0.j.a(b(), t4Var.b()) && c() == t4Var.c() && com.amazon.aps.iva.yb0.j.a(d(), t4Var.d()) && com.amazon.aps.iva.yb0.j.a(a(), t4Var.a())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (Integer.hashCode(c()) + (b().hashCode() * 31)) * 31;
        int i = 0;
        if (d() == null) {
            hashCode = 0;
        } else {
            hashCode = d().hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        if (a() != null) {
            i = a().hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        return "{code = " + c() + ", reason = " + d() + ", message = " + a() + '}';
    }
}
