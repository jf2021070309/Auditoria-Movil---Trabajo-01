package com.amazon.aps.iva.d0;
/* compiled from: RowColumnImpl.kt */
/* loaded from: classes.dex */
public final class u1 {
    public float a;
    public boolean b;
    public q c;

    public u1() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1)) {
            return false;
        }
        u1 u1Var = (u1) obj;
        if (Float.compare(this.a, u1Var.a) == 0 && this.b == u1Var.b && com.amazon.aps.iva.yb0.j.a(this.c, u1Var.c)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2 = Float.hashCode(this.a) * 31;
        boolean z = this.b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode2 + i) * 31;
        q qVar = this.c;
        if (qVar == null) {
            hashCode = 0;
        } else {
            hashCode = qVar.hashCode();
        }
        return i2 + hashCode;
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.a + ", fill=" + this.b + ", crossAxisAlignment=" + this.c + ')';
    }

    public u1(int i) {
        this.a = 0.0f;
        this.b = true;
        this.c = null;
    }
}
