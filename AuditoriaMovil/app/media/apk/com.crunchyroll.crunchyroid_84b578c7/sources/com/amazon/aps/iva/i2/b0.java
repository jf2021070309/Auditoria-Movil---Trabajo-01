package com.amazon.aps.iva.i2;

import com.amazon.aps.iva.d0.b2;
/* compiled from: EditCommand.kt */
/* loaded from: classes.dex */
public final class b0 implements f {
    public final int a;
    public final int b;

    public b0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // com.amazon.aps.iva.i2.f
    public final void a(i iVar) {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(iVar, "buffer");
        if (iVar.d != -1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            iVar.d = -1;
            iVar.e = -1;
        }
        int j = com.amazon.aps.iva.aq.j.j(this.a, 0, iVar.d());
        int j2 = com.amazon.aps.iva.aq.j.j(this.b, 0, iVar.d());
        if (j != j2) {
            if (j < j2) {
                iVar.f(j, j2);
            } else {
                iVar.f(j2, j);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        if (this.a == b0Var.a && this.b == b0Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingRegionCommand(start=");
        sb.append(this.a);
        sb.append(", end=");
        return b2.b(sb, this.b, ')');
    }
}
