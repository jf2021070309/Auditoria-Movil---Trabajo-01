package com.amazon.aps.iva.y;
/* compiled from: EnterExitTransition.kt */
/* loaded from: classes.dex */
public final class a0 {
    public final com.amazon.aps.iva.a1.a a;
    public final com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.o2.j, com.amazon.aps.iva.o2.j> b;
    public final com.amazon.aps.iva.z.z<com.amazon.aps.iva.o2.j> c;
    public final boolean d;

    public a0(com.amazon.aps.iva.z.z zVar, com.amazon.aps.iva.a1.a aVar, com.amazon.aps.iva.xb0.l lVar, boolean z) {
        this.a = aVar;
        this.b = lVar;
        this.c = zVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, a0Var.a) && com.amazon.aps.iva.yb0.j.a(this.b, a0Var.b) && com.amazon.aps.iva.yb0.j.a(this.c, a0Var.c) && this.d == a0Var.d) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = (this.c.hashCode() + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31;
        boolean z = this.d;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChangeSize(alignment=");
        sb.append(this.a);
        sb.append(", size=");
        sb.append(this.b);
        sb.append(", animationSpec=");
        sb.append(this.c);
        sb.append(", clip=");
        return defpackage.a.b(sb, this.d, ')');
    }
}
