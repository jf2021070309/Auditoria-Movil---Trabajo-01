package com.amazon.aps.iva.hm;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.qe0.h;
import com.amazon.aps.iva.yb0.j;
import java.util.ArrayList;
/* compiled from: AssetsCollectionUiModel.kt */
/* loaded from: classes2.dex */
public final class e {
    public static final com.amazon.aps.iva.pe0.b<e> c;
    public final String a;
    public final com.amazon.aps.iva.pe0.a<d> b;

    static {
        ArrayList arrayList = new ArrayList(5);
        for (int i = 0; i < 5; i++) {
            ArrayList arrayList2 = new ArrayList(10);
            for (int i2 = 0; i2 < 10; i2++) {
                arrayList2.add(new d(true, 3));
            }
            arrayList.add(new e(null, x.p0(arrayList2)));
        }
        c = x.p0(arrayList);
    }

    public e(String str, com.amazon.aps.iva.pe0.a<d> aVar) {
        j.f(aVar, "assets");
        this.a = str;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (j.a(this.a, eVar.a) && j.a(this.b, eVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.b.hashCode() + (hashCode * 31);
    }

    public final String toString() {
        return "AssetsCollectionUiModel(title=" + this.a + ", assets=" + this.b + ")";
    }

    public e() {
        this(null, h.c);
    }
}
