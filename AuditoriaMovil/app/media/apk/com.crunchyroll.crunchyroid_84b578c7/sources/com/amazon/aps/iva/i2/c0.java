package com.amazon.aps.iva.i2;

import com.amazon.aps.iva.d0.b2;
/* compiled from: EditCommand.kt */
/* loaded from: classes.dex */
public final class c0 implements f {
    public final com.amazon.aps.iva.c2.b a;
    public final int b;

    public c0(String str, int i) {
        this.a = new com.amazon.aps.iva.c2.b(str, null, 6);
        this.b = i;
    }

    @Override // com.amazon.aps.iva.i2.f
    public final void a(i iVar) {
        boolean z;
        boolean z2;
        int length;
        boolean z3;
        com.amazon.aps.iva.yb0.j.f(iVar, "buffer");
        int i = iVar.d;
        int i2 = -1;
        if (i != -1) {
            z = true;
        } else {
            z = false;
        }
        com.amazon.aps.iva.c2.b bVar = this.a;
        if (z) {
            iVar.e(i, iVar.e, bVar.b);
            String str = bVar.b;
            if (str.length() > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                iVar.f(i, str.length() + i);
            }
        } else {
            int i3 = iVar.b;
            iVar.e(i3, iVar.c, bVar.b);
            String str2 = bVar.b;
            if (str2.length() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                iVar.f(i3, str2.length() + i3);
            }
        }
        int i4 = iVar.b;
        int i5 = iVar.c;
        if (i4 == i5) {
            i2 = i5;
        }
        int i6 = this.b;
        int i7 = i2 + i6;
        if (i6 > 0) {
            length = i7 - 1;
        } else {
            length = i7 - bVar.b.length();
        }
        int j = com.amazon.aps.iva.aq.j.j(length, 0, iVar.d());
        iVar.g(j, j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a.b, c0Var.a.b) && this.b == c0Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.b.hashCode() * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingTextCommand(text='");
        sb.append(this.a.b);
        sb.append("', newCursorPosition=");
        return b2.b(sb, this.b, ')');
    }
}
