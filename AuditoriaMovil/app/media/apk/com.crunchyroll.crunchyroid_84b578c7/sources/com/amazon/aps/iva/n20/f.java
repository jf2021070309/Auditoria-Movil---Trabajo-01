package com.amazon.aps.iva.n20;

import com.amazon.aps.iva.a0.r;
import com.amazon.aps.iva.rs.m;
import com.amazon.aps.iva.yb0.j;
import java.util.ArrayList;
import java.util.List;
/* compiled from: UpsellTierUiModel.kt */
/* loaded from: classes2.dex */
public final class f {
    public final String a;
    public final String b;
    public final e c;
    public final m d;
    public final List<com.amazon.aps.iva.o20.c> e;
    public final int f;
    public final Integer g;

    public f(String str, String str2, e eVar, m mVar, ArrayList arrayList, int i, Integer num) {
        j.f(str, "sku");
        j.f(str2, "title");
        j.f(eVar, "basePhase");
        this.a = str;
        this.b = str2;
        this.c = eVar;
        this.d = mVar;
        this.e = arrayList;
        this.f = i;
        this.g = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (j.a(this.a, fVar.a) && j.a(this.b, fVar.b) && j.a(this.c, fVar.c) && j.a(this.d, fVar.d) && j.a(this.e, fVar.e) && this.f == fVar.f && j.a(this.g, fVar.g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.c.hashCode() + com.amazon.aps.iva.c80.a.b(this.b, this.a.hashCode() * 31, 31)) * 31;
        int i = 0;
        m mVar = this.d;
        if (mVar == null) {
            hashCode = 0;
        } else {
            hashCode = mVar.hashCode();
        }
        int a = r.a(this.f, defpackage.a.a(this.e, (hashCode2 + hashCode) * 31, 31), 31);
        Integer num = this.g;
        if (num != null) {
            i = num.hashCode();
        }
        return a + i;
    }

    public final String toString() {
        return "UpsellTierUiModel(sku=" + this.a + ", title=" + this.b + ", basePhase=" + this.c + ", offer=" + this.d + ", perks=" + this.e + ", imageResId=" + this.f + ", label=" + this.g + ")";
    }
}
