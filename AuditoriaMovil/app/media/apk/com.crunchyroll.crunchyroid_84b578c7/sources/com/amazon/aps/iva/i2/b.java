package com.amazon.aps.iva.i2;

import com.amazon.aps.iva.d0.b2;
/* compiled from: EditCommand.kt */
/* loaded from: classes.dex */
public final class b implements f {
    public final com.amazon.aps.iva.c2.b a;
    public final int b;

    public b(com.amazon.aps.iva.c2.b bVar, int i) {
        com.amazon.aps.iva.yb0.j.f(bVar, "annotatedString");
        this.a = bVar;
        this.b = i;
    }

    @Override // com.amazon.aps.iva.i2.f
    public final void a(i iVar) {
        boolean z;
        int length;
        com.amazon.aps.iva.yb0.j.f(iVar, "buffer");
        int i = iVar.d;
        if (i != -1) {
            z = true;
        } else {
            z = false;
        }
        com.amazon.aps.iva.c2.b bVar = this.a;
        if (z) {
            iVar.e(i, iVar.e, bVar.b);
        } else {
            iVar.e(iVar.b, iVar.c, bVar.b);
        }
        int i2 = iVar.b;
        int i3 = iVar.c;
        if (i2 != i3) {
            i3 = -1;
        }
        int i4 = this.b;
        int i5 = i3 + i4;
        if (i4 > 0) {
            length = i5 - 1;
        } else {
            length = i5 - bVar.b.length();
        }
        int j = com.amazon.aps.iva.aq.j.j(length, 0, iVar.d());
        iVar.g(j, j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a.b, bVar.a.b) && this.b == bVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.b.hashCode() * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommitTextCommand(text='");
        sb.append(this.a.b);
        sb.append("', newCursorPosition=");
        return b2.b(sb, this.b, ')');
    }

    public b(String str, int i) {
        this(new com.amazon.aps.iva.c2.b(str, null, 6), i);
    }
}
