package com.amazon.aps.iva.dv;

import com.amazon.aps.iva.xw.f0;
import com.ellation.crunchyroll.model.Panel;
/* compiled from: CrunchylistShowItem.kt */
/* loaded from: classes2.dex */
public final class g extends a {
    public final String e;
    public final String f;
    public final String g;
    public final Panel h;

    static {
        int i = Panel.$stable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(String str, String str2, String str3, Panel panel) {
        super(str, str2, str3, f0.d(panel));
        com.amazon.aps.iva.yb0.j.f(str, "adapterId");
        com.amazon.aps.iva.yb0.j.f(str2, "id");
        com.amazon.aps.iva.yb0.j.f(str3, "listId");
        com.amazon.aps.iva.yb0.j.f(panel, "panel");
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = panel;
    }

    @Override // com.amazon.aps.iva.dv.a
    public final String a() {
        return this.e;
    }

    @Override // com.amazon.aps.iva.dv.a
    public final String b() {
        return this.f;
    }

    @Override // com.amazon.aps.iva.dv.a
    public final String c() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.e, gVar.e) && com.amazon.aps.iva.yb0.j.a(this.f, gVar.f) && com.amazon.aps.iva.yb0.j.a(this.g, gVar.g) && com.amazon.aps.iva.yb0.j.a(this.h, gVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.h.hashCode() + com.amazon.aps.iva.c80.a.b(this.g, com.amazon.aps.iva.c80.a.b(this.f, this.e.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "CrunchylistShowItem(adapterId=" + this.e + ", id=" + this.f + ", listId=" + this.g + ", panel=" + this.h + ")";
    }
}
