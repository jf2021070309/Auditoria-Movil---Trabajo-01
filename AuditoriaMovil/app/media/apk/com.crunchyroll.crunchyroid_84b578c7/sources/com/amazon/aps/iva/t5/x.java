package com.amazon.aps.iva.t5;
/* compiled from: Size.java */
/* loaded from: classes.dex */
public final class x {
    public static final x c = new x(-1, -1);
    public final int a;
    public final int b;

    static {
        new x(0, 0);
    }

    public x(int i, int i2) {
        boolean z;
        if ((i != -1 && i < 0) || (i2 != -1 && i2 < 0)) {
            z = false;
        } else {
            z = true;
        }
        com.amazon.aps.iva.cq.b.t(z);
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (this.a != xVar.a || this.b != xVar.b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.a;
        return ((i >>> 16) | (i << 16)) ^ this.b;
    }

    public final String toString() {
        return this.a + "x" + this.b;
    }
}
