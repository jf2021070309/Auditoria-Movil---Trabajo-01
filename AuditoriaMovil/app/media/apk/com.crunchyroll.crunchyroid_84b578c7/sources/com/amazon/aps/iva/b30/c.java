package com.amazon.aps.iva.b30;

import java.io.Serializable;
import java.util.List;
/* compiled from: CrPlusSubscriptionProductModel.kt */
/* loaded from: classes2.dex */
public final class c implements Serializable {
    public final String b;
    public final String c;
    public final com.amazon.aps.iva.c30.a d;
    public final com.amazon.aps.iva.n20.e e;
    public final String f;
    public final List<String> g;
    public final String h;
    public final com.amazon.aps.iva.rs.m i;

    public c(String str, String str2, com.amazon.aps.iva.c30.a aVar, com.amazon.aps.iva.n20.e eVar, String str3, List<String> list, String str4, com.amazon.aps.iva.rs.m mVar) {
        com.amazon.aps.iva.yb0.j.f(str, "sku");
        com.amazon.aps.iva.yb0.j.f(str2, "title");
        com.amazon.aps.iva.yb0.j.f(list, "benefitsKeys");
        this.b = str;
        this.c = str2;
        this.d = aVar;
        this.e = eVar;
        this.f = str3;
        this.g = list;
        this.h = str4;
        this.i = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.b, cVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, cVar.c) && com.amazon.aps.iva.yb0.j.a(this.d, cVar.d) && com.amazon.aps.iva.yb0.j.a(this.e, cVar.e) && com.amazon.aps.iva.yb0.j.a(this.f, cVar.f) && com.amazon.aps.iva.yb0.j.a(this.g, cVar.g) && com.amazon.aps.iva.yb0.j.a(this.h, cVar.h) && com.amazon.aps.iva.yb0.j.a(this.i, cVar.i)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int b = com.amazon.aps.iva.c80.a.b(this.c, this.b.hashCode() * 31, 31);
        int i = 0;
        com.amazon.aps.iva.c30.a aVar = this.d;
        if (aVar == null) {
            hashCode = 0;
        } else {
            hashCode = aVar.hashCode();
        }
        int hashCode4 = (this.e.hashCode() + ((b + hashCode) * 31)) * 31;
        String str = this.f;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int a = defpackage.a.a(this.g, (hashCode4 + hashCode2) * 31, 31);
        String str2 = this.h;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i2 = (a + hashCode3) * 31;
        com.amazon.aps.iva.rs.m mVar = this.i;
        if (mVar != null) {
            i = mVar.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return "CrPlusSubscriptionProductModel(sku=" + this.b + ", title=" + this.c + ", freeTrialDuration=" + this.d + ", basePhase=" + this.e + ", description=" + this.f + ", benefitsKeys=" + this.g + ", dealType=" + this.h + ", offer=" + this.i + ")";
    }
}
