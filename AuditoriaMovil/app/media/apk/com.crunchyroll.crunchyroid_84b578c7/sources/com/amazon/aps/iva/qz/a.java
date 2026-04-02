package com.amazon.aps.iva.qz;

import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.yb0.j;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: AssetListModel.kt */
/* loaded from: classes2.dex */
public final class a {
    public final com.amazon.aps.iva.e00.a a;
    public final List<com.amazon.aps.iva.f00.a> b;

    public a() {
        this((List) null, 3);
    }

    public static a a(a aVar, ArrayList arrayList) {
        com.amazon.aps.iva.e00.a aVar2 = aVar.a;
        j.f(aVar2, "rawData");
        return new a(aVar2, arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (j.a(this.a, aVar.a) && j.a(this.b, aVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AssetListModel(rawData=" + this.a + ", assetUiModels=" + this.b + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(com.amazon.aps.iva.e00.a aVar, List<? extends com.amazon.aps.iva.f00.a> list) {
        j.f(aVar, "rawData");
        j.f(list, "assetUiModels");
        this.a = aVar;
        this.b = list;
    }

    public /* synthetic */ a(List list, int i) {
        this((i & 1) != 0 ? new com.amazon.aps.iva.e00.a((List) null, (Map) null, 7) : null, (i & 2) != 0 ? z.b : list);
    }
}
