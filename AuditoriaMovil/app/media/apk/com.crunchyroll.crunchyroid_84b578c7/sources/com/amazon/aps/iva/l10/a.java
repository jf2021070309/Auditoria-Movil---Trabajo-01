package com.amazon.aps.iva.l10;

import com.ellation.crunchyroll.api.etp.model.Image;
import java.io.Serializable;
import java.util.List;
/* compiled from: Genre.kt */
/* loaded from: classes2.dex */
public final class a implements Serializable {
    public final String b;
    public final String c;
    public final List<Image> d;
    public final List<Image> e;
    public final String f;

    public a(String str, String str2, String str3, List list, List list2) {
        com.amazon.aps.iva.yb0.j.f(str, "tenantCategoryId");
        com.amazon.aps.iva.yb0.j.f(list, "icons");
        com.amazon.aps.iva.yb0.j.f(list2, "backgrounds");
        this.b = str;
        this.c = str2;
        this.d = list;
        this.e = list2;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.b, aVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, aVar.c) && com.amazon.aps.iva.yb0.j.a(this.d, aVar.d) && com.amazon.aps.iva.yb0.j.a(this.e, aVar.e) && com.amazon.aps.iva.yb0.j.a(this.f, aVar.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode() + defpackage.a.a(this.e, defpackage.a.a(this.d, com.amazon.aps.iva.c80.a.b(this.c, this.b.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Genre(tenantCategoryId=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", icons=");
        sb.append(this.d);
        sb.append(", backgrounds=");
        sb.append(this.e);
        sb.append(", description=");
        return defpackage.b.c(sb, this.f, ")");
    }
}
