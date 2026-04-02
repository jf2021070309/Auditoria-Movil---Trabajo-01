package com.amazon.aps.iva.nv;

import com.amazon.aps.iva.yb0.j;
/* compiled from: CrunchylistItemUiModel.kt */
/* loaded from: classes2.dex */
public final class a extends b {
    public final String c;

    public a(String str) {
        super(str);
        this.c = str;
    }

    @Override // com.amazon.aps.iva.nv.b
    public final String a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof a) && j.a(this.c, ((a) obj).c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return defpackage.b.c(new StringBuilder("CrunchylistEmptyItem(adapterId="), this.c, ")");
    }
}
