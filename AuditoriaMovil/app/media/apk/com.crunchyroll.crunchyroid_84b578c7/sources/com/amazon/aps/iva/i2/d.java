package com.amazon.aps.iva.i2;

import com.amazon.aps.iva.d0.b2;
/* compiled from: EditCommand.kt */
/* loaded from: classes.dex */
public final class d implements f {
    public final int a;
    public final int b;

    /* compiled from: EditCommand.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Integer> {
        public static final a h = new a();

        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Integer invoke() {
            return 0;
        }
    }

    public d(int i, int i2) {
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
        com.amazon.aps.iva.yb0.j.f(iVar, "buffer");
        int i = iVar.c;
        int i2 = this.b;
        int i3 = i + i2;
        if (((i ^ i3) & (i2 ^ i3)) < 0) {
            i3 = iVar.d();
        }
        iVar.a(iVar.c, Math.min(i3, iVar.d()));
        int i4 = iVar.b;
        com.amazon.aps.iva.yb0.j.f(a.h, "defaultValue");
        int i5 = this.a;
        int i6 = i4 - i5;
        if (((i4 ^ i6) & (i5 ^ i4)) < 0) {
            Integer num = 0;
            i6 = num.intValue();
        }
        iVar.a(Math.max(0, i6), iVar.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.a == dVar.a && this.b == dVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        sb.append(this.a);
        sb.append(", lengthAfterCursor=");
        return b2.b(sb, this.b, ')');
    }
}
