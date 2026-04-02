package com.amazon.aps.iva.xx;

import com.ellation.crunchyroll.model.FmsImages;
/* compiled from: HomeFeedItem.kt */
/* loaded from: classes2.dex */
public final class d implements com.amazon.aps.iva.zx.a {
    public final String a;
    public final String b;
    public final FmsImages c;
    public final String d;
    public final String e;
    public final boolean f;
    public final String g;

    static {
        int i = FmsImages.$stable;
    }

    public d(String str, String str2, FmsImages fmsImages, String str3, String str4, boolean z, String str5) {
        this.a = str;
        this.b = str2;
        this.c = fmsImages;
        this.d = str3;
        this.e = str4;
        this.f = z;
        this.g = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, dVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, dVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, dVar.c) && com.amazon.aps.iva.yb0.j.a(this.d, dVar.d) && com.amazon.aps.iva.yb0.j.a(this.e, dVar.e) && this.f == dVar.f && com.amazon.aps.iva.yb0.j.a(this.g, dVar.g)) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.zx.a
    public final String getId() {
        return this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int b = com.amazon.aps.iva.c80.a.b(this.b, this.a.hashCode() * 31, 31);
        int b2 = com.amazon.aps.iva.c80.a.b(this.e, com.amazon.aps.iva.c80.a.b(this.d, (this.c.hashCode() + b) * 31, 31), 31);
        boolean z = this.f;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (b2 + i) * 31;
        String str = this.g;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return i2 + hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BentoCardUiModel(id=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", images=");
        sb.append(this.c);
        sb.append(", genre=");
        sb.append(this.d);
        sb.append(", link=");
        sb.append(this.e);
        sb.append(", showPremiumLabel=");
        sb.append(this.f);
        sb.append(", feedTitle=");
        return defpackage.b.c(sb, this.g, ")");
    }
}
