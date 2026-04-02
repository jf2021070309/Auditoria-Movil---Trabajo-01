package com.amazon.aps.iva.i2;

import com.amazon.aps.iva.d0.b2;
/* compiled from: EditCommand.kt */
/* loaded from: classes.dex */
public final class e implements f {
    public final int a;
    public final int b;

    public e(int i, int i2) {
        boolean z;
        this.a = i;
        this.b = i2;
        if (i >= 0 && i2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(com.amazon.aps.iva.q.n.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were ", i, " and ", i2, " respectively.").toString());
    }

    @Override // com.amazon.aps.iva.i2.f
    public final void a(i iVar) {
        boolean z;
        int i;
        boolean z2;
        com.amazon.aps.iva.yb0.j.f(iVar, "buffer");
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            i2++;
            if (iVar.b > i2) {
                char b = iVar.b((i - i2) - 1);
                char b2 = iVar.b(iVar.b - i2);
                if (Character.isHighSurrogate(b) && Character.isLowSurrogate(b2)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    i2++;
                }
            }
            if (i2 == iVar.b) {
                break;
            }
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.b; i5++) {
            i4++;
            if (iVar.c + i4 < iVar.d()) {
                char b3 = iVar.b((iVar.c + i4) - 1);
                char b4 = iVar.b(iVar.c + i4);
                if (Character.isHighSurrogate(b3) && Character.isLowSurrogate(b4)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    i4++;
                }
            }
            if (iVar.c + i4 == iVar.d()) {
                break;
            }
        }
        int i6 = iVar.c;
        iVar.a(i6, i4 + i6);
        int i7 = iVar.b;
        iVar.a(i7 - i2, i7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.a == eVar.a && this.b == eVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sb.append(this.a);
        sb.append(", lengthAfterCursor=");
        return b2.b(sb, this.b, ')');
    }
}
