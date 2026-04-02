package com.amazon.aps.iva.xg;

import com.amazon.aps.iva.b8.l1;
import com.amazon.aps.iva.x50.t;
import com.amazon.aps.iva.yb0.j;
/* compiled from: ToDownloadInput.kt */
/* loaded from: classes.dex */
public final class a {
    public final String a;
    public final String b;
    public final t c;
    public final String d;

    public a(String str, String str2, t tVar, String str3) {
        j.f(str, "assetId");
        j.f(str2, "parentId");
        j.f(tVar, "parentType");
        this.a = str;
        this.b = str2;
        this.c = tVar;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (j.a(this.a, aVar.a) && j.a(this.b, aVar.b) && this.c == aVar.c && j.a(this.d, aVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int a = l1.a(this.c, com.amazon.aps.iva.c80.a.b(this.b, this.a.hashCode() * 31, 31), 31);
        String str = this.d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return a + hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ToDownloadInput(assetId=");
        sb.append(this.a);
        sb.append(", parentId=");
        sb.append(this.b);
        sb.append(", parentType=");
        sb.append(this.c);
        sb.append(", seasonId=");
        return b.c(sb, this.d, ")");
    }
}
