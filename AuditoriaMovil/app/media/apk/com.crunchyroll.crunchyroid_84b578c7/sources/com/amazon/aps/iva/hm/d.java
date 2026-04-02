package com.amazon.aps.iva.hm;

import com.amazon.aps.iva.yb0.j;
/* compiled from: AssetsCollectionUiModel.kt */
/* loaded from: classes2.dex */
public final class d {
    public final String a;
    public final boolean b;
    public final boolean c;

    public d() {
        this(false, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (j.a(this.a, dVar.a) && this.b == dVar.b && this.c == dVar.c) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = 1;
        boolean z = this.b;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (hashCode + i2) * 31;
        boolean z2 = this.c;
        if (!z2) {
            i = z2 ? 1 : 0;
        }
        return i3 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AssetUiModel(id=");
        sb.append(this.a);
        sb.append(", isSelected=");
        sb.append(this.b);
        sb.append(", isEmpty=");
        return com.amazon.aps.iva.e4.e.c(sb, this.c, ")");
    }

    public d(String str, boolean z, boolean z2) {
        j.f(str, "id");
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public /* synthetic */ d(boolean z, int i) {
        this((i & 1) != 0 ? "" : null, false, (i & 4) != 0 ? false : z);
    }
}
