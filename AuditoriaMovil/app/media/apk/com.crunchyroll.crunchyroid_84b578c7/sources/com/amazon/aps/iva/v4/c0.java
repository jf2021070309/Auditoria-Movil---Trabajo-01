package com.amazon.aps.iva.v4;
/* compiled from: LazyFieldLite.java */
/* loaded from: classes.dex */
public class c0 {
    public volatile p0 a;
    public volatile h b;

    static {
        o.a();
    }

    public final p0 a(p0 p0Var) {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    try {
                        this.a = p0Var;
                        this.b = h.c;
                    } catch (z unused) {
                        this.a = p0Var;
                        this.b = h.c;
                    }
                }
            }
        }
        return this.a;
    }

    public final h b() {
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            if (this.b != null) {
                return this.b;
            }
            if (this.a == null) {
                this.b = h.c;
            } else {
                this.b = this.a.toByteString();
            }
            return this.b;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        p0 p0Var = this.a;
        p0 p0Var2 = c0Var.a;
        if (p0Var == null && p0Var2 == null) {
            return b().equals(c0Var.b());
        }
        if (p0Var != null && p0Var2 != null) {
            return p0Var.equals(p0Var2);
        }
        if (p0Var != null) {
            return p0Var.equals(c0Var.a(p0Var.a()));
        }
        return a(p0Var2.a()).equals(p0Var2);
    }

    public int hashCode() {
        return 1;
    }
}
