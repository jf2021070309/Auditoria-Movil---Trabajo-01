package com.amazon.aps.iva.o3;
/* compiled from: Pair.java */
/* loaded from: classes.dex */
public final class c<F, S> {
    public final F a;
    public final S b;

    public c(F f, S s) {
        this.a = f;
        this.b = s;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!b.a(cVar.a, this.a) || !b.a(cVar.b, this.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        F f = this.a;
        if (f == null) {
            hashCode = 0;
        } else {
            hashCode = f.hashCode();
        }
        S s = this.b;
        if (s != null) {
            i = s.hashCode();
        }
        return i ^ hashCode;
    }

    public final String toString() {
        return "Pair{" + this.a + " " + this.b + "}";
    }
}
