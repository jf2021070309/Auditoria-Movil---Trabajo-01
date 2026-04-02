package com.amazon.aps.iva.a30;

import com.amazon.aps.iva.yb0.j;
import java.util.List;
/* compiled from: CrPlusSkuProductModel.kt */
/* loaded from: classes2.dex */
public final class b {
    public final String a;
    public final String b;
    public final String c;
    public final List<String> d;
    public final String e;

    public b(String str, String str2, String str3, List<String> list, String str4) {
        j.f(str, "sku");
        j.f(list, "benefitsKeys");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (j.a(this.a, bVar.a) && j.a(this.b, bVar.b) && j.a(this.c, bVar.c) && j.a(this.d, bVar.d) && j.a(this.e, bVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int b = com.amazon.aps.iva.c80.a.b(this.b, this.a.hashCode() * 31, 31);
        int i = 0;
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int a = defpackage.a.a(this.d, (b + hashCode) * 31, 31);
        String str2 = this.e;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return a + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CrPlusSkuProductModel(sku=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", description=");
        sb.append(this.c);
        sb.append(", benefitsKeys=");
        sb.append(this.d);
        sb.append(", dealType=");
        return defpackage.b.c(sb, this.e, ")");
    }
}
