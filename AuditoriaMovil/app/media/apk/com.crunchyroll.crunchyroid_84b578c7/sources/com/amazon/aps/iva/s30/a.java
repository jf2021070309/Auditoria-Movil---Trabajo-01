package com.amazon.aps.iva.s30;

import com.ellation.crunchyroll.model.Panel;
/* compiled from: SearchResultAdapterItem.kt */
/* loaded from: classes2.dex */
public final class a extends k {
    public final Panel c;

    static {
        int i = Panel.$stable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Panel panel) {
        super(panel);
        com.amazon.aps.iva.yb0.j.f(panel, "panel");
        this.c = panel;
    }

    @Override // com.amazon.aps.iva.s30.k
    public final Panel a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof a) && com.amazon.aps.iva.yb0.j.a(this.c, ((a) obj).c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return "ContainerSearchResultItem(panel=" + this.c + ")";
    }
}
