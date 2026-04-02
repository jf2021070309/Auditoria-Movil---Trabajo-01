package com.amazon.aps.iva.e4;
/* compiled from: LazyFieldLite.java */
/* loaded from: classes.dex */
public class d0 {
    public volatile q0 a;
    public volatile i b;

    static {
        p.a();
    }

    public final q0 a(q0 q0Var) {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    try {
                        this.a = q0Var;
                        this.b = i.c;
                    } catch (a0 unused) {
                        this.a = q0Var;
                        this.b = i.c;
                    }
                }
            }
        }
        return this.a;
    }

    public final i b() {
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            if (this.b != null) {
                return this.b;
            }
            if (this.a == null) {
                this.b = i.c;
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
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        q0 q0Var = this.a;
        q0 q0Var2 = d0Var.a;
        if (q0Var == null && q0Var2 == null) {
            return b().equals(d0Var.b());
        }
        if (q0Var != null && q0Var2 != null) {
            return q0Var.equals(q0Var2);
        }
        if (q0Var != null) {
            return q0Var.equals(d0Var.a(q0Var.a()));
        }
        return a(q0Var2.a()).equals(q0Var2);
    }

    public int hashCode() {
        return 1;
    }
}
