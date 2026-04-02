package com.amazon.aps.iva.i2;

import com.amazon.aps.iva.d0.b2;
/* compiled from: EditCommand.kt */
/* loaded from: classes.dex */
public final class d0 implements f {
    public final int a;
    public final int b;

    public d0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // com.amazon.aps.iva.i2.f
    public final void a(i iVar) {
        com.amazon.aps.iva.yb0.j.f(iVar, "buffer");
        int j = com.amazon.aps.iva.aq.j.j(this.a, 0, iVar.d());
        int j2 = com.amazon.aps.iva.aq.j.j(this.b, 0, iVar.d());
        if (j < j2) {
            iVar.g(j, j2);
        } else {
            iVar.g(j2, j);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        if (this.a == d0Var.a && this.b == d0Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetSelectionCommand(start=");
        sb.append(this.a);
        sb.append(", end=");
        return b2.b(sb, this.b, ')');
    }
}
